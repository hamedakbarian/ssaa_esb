package org.FaraFan.Dao.Connection;

import oracle.jdbc.pool.OracleDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.Connection;
import java.util.Hashtable;
import java.util.ResourceBundle;

public class DataAccess {
        private static javax.sql.DataSource ds = null;

          public static Connection getConnection() throws Exception
          {
            ResourceBundle resource = ResourceBundle.getBundle("SsaaConfig");
            String jndi_jdbc_status = resource.getString("jndi_jdbc_status");
            String WebLogic_Address = resource.getString("WebLogic_Address");
            String JNDI_Name = resource.getString("JNDI_Name");
            String JDBC_URL = resource.getString("JDBC_URL");
            String WL_USER = resource.getString("USER");
            String WL_PASS = resource.getString("PASS");

        Connection cn = null;
            try
            {
              if (ds == null)
              {
                if(jndi_jdbc_status.equals("0"))
                {
                    //get datasource with jndi
                    System.out.println("--->SsaaService Connecting via JNDI");
                    Hashtable ht = new Hashtable();
                    ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
                 //   System.out.println( WebLogic_Address );
                    ht.put(Context.PROVIDER_URL, "t3://" + WebLogic_Address);

                    Context ctx = new InitialContext(ht);
                    ds = (javax.sql.DataSource) ctx.lookup(JNDI_Name);
                    //ds = (javax.sql.DataSource) ctx.lookup("edcdbnew2");
                    if(ds==null)
                        System.out.println("noooo");
                    else
                        System.out.println("okkk");
                }
                else {
                    //get datasource with oracle jdbc
                    System.out.println("--->Ssaa Connecting via JDBC");
                    OracleDataSource OraDs = new OracleDataSource();
                    OraDs.setURL(JDBC_URL);
                    OraDs.setUser(WL_USER);
                    OraDs.setPassword(WL_PASS);

                    ds=OraDs;
                }
              }
              cn = ds.getConnection();
              cn.setAutoCommit(false);
            }
            catch (Exception ex)
            {
              throw new Exception("[--errDbNotAvailable--] \nExeption => " + ex);

            }
            return cn;
          }
          public static void dispose(Connection cn) throws Exception
          {
            if ((cn != null) && (!cn.isClosed()))
            {
              cn.close();
            }
            cn = null;
          }
}
