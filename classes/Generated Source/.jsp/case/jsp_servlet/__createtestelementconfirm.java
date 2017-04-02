/* compiled from JSP: /CreateTestElementConfirm.jsp
*
* This code was automatically generated at 12:44:52 on 2005-8-29
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
import java.sql.*; //[ /CreateTestElementConfirm.jsp; Line: 10]
import javax.sql.*; //[ /CreateTestElementConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /CreateTestElementConfirm.jsp; Line: 10]


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
* This code was automatically generated at 12:44:52 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createtestelementconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateTestElementConfirm.jsp", 1123655114000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateTestElementConfirm.jsp", 1123655114000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nCreateTestElementConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  
  
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
      mydb.DatabaseBean tt = null; //[ /CreateTestElementConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)request.getAttribute("tt"); //[ /CreateTestElementConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 11]
        { // Don't need to synchronize on request scope //[ /CreateTestElementConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)request.getAttribute("tt"); //[ /CreateTestElementConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /CreateTestElementConfirm.jsp; Line: 11]
            request.setAttribute("tt", tt); //[ /CreateTestElementConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /CreateTestElementConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /CreateTestElementConfirm.jsp; Line: 12]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateTestElementConfirm.jsp; Line: 12]
      if (rr == null) { // begin 'rr' instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /CreateTestElementConfirm.jsp; Line: 12]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateTestElementConfirm.jsp; Line: 12]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 12]
            rr = new managestring.mystring(); //[ /CreateTestElementConfirm.jsp; Line: 12]
            pageContext.setAttribute("rr", rr); //[ /CreateTestElementConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /CreateTestElementConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /CreateTestElementConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /CreateTestElementConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /CreateTestElementConfirm.jsp; Line: 15]
      //[ /CreateTestElementConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /CreateTestElementConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /CreateTestElementConfirm.jsp; Line: 22]
      } //[ /CreateTestElementConfirm.jsp; Line: 23]
      else{ //[ /CreateTestElementConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /CreateTestElementConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /CreateTestElementConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /CreateTestElementConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /CreateTestElementConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /CreateTestElementConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /CreateTestElementConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /CreateTestElementConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /CreateTestElementConfirm.jsp; Line: 32]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /CreateTestElementConfirm.jsp; Line: 35]
        String sProjectID = new String(); //[ /CreateTestElementConfirm.jsp; Line: 36]
        String sUseCaseID=new String(); //[ /CreateTestElementConfirm.jsp; Line: 37]
        String sFunctionPointID=new String(); //[ /CreateTestElementConfirm.jsp; Line: 38]
        String testElementName = new String(); //[ /CreateTestElementConfirm.jsp; Line: 39]
        long projectID=0; //[ /CreateTestElementConfirm.jsp; Line: 40]
        long useCaseID=0; //[ /CreateTestElementConfirm.jsp; Line: 41]
        long functionPointID=0; //[ /CreateTestElementConfirm.jsp; Line: 42]
        String sql=new String(); //[ /CreateTestElementConfirm.jsp; Line: 43]
        ResultSet rs; //[ /CreateTestElementConfirm.jsp; Line: 44]
        sProjectID=(String)session.getAttribute("ProjectID"); //[ /CreateTestElementConfirm.jsp; Line: 45]
        sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /CreateTestElementConfirm.jsp; Line: 46]
        sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /CreateTestElementConfirm.jsp; Line: 47]
        testElementName=request.getParameter("testelement"); //[ /CreateTestElementConfirm.jsp; Line: 48]
        projectID=Integer.parseInt(sProjectID); //[ /CreateTestElementConfirm.jsp; Line: 49]
        useCaseID=Integer.parseInt(sUseCaseID); //[ /CreateTestElementConfirm.jsp; Line: 50]
        functionPointID=Integer.parseInt(sFunctionPointID); //[ /CreateTestElementConfirm.jsp; Line: 51]
        testElementName=rr.replaceString(testElementName); //[ /CreateTestElementConfirm.jsp; Line: 52]
        testElementName=testElementName.trim(); //[ /CreateTestElementConfirm.jsp; Line: 53]
        //[ /CreateTestElementConfirm.jsp; Line: 54]
        //[ /CreateTestElementConfirm.jsp; Line: 55]
        if(rr.checkString(testElementName)){ //[ /CreateTestElementConfirm.jsp; Line: 56]
          //[ /CreateTestElementConfirm.jsp; Line: 57]
          sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID+" and element_name='"+testElementName+"'";; //[ /CreateTestElementConfirm.jsp; Line: 58]
          rs=myStatement1.executeQuery(sql); //[ /CreateTestElementConfirm.jsp; Line: 59]
          //[ /CreateTestElementConfirm.jsp; Line: 60]
          if(rs.next()){ //[ /CreateTestElementConfirm.jsp; Line: 61]
            session.setAttribute("Error","4.3"); //[ /CreateTestElementConfirm.jsp; Line: 62]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            //[ /CreateTestElementConfirm.jsp; Line: 67]
          } //[ /CreateTestElementConfirm.jsp; Line: 68]
          else{ //[ /CreateTestElementConfirm.jsp; Line: 69]
            //[ /CreateTestElementConfirm.jsp; Line: 70]
            sql="insert into tctc_element (element_id,element_name,project_id,uc_id,functionpoint_id) values(seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')"; //[ /CreateTestElementConfirm.jsp; Line: 71]
            myStatement2.executeUpdate(sql); //[ /CreateTestElementConfirm.jsp; Line: 72]
            session.setAttribute("Temp",testElementName); //[ /CreateTestElementConfirm.jsp; Line: 73]
            session.setAttribute("Page","3"); //[ /CreateTestElementConfirm.jsp; Line: 74]
            response.sendRedirect("Temp.jsp"); //[ /CreateTestElementConfirm.jsp; Line: 75]
          } //[ /CreateTestElementConfirm.jsp; Line: 76]
          rs.close(); //[ /CreateTestElementConfirm.jsp; Line: 77]
        } //[ /CreateTestElementConfirm.jsp; Line: 78]
        else{ //[ /CreateTestElementConfirm.jsp; Line: 79]
          session.setAttribute("Error","4.5"); //[ /CreateTestElementConfirm.jsp; Line: 80]
          _writeText(response, out, _wl_block7, _wl_block7Bytes);
          //[ /CreateTestElementConfirm.jsp; Line: 85]
        } //[ /CreateTestElementConfirm.jsp; Line: 86]
        //[ /CreateTestElementConfirm.jsp; Line: 87]
        myConn.close(); //[ /CreateTestElementConfirm.jsp; Line: 88]
        myStatement1.close(); //[ /CreateTestElementConfirm.jsp; Line: 89]
        myStatement2.close(); //[ /CreateTestElementConfirm.jsp; Line: 90]
      } //[ /CreateTestElementConfirm.jsp; Line: 91]
      _writeText(response, out, _wl_block8, _wl_block8Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
