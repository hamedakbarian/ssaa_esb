package org.FaraFan.Entity.Result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by PC-DPS on 04/21/2015.
 */
@XmlRootElement(name="EventPacket")
public class EventPacket {
    private String ScriptoriumNo;
    private String ScriptoriumDivorceNo;
    private String ScriptoriumName;
    private String ScriptoriumCode;
    private String ScriptoriumLocation;
    private String ScriptoriumLocationCode;
    private String ScriptoriumAddress;
    private String ScriptoriumSarDaftarFullName;
    private String ScriptoriumTelNo;
    private String NationalRegisterNo;
    private int    EventType;
    private String RegisterNo;
    private String RegisterDate;
    private String EventDate;
    private int    SerialDocumentNo1;
    private String SerialDocumentNo2;
    private String SerialDocumentNo3;
    private int    HasJudgeHokm;
    private String CaseClassifyNo;
    private String DadnamehNo;
    private String DadnamehDate;
    private String DadnamehIssuerName;
    private int    MarriageType;
    private int    DiscreteMarriageMonth;
    private int    DiscreteMarriageYear;
    private String LastModifyDateTime;
    private String Description;
    private String BazlDate;
    private int    BazlModatType;
    private String NationalRegisterNo4Bazl;
    private String FaskhDate;
    private String CaseClassifyNo4Faskh;
    private String HokmDate4Faskh;
    private String HokmIssuerName4Faskh;
    private String HokmNo4Faskh;
    private String NationalRegisterNo4Faskh;
    private int    DivorceBaenType;
    private int    DivorceType;
    private int    DivorceRequester;
    private int    HasMarriageInfo4Divorce;
    private String MarriageScriptorium4DivorceCode;
    private String MarriageScriptoriumLoc4Divrc;
    private String MarriageScriptoriumNo4Divrc;
    private String NationalRegisterNo4Divorce;
    private String RelatedEventDate4Divorce;
    private String RelatedRegisterNo4Divorce;
    private String RelatedRegisterDate4Divorce;
    private String ReturnDate;
    private String CaseClassifyNo4Return;
    private String HokmDate4Return;
    private String HokmIssuerName4Return;
    private String HokmNo4Return;
    private String MaxSpecifiedDate4Return;
    private String NationalRegisterNo4Return;
    private int    ReturnInSpecifiedTime;
    private int    ReturnResultToMarriage;
    private int    WifeNationalityType;
    private String WifeNationalityCode;
    private String WifeNationalityTitle;
    private int    WifeIsInfoCompleted;
    private int    WifeNamePrefix;
    private String WifeName;
    private String WifeFamily;
    private String WifeBirthDate;
    private String WifeNationalNo;
    private String WifeFatherName;
    private String WifeMotherName;
    private String WifeIdentityNo;
    private int    WifeIdentitySerialNo1;
    private String WifeIdentitySerialNo2;
    private String WifeIdentitySerialNo3;
    private String WifeIdentityIssueLoc;
    private String WifePassportDate;
    private String WifePassportNo;
    private String WifeMarriagePermitDate;
    private String WifeMarriagePermitNo;
    private String WifeNajaDocDate;
    private String WifeNajaDocNo;
    private String WifeMNotaryJobCode;
    private String WifeMNotaryJobTitle;
    private String WifeEducationLevelCode;
    private String WifeEducationLevelTitle;
    private int    WifeReligionCode;
    private String WifeReligionTitle;
    private int    WifeReligionIdeologyCode;
    private String WifeReligionIdeologyTitle;
    private int    WifeNumOfMarriages;
    private String WifeAddress;
    private String WifeAddressGeolocationCode;
    private String WifeAddressGeolocationTitle;
    private String WifePostalCode;
    private int    HusbandNationalityType;
    private String HusbandNationalityCode;
    private String HusbandNationalityTitle;
    private int    HusbandIsInfoCompleted;
    private int    HusbandNamePrefix;
    private String HusbandName;
    private String HusbandFamily;
    private String HusbandBirthDate;
    private String HusbandNationalNo;
    private String HusbandFatherName;
    private String HusbandMotherName;
    private String HusbandIdentityNo;
    private int    HusbandIdentitySerialNo1;
    private String HusbandIdentitySerialNo2;
    private String HusbandIdentitySerialNo3;
    private String HusbandIdentityIssueLoc;
    private String HusbandPassportDate;
    private String HusbandPassportNo;
    private String HusbandMarriagePermitDate;
    private String HusbandMarriagePermitNo;
    private String HusbandNajaDocDate;
    private String HusbandNajaDocNo;
    private String HusbandMNotaryJobCode;
    private String HusbandMNotaryJobTitle;
    private String HusbandEducationLevelCode;
    private String HusbandEducationLevelTitle;
    private int    HusbandReligionCode;
    private String HusbandReligionTitle;
    private int    HusbandReligionIdeologyCode;
    private String HusbandReligionIdeologyTitle;
    private int    HusbandNumOfMarriages;
    private String HusbandAddress;
    private String HusbandAddressGeoLocationCode;
    private String HusbandAddressGeoLocationTitle;
    private String HusbandPostalCode;

