package org.FaraFan.Dao;

import org.FaraFan.Dao.Connection.EntityBase;
import org.FaraFan.SsaaException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * User: Behrooz Mohamadi <behrooz.mohamadi.66@gmail.com>
 * Date: 9/2/12
 * Time: 11:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class RequestRepository extends EntityBase {

    public RequestRepository(Connection cn) {
        super(cn);
    }

    public Long GetLastRequest(String Schema) throws Exception {
        try {
            String query = "Select max(id) from "+Schema+".SSAA_Request";
            PreparedStatement statement = getConnection().prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            if(rs.next())
                return rs.getLong(1);
            return 0l;
        } catch (Exception ex) {
            throw new SsaaException(ex.getMessage());
        }
    }
    public void saveLastRequest(String Schema,Long lastRequest,int packetCount) throws Exception {
        try {
            String query = "Insert into "+Schema+".SSAA_Request values(?,?,sysdate)";
            PreparedStatement stmt = getConnection().prepareStatement(query);
            stmt.setLong(1, lastRequest);
            stmt.setInt (2, packetCount);
            stmt.executeUpdate();
        } catch (Exception ex) {
            throw new SsaaException(ex.getMessage());
        }
    }
}
