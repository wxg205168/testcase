/* compiled from JSP: /UpdateCRInformationConfirm.jsp
*
* This code was automatically generated at 12:46:56 on 2005-8-29
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
import java.sql.*; //[ /UpdateCRInformationConfirm.jsp; Line: 9]
import javax.sql.*; //[ /UpdateCRInformationConfirm.jsp; Line: 9]
import java.util.Enumeration; //[ /UpdateCRInformationConfirm.jsp; Line: 9]


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
* This code was automatically generated at 12:46:56 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __updatecrinformationconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateCRInformationConfirm.jsp", 1123656092000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateCRInformationConfirm.jsp", 1123656092000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n<form>\r\n";
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
  private final static String _wl_block6 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'EnquireCRInfromation.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n</form>\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /UpdateCRInformationConfirm.jsp; Line: 10]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateCRInformationConfirm.jsp; Line: 10]
      if (tt == null) { // begin 'tt' instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 10]
        { // Don't need to synchronize on page scope //[ /UpdateCRInformationConfirm.jsp; Line: 10]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateCRInformationConfirm.jsp; Line: 10]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 10]
            tt = new mydb.DatabaseBean(); //[ /UpdateCRInformationConfirm.jsp; Line: 10]
            pageContext.setAttribute("tt", tt); //[ /UpdateCRInformationConfirm.jsp; Line: 10]
          } // end synchronized bean instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 10]
        } // end synchronized bean scope block... //[ /UpdateCRInformationConfirm.jsp; Line: 10]
      } // end bean instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 10]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /UpdateCRInformationConfirm.jsp; Line: 11]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateCRInformationConfirm.jsp; Line: 11]
      if (rr == null) { // begin 'rr' instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /UpdateCRInformationConfirm.jsp; Line: 11]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateCRInformationConfirm.jsp; Line: 11]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 11]
            rr = new managestring.mystring(); //[ /UpdateCRInformationConfirm.jsp; Line: 11]
            pageContext.setAttribute("rr", rr); //[ /UpdateCRInformationConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /UpdateCRInformationConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /UpdateCRInformationConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /UpdateCRInformationConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /UpdateCRInformationConfirm.jsp; Line: 14]
      //[ /UpdateCRInformationConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /UpdateCRInformationConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /UpdateCRInformationConfirm.jsp; Line: 21]
      } //[ /UpdateCRInformationConfirm.jsp; Line: 22]
      else{ //[ /UpdateCRInformationConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /UpdateCRInformationConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /UpdateCRInformationConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /UpdateCRInformationConfirm.jsp; Line: 26]
        Statement myStatement=null; //[ /UpdateCRInformationConfirm.jsp; Line: 27]
        myConn=ds.getConnection(); //[ /UpdateCRInformationConfirm.jsp; Line: 28]
        myStatement=myConn.createStatement(); //[ /UpdateCRInformationConfirm.jsp; Line: 29]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /UpdateCRInformationConfirm.jsp; Line: 32]
        String checkName=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 33]
        String textName=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 34]
        String textName1=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 35]
        String checkBoxResult=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 36]
        //[ /UpdateCRInformationConfirm.jsp; Line: 37]
        String informationID=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 38]
        String information=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 39]
        String sql=new String(); //[ /UpdateCRInformationConfirm.jsp; Line: 40]
        //[ /UpdateCRInformationConfirm.jsp; Line: 41]
        //[ /UpdateCRInformationConfirm.jsp; Line: 42]
        int number=Integer.parseInt((String)session.getAttribute("CR_Number")); //[ /UpdateCRInformationConfirm.jsp; Line: 43]
        //[ /UpdateCRInformationConfirm.jsp; Line: 44]
        for(int i=1;i<(number+1);i++){ //[ /UpdateCRInformationConfirm.jsp; Line: 45]
          checkName="C"+i; //[ /UpdateCRInformationConfirm.jsp; Line: 46]
          textName="T"+i; //[ /UpdateCRInformationConfirm.jsp; Line: 47]
          textName1="u"+i; //[ /UpdateCRInformationConfirm.jsp; Line: 48]
          //[ /UpdateCRInformationConfirm.jsp; Line: 49]
          checkBoxResult=request.getParameter(checkName); //[ /UpdateCRInformationConfirm.jsp; Line: 50]
          //[ /UpdateCRInformationConfirm.jsp; Line: 51]
          if(checkBoxResult!=null){ //[ /UpdateCRInformationConfirm.jsp; Line: 52]
            informationID=request.getParameter(textName); //[ /UpdateCRInformationConfirm.jsp; Line: 53]
            information=request.getParameter(textName1); //[ /UpdateCRInformationConfirm.jsp; Line: 54]
            information=rr.replaceString(information); //[ /UpdateCRInformationConfirm.jsp; Line: 55]
            information=information.trim(); //[ /UpdateCRInformationConfirm.jsp; Line: 56]
            //[ /UpdateCRInformationConfirm.jsp; Line: 57]
            if(rr.checkString(information)){ //[ /UpdateCRInformationConfirm.jsp; Line: 58]
              sql="update tctc_information set inf_dis='"+ information +"' where inf_id="+Integer.parseInt(informationID); //[ /UpdateCRInformationConfirm.jsp; Line: 59]
              myStatement.executeUpdate(sql); //[ /UpdateCRInformationConfirm.jsp; Line: 60]
            } //[ /UpdateCRInformationConfirm.jsp; Line: 61]
          } //[ /UpdateCRInformationConfirm.jsp; Line: 62]
        } //[ /UpdateCRInformationConfirm.jsp; Line: 63]
        //[ /UpdateCRInformationConfirm.jsp; Line: 64]
        _writeText(response, out, _wl_block6, _wl_block6Bytes);
        //[ /UpdateCRInformationConfirm.jsp; Line: 69]
        myConn.close(); //[ /UpdateCRInformationConfirm.jsp; Line: 70]
        myStatement.close(); //[ /UpdateCRInformationConfirm.jsp; Line: 71]
      } //[ /UpdateCRInformationConfirm.jsp; Line: 72]
      _writeText(response, out, _wl_block7, _wl_block7Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
