/* compiled from JSP: /CreateUseCaseConfirm.jsp
*
* This code was automatically generated at 12:44:55 on 2005-8-29
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
import java.sql.*; //[ /CreateUseCaseConfirm.jsp; Line: 10]
import javax.sql.*; //[ /CreateUseCaseConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /CreateUseCaseConfirm.jsp; Line: 10]


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
* This code was automatically generated at 12:44:55 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createusecaseconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateUseCaseConfirm.jsp", 1123658494000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateUseCaseConfirm.jsp", 1123658494000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nCreateUseCaseConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
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
  private final static String _wl_block6 = "\r\n      <script language=\"JavaScript\">\r\n        parent.location.href=\'SelectUseCase.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n    <script language=\"JavaScript\">\r\n      parent.location.href=\'SelectUseCase.jsp\'\r\n    </script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  
  
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
      mydb.DatabaseBean tt = null; //[ /CreateUseCaseConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateUseCaseConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /CreateUseCaseConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateUseCaseConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /CreateUseCaseConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /CreateUseCaseConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /CreateUseCaseConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /CreateUseCaseConfirm.jsp; Line: 12]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateUseCaseConfirm.jsp; Line: 12]
      if (rr == null) { // begin 'rr' instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /CreateUseCaseConfirm.jsp; Line: 12]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateUseCaseConfirm.jsp; Line: 12]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 12]
            rr = new managestring.mystring(); //[ /CreateUseCaseConfirm.jsp; Line: 12]
            pageContext.setAttribute("rr", rr); //[ /CreateUseCaseConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /CreateUseCaseConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /CreateUseCaseConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /CreateUseCaseConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /CreateUseCaseConfirm.jsp; Line: 15]
      //[ /CreateUseCaseConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /CreateUseCaseConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /CreateUseCaseConfirm.jsp; Line: 22]
      } //[ /CreateUseCaseConfirm.jsp; Line: 23]
      else{ //[ /CreateUseCaseConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /CreateUseCaseConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /CreateUseCaseConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /CreateUseCaseConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /CreateUseCaseConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /CreateUseCaseConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /CreateUseCaseConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /CreateUseCaseConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /CreateUseCaseConfirm.jsp; Line: 32]
        //[ /CreateUseCaseConfirm.jsp; Line: 33]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /CreateUseCaseConfirm.jsp; Line: 36]
        String selectname = new String(); //[ /CreateUseCaseConfirm.jsp; Line: 37]
        String uc_name = new String(); //[ /CreateUseCaseConfirm.jsp; Line: 38]
        String uc_ab=new String(); //[ /CreateUseCaseConfirm.jsp; Line: 39]
        long project_id = 0; //[ /CreateUseCaseConfirm.jsp; Line: 40]
        String sql; //[ /CreateUseCaseConfirm.jsp; Line: 41]
        ResultSet rs; //[ /CreateUseCaseConfirm.jsp; Line: 42]
        selectname=(String)session.getAttribute("ProjectID"); //[ /CreateUseCaseConfirm.jsp; Line: 43]
        uc_name=request.getParameter("usecase"); //[ /CreateUseCaseConfirm.jsp; Line: 44]
        uc_ab=request.getParameter("ab"); //[ /CreateUseCaseConfirm.jsp; Line: 45]
        uc_name=rr.replaceString(uc_name); //[ /CreateUseCaseConfirm.jsp; Line: 46]
        uc_name=rr.restore(uc_name); //[ /CreateUseCaseConfirm.jsp; Line: 47]
        uc_name=uc_name.trim(); //[ /CreateUseCaseConfirm.jsp; Line: 48]
        uc_ab=uc_ab.trim(); //[ /CreateUseCaseConfirm.jsp; Line: 49]
        uc_ab=rr.replaceString(uc_ab); //[ /CreateUseCaseConfirm.jsp; Line: 50]
        //[ /CreateUseCaseConfirm.jsp; Line: 51]
        project_id=Integer.parseInt(selectname); //[ /CreateUseCaseConfirm.jsp; Line: 52]
        //[ /CreateUseCaseConfirm.jsp; Line: 53]
        if(rr.checkString(uc_ab) && rr.checkString(uc_name)){ //[ /CreateUseCaseConfirm.jsp; Line: 54]
          //[ /CreateUseCaseConfirm.jsp; Line: 55]
          sql="select * from tctc_uc where project_id="+project_id+" and uc_name='"+uc_name+"'"; //[ /CreateUseCaseConfirm.jsp; Line: 56]
          rs=myStatement1.executeQuery(sql); //[ /CreateUseCaseConfirm.jsp; Line: 57]
          //[ /CreateUseCaseConfirm.jsp; Line: 58]
          if(rs.next()){ //[ /CreateUseCaseConfirm.jsp; Line: 59]
            session.setAttribute("Error","2.3"); //[ /CreateUseCaseConfirm.jsp; Line: 60]
            //    response.sendRedirect("UseCase.jsp"); //[ /CreateUseCaseConfirm.jsp; Line: 61]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            //[ /CreateUseCaseConfirm.jsp; Line: 66]
          } //[ /CreateUseCaseConfirm.jsp; Line: 67]
          else{ //[ /CreateUseCaseConfirm.jsp; Line: 68]
            //[ /CreateUseCaseConfirm.jsp; Line: 69]
            sql="insert into tctc_uc (uc_id,uc_name,project_id,uc_ab) values(seq_tctc_uc.nextval,'" + uc_name + "'," + project_id+ ",'"+uc_ab+"')"; //[ /CreateUseCaseConfirm.jsp; Line: 70]
            myStatement2.executeUpdate(sql); //[ /CreateUseCaseConfirm.jsp; Line: 71]
            session.setAttribute("Temp",uc_name); //[ /CreateUseCaseConfirm.jsp; Line: 72]
            session.setAttribute("Page","1"); //[ /CreateUseCaseConfirm.jsp; Line: 73]
            response.sendRedirect("Temp.jsp"); //[ /CreateUseCaseConfirm.jsp; Line: 74]
            //[ /CreateUseCaseConfirm.jsp; Line: 75]
          } //[ /CreateUseCaseConfirm.jsp; Line: 76]
          rs.close(); //[ /CreateUseCaseConfirm.jsp; Line: 77]
        } //[ /CreateUseCaseConfirm.jsp; Line: 78]
        else{ //[ /CreateUseCaseConfirm.jsp; Line: 79]
          session.setAttribute("Error","2.5"); //[ /CreateUseCaseConfirm.jsp; Line: 80]
          _writeText(response, out, _wl_block7, _wl_block7Bytes);
          //[ /CreateUseCaseConfirm.jsp; Line: 85]
        } //[ /CreateUseCaseConfirm.jsp; Line: 86]
        _writeText(response, out, _wl_block8, _wl_block8Bytes);
        //[ /CreateUseCaseConfirm.jsp; Line: 88]
        myConn.close(); //[ /CreateUseCaseConfirm.jsp; Line: 89]
        myStatement1.close(); //[ /CreateUseCaseConfirm.jsp; Line: 90]
        myStatement2.close(); //[ /CreateUseCaseConfirm.jsp; Line: 91]
      } //[ /CreateUseCaseConfirm.jsp; Line: 92]
      _writeText(response, out, _wl_block9, _wl_block9Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
