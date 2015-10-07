/**
 * DivorcesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Aug 08, 2005 (11:49:10 PDT) WSDL2Java emitter.
 */

package org.FaraFan.DcuS;

public class DivorcesInfo  implements java.io.Serializable {
    private DivorceInfo[] divorces;
    private ReturnMessage returnMessage;

    public DivorcesInfo() {
    }

    public DivorcesInfo(
           DivorceInfo[] divorces,
           ReturnMessage returnMessage) {
           this.divorces = divorces;
           this.returnMessage = returnMessage;
    }


    /**
     * Gets the divorces value for this DivorcesInfo.
     * 
     * @return divorces
     */
    public DivorceInfo[] getDivorces() {
        return divorces;
    }


    /**
     * Sets the divorces value for this DivorcesInfo.
     * 
     * @param divorces
     */
    public void setDivorces(DivorceInfo[] divorces) {
        this.divorces = divorces;
    }


    /**
     * Gets the returnMessage value for this DivorcesInfo.
     * 
     * @return returnMessage
     */
    public ReturnMessage getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this DivorcesInfo.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(ReturnMessage returnMessage) {
        this.returnMessage = returnMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DivorcesInfo)) return false;
        DivorcesInfo other = (DivorcesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divorces==null && other.getDivorces()==null) || 
             (this.divorces!=null &&
              java.util.Arrays.equals(this.divorces, other.getDivorces()))) &&
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
        if (getDivorces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDivorces());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDivorces(), i);
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
