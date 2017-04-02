/* compiled from JSP: /UpdateUseCaseConfirm.jsp
*
* This code was automatically generated at 12:47:05 on 2005-8-29
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
import java.sql.*; //[ /UpdateUseCaseConfirm.jsp; Line: 12]
import javax.sql.*; //[ /UpdateUseCaseConfirm.jsp; Line: 12]
import java.util.Enumeration; //[ /UpdateUseCaseConfirm.jsp; Line: 12]


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
* This code was automatically generated at 12:47:05 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __updateusecaseconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateUseCaseConfirm.jsp", 1123659022000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateUseCaseConfirm.jsp", 1123659022000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nUpdatetUseCaseConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n<form action=\"SelectUseCase.jsp\">\r\n\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /UpdateUseCaseConfirm.jsp; Line: 13]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateUseCaseConfirm.jsp; Line: 13]
      if (tt == null) { // begin 'tt' instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 13]
        { // Don't need to synchronize on page scope //[ /UpdateUseCaseConfirm.jsp; Line: 13]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateUseCaseConfirm.jsp; Line: 13]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 13]
            tt = new mydb.DatabaseBean(); //[ /UpdateUseCaseConfirm.jsp; Line: 13]
            pageContext.setAttribute("tt", tt); //[ /UpdateUseCaseConfirm.jsp; Line: 13]
          } // end synchronized bean instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 13]
        } // end synchronized bean scope block... //[ /UpdateUseCaseConfirm.jsp; Line: 13]
      } // end bean instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 13]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /UpdateUseCaseConfirm.jsp; Line: 14]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateUseCaseConfirm.jsp; Line: 14]
      if (rr == null) { // begin 'rr' instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 14]
        { // Don't need to synchronize on page scope //[ /UpdateUseCaseConfirm.jsp; Line: 14]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateUseCaseConfirm.jsp; Line: 14]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 14]
            rr = new managestring.mystring(); //[ /UpdateUseCaseConfirm.jsp; Line: 14]
            pageContext.setAttribute("rr", rr); //[ /UpdateUseCaseConfirm.jsp; Line: 14]
          } // end synchronized bean instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 14]
        } // end synchronized bean scope block... //[ /UpdateUseCaseConfirm.jsp; Line: 14]
      } // end bean instantiation block... //[ /UpdateUseCaseConfirm.jsp; Line: 14]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /UpdateUseCaseConfirm.jsp; Line: 16]
      Enumeration ss=session.getAttributeNames(); //[ /UpdateUseCaseConfirm.jsp; Line: 17]
      //[ /UpdateUseCaseConfirm.jsp; Line: 18]
      if(!ss.hasMoreElements()){ //[ /UpdateUseCaseConfirm.jsp; Line: 19]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /UpdateUseCaseConfirm.jsp; Line: 24]
      } //[ /UpdateUseCaseConfirm.jsp; Line: 25]
      else{ //[ /UpdateUseCaseConfirm.jsp; Line: 26]
        DataSource ds=null; //[ /UpdateUseCaseConfirm.jsp; Line: 27]
        ds=tt.getDataSource(); //[ /UpdateUseCaseConfirm.jsp; Line: 28]
        Connection myConn=null; //[ /UpdateUseCaseConfirm.jsp; Line: 29]
        Statement myStatement1=null; //[ /UpdateUseCaseConfirm.jsp; Line: 30]
        Statement myStatement2=null; //[ /UpdateUseCaseConfirm.jsp; Line: 31]
        myConn=ds.getConnection(); //[ /UpdateUseCaseConfirm.jsp; Line: 32]
        myStatement1=myConn.createStatement(); //[ /UpdateUseCaseConfirm.jsp; Line: 33]
        myStatement2=myConn.createStatement(); //[ /UpdateUseCaseConfirm.jsp; Line: 34]
        //[ /UpdateUseCaseConfirm.jsp; Line: 35]
        String sql=new String(); //[ /UpdateUseCaseConfirm.jsp; Line: 36]
        ResultSet rs; //[ /UpdateUseCaseConfirm.jsp; Line: 37]
        String textName=new String(); //[ /UpdateUseCaseConfirm.jsp; Line: 38]
        String textName1=new String(); //[ /UpdateUseCaseConfirm.jsp; Line: 39]
        String textName2=new String(); //[ /UpdateUseCaseConfirm.jsp; Line: 40]
        String useCaseName=new String(); //[ /UpdateUseCaseConfirm.jsp; Line: 41]
        String useCaseAB=new String(); //[ /UpdateUseCaseConfirm.jsp; Line: 42]
        long useCaseID=0; //[ /UpdateUseCaseConfirm.jsp; Line: 43]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /UpdateUseCaseConfirm.jsp; Line: 44]
        long projectID=Integer.parseInt(sProjectID); //[ /UpdateUseCaseConfirm.jsp; Line: 45]
        //[ /UpdateUseCaseConfirm.jsp; Line: 46]
        textName="t"+request.getParameter("radiobutton"); //[ /UpdateUseCaseConfirm.jsp; Line: 47]
        textName1="u"+request.getParameter("radiobutton"); //[ /UpdateUseCaseConfirm.jsp; Line: 48]
        textName2="uu"+request.getParameter("radiobutton"); //[ /UpdateUseCaseConfirm.jsp; Line: 49]
        useCaseID=Integer.parseInt(request.getParameter(textName)); //[ /UpdateUseCaseConfirm.jsp; Line: 50]
        useCaseName=(String)request.getParameter(textName1); //[ /UpdateUseCaseConfirm.jsp; Line: 51]
        useCaseAB=(String)request.getParameter(textName2); //[ /UpdateUseCaseConfirm.jsp; Line: 52]
        useCaseName=rr.replaceString(useCaseName); //[ /UpdateUseCaseConfirm.jsp; Line: 53]
        useCaseName=rr.restore(useCaseName); //[ /UpdateUseCaseConfirm.jsp; Line: 54]
        useCaseAB=rr.replaceString(useCaseAB); //[ /UpdateUseCaseConfirm.jsp; Line: 55]
        useCaseAB=rr.restore(useCaseAB); //[ /UpdateUseCaseConfirm.jsp; Line: 56]
        useCaseName=useCaseName.trim(); //[ /UpdateUseCaseConfirm.jsp; Line: 57]
        useCaseAB=useCaseAB.trim(); //[ /UpdateUseCaseConfirm.jsp; Line: 58]
        //[ /UpdateUseCaseConfirm.jsp; Line: 59]
        if(rr.checkString(useCaseAB) && rr.checkString(useCaseName)){ //[ /UpdateUseCaseConfirm.jsp; Line: 60]
          //[ /UpdateUseCaseConfirm.jsp; Line: 61]
          sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID; //[ /UpdateUseCaseConfirm.jsp; Line: 62]
          rs=myStatement1.executeQuery(sql); //[ /UpdateUseCaseConfirm.jsp; Line: 63]
          //[ /UpdateUseCaseConfirm.jsp; Line: 64]
          if(rs.next()){ //[ /UpdateUseCaseConfirm.jsp; Line: 65]
            //[ /UpdateUseCaseConfirm.jsp; Line: 66]
            sql="update tctc_uc set uc_name='"+useCaseName+"', uc_ab='"+useCaseAB+"' where uc_id="+useCaseID; //[ /UpdateUseCaseConfirm.jsp; Line: 67]
            myStatement2.executeUpdate(sql); //[ /UpdateUseCaseConfirm.jsp; Line: 68]
            //[ /UpdateUseCaseConfirm.jsp; Line: 69]
          } //[ /UpdateUseCaseConfirm.jsp; Line: 70]
          else{ //[ /UpdateUseCaseConfirm.jsp; Line: 71]
            session.setAttribute("Error","2.2"); //[ /UpdateUseCaseConfirm.jsp; Line: 72]
          } //[ /UpdateUseCaseConfirm.jsp; Line: 73]
          rs.close(); //[ /UpdateUseCaseConfirm.jsp; Line: 74]
        } //[ /UpdateUseCaseConfirm.jsp; Line: 75]
        else{ //[ /UpdateUseCaseConfirm.jsp; Line: 76]
          session.setAttribute("Error","2.5"); //[ /UpdateUseCaseConfirm.jsp; Line: 77]
        } //[ /UpdateUseCaseConfirm.jsp; Line: 78]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /UpdateUseCaseConfirm.jsp; Line: 85]
        myConn.close(); //[ /UpdateUseCaseConfirm.jsp; Line: 86]
        myStatement1.close(); //[ /UpdateUseCaseConfirm.jsp; Line: 87]
        myStatement2.close(); //[ /UpdateUseCaseConfirm.jsp; Line: 88]
      } //[ /UpdateUseCaseConfirm.jsp; Line: 89]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
