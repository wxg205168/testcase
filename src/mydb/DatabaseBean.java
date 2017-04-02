package mydb;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;
import java.util.Properties;
import javax.rmi.PortableRemoteObject;


/**
 * <p>Title: Database</p>
 * <p>Description: 1.0</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Wang Xiaoguang
 * @version 1.0
 */

public class DatabaseBean{

  DataSource ds=null;
  Context ctx=null;
  Context initCtx=null;
  Connection myConn=null;
  Statement myStatement=null;
  ResultSet myResultSet=null;

  public DatabaseBean(){
    try{
//          ctx=getInitialContext();
//          ds=(javax.sql.DataSource)
//             ctx.lookup("myDataSource");
      initCtx=new InitialContext();
      ctx = (Context)initCtx.lookup("java:comp/env");
      Object obj=(Object)ctx.lookup("myDataSource");
      ds = (DataSource)obj;


        }
        catch(Exception E){
          System.out.println("Init Error:"+E);
        }
  }

  public DataSource getDataSource(){

    return ds;
  }
  public ResultSet executeQuery(String sql){
    try{
      myConn=ds.getConnection();
      myStatement=myConn.createStatement();
      myResultSet=myStatement.executeQuery(sql);

      return myResultSet;

    }

    catch(SQLException ex){
      System.err.println("aq.executeQuery: " + ex.getMessage());
      System.err.println("aq.executeQuery: " + sql);
    }
/*
    finally{
          try{
            if(myStatement!=null){
                  myStatement.close();
                }
                if(myConn!=null){
                  myConn.close();
                }
          }
      catch(SQLException ex){
        System.err.println("aq.executeQuery: " + ex.getMessage());
        System.err.println("aq.executeQuery: " + sql);
      }
        }
*/
    return null;
  }



  public void updateQuery(String sql){
    try{
      myConn=ds.getConnection();
      myStatement=myConn.createStatement();
      myStatement.executeUpdate(sql);
      myStatement.close();
      myConn.close();
    }

    catch(SQLException ex){
      System.err.println("aq.executeQuery: " + ex.getMessage());
      System.err.println("aq.executeQuery: " + sql);
    }
    finally{
          try{
            if(myStatement!=null){
                  myStatement.close();
                }
                if(myConn!=null){
                  myConn.close();
                }
          }
      catch(SQLException ex){
        System.err.println("aq.executeQuery: " + ex.getMessage());
        System.err.println("aq.executeQuery: " + sql);
      }
        }


  }

  private static Context getInitialContext() throws Exception{
    String url="t3://localhost:8080";
    String user="123";
    String password="123";
    Properties properties=null;
    try{
      properties=new Properties();
      properties.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
      properties.put(Context.PROVIDER_URL,url);
      if(user !=null){
        properties.put(Context.SECURITY_PRINCIPAL,user);
        properties.put(Context.SECURITY_CREDENTIALS,password==null ? "":password);
      }

      return new InitialContext(properties);
    }
    catch(Exception e){
      throw e;
    }
  }


}
