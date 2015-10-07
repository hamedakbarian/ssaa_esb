/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Aug 08, 2005 (11:49:10 PDT) WSDL2Java emitter.
 */

package org.FaraFan.DcuS;

public interface Services extends java.rmi.Remote {
    public String getCurrentVersion(boolean mInfo) throws java.rmi.RemoteException;
    public ReturnMessage saveBirth(BirthInfo birthInfo, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage sanadConfirm(SanadInfo sanadInfo, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage saveDeath(DeathInfo deathInfo, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage saveMarriage(WifeInfo husbandInfo, WifeInfo wifeInfo, MarriageInfo marriageInfo, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage saveDivorce(WifeInfo husbandInfo, WifeInfo wifeInfo, DivorceInfo divorceInfo, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage saveSeriSerialChange(ChangeInfo info, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage saveImageChange(ChangeImageInfo info, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage shenasnameConfirm(ShenasnameInfo shenasnameInfo, String username, String password) throws java.rmi.RemoteException;
    public MarriagesInfo getPersonMarriages(long personNin, String username, String password) throws java.rmi.RemoteException;
    public MarriagesInfo getParentsMarriages(long husbandNin, long wifeNin, String username, String password) throws java.rmi.RemoteException;
    public DivorcesInfo getPersonDivorces(long personNin, String username, String password) throws java.rmi.RemoteException;
    public DivorcesInfo getParentsDivorces(long husbandNin, long wifeNin, String username, String password) throws java.rmi.RemoteException;
    public ReturnMessage finalConfirmedShenasname(ShenasnameInfo shenasnameInfo, String username, String password) throws java.rmi.RemoteException;
}
