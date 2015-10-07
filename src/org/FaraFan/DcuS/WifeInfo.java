/**
 * WifeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Aug 08, 2005 (11:49:10 PDT) WSDL2Java emitter.
 */

package org.FaraFan.DcuS;

public class WifeInfo  implements java.io.Serializable {
    private String addressGeoSerial;
    private String address;
    private long zipCode;
    private String educationCode;
    private String jobCode;
    private long personNin;
    private String religionCode;
    private String sexCode;
    private int times;

    public WifeInfo() {
    }

    public WifeInfo(
           String addressGeoSerial,
           String educationCode,
           String jobCode,
           long personNin,
           String religionCode,
           String sexCode,
           int times) {
           this.addressGeoSerial = addressGeoSerial;
           this.educationCode = educationCode;
           this.jobCode = jobCode;
           this.personNin = personNin;
           this.religionCode = religionCode;
           this.sexCode = sexCode;
           this.times = times;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the addressGeoSerial value for this WifeInfo.
     * 
     * @return addressGeoSerial
     */
    public String getAddressGeoSerial() {
        return addressGeoSerial;
    }


    /**
     * Sets the addressGeoSerial value for this WifeInfo.
     * 
     * @param addressGeoSerial
     */
    public void setAddressGeoSerial(String addressGeoSerial) {
        this.addressGeoSerial = addressGeoSerial;
    }


    /**
     * Gets the educationCode value for this WifeInfo.
     * 
     * @return educationCode
     */
    public String getEducationCode() {
        return educationCode;
    }


    /**
     * Sets the educationCode value for this WifeInfo.
     * 
     * @param educationCode
     */
    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
    }


    /**
     * Gets the jobCode value for this WifeInfo.
     * 
     * @return jobCode
     */
    public String getJobCode() {
        return jobCode;
    }


    /**
     * Sets the jobCode value for this WifeInfo.
     * 
     * @param jobCode
     */
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }


    /**
     * Gets the personNin value for this WifeInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this WifeInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the religionCode value for this WifeInfo.
     * 
     * @return religionCode
     */
    public String getReligionCode() {
        return religionCode;
    }


    /**
     * Sets the religionCode value for this WifeInfo.
     * 
     * @param religionCode
     */
    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }


    /**
     * Gets the sexCode value for this WifeInfo.
     * 
     * @return sexCode
     */
    public String getSexCode() {
        return sexCode;
    }


    /**
     * Sets the sexCode value for this WifeInfo.
     * 
     * @param sexCode
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }


    /**
     * Gets the times value for this WifeInfo.
     * 
     * @return times
     */
    public int getTimes() {
        return times;
    }


    /**
     * Sets the times value for this WifeInfo.
     * 
     * @param times
     */
    public void setTimes(int times) {
        this.times = times;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WifeInfo)) return false;
        WifeInfo other = (WifeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressGeoSerial==null && other.getAddressGeoSerial()==null) || 
             (this.addressGeoSerial!=null &&
              this.addressGeoSerial.equals(other.getAddressGeoSerial()))) &&
            ((this.educationCode==null && other.getEducationCode()==null) || 
             (this.educationCode!=null &&
              this.educationCode.equals(other.getEducationCode()))) &&
            ((this.jobCode==null && other.getJobCode()==null) || 
             (this.jobCode!=null &&
              this.jobCode.equals(other.getJobCode()))) &&
            this.personNin == other.getPersonNin() &&
            ((this.religionCode==null && other.getReligionCode()==null) || 
             (this.religionCode!=null &&
              this.religionCode.equals(other.getReligionCode()))) &&
            ((this.sexCode==null && other.getSexCode()==null) || 
             (this.sexCode!=null &&
              this.sexCode.equals(other.getSexCode()))) &&
            this.times == other.getTimes();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddressGeoSerial() != null) {
            _hashCode += getAddressGeoSerial().hashCode();
        }
        if (getEducationCode() != null) {
            _hashCode += getEducationCode().hashCode();
        }
        if (getJobCode() != null) {
            _hashCode += getJobCode().hashCode();
        }
        _hashCode += new Long(getPersonNin()).hashCode();
        if (getReligionCode() != null) {
            _hashCode += getReligionCode().hashCode();
        }
        if (getSexCode() != null) {
            _hashCode += getSexCode().hashCode();
        }
        _hashCode += getTimes();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