    public String getScriptoriumNo() {
        return ScriptoriumNo;
    }
    @XmlElement(name = "ScriptoriumNo")
    public void setScriptoriumNo(String scriptoriumNo) {
        ScriptoriumNo = scriptoriumNo;
    }

    public String getScriptoriumDivorceNo() {
        return ScriptoriumDivorceNo;
    }
    @XmlElement(name = "ScriptoriumDivorceNo")
    public void setScriptoriumDivorceNo(String scriptoriumDivorceNo) {
        ScriptoriumDivorceNo = scriptoriumDivorceNo;
    }

    public String getScriptoriumName() {
        return ScriptoriumName;
    }
    @XmlElement(name = "ScriptoriumName")
    public void setScriptoriumName(String scriptoriumName) {
        ScriptoriumName = scriptoriumName;
    }

    public String getScriptoriumCode() {
        return ScriptoriumCode;
    }
    @XmlElement(name = "ScriptoriumCode")
    public void setScriptoriumCode(String scriptoriumCode) {
        ScriptoriumCode = scriptoriumCode;
    }

    public String getScriptoriumLocation() {
        return ScriptoriumLocation;
    }
    @XmlElement(name = "ScriptoriumLocation")
    public void setScriptoriumLocation(String scriptoriumLocation) {
        ScriptoriumLocation = scriptoriumLocation;
    }

    public String getScriptoriumLocationCode() {
        return ScriptoriumLocationCode;
    }
    @XmlElement(name = "ScriptoriumLocationCode")
    public void setScriptoriumLocationCode(String scriptoriumLocationCode) {
        ScriptoriumLocationCode = scriptoriumLocationCode;
    }

    public String getScriptoriumAddress() {
        return ScriptoriumAddress;
    }
    @XmlElement(name = "ScriptoriumAddress")
    public void setScriptoriumAddress(String scriptoriumAddress) {
        ScriptoriumAddress = scriptoriumAddress;
    }

    public String getScriptoriumSarDaftarFullName() {
        return ScriptoriumSarDaftarFullName;
    }
    @XmlElement(name = "ScriptoriumSarDaftarFullName")
    public void setScriptoriumSarDaftarFullName(String scriptoriumSarDaftarFullName) {
        ScriptoriumSarDaftarFullName = scriptoriumSarDaftarFullName;
    }

    public String getScriptoriumTelNo() {
        return ScriptoriumTelNo;
    }
    @XmlElement(name = "ScriptoriumTelNo")
    public void setScriptoriumTelNo(String scriptoriumTelNo) {
        ScriptoriumTelNo = scriptoriumTelNo;
    }

    public String getNationalRegisterNo() {
        return NationalRegisterNo;
    }
    @XmlElement(name = "NationalRegisterNo")
    public void setNationalRegisterNo(String nationalRegisterNo) {
        NationalRegisterNo = nationalRegisterNo;
    }

    public int getEventType() {
        return EventType;
    }
    @XmlElement(name = "EventType")
    //@XmlElement(name = "EVENTTYPE")
    public void setEventType(int eventType) {
        EventType = eventType;
    }

    public String getRegisterNo() {
        return RegisterNo;
    }
    @XmlElement(name = "RegisterNo")
    public void setRegisterNo(String registerNo) {
        RegisterNo = registerNo;
    }

    public String getRegisterDate() {
        return RegisterDate;
    }
    @XmlElement(name = "RegisterDate")
    public void setRegisterDate(String registerDate) {
        RegisterDate = registerDate;
    }

    public String getEventDate() {
        return EventDate;
    }
    @XmlElement(name = "EventDate")
    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    public int getSerialDocumentNo1() {
        return SerialDocumentNo1;
    }
    @XmlElement(name = "SerialDocumentNo1")
    public void setSerialDocumentNo1(int serialDocumentNo1) {
        SerialDocumentNo1 = serialDocumentNo1;
    }

    public String getSerialDocumentNo2() {
        return SerialDocumentNo2;
    }
    @XmlElement(name = "SerialDocumentNo2")
    public void setSerialDocumentNo2(String serialDocumentNo2) {
        SerialDocumentNo2 = serialDocumentNo2;
    }

    public String getSerialDocumentNo3() {
        return SerialDocumentNo3;
    }
    @XmlElement(name = "SerialDocumentNo3")
    public void setSerialDocumentNo3(String serialDocumentNo3) {
        SerialDocumentNo3 = serialDocumentNo3;
    }

    public int getHasJudgeHokm() {
        return HasJudgeHokm;
    }
    @XmlElement(name = "HasJudgeHokm")
    public void setHasJudgeHokm(int hasJudgeHokm) {
        HasJudgeHokm = hasJudgeHokm;
    }

    public String getCaseClassifyNo() {
        return CaseClassifyNo;
    }
    @XmlElement(name = "CaseClassifyNo")
    public void setCaseClassifyNo(String caseClassifyNo) {
        CaseClassifyNo = caseClassifyNo;
    }

    public String getDadnamehNo() {
        return DadnamehNo;
    }
    @XmlElement(name = "DadnamehNo")
    public void setDadnamehNo(String dadnamehNo) {
        DadnamehNo = dadnamehNo;
    }

