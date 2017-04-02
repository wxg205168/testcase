/* compiled from JSP: /DeleteTestConditionConfirm.jsp
*
* This code was automatically generated at 10:37:50 on 2005-8-8
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
import java.sql.*; //[ /DeleteTestConditionConfirm.jsp; Line: 10]
import javax.sql.*; //[ /DeleteTestConditionConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /DeleteTestConditionConfirm.jsp; Line: 10]


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
* This code was automatically generated at 10:37:51 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletetestconditionconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestConditionConfirm.jsp", 1123463998000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestConditionConfirm.jsp", 1123463998000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nDeleteTestConditionConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'DeleteTestCondition.jsp\'\r\n</script>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /DeleteTestConditionConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestConditionConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteTestConditionConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /DeleteTestConditionConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestConditionConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteTestConditionConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /DeleteTestConditionConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /DeleteTestConditionConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /DeleteTestConditionConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /DeleteTestConditionConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /DeleteTestConditionConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteTestConditionConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteTestConditionConfirm.jsp; Line: 14]
      //[ /DeleteTestConditionConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /DeleteTestConditionConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteTestConditionConfirm.jsp; Line: 21]
      } //[ /DeleteTestConditionConfirm.jsp; Line: 22]
      else{ //[ /DeleteTestConditionConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /DeleteTestConditionConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /DeleteTestConditionConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /DeleteTestConditionConfirm.jsp; Line: 26]
        Statement myStatement1=null; //[ /DeleteTestConditionConfirm.jsp; Line: 27]
        Statement myStatement2=null; //[ /DeleteTestConditionConfirm.jsp; Line: 28]
        Statement myStatement3=null; //[ /DeleteTestConditionConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /DeleteTestConditionConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /DeleteTestConditionConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /DeleteTestConditionConfirm.jsp; Line: 32]
        myStatement3=myConn.createStatement(); //[ /DeleteTestConditionConfirm.jsp; Line: 33]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteTestConditionConfirm.jsp; Line: 36]
        String checkName=new String(); //[ /DeleteTestConditionConfirm.jsp; Line: 37]
        String textName=new String(); //[ /DeleteTestConditionConfirm.jsp; Line: 38]
        String checkBoxResult=new String(); //[ /DeleteTestConditionConfirm.jsp; Line: 39]
        //[ /DeleteTestConditionConfirm.jsp; Line: 40]
        String hidResult=new String(); //[ /DeleteTestConditionConfirm.jsp; Line: 41]
        String sql=new String(); //[ /DeleteTestConditionConfirm.jsp; Line: 42]
        ResultSet rs; //[ /DeleteTestConditionConfirm.jsp; Line: 43]
        String information=new String(); //[ /DeleteTestConditionConfirm.jsp; Line: 44]
        //[ /DeleteTestConditionConfirm.jsp; Line: 45]
        int number=Integer.parseInt((String)session.getAttribute("CR_Number")); //[ /DeleteTestConditionConfirm.jsp; Line: 46]
        //[ /DeleteTestConditionConfirm.jsp; Line: 47]
        for(int i=1;i<(number+1);i++){ //[ /DeleteTestConditionConfirm.jsp; Line: 48]
          checkName="C"+i; //[ /DeleteTestConditionConfirm.jsp; Line: 49]
          textName="T"+i; //[ /DeleteTestConditionConfirm.jsp; Line: 50]
          //[ /DeleteTestConditionConfirm.jsp; Line: 51]
          checkBoxResult=request.getParameter(checkName); //[ /DeleteTestConditionConfirm.jsp; Line: 52]
          //[ /DeleteTestConditionConfirm.jsp; Line: 53]
          if(checkBoxResult!=null){ //[ /DeleteTestConditionConfirm.jsp; Line: 54]
            hidResult=request.getParameter(textName); //[ /DeleteTestConditionConfirm.jsp; Line: 55]
            sql="select inf_dis from tctc_information where inf_id="+Integer.parseInt(hidResult); //[ /DeleteTestConditionConfirm.jsp; Line: 56]
            rs=myStatement1.executeQuery(sql); //[ /DeleteTestConditionConfirm.jsp; Line: 57]
            if(rs.next()){ //[ /DeleteTestConditionConfirm.jsp; Line: 58]
              information=rs.getString("inf_dis"); //[ /DeleteTestConditionConfirm.jsp; Line: 59]
              //[ /DeleteTestConditionConfirm.jsp; Line: 60]
              sql="delete from tctc_information where inf_id="+Integer.parseInt(hidResult); //[ /DeleteTestConditionConfirm.jsp; Line: 61]
              myStatement2.executeUpdate(sql); //[ /DeleteTestConditionConfirm.jsp; Line: 62]
              //[ /DeleteTestConditionConfirm.jsp; Line: 63]
              sql="delete from tctc_test_case where  condition = '"+information+"'"; //[ /DeleteTestConditionConfirm.jsp; Line: 64]
              myStatement3.executeUpdate(sql); //[ /DeleteTestConditionConfirm.jsp; Line: 65]
            } //[ /DeleteTestConditionConfirm.jsp; Line: 66]
          } //[ /DeleteTestConditionConfirm.jsp; Line: 67]
          //[ /DeleteTestConditionConfirm.jsp; Line: 68]
        } //[ /DeleteTestConditionConfirm.jsp; Line: 69]
        //[ /DeleteTestConditionConfirm.jsp; Line: 70]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteTestConditionConfirm.jsp; Line: 75]
        myConn.close(); //[ /DeleteTestConditionConfirm.jsp; Line: 76]
        myStatement1.close(); //[ /DeleteTestConditionConfirm.jsp; Line: 77]
        myStatement2.close(); //[ /DeleteTestConditionConfirm.jsp; Line: 78]
        myStatement3.close(); //[ /DeleteTestConditionConfirm.jsp; Line: 79]
      } //[ /DeleteTestConditionConfirm.jsp; Line: 80]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
