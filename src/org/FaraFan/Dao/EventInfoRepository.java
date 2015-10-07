package org.FaraFan.Dao;

import org.FaraFan.Dao.Connection.EntityBase;
import org.FaraFan.Entity.Result.EventPacket;
import org.FaraFan.SsaaException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

/**
 * User: Behrooz Mohamadi <behrooz.mohamadi.66@gmail.com>
 * Date: 8/26/12
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventInfoRepository extends EntityBase {
    final ResourceBundle resource = ResourceBundle.getBundle("SsaaConfig");
    String databaseUserName = resource.getString("DatabaseUserName");
    public EventInfoRepository(Connection cn) {
        super(cn);
    }

    public Long saveAll(EventPacket eventPacket, Long lastRequest, String Schema) throws Exception {

//        for (EventPacket eventPacket : eventPacketList) {

                Long wifeID = new CoupleInfoRepository(getConnection()).saveWife(Schema,eventPacket);
                Long husbandID = new CoupleInfoRepository(getConnection()).saveHusband(Schema,eventPacket);

                String query = "INSERT INTO "+Schema+".SSAA_EVENT_INFO " +
                        "(ID," +
                        "ScriptoriumNo," +
                        "ScriptoriumName," +
                        "ScriptoriumCode," +
                        "ScriptoriumLocation," +
                        "ScriptoriumLocationCode," +
                        "ScriptoriumAddress," +
                        "SCRIPTORIUMSARDAFTARFULLNAME," +
                        "ScriptoriumTelNo," +
                        "NationalRegisterNo," +
                        "EventType," +
                        "RegisterNo," +
                        "RegisterDate," +
                        "EventDate," +
                        "SerialDocumentNo1," +
                        "SerialDocumentNo2," +
                        "SerialDocumentNo3," +
                        "HasJudgeHokm," +
                        "CaseClassifyNo," +
                        "DadnamehNo," +
                        "DadnamehDate," +
                        "DadnamehIssuerName," +
                        "MarriageType," +
                        "DiscreteMarriageMonth," +
                        "DiscreteMarriageYear," +
                        "LastModifyDateTime," +
                        "Description," +
                        "BazlDate," +
                        "BazlModatType," +
                        "NationalRegisterNo4Bazl," +
                        "FaskhDate," +
                        "CaseClassifyNo4Faskh," +
                        "HokmDate4Faskh," +
                        "HokmIssuerName4Faskh," +
                        "HokmNo4Faskh," +
                        "NationalRegisterNo4Faskh," +
                        "DivorceBaenType," +
                        "DivorceType," +
                        "DivorceRequester," +
                        "HasMarriageInfo4Divorce," +
                        "MARRSCRIPTORIUM4DVRCCODE," +
                        "MARRIAGESCRIPTORIUMLOC4DIVRC," +
                        "MARRIAGESCRIPTORIUMNO4DIVRC," +
                        "NationalRegisterNo4Divorce," +
                        "RelatedEventDate4Divorce," +
                        "RelatedRegisterNo4Divorce," +
                        "RelatedRegisterDate4Divorce," +
                        "ReturnDate," +
                        "CaseClassifyNo4Return," +
                        "HokmDate4Return," +
                        "HokmIssuerName4Return," +
                        "HokmNo4Return," +
                        "MaxSpecifiedDate4Return," +
                        "NationalRegisterNo4Return," +
                        "ReturnInSpecifiedTime," +
                        "ReturnResultToMarriage," +
                        "WIFE_COUPLE_ID," +
                        "HUSBAND_COUPLE_ID," +
                        "REQUEST_ID," +
                        "ScriptoriumDivorceNo) " +
                        "VALUES (" + databaseUserName + ".SEQ_TBL_MARRIAGE_EVENT_INFO.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                        "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try {
                    PreparedStatement stmt = getConnection().prepareStatement(query);

                    stmt.setString(1,  eventPacket.getScriptoriumNo());
                    stmt.setString(2,  eventPacket.getScriptoriumName());
                    stmt.setString(3,  eventPacket.getScriptoriumCode());
                    stmt.setString(4,  eventPacket.getScriptoriumLocation());
                    stmt.setString(5,  eventPacket.getScriptoriumLocationCode());
                    stmt.setString(6,  eventPacket.getScriptoriumAddress());
                    stmt.setString(7,  eventPacket.getScriptoriumSarDaftarFullName());
                    stmt.setString(8,  eventPacket.getScriptoriumTelNo());
                    stmt.setString(9, eventPacket.getNationalRegisterNo());
                    stmt.setInt   (10, eventPacket.getEventType());
                    stmt.setString(11, eventPacket.getRegisterNo());
                    stmt.setString(12, eventPacket.getRegisterDate());
                    stmt.setString(13, eventPacket.getEventDate());
                    stmt.setLong  (14, eventPacket.getSerialDocumentNo1());
                    stmt.setString(15, eventPacket.getSerialDocumentNo2());
                    stmt.setString(16, eventPacket.getSerialDocumentNo3());
                    stmt.setInt   (17, eventPacket.getHasJudgeHokm());
                    stmt.setString(18, eventPacket.getCaseClassifyNo());
                    stmt.setString(19, eventPacket.getDadnamehNo());
                    stmt.setString(20, eventPacket.getDadnamehDate());
                    stmt.setString(21, eventPacket.getDadnamehIssuerName());
                    stmt.setInt   (22, eventPacket.getMarriageType());
                    stmt.setInt   (23, eventPacket.getDiscreteMarriageMonth());
                    stmt.setInt   (24, eventPacket.getDiscreteMarriageYear());
                    stmt.setString(25, eventPacket.getLastModifyDateTime());
                    stmt.setString(26, eventPacket.getDescription());
                    stmt.setString(27, eventPacket.getBazlDate());
                    stmt.setInt   (28, eventPacket.getBazlModatType());
                    stmt.setString(29, eventPacket.getNationalRegisterNo4Bazl());
                    stmt.setString(30, eventPacket.getFaskhDate());
                    stmt.setString(31, eventPacket.getCaseClassifyNo4Faskh());
                    stmt.setString(32, eventPacket.getHokmDate4Faskh());
                    stmt.setString(33, eventPacket.getHokmIssuerName4Faskh());
                    stmt.setString(34, eventPacket.getHokmNo4Faskh());
                    stmt.setString(35, eventPacket.getNationalRegisterNo4Faskh());
                    stmt.setInt   (36, eventPacket.getDivorceBaenType());
                    stmt.setInt   (37, eventPacket.getDivorceType());
                    stmt.setInt   (38, eventPacket.getDivorceRequester());
                    stmt.setInt   (39, eventPacket.getHasMarriageInfo4Divorce());
                    stmt.setString(40, eventPacket.getMarriageScriptorium4DivorceCode());
                    stmt.setString(41, eventPacket.getMarriageScriptoriumLoc4Divrc());
                    stmt.setString(42, eventPacket.getMarriageScriptoriumNo4Divrc());
                    stmt.setString(43, eventPacket.getNationalRegisterNo4Divorce());
                    stmt.setString(44, eventPacket.getRelatedEventDate4Divorce());
                    stmt.setString(45, eventPacket.getRelatedRegisterNo4Divorce());
                    stmt.setString(46, eventPacket.getRelatedRegisterDate4Divorce());
                    stmt.setString(47, eventPacket.getReturnDate());
                    stmt.setString(48, eventPacket.getCaseClassifyNo4Return());
                    stmt.setString(49, eventPacket.getHokmDate4Return());
                    stmt.setString(50, eventPacket.getHokmIssuerName4Return());
                    stmt.setString(51, eventPacket.getHokmNo4Return());
                    stmt.setString(52, eventPacket.getMaxSpecifiedDate4Return());
                    stmt.setString(53, eventPacket.getNationalRegisterNo4Return());
                    stmt.setInt   (54, eventPacket.getReturnInSpecifiedTime());
                    stmt.setInt   (55, eventPacket.getReturnResultToMarriage());
                    stmt.setLong  (56, wifeID);
                    stmt.setLong  (57, husbandID);
                    stmt.setLong  (58, lastRequest);
                    stmt.setString(59, eventPacket.getScriptoriumDivorceNo());
                    stmt.executeUpdate();

                    stmt = getConnection().prepareStatement("Select " + databaseUserName + ".SEQ_TBL_MARRIAGE_EVENT_INFO.currval from dual");
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        return rs.getLong(1);
                    }else throw new SsaaException("sequence SEQ_TBL_MARRIAGE_EVENT_INFO not exist!");

                } catch (Exception ex) {
                    throw new SsaaException(ex.getMessage());
            }
        //}
    }
}