    public String getDadnamehDate() {
        return DadnamehDate;
    }
    @XmlElement(name = "DadnamehDate")
    public void setDadnamehDate(String dadnamehDate) {
        DadnamehDate = dadnamehDate;
    }

    public String getDadnamehIssuerName() {
        return DadnamehIssuerName;
    }
    @XmlElement(name = "DadnamehIssuerName")
    public void setDadnamehIssuerName(String dadnamehIssuerName) {
        DadnamehIssuerName = dadnamehIssuerName;
    }

    public int getMarriageType() {
        return MarriageType;
    }
    @XmlElement(name = "MarriageType")
    public void setMarriageType(int marriageType) {
        MarriageType = marriageType;
    }

    public int getDiscreteMarriageMonth() {
        return DiscreteMarriageMonth;
    }
    @XmlElement(name = "DiscreteMarriageMonth")
    public void setDiscreteMarriageMonth(int discreteMarriageMonth) {
        DiscreteMarriageMonth = discreteMarriageMonth;
    }

    public int getDiscreteMarriageYear() {
        return DiscreteMarriageYear;
    }
    @XmlElement(name = "DiscreteMarriageYear")
    public void setDiscreteMarriageYear(int discreteMarriageYear) {
        DiscreteMarriageYear = discreteMarriageYear;
    }

    public String getLastModifyDateTime() {
        return LastModifyDateTime;
    }
    @XmlElement(name = "LastModifyDateTime")
    public void setLastModifyDateTime(String lastModifyDateTime) {
        LastModifyDateTime = lastModifyDateTime;
    }

    public String getDescription() {
        return Description;
    }
    @XmlElement(name = "Description")
    public void setDescription(String description) {
        Description = description;
    }

    public String getBazlDate() {
        return BazlDate;
    }
    @XmlElement(name = "BazlDate")
    public void setBazlDate(String bazlDate) {
        BazlDate = bazlDate;
    }

    public int getBazlModatType() {
        return BazlModatType;
    }
    @XmlElement(name = "BazlModatType")
    public void setBazlModatType(int bazlModatType) {
        BazlModatType = bazlModatType;
    }

    public String getNationalRegisterNo4Bazl() {
        return NationalRegisterNo4Bazl;
    }
    @XmlElement(name = "NationalRegisterNo4Bazl")
    public void setNationalRegisterNo4Bazl(String nationalRegisterNo4Bazl) {
        NationalRegisterNo4Bazl = nationalRegisterNo4Bazl;
    }

    public String getFaskhDate() {
        return FaskhDate;
    }
    @XmlElement(name = "FaskhDate")
    public void setFaskhDate(String faskhDate) {
        FaskhDate = faskhDate;
    }

    public String getCaseClassifyNo4Faskh() {
        return CaseClassifyNo4Faskh;
    }
    @XmlElement(name = "CaseClassifyNo4Faskh")
    public void setCaseClassifyNo4Faskh(String caseClassifyNo4Faskh) {
        CaseClassifyNo4Faskh = caseClassifyNo4Faskh;
    }

    public String getHokmDate4Faskh() {
        return HokmDate4Faskh;
    }
    @XmlElement(name = "HokmDate4Faskh")
    public void setHokmDate4Faskh(String hokmDate4Faskh) {
        HokmDate4Faskh = hokmDate4Faskh;
    }

    public String getHokmIssuerName4Faskh() {
        return HokmIssuerName4Faskh;
    }
    @XmlElement(name = "HokmIssuerName4Faskh")
    public void setHokmIssuerName4Faskh(String hokmIssuerName4Faskh) {
        HokmIssuerName4Faskh = hokmIssuerName4Faskh;
    }

    public String getHokmNo4Faskh() {
        return HokmNo4Faskh;
    }
    @XmlElement(name = "HokmNo4Faskh")
    public void setHokmNo4Faskh(String hokmNo4Faskh) {
        HokmNo4Faskh = hokmNo4Faskh;
    }

    public String getNationalRegisterNo4Faskh() {
        return NationalRegisterNo4Faskh;
    }
    @XmlElement(name = "NationalRegisterNo4Faskh")
    public void setNationalRegisterNo4Faskh(String nationalRegisterNo4Faskh) {
        NationalRegisterNo4Faskh = nationalRegisterNo4Faskh;
    }

    public int getDivorceBaenType() {
        return DivorceBaenType;
    }
    @XmlElement(name = "DivorceBaenType")
    public void setDivorceBaenType(int divorceBaenType) {
        DivorceBaenType = divorceBaenType;
    }

    public int getDivorceType() {
        return DivorceType;
    }
    @XmlElement(name = "DivorceType")
    public void setDivorceType(int divorceType) {
        DivorceType = divorceType;
    }

    public int getDivorceRequester() {
        return DivorceRequester;
    }
    @XmlElement(name = "DivorceRequester")
    public void setDivorceRequester(int divorceRequester) {
        DivorceRequester = divorceRequester;
    }

