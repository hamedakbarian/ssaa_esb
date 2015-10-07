/**
 * ReturnMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Aug 08, 2005 (11:49:10 PDT) WSDL2Java emitter.
 */

package org.FaraFan.DcuS;

public class ReturnMessage  implements java.io.Serializable {
    private int code;
    private String description;
    private long traceCode;

    public ReturnMessage() {
    }

    public ReturnMessage(
           int code,
           String description,
           long traceCode) {
           this.code = code;
           this.description = description;
           this.traceCode = traceCode;
    }


    /**
     * Gets the code value for this ReturnMessage.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this ReturnMessage.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the description value for this ReturnMessage.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ReturnMessage.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the traceCode value for this ReturnMessage.
     * 
     * @return traceCode
     */
    public long getTraceCode() {
        return traceCode;
    }


    /**
     * Sets the traceCode value for this ReturnMessage.
     * 
     * @param traceCode
     */
    public void setTraceCode(long traceCode) {
        this.traceCode = traceCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReturnMessage)) return false;
        ReturnMessage other = (ReturnMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.code == other.getCode() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.traceCode == other.getTraceCode();
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
        _hashCode += getCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getTraceCode()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
