/* compiled from JSP: /DeleteCRInformationConfirm.jsp
*
* This code was automatically generated at 12:44:58 on 2005-8-29
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
import java.sql.*; //[ /DeleteCRInformationConfirm.jsp; Line: 9]
import javax.sql.*; //[ /DeleteCRInformationConfirm.jsp; Line: 9]
import java.util.Enumeration; //[ /DeleteCRInformationConfirm.jsp; Line: 9]


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
* This code was automatically generated at 12:44:58 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletecrinformationconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteCRInformationConfirm.jsp", 1123463712000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteCRInformationConfirm.jsp", 1123463712000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'EnquireCRInfromation.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n</form>\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /DeleteCRInformationConfirm.jsp; Line: 10]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteCRInformationConfirm.jsp; Line: 10]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteCRInformationConfirm.jsp; Line: 10]
        { // Don't need to synchronize on page scope //[ /DeleteCRInformationConfirm.jsp; Line: 10]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteCRInformationConfirm.jsp; Line: 10]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteCRInformationConfirm.jsp; Line: 10]
            tt = new mydb.DatabaseBean(); //[ /DeleteCRInformationConfirm.jsp; Line: 10]
            pageContext.setAttribute("tt", tt); //[ /DeleteCRInformationConfirm.jsp; Line: 10]
          } // end synchronized bean instantiation block... //[ /DeleteCRInformationConfirm.jsp; Line: 10]
        } // end synchronized bean scope block... //[ /DeleteCRInformationConfirm.jsp; Line: 10]
      } // end bean instantiation block... //[ /DeleteCRInformationConfirm.jsp; Line: 10]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteCRInformationConfirm.jsp; Line: 12]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteCRInformationConfirm.jsp; Line: 13]
      //[ /DeleteCRInformationConfirm.jsp; Line: 14]
      if(!ss.hasMoreElements()){ //[ /DeleteCRInformationConfirm.jsp; Line: 15]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteCRInformationConfirm.jsp; Line: 20]
      } //[ /DeleteCRInformationConfirm.jsp; Line: 21]
      else{ //[ /DeleteCRInformationConfirm.jsp; Line: 22]
        DataSource ds=null; //[ /DeleteCRInformationConfirm.jsp; Line: 23]
        ds=tt.getDataSource(); //[ /DeleteCRInformationConfirm.jsp; Line: 24]
        Connection myConn=null; //[ /DeleteCRInformationConfirm.jsp; Line: 25]
        Statement myStatement1=null; //[ /DeleteCRInformationConfirm.jsp; Line: 26]
        Statement myStatement2=null; //[ /DeleteCRInformationConfirm.jsp; Line: 27]
        Statement myStatement3=null; //[ /DeleteCRInformationConfirm.jsp; Line: 28]
        Statement myStatement4=null; //[ /DeleteCRInformationConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /DeleteCRInformationConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /DeleteCRInformationConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /DeleteCRInformationConfirm.jsp; Line: 32]
        myStatement3=myConn.createStatement(); //[ /DeleteCRInformationConfirm.jsp; Line: 33]
        myStatement4=myConn.createStatement(); //[ /DeleteCRInformationConfirm.jsp; Line: 34]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteCRInformationConfirm.jsp; Line: 37]
        String checkName=new String(); //[ /DeleteCRInformationConfirm.jsp; Line: 38]
        String textName=new String(); //[ /DeleteCRInformationConfirm.jsp; Line: 39]
        String checkBoxResult=new String(); //[ /DeleteCRInformationConfirm.jsp; Line: 40]
        //[ /DeleteCRInformationConfirm.jsp; Line: 41]
        String informationID=new String(); //[ /DeleteCRInformationConfirm.jsp; Line: 42]
        String sql=new String(); //[ /DeleteCRInformationConfirm.jsp; Line: 43]
        //[ /DeleteCRInformationConfirm.jsp; Line: 44]
        //[ /DeleteCRInformationConfirm.jsp; Line: 45]
        int number=Integer.parseInt((String)session.getAttribute("CR_Number")); //[ /DeleteCRInformationConfirm.jsp; Line: 46]
        //[ /DeleteCRInformationConfirm.jsp; Line: 47]
        for(int i=1;i<(number+1);i++){ //[ /DeleteCRInformationConfirm.jsp; Line: 48]
          checkName="C"+i; //[ /DeleteCRInformationConfirm.jsp; Line: 49]
          textName="T"+i; //[ /DeleteCRInformationConfirm.jsp; Line: 50]
          //[ /DeleteCRInformationConfirm.jsp; Line: 51]
          checkBoxResult=request.getParameter(checkName); //[ /DeleteCRInformationConfirm.jsp; Line: 52]
          //[ /DeleteCRInformationConfirm.jsp; Line: 53]
          if(checkBoxResult!=null){ //[ /DeleteCRInformationConfirm.jsp; Line: 54]
            informationID=request.getParameter(textName); //[ /DeleteCRInformationConfirm.jsp; Line: 55]
            sql="delete from tctc_information where inf_id="+Integer.parseInt(informationID); //[ /DeleteCRInformationConfirm.jsp; Line: 56]
            myStatement1.executeUpdate(sql); //[ /DeleteCRInformationConfirm.jsp; Line: 57]
            //[ /DeleteCRInformationConfirm.jsp; Line: 58]
            informationID="%"+informationID+"%"; //[ /DeleteCRInformationConfirm.jsp; Line: 59]
            //[ /DeleteCRInformationConfirm.jsp; Line: 60]
            sql="delete from tctc_information where  inf_dis like '"+informationID+"'"; //[ /DeleteCRInformationConfirm.jsp; Line: 61]
            myStatement2.executeUpdate(sql); //[ /DeleteCRInformationConfirm.jsp; Line: 62]
            //[ /DeleteCRInformationConfirm.jsp; Line: 63]
            sql="delete from tctc_test_case where  condition like '"+informationID+"'"; //[ /DeleteCRInformationConfirm.jsp; Line: 64]
            myStatement3.executeUpdate(sql); //[ /DeleteCRInformationConfirm.jsp; Line: 65]
            //[ /DeleteCRInformationConfirm.jsp; Line: 66]
            sql="delete from tctc_test_case where  result like '"+informationID+"'"; //[ /DeleteCRInformationConfirm.jsp; Line: 67]
            myStatement4.executeUpdate(sql); //[ /DeleteCRInformationConfirm.jsp; Line: 68]
            //[ /DeleteCRInformationConfirm.jsp; Line: 69]
          } //[ /DeleteCRInformationConfirm.jsp; Line: 70]
        } //[ /DeleteCRInformationConfirm.jsp; Line: 71]
        //[ /DeleteCRInformationConfirm.jsp; Line: 72]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteCRInformationConfirm.jsp; Line: 77]
        myConn.close(); //[ /DeleteCRInformationConfirm.jsp; Line: 78]
        myStatement1.close(); //[ /DeleteCRInformationConfirm.jsp; Line: 79]
        myStatement2.close(); //[ /DeleteCRInformationConfirm.jsp; Line: 80]
        myStatement3.close(); //[ /DeleteCRInformationConfirm.jsp; Line: 81]
        myStatement4.close(); //[ /DeleteCRInformationConfirm.jsp; Line: 82]
      } //[ /DeleteCRInformationConfirm.jsp; Line: 83]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