    public int getHasMarriageInfo4Divorce() {
        return HasMarriageInfo4Divorce;
    }
    @XmlElement(name = "HasMarriageInfo4Divorce")
    public void setHasMarriageInfo4Divorce(int hasMarriageInfo4Divorce) {
        HasMarriageInfo4Divorce = hasMarriageInfo4Divorce;
    }

    public String getMarriageScriptorium4DivorceCode() {
        return MarriageScriptorium4DivorceCode;
    }
    @XmlElement(name = "MarriageScriptorium4DivorceCode")
    public void setMarriageScriptorium4DivorceCode(String marriageScriptorium4DivorceCode) {
        MarriageScriptorium4DivorceCode = marriageScriptorium4DivorceCode;
    }

    public String getMarriageScriptoriumLoc4Divrc() {
        return MarriageScriptoriumLoc4Divrc;
    }
    @XmlElement(name = "MarriageScriptoriumLoc4Divrc")
    public void setMarriageScriptoriumLoc4Divrc(String marriageScriptoriumLoc4Divrc) {
        MarriageScriptoriumLoc4Divrc = marriageScriptoriumLoc4Divrc;
    }

    public String getMarriageScriptoriumNo4Divrc() {
        return MarriageScriptoriumNo4Divrc;
    }
    @XmlElement(name = "MarriageScriptoriumNo4Divrc")
    public void setMarriageScriptoriumNo4Divrc(String marriageScriptoriumNo4Divrc) {
        MarriageScriptoriumNo4Divrc = marriageScriptoriumNo4Divrc;
    }

    public String getNationalRegisterNo4Divorce() {
        return NationalRegisterNo4Divorce;
    }
    @XmlElement(name = "NationalRegisterNo4Divorce")
    public void setNationalRegisterNo4Divorce(String nationalRegisterNo4Divorce) {
        NationalRegisterNo4Divorce = nationalRegisterNo4Divorce;
    }

    public String getRelatedEventDate4Divorce() {
        return RelatedEventDate4Divorce;
    }
    @XmlElement(name = "RelatedEventDate4Divorce")
    public void setRelatedEventDate4Divorce(String relatedEventDate4Divorce) {
        RelatedEventDate4Divorce = relatedEventDate4Divorce;
    }

    public String getRelatedRegisterNo4Divorce() {
        return RelatedRegisterNo4Divorce;
    }
    @XmlElement(name = "RelatedRegisterNo4Divorce")
    public void setRelatedRegisterNo4Divorce(String relatedRegisterNo4Divorce) {
        RelatedRegisterNo4Divorce = relatedRegisterNo4Divorce;
    }

    public String getRelatedRegisterDate4Divorce() {
        return RelatedRegisterDate4Divorce;
    }
    @XmlElement(name = "RelatedRegisterDate4Divorce")
    public void setRelatedRegisterDate4Divorce(String relatedRegisterDate4Divorce) {
        RelatedRegisterDate4Divorce = relatedRegisterDate4Divorce;
    }

