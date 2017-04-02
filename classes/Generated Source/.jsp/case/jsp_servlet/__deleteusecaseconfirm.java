/* compiled from JSP: /DeleteUseCaseConfirm.jsp
*
* This code was automatically generated at 12:45:18 on 2005-8-29
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
import java.sql.*; //[ /DeleteUseCaseConfirm.jsp; Line: 11]
import javax.sql.*; //[ /DeleteUseCaseConfirm.jsp; Line: 11]
import java.util.Enumeration; //[ /DeleteUseCaseConfirm.jsp; Line: 11]


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
* This code was automatically generated at 12:45:18 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deleteusecaseconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteUseCaseConfirm.jsp", 1123466268000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteUseCaseConfirm.jsp", 1123466268000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nDeletetUseCaseConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n<form action=\"SelectUseCase.jsp\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n\r\n";
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
      mydb.DatabaseBean tt = null; //[ /DeleteUseCaseConfirm.jsp; Line: 12]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteUseCaseConfirm.jsp; Line: 12]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteUseCaseConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /DeleteUseCaseConfirm.jsp; Line: 12]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteUseCaseConfirm.jsp; Line: 12]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteUseCaseConfirm.jsp; Line: 12]
            tt = new mydb.DatabaseBean(); //[ /DeleteUseCaseConfirm.jsp; Line: 12]
            pageContext.setAttribute("tt", tt); //[ /DeleteUseCaseConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /DeleteUseCaseConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /DeleteUseCaseConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /DeleteUseCaseConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteUseCaseConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteUseCaseConfirm.jsp; Line: 15]
      //[ /DeleteUseCaseConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /DeleteUseCaseConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteUseCaseConfirm.jsp; Line: 22]
      } //[ /DeleteUseCaseConfirm.jsp; Line: 23]
      else{ //[ /DeleteUseCaseConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /DeleteUseCaseConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /DeleteUseCaseConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /DeleteUseCaseConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /DeleteUseCaseConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /DeleteUseCaseConfirm.jsp; Line: 29]
        Statement myStatement3=null; //[ /DeleteUseCaseConfirm.jsp; Line: 30]
        Statement myStatement4=null; //[ /DeleteUseCaseConfirm.jsp; Line: 31]
        Statement myStatement5=null; //[ /DeleteUseCaseConfirm.jsp; Line: 32]
        Statement myStatement6=null; //[ /DeleteUseCaseConfirm.jsp; Line: 33]
        myConn=ds.getConnection(); //[ /DeleteUseCaseConfirm.jsp; Line: 34]
        myStatement1=myConn.createStatement(); //[ /DeleteUseCaseConfirm.jsp; Line: 35]
        myStatement2=myConn.createStatement(); //[ /DeleteUseCaseConfirm.jsp; Line: 36]
        myStatement3=myConn.createStatement(); //[ /DeleteUseCaseConfirm.jsp; Line: 37]
        myStatement4=myConn.createStatement(); //[ /DeleteUseCaseConfirm.jsp; Line: 38]
        myStatement5=myConn.createStatement(); //[ /DeleteUseCaseConfirm.jsp; Line: 39]
        myStatement6=myConn.createStatement(); //[ /DeleteUseCaseConfirm.jsp; Line: 40]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteUseCaseConfirm.jsp; Line: 43]
        String sql=new String(); //[ /DeleteUseCaseConfirm.jsp; Line: 44]
        ResultSet rs; //[ /DeleteUseCaseConfirm.jsp; Line: 45]
        String textName=new String(); //[ /DeleteUseCaseConfirm.jsp; Line: 46]
        String useCaseName=new String(); //[ /DeleteUseCaseConfirm.jsp; Line: 47]
        long useCaseID=0; //[ /DeleteUseCaseConfirm.jsp; Line: 48]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /DeleteUseCaseConfirm.jsp; Line: 49]
        long projectID=Integer.parseInt(sProjectID); //[ /DeleteUseCaseConfirm.jsp; Line: 50]
        //[ /DeleteUseCaseConfirm.jsp; Line: 51]
        textName="t"+request.getParameter("radiobutton"); //[ /DeleteUseCaseConfirm.jsp; Line: 52]
        useCaseID=Integer.parseInt(request.getParameter(textName)); //[ /DeleteUseCaseConfirm.jsp; Line: 53]
        //[ /DeleteUseCaseConfirm.jsp; Line: 54]
        sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID; //[ /DeleteUseCaseConfirm.jsp; Line: 55]
        rs=myStatement1.executeQuery(sql); //[ /DeleteUseCaseConfirm.jsp; Line: 56]
        //[ /DeleteUseCaseConfirm.jsp; Line: 57]
        if(rs.next()){ //[ /DeleteUseCaseConfirm.jsp; Line: 58]
          if(((String)request.getParameter(textName)).equals((String)session.getAttribute("UseCaseID"))){ //[ /DeleteUseCaseConfirm.jsp; Line: 59]
            //[ /DeleteUseCaseConfirm.jsp; Line: 60]
            session.setAttribute("UseCaseName","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 61]
            session.setAttribute("UseCaseID","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 62]
            session.setAttribute("FunctionPointName","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 63]
            session.setAttribute("FunctionPointID","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 64]
            session.setAttribute("TestElementName","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 65]
            session.setAttribute("TestElementID","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 66]
            session.setAttribute("Type","c"); //[ /DeleteUseCaseConfirm.jsp; Line: 67]
            session.setAttribute("CR_Number","null"); //[ /DeleteUseCaseConfirm.jsp; Line: 68]
          } //[ /DeleteUseCaseConfirm.jsp; Line: 69]
          sql="delete from tctc_uc where uc_id="+useCaseID; //[ /DeleteUseCaseConfirm.jsp; Line: 70]
          myStatement2.executeUpdate(sql); //[ /DeleteUseCaseConfirm.jsp; Line: 71]
          //[ /DeleteUseCaseConfirm.jsp; Line: 72]
          sql="delete from tctc_function_point where uc_id="+useCaseID; //[ /DeleteUseCaseConfirm.jsp; Line: 73]
          myStatement3.executeUpdate(sql); //[ /DeleteUseCaseConfirm.jsp; Line: 74]
          //[ /DeleteUseCaseConfirm.jsp; Line: 75]
          sql="delete from tctc_element where uc_id="+useCaseID; //[ /DeleteUseCaseConfirm.jsp; Line: 76]
          myStatement4.executeUpdate(sql); //[ /DeleteUseCaseConfirm.jsp; Line: 77]
          //[ /DeleteUseCaseConfirm.jsp; Line: 78]
          sql="delete from tctc_information where uc_id="+useCaseID; //[ /DeleteUseCaseConfirm.jsp; Line: 79]
          myStatement5.executeUpdate(sql); //[ /DeleteUseCaseConfirm.jsp; Line: 80]
          //[ /DeleteUseCaseConfirm.jsp; Line: 81]
          sql="delete from tctc_test_case where uc_id="+useCaseID; //[ /DeleteUseCaseConfirm.jsp; Line: 82]
          myStatement6.executeUpdate(sql); //[ /DeleteUseCaseConfirm.jsp; Line: 83]
          //[ /DeleteUseCaseConfirm.jsp; Line: 84]
        } //[ /DeleteUseCaseConfirm.jsp; Line: 85]
        else //[ /DeleteUseCaseConfirm.jsp; Line: 86]
        { //[ /DeleteUseCaseConfirm.jsp; Line: 87]
          session.setAttribute("Error","2.2"); //[ /DeleteUseCaseConfirm.jsp; Line: 88]
        } //[ /DeleteUseCaseConfirm.jsp; Line: 89]
        rs.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 90]
        //[ /DeleteUseCaseConfirm.jsp; Line: 91]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteUseCaseConfirm.jsp; Line: 98]
        myConn.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 99]
        myStatement1.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 100]
        myStatement2.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 101]
        myStatement3.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 102]
        myStatement4.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 103]
        myStatement5.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 104]
        myStatement6.close(); //[ /DeleteUseCaseConfirm.jsp; Line: 105]
      } //[ /DeleteUseCaseConfirm.jsp; Line: 106]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
