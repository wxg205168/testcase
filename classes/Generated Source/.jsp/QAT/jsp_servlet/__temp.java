/* compiled from JSP: /Temp.jsp
*
* This code was automatically generated at 10:39:34 on 2005-8-8
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
import java.sql.*; //[ /Temp.jsp; Line: 6]
import javax.sql.*; //[ /Temp.jsp; Line: 6]


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
* This code was automatically generated at 10:39:34 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __temp
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Temp.jsp", 1123228864000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Temp.jsp", 1123228864000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n<form method=\"POST\" action=\"UseCase.jsp\">\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n    parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /Temp.jsp; Line: 7]
      tt = (mydb.DatabaseBean)request.getAttribute("tt"); //[ /Temp.jsp; Line: 7]
      if (tt == null) { // begin 'tt' instantiation block... //[ /Temp.jsp; Line: 7]
        { // Don't need to synchronize on request scope //[ /Temp.jsp; Line: 7]
          tt = (mydb.DatabaseBean)request.getAttribute("tt"); //[ /Temp.jsp; Line: 7]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /Temp.jsp; Line: 7]
            tt = new mydb.DatabaseBean(); //[ /Temp.jsp; Line: 7]
            request.setAttribute("tt", tt); //[ /Temp.jsp; Line: 7]
          } // end synchronized bean instantiation block... //[ /Temp.jsp; Line: 7]
        } // end synchronized bean scope block... //[ /Temp.jsp; Line: 7]
      } // end bean instantiation block... //[ /Temp.jsp; Line: 7]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /Temp.jsp; Line: 9]
      DataSource ds=null; //[ /Temp.jsp; Line: 10]
      ds=tt.getDataSource(); //[ /Temp.jsp; Line: 11]
      Connection myConn=null; //[ /Temp.jsp; Line: 12]
      Statement myStatement=null; //[ /Temp.jsp; Line: 13]
      myConn=ds.getConnection(); //[ /Temp.jsp; Line: 14]
      myStatement=myConn.createStatement(); //[ /Temp.jsp; Line: 15]
      //[ /Temp.jsp; Line: 16]
      String sPage=(String)session.getAttribute("Page"); //[ /Temp.jsp; Line: 17]
      String temp=(String)session.getAttribute("Temp"); //[ /Temp.jsp; Line: 18]
      String sql=new String(); //[ /Temp.jsp; Line: 19]
      String sProjectID=new String(); //[ /Temp.jsp; Line: 20]
      String sUseCaseID=new String(); //[ /Temp.jsp; Line: 21]
      String sFunctionPointID=new String(); //[ /Temp.jsp; Line: 22]
      ResultSet rs; //[ /Temp.jsp; Line: 23]
      //[ /Temp.jsp; Line: 24]
      if(sPage.equals("1")){ //[ /Temp.jsp; Line: 25]
        sProjectID=(String)session.getAttribute("ProjectID"); //[ /Temp.jsp; Line: 26]
        sql="select uc_id from tctc_uc where project_id="+Integer.parseInt(sProjectID)+" and uc_name='"+temp+"'"; //[ /Temp.jsp; Line: 27]
        rs=myStatement.executeQuery(sql); //[ /Temp.jsp; Line: 28]
        long id=0; //[ /Temp.jsp; Line: 29]
        //[ /Temp.jsp; Line: 30]
        if(rs.next()) //[ /Temp.jsp; Line: 31]
        { //[ /Temp.jsp; Line: 32]
          id=rs.getLong("uc_id"); //[ /Temp.jsp; Line: 33]
          //[ /Temp.jsp; Line: 34]
          session.setAttribute("UseCaseName",temp); //[ /Temp.jsp; Line: 35]
          session.setAttribute("UseCaseID",String.valueOf(id)); //[ /Temp.jsp; Line: 36]
          session.setAttribute("FunctionPointName","null"); //[ /Temp.jsp; Line: 37]
          session.setAttribute("FunctionPointID","null"); //[ /Temp.jsp; Line: 38]
          session.setAttribute("TestElementName","null"); //[ /Temp.jsp; Line: 39]
          session.setAttribute("TestElementID","null"); //[ /Temp.jsp; Line: 40]
          session.setAttribute("Type","c"); //[ /Temp.jsp; Line: 41]
          session.setAttribute("CR_Number","null"); //[ /Temp.jsp; Line: 42]
        } //[ /Temp.jsp; Line: 43]
        else{ //[ /Temp.jsp; Line: 44]
          session.setAttribute("Error","2.4"); //[ /Temp.jsp; Line: 45]
        } //[ /Temp.jsp; Line: 46]
        //    response.sendRedirect("UseCase.jsp"); //[ /Temp.jsp; Line: 47]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /Temp.jsp; Line: 52]
      } //[ /Temp.jsp; Line: 53]
      else if(sPage.equals("2")){ //[ /Temp.jsp; Line: 54]
        sProjectID=(String)session.getAttribute("ProjectID"); //[ /Temp.jsp; Line: 55]
        sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /Temp.jsp; Line: 56]
        sql="select fun_p_id from tctc_function_point where pro_id="+Integer.parseInt(sProjectID)+" and uc_id=" + Integer.parseInt(sUseCaseID) +" and fun_n='"+temp+"'"; //[ /Temp.jsp; Line: 57]
        rs=myStatement.executeQuery(sql); //[ /Temp.jsp; Line: 58]
        long id=0; //[ /Temp.jsp; Line: 59]
        //[ /Temp.jsp; Line: 60]
        if(rs.next()) //[ /Temp.jsp; Line: 61]
        { //[ /Temp.jsp; Line: 62]
          id=rs.getLong("fun_p_id"); //[ /Temp.jsp; Line: 63]
          session.setAttribute("FunctionPointName",temp); //[ /Temp.jsp; Line: 64]
          session.setAttribute("FunctionPointID",String.valueOf(id)); //[ /Temp.jsp; Line: 65]
          session.setAttribute("TestElementName","null"); //[ /Temp.jsp; Line: 66]
          session.setAttribute("TestElementID","null"); //[ /Temp.jsp; Line: 67]
          session.setAttribute("Type","c"); //[ /Temp.jsp; Line: 68]
          session.setAttribute("CR_Number","null"); //[ /Temp.jsp; Line: 69]
        } //[ /Temp.jsp; Line: 70]
        else{ //[ /Temp.jsp; Line: 71]
          session.setAttribute("Error","3.4"); //[ /Temp.jsp; Line: 72]
        } //[ /Temp.jsp; Line: 73]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /Temp.jsp; Line: 78]
      } //[ /Temp.jsp; Line: 79]
      else if(sPage.equals("3")){ //[ /Temp.jsp; Line: 80]
        sProjectID=(String)session.getAttribute("ProjectID"); //[ /Temp.jsp; Line: 81]
        sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /Temp.jsp; Line: 82]
        sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /Temp.jsp; Line: 83]
        sql="select element_id,element_name from tctc_element where project_id=" +Integer.parseInt(sProjectID)+" and uc_id="+Integer.parseInt(sUseCaseID) + " and functionpoint_id="+Integer.parseInt(sFunctionPointID)+" and element_name='"+temp+"'";; //[ /Temp.jsp; Line: 84]
        rs=myStatement.executeQuery(sql); //[ /Temp.jsp; Line: 85]
        long id=0; //[ /Temp.jsp; Line: 86]
        //[ /Temp.jsp; Line: 87]
        if(rs.next()) //[ /Temp.jsp; Line: 88]
        { //[ /Temp.jsp; Line: 89]
          id=rs.getLong("element_id"); //[ /Temp.jsp; Line: 90]
          session.setAttribute("TestElementName",temp); //[ /Temp.jsp; Line: 91]
          session.setAttribute("TestElementID",String.valueOf(id)); //[ /Temp.jsp; Line: 92]
          session.setAttribute("Type","c"); //[ /Temp.jsp; Line: 93]
          session.setAttribute("CR_Number","null"); //[ /Temp.jsp; Line: 94]
        } //[ /Temp.jsp; Line: 95]
        else{ //[ /Temp.jsp; Line: 96]
          session.setAttribute("Error","4.4"); //[ /Temp.jsp; Line: 97]
        } //[ /Temp.jsp; Line: 98]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /Temp.jsp; Line: 103]
      } //[ /Temp.jsp; Line: 104]
      myConn.close(); //[ /Temp.jsp; Line: 105]
      myStatement.close(); //[ /Temp.jsp; Line: 106]
      //[ /Temp.jsp; Line: 107]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
