/* compiled from JSP: /CreateTestCaseConfirm.jsp
*
* This code was automatically generated at 12:44:46 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*/

package jsp_servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

// User imports
import java.sql.*; //[ /CreateTestCaseConfirm.jsp; Line: 10]
import javax.sql.*; //[ /CreateTestCaseConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /CreateTestCaseConfirm.jsp; Line: 10]


// built-in init parameters:
// boolean             _verbose -- wants debugging

// Well-known variables:
// JspWriter out                  -- to write to the browser
// HttpServletRequest  request    -- the request object.
// HttpServletResponse response   -- the response object.
// PageContext pageContext        -- the page context for this JSP
// HttpSession session            -- the session object for the client (if any)
// ServletContext application     -- The servlet (application) context
// ServletConfig config           -- The ServletConfig for this JSP
// Object page                    -- the instance of this page's implementation class (i.e., 'this')

/**
* This code was automatically generated at 12:44:46 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createtestcaseconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateTestCaseConfirm.jsp", 1123665092000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateTestCaseConfirm.jsp", 1123665092000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  
  private static void _writeText(ServletResponse rsp, JspWriter out, String block, byte[] blockBytes) throws IOException {
    if (!_WL_ENCODED_BYTES_OK || _hasEncodingChanged(rsp)) {
      out.print(block);
    } else {
      ((weblogic.servlet.jsp.ByteWriter)out).write(blockBytes, block);
    } 
  }
  
  
  private static boolean _hasEncodingChanged(ServletResponse rsp) {
    if (_WL_ORIGINAL_ENCODING.equals(rsp.getCharacterEncoding())) {
      return false;
    }
    return true;
  }
  
  private static boolean _WL_ENCODED_BYTES_OK = true;
  
  private static final String _WL_ORIGINAL_ENCODING = "GBK";
  
  private static byte[] _getBytes(String block) {
    try {
      return block.getBytes(_WL_ORIGINAL_ENCODING);
    } catch (java.io.UnsupportedEncodingException u) {
      _WL_ENCODED_BYTES_OK = false;
    }
    return null;
  }
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nCreateTestCaseConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'EnquireTestCase1.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  
  
  public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException 
  {  
    
    // declare and set well-known variables:
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.ServletContext application = config.getServletContext();
    javax.servlet.jsp.tagext.Tag _activeTag = null;
    // variables for Tag extension protocol
    
    Object page = this;
    javax.servlet.jsp.JspWriter out;
    javax.servlet.jsp.PageContext pageContext =
    javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
    
    response.setHeader("Content-Type", "text/html; charset=GBK");
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      response.setContentType("text/html; charset=GBK");
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /CreateTestCaseConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateTestCaseConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /CreateTestCaseConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /CreateTestCaseConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateTestCaseConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /CreateTestCaseConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /CreateTestCaseConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /CreateTestCaseConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /CreateTestCaseConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /CreateTestCaseConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /CreateTestCaseConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /CreateTestCaseConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /CreateTestCaseConfirm.jsp; Line: 14]
      //[ /CreateTestCaseConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /CreateTestCaseConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /CreateTestCaseConfirm.jsp; Line: 21]
      } //[ /CreateTestCaseConfirm.jsp; Line: 22]
      else{ //[ /CreateTestCaseConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /CreateTestCaseConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /CreateTestCaseConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /CreateTestCaseConfirm.jsp; Line: 26]
        Statement myStatement1=null; //[ /CreateTestCaseConfirm.jsp; Line: 27]
        Statement myStatement2=null; //[ /CreateTestCaseConfirm.jsp; Line: 28]
        myConn=ds.getConnection(); //[ /CreateTestCaseConfirm.jsp; Line: 29]
        myStatement1=myConn.createStatement(); //[ /CreateTestCaseConfirm.jsp; Line: 30]
        myStatement2=myConn.createStatement(); //[ /CreateTestCaseConfirm.jsp; Line: 31]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /CreateTestCaseConfirm.jsp; Line: 34]
        String xx=(String)session.getAttribute("R_Number"); //[ /CreateTestCaseConfirm.jsp; Line: 35]
        int x=Integer.parseInt(xx); //[ /CreateTestCaseConfirm.jsp; Line: 36]
        //[ /CreateTestCaseConfirm.jsp; Line: 37]
        xx=(String)session.getAttribute("C_Number"); //[ /CreateTestCaseConfirm.jsp; Line: 38]
        int y=Integer.parseInt(xx); //[ /CreateTestCaseConfirm.jsp; Line: 39]
        //[ /CreateTestCaseConfirm.jsp; Line: 40]
        ResultSet rs; //[ /CreateTestCaseConfirm.jsp; Line: 41]
        String funID = (String)session.getAttribute("FunctionPointID"); //[ /CreateTestCaseConfirm.jsp; Line: 42]
        String sUCID=(String)session.getAttribute("UseCaseID"); //[ /CreateTestCaseConfirm.jsp; Line: 43]
        String rContent = new String(); //[ /CreateTestCaseConfirm.jsp; Line: 44]
        String cContent = new String(); //[ /CreateTestCaseConfirm.jsp; Line: 45]
        String cName = new String(); //[ /CreateTestCaseConfirm.jsp; Line: 46]
        String sCheckBox=new String(); //[ /CreateTestCaseConfirm.jsp; Line: 47]
        String crName1 = new String(); //[ /CreateTestCaseConfirm.jsp; Line: 48]
        String crName2 = new String(); //[ /CreateTestCaseConfirm.jsp; Line: 49]
        String sql = new String(); //[ /CreateTestCaseConfirm.jsp; Line: 50]
        String projectID = (String)session.getAttribute("ProjectID"); //[ /CreateTestCaseConfirm.jsp; Line: 51]
        String type=new String(); //[ /CreateTestCaseConfirm.jsp; Line: 52]
        boolean write=false; //[ /CreateTestCaseConfirm.jsp; Line: 53]
        boolean first=true; //[ /CreateTestCaseConfirm.jsp; Line: 54]
        //[ /CreateTestCaseConfirm.jsp; Line: 55]
        for(int i=1;i<(y+1);i++){ //[ /CreateTestCaseConfirm.jsp; Line: 56]
          crName1 = "C" + String.valueOf(i); //[ /CreateTestCaseConfirm.jsp; Line: 57]
          cContent = request.getParameter(crName1); //[ /CreateTestCaseConfirm.jsp; Line: 58]
          type=request.getParameter(String.valueOf(i)); //[ /CreateTestCaseConfirm.jsp; Line: 59]
          //[ /CreateTestCaseConfirm.jsp; Line: 60]
          write=false; //[ /CreateTestCaseConfirm.jsp; Line: 61]
          first=true; //[ /CreateTestCaseConfirm.jsp; Line: 62]
          //[ /CreateTestCaseConfirm.jsp; Line: 63]
          for(int j=1;j<(x+1);j++){ //[ /CreateTestCaseConfirm.jsp; Line: 64]
            //[ /CreateTestCaseConfirm.jsp; Line: 65]
            cName=String.valueOf(j) + "-" + String.valueOf(i); //[ /CreateTestCaseConfirm.jsp; Line: 66]
            sCheckBox=request.getParameter(cName); //[ /CreateTestCaseConfirm.jsp; Line: 67]
            if(sCheckBox!=null){ //[ /CreateTestCaseConfirm.jsp; Line: 68]
              crName2 = "R" + String.valueOf(j); //[ /CreateTestCaseConfirm.jsp; Line: 69]
              if(first){ //[ /CreateTestCaseConfirm.jsp; Line: 70]
                rContent = request.getParameter(crName2); //[ /CreateTestCaseConfirm.jsp; Line: 71]
                first=false; //[ /CreateTestCaseConfirm.jsp; Line: 72]
              } //[ /CreateTestCaseConfirm.jsp; Line: 73]
              else{ //[ /CreateTestCaseConfirm.jsp; Line: 74]
                rContent =rContent + " " + request.getParameter(crName2); //[ /CreateTestCaseConfirm.jsp; Line: 75]
              } //[ /CreateTestCaseConfirm.jsp; Line: 76]
              write=true; //[ /CreateTestCaseConfirm.jsp; Line: 77]
              //[ /CreateTestCaseConfirm.jsp; Line: 78]
            } //[ /CreateTestCaseConfirm.jsp; Line: 79]
          } //[ /CreateTestCaseConfirm.jsp; Line: 80]
          if(write) //[ /CreateTestCaseConfirm.jsp; Line: 81]
          { //[ /CreateTestCaseConfirm.jsp; Line: 82]
            sql="select * from tctc_test_case where pro_id="+Integer.parseInt(projectID)+" and uc_id="+Integer.parseInt(sUCID)+" and fun_p_id="+Integer.parseInt(funID)+" and condition='"+cContent+"' and result='"+rContent+"'"; //[ /CreateTestCaseConfirm.jsp; Line: 83]
            rs=myStatement1.executeQuery(sql); //[ /CreateTestCaseConfirm.jsp; Line: 84]
            if(!rs.next()){ //[ /CreateTestCaseConfirm.jsp; Line: 85]
              sql="insert into tctc_test_case (test_case_id,condition,result,fun_p_id,pro_id,uc_id,test_case_type) values(seq_tctc_test_case.nextval,'" + cContent + "','" + rContent + "','" + Integer.parseInt(funID) + "','" + Integer.parseInt(projectID) + "','"+Integer.parseInt(sUCID)+"','"+type+"')"; //[ /CreateTestCaseConfirm.jsp; Line: 86]
              myStatement2.executeUpdate(sql); //[ /CreateTestCaseConfirm.jsp; Line: 87]
            } //[ /CreateTestCaseConfirm.jsp; Line: 88]
          } //[ /CreateTestCaseConfirm.jsp; Line: 89]
        } //[ /CreateTestCaseConfirm.jsp; Line: 90]
        //[ /CreateTestCaseConfirm.jsp; Line: 91]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /CreateTestCaseConfirm.jsp; Line: 96]
        myConn.close(); //[ /CreateTestCaseConfirm.jsp; Line: 97]
        myStatement1.close(); //[ /CreateTestCaseConfirm.jsp; Line: 98]
        myStatement2.close(); //[ /CreateTestCaseConfirm.jsp; Line: 99]
      } //[ /CreateTestCaseConfirm.jsp; Line: 100]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