    public String getReturnDate() {
        return ReturnDate;
    }
    @XmlElement(name = "ReturnDate")
    public void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }

    public String getCaseClassifyNo4Return() {
        return CaseClassifyNo4Return;
    }
    @XmlElement(name = "CaseClassifyNo4Return")
    public void setCaseClassifyNo4Return(String caseClassifyNo4Return) {
        CaseClassifyNo4Return = caseClassifyNo4Return;
    }

    public String getHokmDate4Return() {
        return HokmDate4Return;
    }
    @XmlElement(name = "HokmDate4Return")
    public void setHokmDate4Return(String hokmDate4Return) {
        HokmDate4Return = hokmDate4Return;
    }

    public String getHokmIssuerName4Return() {
        return HokmIssuerName4Return;
    }
    @XmlElement(name = "HokmIssuerName4Return")
    public void setHokmIssuerName4Return(String hokmIssuerName4Return) {
        HokmIssuerName4Return = hokmIssuerName4Return;
    }

    public String getHokmNo4Return() {
        return HokmNo4Return;
    }
    @XmlElement(name = "HokmNo4Return")
    public void setHokmNo4Return(String hokmNo4Return) {
        HokmNo4Return = hokmNo4Return;
    }

    public String getMaxSpecifiedDate4Return() {
        return MaxSpecifiedDate4Return;
    }
    @XmlElement(name = "MaxSpecifiedDate4Return")
    public void setMaxSpecifiedDate4Return(String maxSpecifiedDate4Return) {
        MaxSpecifiedDate4Return = maxSpecifiedDate4Return;
    }

    public String getNationalRegisterNo4Return() {
        return NationalRegisterNo4Return;
    }
    @XmlElement(name = "NationalRegisterNo4Return")
    public void setNationalRegisterNo4Return(String nationalRegisterNo4Return) {
        NationalRegisterNo4Return = nationalRegisterNo4Return;
    }

    public int getReturnInSpecifiedTime() {
        return ReturnInSpecifiedTime;
    }
    @XmlElement(name = "ReturnInSpecifiedTime")
    public void setReturnInSpecifiedTime(int returnInSpecifiedTime) {
        ReturnInSpecifiedTime = returnInSpecifiedTime;
    }

    public int getReturnResultToMarriage() {
        return ReturnResultToMarriage;
    }
    @XmlElement(name = "ReturnResultToMarriage")
    public void setReturnResultToMarriage(int returnResultToMarriage) {
        ReturnResultToMarriage = returnResultToMarriage;
    }

    public int getWifeNationalityType() {
        return WifeNationalityType;
    }
    @XmlElement(name = "WifeNationalityType")
    public void setWifeNationalityType(int wifeNationalityType) {
        WifeNationalityType = wifeNationalityType;
    }

    public String getWifeNationalityCode() {
        return WifeNationalityCode;
    }
    @XmlElement(name = "WifeNationalityCode")
    public void setWifeNationalityCode(String wifeNationalityCode) {
        WifeNationalityCode = wifeNationalityCode;
    }

    public String getWifeNationalityTitle() {
        return WifeNationalityTitle;
    }
    @XmlElement(name = "WifeNationalityTitle")
    public void setWifeNationalityTitle(String wifeNationalityTitle) {
        WifeNationalityTitle = wifeNationalityTitle;
    }

    public int getWifeIsInfoCompleted() {
        return WifeIsInfoCompleted;
    }
    @XmlElement(name = "WifeIsInfoCompleted")
    public void setWifeIsInfoCompleted(int wifeIsInfoCompleted) {
        WifeIsInfoCompleted = wifeIsInfoCompleted;
    }

    public int getWifeNamePrefix() {
        return WifeNamePrefix;
    }
    @XmlElement(name = "WifeNamePrefix")
    public void setWifeNamePrefix(int wifeNamePrefix) {
        WifeNamePrefix = wifeNamePrefix;
    }

    public String getWifeName() {
        return WifeName;
    }
    @XmlElement(name = "WifeName")
    public void setWifeName(String wifeName) {
        WifeName = wifeName;
    }

    public String getWifeFamily() {
        return WifeFamily;
    }
    @XmlElement(name = "WifeFamily")
    public void setWifeFamily(String wifeFamily) {
        WifeFamily = wifeFamily;
    }

    public String getWifeBirthDate() {
        return WifeBirthDate;
    }
    @XmlElement(name = "WifeBirthDate")
    public void setWifeBirthDate(String wifeBirthDate) {
        WifeBirthDate = wifeBirthDate;
    }

    public String getWifeNationalNo() {
        return WifeNationalNo;
    }
    @XmlElement(name = "WifeNationalNo")
    public void setWifeNationalNo(String wifeNationalNo) {
        WifeNationalNo = wifeNationalNo;
    }

    public String getWifeFatherName() {
        return WifeFatherName;
    }
    @XmlElement(name = "WifeFatherName")
    public void setWifeFatherName(String wifeFatherName) {
        WifeFatherName = wifeFatherName;
    }

    public String getWifeMotherName() {
        return WifeMotherName;
    }
    @XmlElement(name = "WifeMotherName")
    public void setWifeMotherName(String wifeMotherName) {
        WifeMotherName = wifeMotherName;
    }

    public String getWifeIdentityNo() {
        return WifeIdentityNo;
    }
    @XmlElement(name = "WifeIdentityNo")
    public void setWifeIdentityNo(String wifeIdentityNo) {
        WifeIdentityNo = wifeIdentityNo;
    }

    public int getWifeIdentitySerialNo1() {
        return WifeIdentitySerialNo1;
    }
    @XmlElement(name = "WifeIdentitySerialNo1")
    public void setWifeIdentitySerialNo1(int wifeIdentitySerialNo1) {
        WifeIdentitySerialNo1 = wifeIdentitySerialNo1;
    }

    public String getWifeIdentitySerialNo2() {
        return WifeIdentitySerialNo2;
    }
    @XmlElement(name = "WifeIdentitySerialNo2")
    public void setWifeIdentitySerialNo2(String wifeIdentitySerialNo2) {
        WifeIdentitySerialNo2 = wifeIdentitySerialNo2;
    }

    public String getWifeIdentitySerialNo3() {
        return WifeIdentitySerialNo3;
    }
    @XmlElement(name = "WifeIdentitySerialNo3")
    public void setWifeIdentitySerialNo3(String wifeIdentitySerialNo3) {
        WifeIdentitySerialNo3 = wifeIdentitySerialNo3;
    }

    public String getWifeIdentityIssueLoc() {
        return WifeIdentityIssueLoc;
    }
    @XmlElement(name = "WifeIdentityIssueLoc")
    public void setWifeIdentityIssueLoc(String wifeIdentityIssueLoc) {
        WifeIdentityIssueLoc = wifeIdentityIssueLoc;
    }

    public String getWifePassportDate() {
        return WifePassportDate;
    }
    @XmlElement(name = "WifePassportDate")
    public void setWifePassportDate(String wifePassportDate) {
        WifePassportDate = wifePassportDate;
    }

    public String getWifePassportNo() {
        return WifePassportNo;
    }
    @XmlElement(name = "WifePassportNo")
    public void setWifePassportNo(String wifePassportNo) {
        WifePassportNo = wifePassportNo;
    }

    public String getWifeMarriagePermitDate() {
        return WifeMarriagePermitDate;
    }
    @XmlElement(name = "WifeMarriagePermitDate")
    public void setWifeMarriagePermitDate(String wifeMarriagePermitDate) {
        WifeMarriagePermitDate = wifeMarriagePermitDate;
    }

    public String getWifeMarriagePermitNo() {
        return WifeMarriagePermitNo;
    }
    @XmlElement(name = "WifeMarriagePermitNo")
    public void setWifeMarriagePermitNo(String wifeMarriagePermitNo) {
        WifeMarriagePermitNo = wifeMarriagePermitNo;
    }

    public String getWifeNajaDocDate() {
        return WifeNajaDocDate;
    }
    @XmlElement(name = "WifeNajaDocDate")
    public void setWifeNajaDocDate(String wifeNajaDocDate) {
        WifeNajaDocDate = wifeNajaDocDate;
    }

    public String getWifeNajaDocNo() {
        return WifeNajaDocNo;
    }
    @XmlElement(name = "WifeNajaDocNo")
    public void setWifeNajaDocNo(String wifeNajaDocNo) {
        WifeNajaDocNo = wifeNajaDocNo;
    }

    public String getWifeMNotaryJobCode() {
        return WifeMNotaryJobCode;
    }
    @XmlElement(name = "WifeMNotaryJobCode")
    public void setWifeMNotaryJobCode(String wifeMNotaryJobCode) {
        WifeMNotaryJobCode = wifeMNotaryJobCode;
    }

    public String getWifeMNotaryJobTitle() {
        return WifeMNotaryJobTitle;
    }
    @XmlElement(name = "WifeMNotaryJobTitle")
    public void setWifeMNotaryJobTitle(String wifeMNotaryJobTitle) {
        WifeMNotaryJobTitle = wifeMNotaryJobTitle;
    }

    public String getWifeEducationLevelCode() {
        return WifeEducationLevelCode;
    }
    @XmlElement(name = "WifeEducationLevelCode")
    public void setWifeEducationLevelCode(String wifeEducationLevelCode) {
        WifeEducationLevelCode = wifeEducationLevelCode;
    }

    public String getWifeEducationLevelTitle() {
        return WifeEducationLevelTitle;
    }
    @XmlElement(name = "WifeEducationLevelTitle")
    public void setWifeEducationLevelTitle(String wifeEducationLevelTitle) {
        WifeEducationLevelTitle = wifeEducationLevelTitle;
    }

    public int getWifeReligionCode() {
        return WifeReligionCode;
    }
    @XmlElement(name = "WifeReligionCode")
    public void setWifeReligionCode(int wifeReligionCode) {
        WifeReligionCode = wifeReligionCode;
    }

    public String getWifeReligionTitle() {
        return WifeReligionTitle;
    }
    @XmlElement(name = "WifeReligionTitle")
    public void setWifeReligionTitle(String wifeReligionTitle) {
        WifeReligionTitle = wifeReligionTitle;
    }

    public int getWifeReligionIdeologyCode() {
        return WifeReligionIdeologyCode;
    }
    @XmlElement(name = "WifeReligionIdeologyCode")
    public void setWifeReligionIdeologyCode(int wifeReligionIdeologyCode) {
        WifeReligionIdeologyCode = wifeReligionIdeologyCode;
    }

    public String getWifeReligionIdeologyTitle() {
        return WifeReligionIdeologyTitle;
    }
    @XmlElement(name = "WifeReligionIdeologyTitle")
    public void setWifeReligionIdeologyTitle(String wifeReligionIdeologyTitle) {
        WifeReligionIdeologyTitle = wifeReligionIdeologyTitle;
    }

    public int getWifeNumOfMarriages() {
        return WifeNumOfMarriages;
    }
    @XmlElement(name = "WifeNumOfMarriages")
    public void setWifeNumOfMarriages(int wifeNumOfMarriages) {
        WifeNumOfMarriages = wifeNumOfMarriages;
    }

    public String getWifeAddress() {
        return WifeAddress;
    }
    @XmlElement(name = "WifeAddress")
    public void setWifeAddress(String wifeAddress) {
        WifeAddress = wifeAddress;
    }

    public String getWifeAddressGeolocationCode() {
        return WifeAddressGeolocationCode;
    }
    @XmlElement(name = "WifeAddressGeolocationCode")
    public void setWifeAddressGeolocationCode(String wifeAddressGeolocationCode) {
        WifeAddressGeolocationCode = wifeAddressGeolocationCode;
    }

    public String getWifeAddressGeolocationTitle() {
        return WifeAddressGeolocationTitle;
    }
    @XmlElement(name = "WifeAddressGeolocationTitle")
    public void setWifeAddressGeolocationTitle(String wifeAddressGeolocationTitle) {
        WifeAddressGeolocationTitle = wifeAddressGeolocationTitle;
    }

    public String getWifePostalCode() {
        return WifePostalCode;
    }
    @XmlElement(name = "WifePostalCode")
    public void setWifePostalCode(String wifePostalCode) {
        WifePostalCode = wifePostalCode;
    }

    public int getHusbandNationalityType() {
        return HusbandNationalityType;
    }
    @XmlElement(name = "HusbandNationalityType")
    public void setHusbandNationalityType(int husbandNationalityType) {
        HusbandNationalityType = husbandNationalityType;
    }

    public String getHusbandNationalityCode() {
        return HusbandNationalityCode;
    }
    @XmlElement(name = "HusbandNationalityCode")
    public void setHusbandNationalityCode(String husbandNationalityCode) {
        HusbandNationalityCode = husbandNationalityCode;
    }

    public String getHusbandNationalityTitle() {
        return HusbandNationalityTitle;
    }
    @XmlElement(name = "HusbandNationalityTitle")
    public void setHusbandNationalityTitle(String husbandNationalityTitle) {
        HusbandNationalityTitle = husbandNationalityTitle;
    }

    public int getHusbandIsInfoCompleted() {
        return HusbandIsInfoCompleted;
    }
    @XmlElement(name = "HusbandIsInfoCompleted")
    public void setHusbandIsInfoCompleted(int husbandIsInfoCompleted) {
        HusbandIsInfoCompleted = husbandIsInfoCompleted;
    }

    public int getHusbandNamePrefix() {
        return HusbandNamePrefix;
    }
    @XmlElement(name = "HusbandNamePrefix")
    public void setHusbandNamePrefix(int husbandNamePrefix) {
        HusbandNamePrefix = husbandNamePrefix;
    }

    public String getHusbandName() {
        return HusbandName;
    }
    @XmlElement(name = "HusbandName")
    public void setHusbandName(String husbandName) {
        HusbandName = husbandName;
    }

    public String getHusbandFamily() {
        return HusbandFamily;
    }
    @XmlElement(name = "HusbandFamily")
    public void setHusbandFamily(String husbandFamily) {
        HusbandFamily = husbandFamily;
    }

    public String getHusbandBirthDate() {
        return HusbandBirthDate;
    }
    @XmlElement(name = "HusbandBirthDate")
    public void setHusbandBirthDate(String husbandBirthDate) {
        HusbandBirthDate = husbandBirthDate;
    }

    public String getHusbandNationalNo() {
        return HusbandNationalNo;
    }
    @XmlElement(name = "HusbandNationalNo")
    public void setHusbandNationalNo(String husbandNationalNo) {
        HusbandNationalNo = husbandNationalNo;
    }

    public String getHusbandFatherName() {
        return HusbandFatherName;
    }
    @XmlElement(name = "HusbandFatherName")
    public void setHusbandFatherName(String husbandFatherName) {
        HusbandFatherName = husbandFatherName;
    }

    public String getHusbandMotherName() {
        return HusbandMotherName;
    }
    @XmlElement(name = "HusbandMotherName")
    public void setHusbandMotherName(String husbandMotherName) {
        HusbandMotherName = husbandMotherName;
    }

    public String getHusbandIdentityNo() {
        return HusbandIdentityNo;
    }
    @XmlElement(name = "HusbandIdentityNo")
    public void setHusbandIdentityNo(String husbandIdentityNo) {
        HusbandIdentityNo = husbandIdentityNo;
    }

    public int getHusbandIdentitySerialNo1() {
        return HusbandIdentitySerialNo1;
    }
    @XmlElement(name = "HusbandIdentitySerialNo1")
    public void setHusbandIdentitySerialNo1(int husbandIdentitySerialNo1) {
        HusbandIdentitySerialNo1 = husbandIdentitySerialNo1;
    }

    public String getHusbandIdentitySerialNo2() {
        return HusbandIdentitySerialNo2;
    }
    @XmlElement(name = "HusbandIdentitySerialNo2")
    public void setHusbandIdentitySerialNo2(String husbandIdentitySerialNo2) {
        HusbandIdentitySerialNo2 = husbandIdentitySerialNo2;
    }

    public String getHusbandIdentitySerialNo3() {
        return HusbandIdentitySerialNo3;
    }
    @XmlElement(name = "HusbandIdentitySerialNo3")
    public void setHusbandIdentitySerialNo3(String husbandIdentitySerialNo3) {
        HusbandIdentitySerialNo3 = husbandIdentitySerialNo3;
    }

    public String getHusbandIdentityIssueLoc() {
        return HusbandIdentityIssueLoc;
    }
    @XmlElement(name = "HusbandIdentityIssueLoc")
    public void setHusbandIdentityIssueLoc(String husbandIdentityIssueLoc) {
        HusbandIdentityIssueLoc = husbandIdentityIssueLoc;
    }

    public String getHusbandPassportDate() {
        return HusbandPassportDate;
    }
    @XmlElement(name = "HusbandPassportDate")
    public void setHusbandPassportDate(String husbandPassportDate) {
        HusbandPassportDate = husbandPassportDate;
    }

    public String getHusbandPassportNo() {
        return HusbandPassportNo;
    }
    @XmlElement(name = "HusbandPassportNo")
    public void setHusbandPassportNo(String husbandPassportNo) {
        HusbandPassportNo = husbandPassportNo;
    }

    public String getHusbandMarriagePermitDate() {
        return HusbandMarriagePermitDate;
    }
    @XmlElement(name = "HusbandMarriagePermitDate")
    public void setHusbandMarriagePermitDate(String husbandMarriagePermitDate) {
        HusbandMarriagePermitDate = husbandMarriagePermitDate;
    }

    public String getHusbandMarriagePermitNo() {
        return HusbandMarriagePermitNo;
    }
    @XmlElement(name = "HusbandMarriagePermitNo")
    public void setHusbandMarriagePermitNo(String husbandMarriagePermitNo) {
        HusbandMarriagePermitNo = husbandMarriagePermitNo;
    }

    public String getHusbandNajaDocDate() {
        return HusbandNajaDocDate;
    }
    @XmlElement(name = "HusbandNajaDocDate")
    public void setHusbandNajaDocDate(String husbandNajaDocDate) {
        HusbandNajaDocDate = husbandNajaDocDate;
    }

    public String getHusbandNajaDocNo() {
        return HusbandNajaDocNo;
    }
    @XmlElement(name = "HusbandNajaDocNo")
    public void setHusbandNajaDocNo(String husbandNajaDocNo) {
        HusbandNajaDocNo = husbandNajaDocNo;
    }

    public String getHusbandMNotaryJobCode() {
        return HusbandMNotaryJobCode;
    }
    @XmlElement(name = "HusbandMNotaryJobCode")
    public void setHusbandMNotaryJobCode(String husbandMNotaryJobCode) {
        HusbandMNotaryJobCode = husbandMNotaryJobCode;
    }

    public String getHusbandMNotaryJobTitle() {
        return HusbandMNotaryJobTitle;
    }
    @XmlElement(name = "HusbandMNotaryJobTitle")
    public void setHusbandMNotaryJobTitle(String husbandMNotaryJobTitle) {
        HusbandMNotaryJobTitle = husbandMNotaryJobTitle;
    }

    public String getHusbandEducationLevelCode() {
        return HusbandEducationLevelCode;
    }
    @XmlElement(name = "HusbandEducationLevelCode")
    public void setHusbandEducationLevelCode(String husbandEducationLevelCode) {
        HusbandEducationLevelCode = husbandEducationLevelCode;
    }

    public String getHusbandEducationLevelTitle() {
        return HusbandEducationLevelTitle;
    }
    @XmlElement(name = "HusbandEducationLevelTitle")
    public void setHusbandEducationLevelTitle(String husbandEducationLevelTitle) {
        HusbandEducationLevelTitle = husbandEducationLevelTitle;
    }

    public int getHusbandReligionCode() {
        return HusbandReligionCode;
    }
    @XmlElement(name = "HusbandReligionCode")
    public void setHusbandReligionCode(int husbandReligionCode) {
        HusbandReligionCode = husbandReligionCode;
    }

    public String getHusbandReligionTitle() {
        return HusbandReligionTitle;
    }
    @XmlElement(name = "HusbandReligionTitle")
    public void setHusbandReligionTitle(String husbandReligionTitle) {
        HusbandReligionTitle = husbandReligionTitle;
    }

    public int getHusbandReligionIdeologyCode() {
        return HusbandReligionIdeologyCode;
    }
    @XmlElement(name = "HusbandReligionIdeologyCode")
    public void setHusbandReligionIdeologyCode(int husbandReligionIdeologyCode) {
        HusbandReligionIdeologyCode = husbandReligionIdeologyCode;
    }

    public String getHusbandReligionIdeologyTitle() {
        return HusbandReligionIdeologyTitle;
    }
    @XmlElement(name = "HusbandReligionIdeologyTitle")
    public void setHusbandReligionIdeologyTitle(String husbandReligionIdeologyTitle) {
        HusbandReligionIdeologyTitle = husbandReligionIdeologyTitle;
    }

    public int getHusbandNumOfMarriages() {
        return HusbandNumOfMarriages;
    }
    @XmlElement(name = "HusbandNumOfMarriages")
    public void setHusbandNumOfMarriages(int husbandNumOfMarriages) {
        HusbandNumOfMarriages = husbandNumOfMarriages;
    }

    public String getHusbandAddress() {
        return HusbandAddress;
    }
    @XmlElement(name = "HusbandAddress")
    public void setHusbandAddress(String husbandAddress) {
        HusbandAddress = husbandAddress;
    }

    public String getHusbandAddressGeoLocationCode() {
        return HusbandAddressGeoLocationCode;
    }
    @XmlElement(name = "HusbandAddressGeoLocationCode")
    public void setHusbandAddressGeoLocationCode(String husbandAddressGeoLocationCode) {
        HusbandAddressGeoLocationCode = husbandAddressGeoLocationCode;
    }

    public String getHusbandAddressGeoLocationTitle() {
        return HusbandAddressGeoLocationTitle;
    }
    @XmlElement(name = "HusbandAddressGeoLocationTitle")
    public void setHusbandAddressGeoLocationTitle(String husbandAddressGeoLocationTitle) {
        HusbandAddressGeoLocationTitle = husbandAddressGeoLocationTitle;
    }

    public String getHusbandPostalCode() {
        return HusbandPostalCode;
    }
    @XmlElement(name = "HusbandPostalCode")
    public void setHusbandPostalCode(String husbandPostalCode) {
        HusbandPostalCode = husbandPostalCode;
    }
}
