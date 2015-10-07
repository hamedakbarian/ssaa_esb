/**
 * MarriagesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Aug 08, 2005 (11:49:10 PDT) WSDL2Java emitter.
 */

package org.FaraFan.DcuS;

public class MarriagesInfo  implements java.io.Serializable {
    private MarriageInfo[] marriages;
    private ReturnMessage returnMessage;

    public MarriagesInfo() {
    }

    public MarriagesInfo(
           MarriageInfo[] marriages,
           ReturnMessage returnMessage) {
           this.marriages = marriages;
           this.returnMessage = returnMessage;
    }


    /**
     * Gets the marriages value for this MarriagesInfo.
     * 
     * @return marriages
     */
    public MarriageInfo[] getMarriages() {
        return marriages;
    }


    /**
     * Sets the marriages value for this MarriagesInfo.
     * 
     * @param marriages
     */
    public void setMarriages(MarriageInfo[] marriages) {
        this.marriages = marriages;
    }


    /**
     * Gets the returnMessage value for this MarriagesInfo.
     * 
     * @return returnMessage
     */
    public ReturnMessage getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this MarriagesInfo.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(ReturnMessage returnMessage) {
        this.returnMessage = returnMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MarriagesInfo)) return false;
        MarriagesInfo other = (MarriagesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.marriages==null && other.getMarriages()==null) || 
             (this.marriages!=null &&
              java.util.Arrays.equals(this.marriages, other.getMarriages()))) &&
            ((this.returnMessage==null && other.getReturnMessage()==null) || 
             (this.returnMessage!=null &&
              this.returnMessage.equals(other.getReturnMessage())));
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
        if (getMarriages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarriages());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMarriages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnMessage() != null) {
            _hashCode += getReturnMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
