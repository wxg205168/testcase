/* compiled from JSP: /CreateTestConditionConfirm.jsp
*
* This code was automatically generated at 9:17:53 on 2005-8-8
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
import java.sql.*; //[ /CreateTestConditionConfirm.jsp; Line: 9]
import javax.sql.*; //[ /CreateTestConditionConfirm.jsp; Line: 9]
import java.util.Enumeration; //[ /CreateTestConditionConfirm.jsp; Line: 9]


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
* This code was automatically generated at 9:17:53 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createtestconditionconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateTestConditionConfirm.jsp", 1123463868000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateTestConditionConfirm.jsp", 1123463868000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nCreateTestConditionConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n";
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
      mydb.DatabaseBean tt = null; //[ /CreateTestConditionConfirm.jsp; Line: 10]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateTestConditionConfirm.jsp; Line: 10]
      if (tt == null) { // begin 'tt' instantiation block... //[ /CreateTestConditionConfirm.jsp; Line: 10]
        { // Don't need to synchronize on page scope //[ /CreateTestConditionConfirm.jsp; Line: 10]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateTestConditionConfirm.jsp; Line: 10]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /CreateTestConditionConfirm.jsp; Line: 10]
            tt = new mydb.DatabaseBean(); //[ /CreateTestConditionConfirm.jsp; Line: 10]
            pageContext.setAttribute("tt", tt); //[ /CreateTestConditionConfirm.jsp; Line: 10]
          } // end synchronized bean instantiation block... //[ /CreateTestConditionConfirm.jsp; Line: 10]
        } // end synchronized bean scope block... //[ /CreateTestConditionConfirm.jsp; Line: 10]
      } // end bean instantiation block... //[ /CreateTestConditionConfirm.jsp; Line: 10]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /CreateTestConditionConfirm.jsp; Line: 12]
      Enumeration ss=session.getAttributeNames(); //[ /CreateTestConditionConfirm.jsp; Line: 13]
      //[ /CreateTestConditionConfirm.jsp; Line: 14]
      if(!ss.hasMoreElements()){ //[ /CreateTestConditionConfirm.jsp; Line: 15]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /CreateTestConditionConfirm.jsp; Line: 20]
      } //[ /CreateTestConditionConfirm.jsp; Line: 21]
      else{ //[ /CreateTestConditionConfirm.jsp; Line: 22]
        DataSource ds=null; //[ /CreateTestConditionConfirm.jsp; Line: 23]
        ds=tt.getDataSource(); //[ /CreateTestConditionConfirm.jsp; Line: 24]
        Connection myConn=null; //[ /CreateTestConditionConfirm.jsp; Line: 25]
        Statement myStatement1=null; //[ /CreateTestConditionConfirm.jsp; Line: 26]
        Statement myStatement2=null; //[ /CreateTestConditionConfirm.jsp; Line: 27]
        myConn=ds.getConnection(); //[ /CreateTestConditionConfirm.jsp; Line: 28]
        myStatement1=myConn.createStatement(); //[ /CreateTestConditionConfirm.jsp; Line: 29]
        myStatement2=myConn.createStatement(); //[ /CreateTestConditionConfirm.jsp; Line: 30]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /CreateTestConditionConfirm.jsp; Line: 33]
        String sql=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 34]
        ResultSet rs1, rs2; //[ /CreateTestConditionConfirm.jsp; Line: 35]
        int first=1; //[ /CreateTestConditionConfirm.jsp; Line: 36]
        rs1=null; //[ /CreateTestConditionConfirm.jsp; Line: 37]
        rs2=null; //[ /CreateTestConditionConfirm.jsp; Line: 38]
        String checkName=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 39]
        String hideName=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 40]
        String checkValue=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 41]
        String sNumber=(String)session.getAttribute("CR_Number2"); //[ /CreateTestConditionConfirm.jsp; Line: 42]
        long number=Integer.parseInt(sNumber); //[ /CreateTestConditionConfirm.jsp; Line: 43]
        //[ /CreateTestConditionConfirm.jsp; Line: 44]
        String condition=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 45]
        String content=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 46]
        String sInformationID=new String(); //[ /CreateTestConditionConfirm.jsp; Line: 47]
        long informationID=0; //[ /CreateTestConditionConfirm.jsp; Line: 48]
        //[ /CreateTestConditionConfirm.jsp; Line: 49]
        //[ /CreateTestConditionConfirm.jsp; Line: 50]
        long functionPointID=Integer.parseInt((String)session.getAttribute("FunctionPointID")); //[ /CreateTestConditionConfirm.jsp; Line: 51]
        long projectID=Integer.parseInt((String)session.getAttribute("ProjectID")); //[ /CreateTestConditionConfirm.jsp; Line: 52]
        long useCaseID=Integer.parseInt((String)session.getAttribute("UseCaseID")); //[ /CreateTestConditionConfirm.jsp; Line: 53]
        //[ /CreateTestConditionConfirm.jsp; Line: 54]
        for(int i=1;i<(number+1);i++) //[ /CreateTestConditionConfirm.jsp; Line: 55]
        { //[ /CreateTestConditionConfirm.jsp; Line: 56]
          //[ /CreateTestConditionConfirm.jsp; Line: 57]
          checkName="C"+i; //[ /CreateTestConditionConfirm.jsp; Line: 58]
          checkValue=request.getParameter(checkName); //[ /CreateTestConditionConfirm.jsp; Line: 59]
          //[ /CreateTestConditionConfirm.jsp; Line: 60]
          hideName="T"+checkValue+checkName; //[ /CreateTestConditionConfirm.jsp; Line: 61]
          sInformationID=request.getParameter(hideName); //[ /CreateTestConditionConfirm.jsp; Line: 62]
          //[ /CreateTestConditionConfirm.jsp; Line: 63]
          informationID=Integer.parseInt(sInformationID); //[ /CreateTestConditionConfirm.jsp; Line: 64]
          //[ /CreateTestConditionConfirm.jsp; Line: 65]
          if(first==1){ //[ /CreateTestConditionConfirm.jsp; Line: 66]
            content=String.valueOf(informationID); //[ /CreateTestConditionConfirm.jsp; Line: 67]
            first=0; //[ /CreateTestConditionConfirm.jsp; Line: 68]
          } //[ /CreateTestConditionConfirm.jsp; Line: 69]
          else{ //[ /CreateTestConditionConfirm.jsp; Line: 70]
            content=content+" "+String.valueOf(informationID); //[ /CreateTestConditionConfirm.jsp; Line: 71]
          } //[ /CreateTestConditionConfirm.jsp; Line: 72]
          //[ /CreateTestConditionConfirm.jsp; Line: 73]
        } //[ /CreateTestConditionConfirm.jsp; Line: 74]
        //[ /CreateTestConditionConfirm.jsp; Line: 75]
        //  rs1.close(); //[ /CreateTestConditionConfirm.jsp; Line: 76]
        //[ /CreateTestConditionConfirm.jsp; Line: 77]
        //[ /CreateTestConditionConfirm.jsp; Line: 78]
        if(!content.equals(null)) //[ /CreateTestConditionConfirm.jsp; Line: 79]
        { //[ /CreateTestConditionConfirm.jsp; Line: 80]
          sql="select * from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID+" and inf_dis='"+content+"'"; //[ /CreateTestConditionConfirm.jsp; Line: 81]
          rs2=myStatement1.executeQuery(sql); //[ /CreateTestConditionConfirm.jsp; Line: 82]
          if(!rs2.next()){ //[ /CreateTestConditionConfirm.jsp; Line: 83]
            sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id) values(seq_tctc_information.nextval,'condition','" + content + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"')"; //[ /CreateTestConditionConfirm.jsp; Line: 84]
            myStatement2.executeUpdate(sql); //[ /CreateTestConditionConfirm.jsp; Line: 85]
          } //[ /CreateTestConditionConfirm.jsp; Line: 86]
          rs2.close(); //[ /CreateTestConditionConfirm.jsp; Line: 87]
        } //[ /CreateTestConditionConfirm.jsp; Line: 88]
        //[ /CreateTestConditionConfirm.jsp; Line: 89]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /CreateTestConditionConfirm.jsp; Line: 94]
        myConn.close(); //[ /CreateTestConditionConfirm.jsp; Line: 95]
        myStatement1.close(); //[ /CreateTestConditionConfirm.jsp; Line: 96]
        myStatement2.close(); //[ /CreateTestConditionConfirm.jsp; Line: 97]
      } //[ /CreateTestConditionConfirm.jsp; Line: 98]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
