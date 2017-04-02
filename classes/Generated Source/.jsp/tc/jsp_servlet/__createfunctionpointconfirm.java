/* compiled from JSP: /CreateFunctionPointConfirm.jsp
*
* This code was automatically generated at 15:08:38 on 2005-8-9
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
import java.sql.*; //[ /CreateFunctionPointConfirm.jsp; Line: 10]
import javax.sql.*; //[ /CreateFunctionPointConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /CreateFunctionPointConfirm.jsp; Line: 10]


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
* This code was automatically generated at 15:08:39 on 2005-8-9
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createfunctionpointconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateFunctionPointConfirm.jsp", 1123571084000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateFunctionPointConfirm.jsp", 1123571084000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nCreateFunctionPointConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
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
  private final static String _wl_block6 = "\r\n\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  
  
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
      mydb.DatabaseBean tt = null; //[ /CreateFunctionPointConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)request.getAttribute("tt"); //[ /CreateFunctionPointConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 11]
        { // Don't need to synchronize on request scope //[ /CreateFunctionPointConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)request.getAttribute("tt"); //[ /CreateFunctionPointConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /CreateFunctionPointConfirm.jsp; Line: 11]
            request.setAttribute("tt", tt); //[ /CreateFunctionPointConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /CreateFunctionPointConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /CreateFunctionPointConfirm.jsp; Line: 12]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateFunctionPointConfirm.jsp; Line: 12]
      if (rr == null) { // begin 'rr' instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /CreateFunctionPointConfirm.jsp; Line: 12]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateFunctionPointConfirm.jsp; Line: 12]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 12]
            rr = new managestring.mystring(); //[ /CreateFunctionPointConfirm.jsp; Line: 12]
            pageContext.setAttribute("rr", rr); //[ /CreateFunctionPointConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /CreateFunctionPointConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /CreateFunctionPointConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /CreateFunctionPointConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /CreateFunctionPointConfirm.jsp; Line: 15]
      //[ /CreateFunctionPointConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /CreateFunctionPointConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /CreateFunctionPointConfirm.jsp; Line: 22]
      } //[ /CreateFunctionPointConfirm.jsp; Line: 23]
      else{ //[ /CreateFunctionPointConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /CreateFunctionPointConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /CreateFunctionPointConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /CreateFunctionPointConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /CreateFunctionPointConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /CreateFunctionPointConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /CreateFunctionPointConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /CreateFunctionPointConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /CreateFunctionPointConfirm.jsp; Line: 32]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /CreateFunctionPointConfirm.jsp; Line: 35]
        //[ /CreateFunctionPointConfirm.jsp; Line: 36]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /CreateFunctionPointConfirm.jsp; Line: 37]
        String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /CreateFunctionPointConfirm.jsp; Line: 38]
        long projectID=0; //[ /CreateFunctionPointConfirm.jsp; Line: 39]
        long useCaseID=0; //[ /CreateFunctionPointConfirm.jsp; Line: 40]
        //[ /CreateFunctionPointConfirm.jsp; Line: 41]
        if(sProjectID.equals("null") || sProjectID.equals(null)){ //[ /CreateFunctionPointConfirm.jsp; Line: 42]
          session.setAttribute("Error","2.1"); //[ /CreateFunctionPointConfirm.jsp; Line: 43]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /CreateFunctionPointConfirm.jsp; Line: 50]
        } //[ /CreateFunctionPointConfirm.jsp; Line: 51]
        else if(sUseCaseID.equals("null") || sUseCaseID.equals(null)){ //[ /CreateFunctionPointConfirm.jsp; Line: 52]
          session.setAttribute("Error","3.1"); //[ /CreateFunctionPointConfirm.jsp; Line: 53]
          _writeText(response, out, _wl_block7, _wl_block7Bytes);
          //[ /CreateFunctionPointConfirm.jsp; Line: 58]
        } //[ /CreateFunctionPointConfirm.jsp; Line: 59]
        else{ //[ /CreateFunctionPointConfirm.jsp; Line: 60]
          projectID=Integer.parseInt(sProjectID); //[ /CreateFunctionPointConfirm.jsp; Line: 61]
          useCaseID=Integer.parseInt(sUseCaseID); //[ /CreateFunctionPointConfirm.jsp; Line: 62]
          //[ /CreateFunctionPointConfirm.jsp; Line: 63]
          String functionPointName = new String(); //[ /CreateFunctionPointConfirm.jsp; Line: 64]
          String sql=new String(); //[ /CreateFunctionPointConfirm.jsp; Line: 65]
          ResultSet rs; //[ /CreateFunctionPointConfirm.jsp; Line: 66]
          functionPointName=request.getParameter("functionpoint"); //[ /CreateFunctionPointConfirm.jsp; Line: 67]
          functionPointName=rr.replaceString(functionPointName); //[ /CreateFunctionPointConfirm.jsp; Line: 68]
          functionPointName=rr.restore(functionPointName); //[ /CreateFunctionPointConfirm.jsp; Line: 69]
          functionPointName=functionPointName.trim(); //[ /CreateFunctionPointConfirm.jsp; Line: 70]
          //[ /CreateFunctionPointConfirm.jsp; Line: 71]
          sql="select fun_n from tctc_function_point where pro_id="+projectID+" and uc_id=" + useCaseID +" and fun_n='"+functionPointName+"'"; //[ /CreateFunctionPointConfirm.jsp; Line: 72]
          rs=myStatement1.executeQuery(sql); //[ /CreateFunctionPointConfirm.jsp; Line: 73]
          //[ /CreateFunctionPointConfirm.jsp; Line: 74]
          if(rs.next()){ //[ /CreateFunctionPointConfirm.jsp; Line: 75]
            session.setAttribute("Error","3.3"); //[ /CreateFunctionPointConfirm.jsp; Line: 76]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /CreateFunctionPointConfirm.jsp; Line: 81]
          } //[ /CreateFunctionPointConfirm.jsp; Line: 82]
          else{ //[ /CreateFunctionPointConfirm.jsp; Line: 83]
            //[ /CreateFunctionPointConfirm.jsp; Line: 84]
            sql="insert into tctc_function_point (fun_p_id,fun_n,pro_id,uc_id) values(seq_tctc_function_point.nextval,'" + functionPointName + "','" + projectID + "','"+useCaseID+"')"; //[ /CreateFunctionPointConfirm.jsp; Line: 85]
            myStatement2.executeUpdate(sql); //[ /CreateFunctionPointConfirm.jsp; Line: 86]
            session.setAttribute("Temp",functionPointName); //[ /CreateFunctionPointConfirm.jsp; Line: 87]
            session.setAttribute("Page","2"); //[ /CreateFunctionPointConfirm.jsp; Line: 88]
            response.sendRedirect("Temp.jsp"); //[ /CreateFunctionPointConfirm.jsp; Line: 89]
          } //[ /CreateFunctionPointConfirm.jsp; Line: 90]
          rs.close(); //[ /CreateFunctionPointConfirm.jsp; Line: 91]
        } //[ /CreateFunctionPointConfirm.jsp; Line: 92]
        _writeText(response, out, _wl_block9, _wl_block9Bytes);
        //[ /CreateFunctionPointConfirm.jsp; Line: 94]
        myConn.close(); //[ /CreateFunctionPointConfirm.jsp; Line: 95]
        myStatement1.close(); //[ /CreateFunctionPointConfirm.jsp; Line: 96]
        myStatement2.close(); //[ /CreateFunctionPointConfirm.jsp; Line: 97]
      } //[ /CreateFunctionPointConfirm.jsp; Line: 98]
      _writeText(response, out, _wl_block10, _wl_block10Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
