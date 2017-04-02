/* compiled from JSP: /UpdateTestElementConfirm.jsp
*
* This code was automatically generated at 15:26:27 on 2005-8-10
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
import java.sql.*; //[ /UpdateTestElementConfirm.jsp; Line: 10]
import javax.sql.*; //[ /UpdateTestElementConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /UpdateTestElementConfirm.jsp; Line: 10]


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
* This code was automatically generated at 15:26:27 on 2005-8-10
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __updatetestelementconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateTestElementConfirm.jsp", 1123658766000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateTestElementConfirm.jsp", 1123658766000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nUpdateTestElementConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /UpdateTestElementConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateTestElementConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /UpdateTestElementConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateTestElementConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /UpdateTestElementConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /UpdateTestElementConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /UpdateTestElementConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /UpdateTestElementConfirm.jsp; Line: 12]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateTestElementConfirm.jsp; Line: 12]
      if (rr == null) { // begin 'rr' instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /UpdateTestElementConfirm.jsp; Line: 12]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateTestElementConfirm.jsp; Line: 12]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 12]
            rr = new managestring.mystring(); //[ /UpdateTestElementConfirm.jsp; Line: 12]
            pageContext.setAttribute("rr", rr); //[ /UpdateTestElementConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /UpdateTestElementConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /UpdateTestElementConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /UpdateTestElementConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /UpdateTestElementConfirm.jsp; Line: 15]
      //[ /UpdateTestElementConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /UpdateTestElementConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /UpdateTestElementConfirm.jsp; Line: 22]
      } //[ /UpdateTestElementConfirm.jsp; Line: 23]
      else{ //[ /UpdateTestElementConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /UpdateTestElementConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /UpdateTestElementConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /UpdateTestElementConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /UpdateTestElementConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /UpdateTestElementConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /UpdateTestElementConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /UpdateTestElementConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /UpdateTestElementConfirm.jsp; Line: 32]
        //[ /UpdateTestElementConfirm.jsp; Line: 33]
        String sql=new String(); //[ /UpdateTestElementConfirm.jsp; Line: 34]
        ResultSet rs=null; //[ /UpdateTestElementConfirm.jsp; Line: 35]
        String textName=new String(); //[ /UpdateTestElementConfirm.jsp; Line: 36]
        String textName1=new String(); //[ /UpdateTestElementConfirm.jsp; Line: 37]
        String testElementName=new String(); //[ /UpdateTestElementConfirm.jsp; Line: 38]
        long testElementID=0; //[ /UpdateTestElementConfirm.jsp; Line: 39]
        //[ /UpdateTestElementConfirm.jsp; Line: 40]
        textName="t"+request.getParameter("radiobutton"); //[ /UpdateTestElementConfirm.jsp; Line: 41]
        textName1="u"+request.getParameter("radiobutton"); //[ /UpdateTestElementConfirm.jsp; Line: 42]
        testElementID=Integer.parseInt(request.getParameter(textName)); //[ /UpdateTestElementConfirm.jsp; Line: 43]
        testElementName=(String)request.getParameter(textName1); //[ /UpdateTestElementConfirm.jsp; Line: 44]
        testElementName=rr.replaceString(testElementName); //[ /UpdateTestElementConfirm.jsp; Line: 45]
        testElementName=rr.restore(testElementName); //[ /UpdateTestElementConfirm.jsp; Line: 46]
        testElementName=testElementName.trim(); //[ /UpdateTestElementConfirm.jsp; Line: 47]
        //[ /UpdateTestElementConfirm.jsp; Line: 48]
        if(rr.checkString(testElementName)){ //[ /UpdateTestElementConfirm.jsp; Line: 49]
          //[ /UpdateTestElementConfirm.jsp; Line: 50]
          sql="select * from tctc_element where element_id="+testElementID; //[ /UpdateTestElementConfirm.jsp; Line: 51]
          rs=myStatement1.executeQuery(sql); //[ /UpdateTestElementConfirm.jsp; Line: 52]
          //[ /UpdateTestElementConfirm.jsp; Line: 53]
          if(rs.next()){ //[ /UpdateTestElementConfirm.jsp; Line: 54]
            if(((String)request.getParameter(textName)).equals((String)session.getAttribute("TestElementID"))){ //[ /UpdateTestElementConfirm.jsp; Line: 55]
              session.setAttribute("TestElementName",testElementName); //[ /UpdateTestElementConfirm.jsp; Line: 56]
            } //[ /UpdateTestElementConfirm.jsp; Line: 57]
            //[ /UpdateTestElementConfirm.jsp; Line: 58]
            sql="update tctc_element set element_name='"+testElementName+"' where element_id="+testElementID; //[ /UpdateTestElementConfirm.jsp; Line: 59]
            myStatement2.executeUpdate(sql); //[ /UpdateTestElementConfirm.jsp; Line: 60]
          } //[ /UpdateTestElementConfirm.jsp; Line: 61]
          else //[ /UpdateTestElementConfirm.jsp; Line: 62]
          { //[ /UpdateTestElementConfirm.jsp; Line: 63]
            session.setAttribute("Error","4.2"); //[ /UpdateTestElementConfirm.jsp; Line: 64]
          } //[ /UpdateTestElementConfirm.jsp; Line: 65]
          rs.close(); //[ /UpdateTestElementConfirm.jsp; Line: 66]
        } //[ /UpdateTestElementConfirm.jsp; Line: 67]
        else{ //[ /UpdateTestElementConfirm.jsp; Line: 68]
          session.setAttribute("Error","4.5"); //[ /UpdateTestElementConfirm.jsp; Line: 69]
        } //[ /UpdateTestElementConfirm.jsp; Line: 70]
        //[ /UpdateTestElementConfirm.jsp; Line: 71]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /UpdateTestElementConfirm.jsp; Line: 76]
        myConn.close(); //[ /UpdateTestElementConfirm.jsp; Line: 77]
        myStatement1.close(); //[ /UpdateTestElementConfirm.jsp; Line: 78]
        myStatement2.close(); //[ /UpdateTestElementConfirm.jsp; Line: 79]
      } //[ /UpdateTestElementConfirm.jsp; Line: 80]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
