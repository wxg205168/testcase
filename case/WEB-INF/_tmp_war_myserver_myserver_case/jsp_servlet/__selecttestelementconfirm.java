/* compiled from JSP: /SelectTestElementConfirm.jsp
*
* This code was automatically generated at 12:46:33 on 2005-8-29
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
import java.sql.*; //[ /SelectTestElementConfirm.jsp; Line: 10]
import javax.sql.*; //[ /SelectTestElementConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /SelectTestElementConfirm.jsp; Line: 10]


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
* This code was automatically generated at 12:46:33 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selecttestelementconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectTestElementConfirm.jsp", 1123230428000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectTestElementConfirm.jsp", 1123230428000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nSelectTestElementConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'EnquireCRInfromation.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n";
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
      mydb.DatabaseBean tt = null; //[ /SelectTestElementConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectTestElementConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectTestElementConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /SelectTestElementConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectTestElementConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectTestElementConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /SelectTestElementConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /SelectTestElementConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /SelectTestElementConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /SelectTestElementConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /SelectTestElementConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /SelectTestElementConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /SelectTestElementConfirm.jsp; Line: 14]
      //[ /SelectTestElementConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /SelectTestElementConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /SelectTestElementConfirm.jsp; Line: 21]
      } //[ /SelectTestElementConfirm.jsp; Line: 22]
      else{ //[ /SelectTestElementConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /SelectTestElementConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /SelectTestElementConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /SelectTestElementConfirm.jsp; Line: 26]
        Statement myStatement=null; //[ /SelectTestElementConfirm.jsp; Line: 27]
        myConn=ds.getConnection(); //[ /SelectTestElementConfirm.jsp; Line: 28]
        myStatement=myConn.createStatement(); //[ /SelectTestElementConfirm.jsp; Line: 29]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /SelectTestElementConfirm.jsp; Line: 32]
        String sql=new String(); //[ /SelectTestElementConfirm.jsp; Line: 33]
        ResultSet rs; //[ /SelectTestElementConfirm.jsp; Line: 34]
        String textName=new String(); //[ /SelectTestElementConfirm.jsp; Line: 35]
        String testElementName=new String(); //[ /SelectTestElementConfirm.jsp; Line: 36]
        long testElementID=0; //[ /SelectTestElementConfirm.jsp; Line: 37]
        //[ /SelectTestElementConfirm.jsp; Line: 38]
        textName="t"+request.getParameter("radiobutton"); //[ /SelectTestElementConfirm.jsp; Line: 39]
        testElementID=Integer.parseInt(request.getParameter(textName)); //[ /SelectTestElementConfirm.jsp; Line: 40]
        //[ /SelectTestElementConfirm.jsp; Line: 41]
        sql="select element_id,element_name from tctc_element where element_id="+testElementID; //[ /SelectTestElementConfirm.jsp; Line: 42]
        rs=myStatement.executeQuery(sql); //[ /SelectTestElementConfirm.jsp; Line: 43]
        //[ /SelectTestElementConfirm.jsp; Line: 44]
        if(rs.next()){ //[ /SelectTestElementConfirm.jsp; Line: 45]
          //[ /SelectTestElementConfirm.jsp; Line: 46]
          testElementName=rs.getString("element_name"); //[ /SelectTestElementConfirm.jsp; Line: 47]
          session.setAttribute("TestElementName",testElementName); //[ /SelectTestElementConfirm.jsp; Line: 48]
          session.setAttribute("TestElementID",String.valueOf(testElementID)); //[ /SelectTestElementConfirm.jsp; Line: 49]
          session.setAttribute("Type","c"); //[ /SelectTestElementConfirm.jsp; Line: 50]
          session.setAttribute("CR_Number","null"); //[ /SelectTestElementConfirm.jsp; Line: 51]
          _writeText(response, out, _wl_block5, _wl_block5Bytes);
          //[ /SelectTestElementConfirm.jsp; Line: 56]
        } //[ /SelectTestElementConfirm.jsp; Line: 57]
        else //[ /SelectTestElementConfirm.jsp; Line: 58]
        { //[ /SelectTestElementConfirm.jsp; Line: 59]
          session.setAttribute("Error","4.2"); //[ /SelectTestElementConfirm.jsp; Line: 60]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /SelectTestElementConfirm.jsp; Line: 65]
          //[ /SelectTestElementConfirm.jsp; Line: 66]
        } //[ /SelectTestElementConfirm.jsp; Line: 67]
        rs.close(); //[ /SelectTestElementConfirm.jsp; Line: 68]
        _writeText(response, out, _wl_block7, _wl_block7Bytes);
        //[ /SelectTestElementConfirm.jsp; Line: 70]
        myConn.close(); //[ /SelectTestElementConfirm.jsp; Line: 71]
        myStatement.close(); //[ /SelectTestElementConfirm.jsp; Line: 72]
      } //[ /SelectTestElementConfirm.jsp; Line: 73]
      _writeText(response, out, _wl_block8, _wl_block8Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
