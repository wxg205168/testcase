/* compiled from JSP: /DeleteFunctionPointConfirm.jsp
*
* This code was automatically generated at 10:37:37 on 2005-8-8
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
import java.sql.*; //[ /DeleteFunctionPointConfirm.jsp; Line: 10]
import javax.sql.*; //[ /DeleteFunctionPointConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /DeleteFunctionPointConfirm.jsp; Line: 10]


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
* This code was automatically generated at 10:37:37 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletefunctionpointconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteFunctionPointConfirm.jsp", 1123466028000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteFunctionPointConfirm.jsp", 1123466028000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nSelectFunctionPointConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  
  
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
      mydb.DatabaseBean tt = null; //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /DeleteFunctionPointConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteFunctionPointConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteFunctionPointConfirm.jsp; Line: 14]
      //[ /DeleteFunctionPointConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /DeleteFunctionPointConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteFunctionPointConfirm.jsp; Line: 21]
      } //[ /DeleteFunctionPointConfirm.jsp; Line: 22]
      else{ //[ /DeleteFunctionPointConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /DeleteFunctionPointConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 26]
        Statement myStatement1=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 27]
        Statement myStatement2=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 28]
        Statement myStatement3=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 29]
        Statement myStatement4=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 30]
        Statement myStatement5=null; //[ /DeleteFunctionPointConfirm.jsp; Line: 31]
        myConn=ds.getConnection(); //[ /DeleteFunctionPointConfirm.jsp; Line: 32]
        myStatement1=myConn.createStatement(); //[ /DeleteFunctionPointConfirm.jsp; Line: 33]
        myStatement2=myConn.createStatement(); //[ /DeleteFunctionPointConfirm.jsp; Line: 34]
        myStatement3=myConn.createStatement(); //[ /DeleteFunctionPointConfirm.jsp; Line: 35]
        myStatement4=myConn.createStatement(); //[ /DeleteFunctionPointConfirm.jsp; Line: 36]
        myStatement5=myConn.createStatement(); //[ /DeleteFunctionPointConfirm.jsp; Line: 37]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteFunctionPointConfirm.jsp; Line: 40]
        String sql=new String(); //[ /DeleteFunctionPointConfirm.jsp; Line: 41]
        ResultSet rs; //[ /DeleteFunctionPointConfirm.jsp; Line: 42]
        String textName=new String(); //[ /DeleteFunctionPointConfirm.jsp; Line: 43]
        String functionPointName=new String(); //[ /DeleteFunctionPointConfirm.jsp; Line: 44]
        long functionPointID=0; //[ /DeleteFunctionPointConfirm.jsp; Line: 45]
        //[ /DeleteFunctionPointConfirm.jsp; Line: 46]
        textName="t"+request.getParameter("radiobutton"); //[ /DeleteFunctionPointConfirm.jsp; Line: 47]
        functionPointID=Integer.parseInt(request.getParameter(textName)); //[ /DeleteFunctionPointConfirm.jsp; Line: 48]
        //[ /DeleteFunctionPointConfirm.jsp; Line: 49]
        sql="select fun_p_id,fun_n from tctc_function_point where fun_p_id="+functionPointID; //[ /DeleteFunctionPointConfirm.jsp; Line: 50]
        rs=myStatement1.executeQuery(sql); //[ /DeleteFunctionPointConfirm.jsp; Line: 51]
        //[ /DeleteFunctionPointConfirm.jsp; Line: 52]
        if(rs.next()){ //[ /DeleteFunctionPointConfirm.jsp; Line: 53]
          if(((String)request.getParameter(textName)).equals((String)session.getAttribute("FunctionPointID"))){ //[ /DeleteFunctionPointConfirm.jsp; Line: 54]
            //[ /DeleteFunctionPointConfirm.jsp; Line: 55]
            session.setAttribute("FunctionPointName","null"); //[ /DeleteFunctionPointConfirm.jsp; Line: 56]
            session.setAttribute("FunctionPointID","null"); //[ /DeleteFunctionPointConfirm.jsp; Line: 57]
            session.setAttribute("TestElementName","null"); //[ /DeleteFunctionPointConfirm.jsp; Line: 58]
            session.setAttribute("TestElementID","null"); //[ /DeleteFunctionPointConfirm.jsp; Line: 59]
            session.setAttribute("Type","c"); //[ /DeleteFunctionPointConfirm.jsp; Line: 60]
            session.setAttribute("CR_Number","null"); //[ /DeleteFunctionPointConfirm.jsp; Line: 61]
          } //[ /DeleteFunctionPointConfirm.jsp; Line: 62]
          sql="delete from tctc_function_point where fun_p_id="+functionPointID; //[ /DeleteFunctionPointConfirm.jsp; Line: 63]
          myStatement2.executeUpdate(sql); //[ /DeleteFunctionPointConfirm.jsp; Line: 64]
          //[ /DeleteFunctionPointConfirm.jsp; Line: 65]
          sql="delete from tctc_element where functionpoint_id="+functionPointID; //[ /DeleteFunctionPointConfirm.jsp; Line: 66]
          myStatement3.executeUpdate(sql); //[ /DeleteFunctionPointConfirm.jsp; Line: 67]
          //[ /DeleteFunctionPointConfirm.jsp; Line: 68]
          sql="delete from tctc_information where fun_p_id="+functionPointID; //[ /DeleteFunctionPointConfirm.jsp; Line: 69]
          myStatement4.executeUpdate(sql); //[ /DeleteFunctionPointConfirm.jsp; Line: 70]
          //[ /DeleteFunctionPointConfirm.jsp; Line: 71]
          sql="delete from tctc_test_case where fun_p_id="+functionPointID; //[ /DeleteFunctionPointConfirm.jsp; Line: 72]
          myStatement5.executeUpdate(sql); //[ /DeleteFunctionPointConfirm.jsp; Line: 73]
          //[ /DeleteFunctionPointConfirm.jsp; Line: 74]
        } //[ /DeleteFunctionPointConfirm.jsp; Line: 75]
        else //[ /DeleteFunctionPointConfirm.jsp; Line: 76]
        { //[ /DeleteFunctionPointConfirm.jsp; Line: 77]
          session.setAttribute("Error","3.2"); //[ /DeleteFunctionPointConfirm.jsp; Line: 78]
          //[ /DeleteFunctionPointConfirm.jsp; Line: 79]
        } //[ /DeleteFunctionPointConfirm.jsp; Line: 80]
        //[ /DeleteFunctionPointConfirm.jsp; Line: 81]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteFunctionPointConfirm.jsp; Line: 86]
        //[ /DeleteFunctionPointConfirm.jsp; Line: 87]
        rs.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 88]
        _writeText(response, out, _wl_block6, _wl_block6Bytes);
        //[ /DeleteFunctionPointConfirm.jsp; Line: 90]
        myConn.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 91]
        myStatement1.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 92]
        myStatement2.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 93]
        myStatement3.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 94]
        myStatement4.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 95]
        myStatement5.close(); //[ /DeleteFunctionPointConfirm.jsp; Line: 96]
      } //[ /DeleteFunctionPointConfirm.jsp; Line: 97]
      _writeText(response, out, _wl_block7, _wl_block7Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
