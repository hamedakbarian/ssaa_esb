package org.FaraFan.Common;

import org.FaraFan.Dao.Connection.DataAccess;
import org.FaraFan.Dao.DcuServiceLogsRepository;
import org.FaraFan.DcuS.*;
import org.FaraFan.Entity.Request.Request;
import org.FaraFan.Entity.Responce.response;
import org.FaraFan.Entity.Result.EventPacket;
import org.FaraFan.SsaaException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * Created by behrooz on 4/21/2015.
 */
public class Utils {
    public static boolean ServiceAvailable(String url) {
        boolean available = false;
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.connect();

            if (conn.getResponseCode() == 200)
                available = true;
        } catch (IOException e) {
        } finally {
            if (conn != null)
                conn.disconnect();
        }
        return available;
    }
    public static String getCurrentVersion()
    {
        try {

            return         Configuration.read("SsaaVersion.xml", "ssaa", "version") +
                    "." +  Configuration.read("SsaaVersion.xml", "ssaa", "release") +
                    "." +  Configuration.read("SsaaVersion.xml", "ssaa", "updatedIn");
        }
        catch (Exception ex)
        {
            return "0.0.0";
        }
    }
    public  static response parse_xml_to_object(String xml) throws JAXBException, UnsupportedEncodingException {
        JAXBContext jaxbContext = JAXBContext.newInstance(response.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return  (response) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }
    public  static String parse_object_to_xml(ResourceBundle resource,Long lastRequest,int EventPacketCount) throws JAXBException {
        Request r = new Request();
        r.setUserid(resource.getString("Userid"));
        r.setPassword(resource.getString("Password"));
        r.setCat(resource.getString("Cat"));
        r.setAction(resource.getString("Action"));
        r.setBody(lastRequest,EventPacketCount);

        JAXBContext jaxbContext = JAXBContext.newInstance(Request.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter XMLData=new StringWriter();
        jaxbMarshaller.marshal(r,XMLData);
        return XMLData.toString().replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>","");
    }
    public static void
    call_DcuService(EventPacket eventPacket, Long lastRequest, ResourceBundle resource, Long evenInfoID) throws Exception {
        Connection cn = null;
//        int eventPacketIndex=0;
        try {
            if (!Utils.ServiceAvailable(resource.getString("DcuS_WSDL_URL")))
                throw new SsaaException("Dcu Service not available!");

            ServicesSoapBindingStub dcuPort = (ServicesSoapBindingStub) new ServicesServiceLocator().getServices(new java.net.URL(resource.getString("DcuS_WSDL_URL")));

//            for (EventPacket eventPacket : eventPacketList) {

            if(eventPacket.getHusbandNationalityType() == 1 && eventPacket.getWifeNationalityType() ==1){
            //if(eventPacket.getEventType() == 2){
                WifeInfo husband = new WifeInfo();
                WifeInfo wife = new WifeInfo();
                MarriageInfo marriage = new MarriageInfo();
                DivorceInfo divorce = new DivorceInfo();
                ReturnMessage message = null;
                //set husband Info
                husband.setPersonNin(Long.valueOf(eventPacket.getHusbandNationalNo()));
                husband.setSexCode(ConvertSex("2"));//2 is Male
                husband.setJobCode(eventPacket.getHusbandMNotaryJobCode());
                husband.setEducationCode(String.valueOf(Integer.parseInt(eventPacket.getHusbandEducationLevelCode())));
                husband.setAddressGeoSerial(eventPacket.getHusbandAddressGeoLocationCode());
                husband.setAddress(eventPacket.getHusbandAddress());
                husband.setZipCode(Long.parseLong(eventPacket.getHusbandPostalCode()));
                husband.setTimes(eventPacket.getHusbandNumOfMarriages() + 1);
                husband.setReligionCode(ConvertReligion(eventPacket.getHusbandReligionCode()));
                //set wife Info
                wife.setPersonNin(Long.valueOf(eventPacket.getWifeNationalNo()));
                wife.setSexCode(ConvertSex("1"));//1 is Female
                wife.setJobCode(eventPacket.getWifeMNotaryJobCode());
                wife.setEducationCode(String.valueOf(Integer.parseInt(eventPacket.getWifeEducationLevelCode())));
                wife.setAddressGeoSerial(eventPacket.getWifeAddressGeolocationCode());
                wife.setAddress(eventPacket.getWifeAddress());
                wife.setZipCode(Long.parseLong(eventPacket.getWifePostalCode()));
                wife.setTimes(eventPacket.getWifeNumOfMarriages() + 1);
                wife.setReligionCode(ConvertReligion(eventPacket.getWifeReligionCode()));

                //if(!eventPacket.getEventDate().isEmpty()) {
                if(eventPacket.getEventType() == 1) {
                    //eventPacket.setEventType(1);
                    marriage.setEventDate(eventPacket.getEventDate());
                    marriage.setRegstDate(eventPacket.getRegisterDate());
                    marriage.setRegstNo(eventPacket.getRegisterNo());
                    marriage.setRegstAu(eventPacket.getScriptoriumNo());
                }
                //else if(!eventPacket.getRelatedEventDate4Divorce().isEmpty()) {
                else  if(eventPacket.getEventType() == 2) {
                    //eventPacket.setEventType(2);
                    divorce.setEventDate(eventPacket.getEventDate());
                    divorce.setRegstDate(eventPacket.getRegisterDate());
                    divorce.setRegstNo(eventPacket.getRegisterNo());
                    divorce.setRegstAu(eventPacket.getScriptoriumDivorceNo());
                    //divorce.setRegstAu(eventPacket.getMarriageScriptoriumNo4Divrc());
                }
                //else if(!eventPacket.getReturnDate().isEmpty()) {
                else  if(eventPacket.getEventType() == 4) {
                    //eventPacket.setEventType(4);
                    marriage.setEventDate(eventPacket.getEventDate());
                    marriage.setRegstDate(eventPacket.getRegisterDate());
                    marriage.setRegstNo(eventPacket.getRegisterNo());
                    marriage.setRegstAu(eventPacket.getScriptoriumNo());
                }
                //else if(!eventPacket.getFaskhDate().isEmpty()) {
                else  if(eventPacket.getEventType() == 5) {
                    //eventPacket.setEventType(5);
                    marriage.setEventDate(eventPacket.getEventDate());
                    marriage.setRegstDate(eventPacket.getRegisterDate());
                    marriage.setRegstNo(eventPacket.getRegisterNo());
                    marriage.setRegstAu(eventPacket.getScriptoriumNo());
                }
                //else if(!eventPacket.getBazlDate().isEmpty()) {
                else  if(eventPacket.getEventType() == 6) {
                    //eventPacket.setEventType(6);
                    divorce.setEventDate(eventPacket.getEventDate());
                    divorce.setRegstDate(eventPacket.getRegisterDate());
                    divorce.setRegstNo(eventPacket.getRegisterNo());
                    divorce.setRegstAu(eventPacket.getScriptoriumNo());
                }

//                eventPacket.setEventType(eventPacket.getEventType());
//                marriage.setEventDate(eventPacket.getEventDate());
//                marriage.setRegstDate(eventPacket.getRegisterDate());
//                marriage.setRegstNo(eventPacket.getRegisterNo());
//                marriage.setRegstAu(eventPacket.getScriptoriumNo());

                marriage.setTypeCode(String.valueOf(eventPacket.getEventType()));
                divorce.setTypeCode(String.valueOf(eventPacket.getEventType()));

                marriage.setRegstGeoSerial(eventPacket.getScriptoriumLocationCode());
                divorce.setRegstGeoSerial(eventPacket.getScriptoriumLocationCode());

                marriage.setRegstRefCode("1");
                divorce.setRegstRefCode("1");

                marriage.setConfirmAutCode("1");
                divorce.setConfirmAutCode("1");

                marriage.setUserId(resource.getString("DcuS_User"));
                divorce.setUserId(resource.getString("DcuS_User"));


                if (eventPacket.getEventType() == 1 || eventPacket.getEventType() == 4 || eventPacket.getEventType() == 5) {
                    message = dcuPort.saveMarriage(husband, wife, marriage, resource.getString("DcuS_User"), resource.getString("DcuS_Pass"));
                }

                if(eventPacket.getEventType() == 2 || eventPacket.getEventType() == 6) {
                    divorce.setMarriageDate(eventPacket.getRelatedEventDate4Divorce());
                    message = dcuPort.saveDivorce(husband, wife, divorce, resource.getString("DcuS_User"), resource.getString("DcuS_Pass"));
                }

                if ((cn == null) || (cn.isClosed()))  cn = DataAccess.getConnection();
                new DcuServiceLogsRepository(cn).saveLogs(resource.getString("Schema"), message, lastRequest, eventPacket.getNationalRegisterNo(),evenInfoID);
                cn.commit();
            }
//            if(message.getCode() == 0){
//                System.out.println("Dcu Service successfully saved:"+message.getCode()+" Message:"+message.getDescription());
//                throw new SsaaException("Dcu Service successfully saved:"+message.getCode()+" Message:"+message.getDescription());
//            }
                /*if(message.getCode()!=0)
                    throw new SsaaException("Dcu Service Error:"+message.getCode()+" Message:"+message.getDescription());

                eventPacketIndex++;
            }*/
        }catch(Exception ex){
            ReturnMessage message = new ReturnMessage();
            message.setCode(-1);
            message.setDescription(ex.getMessage());
            if ((cn == null) || (cn.isClosed()))  cn = DataAccess.getConnection();
            new DcuServiceLogsRepository(cn).saveLogs(resource.getString("Schema"), message, lastRequest, eventPacket.getNationalRegisterNo(), evenInfoID);
            cn.commit();
            //throw new SsaaException(ex.getMessage());
        }
        finally {
            DataAccess.dispose(cn);
        }
    }
    public static String ConvertReligion(Integer code){
        if(code == null)
            return null;
        switch (code){
            case 1:return  "م";
            case 2:return  "ع";
            case 3:return  "ز";
            case 4:return  "ك";
            case 5:return  "م";//saebin felan mosalman zakhire mishavand.
//            case 6:return  "?";
//            case 7:return  "?";
//            case 8:return  "?";
//            case 9:return  "?";
//            case 10:return "?";
        }
        return null;
    }
    public static String ConvertSex(String code){
        if(code == null)
            return "";
        switch (Integer.parseInt(code)) {
            case 1:
                return "د";
            case 2:
                return "پ";
        }
        return "";
    }

}
