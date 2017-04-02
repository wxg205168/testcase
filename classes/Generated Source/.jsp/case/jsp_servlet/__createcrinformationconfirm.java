/* compiled from JSP: /CreateCRInformationConfirm.jsp
*
* This code was automatically generated at 12:44:40 on 2005-8-29
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
import java.sql.*; //[ /CreateCRInformationConfirm.jsp; Line: 10]
import javax.sql.*; //[ /CreateCRInformationConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /CreateCRInformationConfirm.jsp; Line: 10]


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
* This code was automatically generated at 12:44:40 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createcrinformationconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateCRInformationConfirm.jsp", 1123655526000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateCRInformationConfirm.jsp", 1123655526000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nCreateCRInformationConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
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
  private final static String _wl_block6 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'EnquireCRInfromation.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'EnquireCRInfromation.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n<script LANGUAGE=\"javascript\">\r\n    parent.location.href=\'EnquireCRInfromation.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  
  
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
      mydb.DatabaseBean tt = null; //[ /CreateCRInformationConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateCRInformationConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /CreateCRInformationConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /CreateCRInformationConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /CreateCRInformationConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /CreateCRInformationConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /CreateCRInformationConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /CreateCRInformationConfirm.jsp; Line: 12]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateCRInformationConfirm.jsp; Line: 12]
      if (rr == null) { // begin 'rr' instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /CreateCRInformationConfirm.jsp; Line: 12]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /CreateCRInformationConfirm.jsp; Line: 12]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 12]
            rr = new managestring.mystring(); //[ /CreateCRInformationConfirm.jsp; Line: 12]
            pageContext.setAttribute("rr", rr); //[ /CreateCRInformationConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /CreateCRInformationConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /CreateCRInformationConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /CreateCRInformationConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /CreateCRInformationConfirm.jsp; Line: 15]
      //[ /CreateCRInformationConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /CreateCRInformationConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /CreateCRInformationConfirm.jsp; Line: 22]
      } //[ /CreateCRInformationConfirm.jsp; Line: 23]
      else{ //[ /CreateCRInformationConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /CreateCRInformationConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /CreateCRInformationConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /CreateCRInformationConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /CreateCRInformationConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /CreateCRInformationConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /CreateCRInformationConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /CreateCRInformationConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /CreateCRInformationConfirm.jsp; Line: 32]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /CreateCRInformationConfirm.jsp; Line: 35]
        //[ /CreateCRInformationConfirm.jsp; Line: 36]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /CreateCRInformationConfirm.jsp; Line: 37]
        String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /CreateCRInformationConfirm.jsp; Line: 38]
        String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /CreateCRInformationConfirm.jsp; Line: 39]
        String sTestElementID=(String)session.getAttribute("TestElementID"); //[ /CreateCRInformationConfirm.jsp; Line: 40]
        //[ /CreateCRInformationConfirm.jsp; Line: 41]
        if(sProjectID.equals("null")){ //[ /CreateCRInformationConfirm.jsp; Line: 42]
          //[ /CreateCRInformationConfirm.jsp; Line: 43]
          session.setAttribute("Error","2.1"); //[ /CreateCRInformationConfirm.jsp; Line: 44]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /CreateCRInformationConfirm.jsp; Line: 49]
        } //[ /CreateCRInformationConfirm.jsp; Line: 50]
        else if(sUseCaseID.equals("null")){ //[ /CreateCRInformationConfirm.jsp; Line: 51]
          session.setAttribute("Error","3.1"); //[ /CreateCRInformationConfirm.jsp; Line: 52]
          _writeText(response, out, _wl_block7, _wl_block7Bytes);
          //[ /CreateCRInformationConfirm.jsp; Line: 57]
        } //[ /CreateCRInformationConfirm.jsp; Line: 58]
        else if(sFunctionPointID.equals("null")){ //[ /CreateCRInformationConfirm.jsp; Line: 59]
          session.setAttribute("Error","4.1"); //[ /CreateCRInformationConfirm.jsp; Line: 60]
          _writeText(response, out, _wl_block8, _wl_block8Bytes);
          //[ /CreateCRInformationConfirm.jsp; Line: 65]
        } //[ /CreateCRInformationConfirm.jsp; Line: 66]
        else{ //[ /CreateCRInformationConfirm.jsp; Line: 67]
          //[ /CreateCRInformationConfirm.jsp; Line: 68]
          long projectID=Integer.parseInt(sProjectID); //[ /CreateCRInformationConfirm.jsp; Line: 69]
          long useCaseID=Integer.parseInt(sUseCaseID); //[ /CreateCRInformationConfirm.jsp; Line: 70]
          long functionPointID=Integer.parseInt(sFunctionPointID); //[ /CreateCRInformationConfirm.jsp; Line: 71]
          long testElementID=0; //[ /CreateCRInformationConfirm.jsp; Line: 72]
          //[ /CreateCRInformationConfirm.jsp; Line: 73]
          String MaterialType=(String)request.getParameter("radiobutton"); //[ /CreateCRInformationConfirm.jsp; Line: 74]
          String type=new String(); //[ /CreateCRInformationConfirm.jsp; Line: 75]
          String sType=new String(); //[ /CreateCRInformationConfirm.jsp; Line: 76]
          String sql; //[ /CreateCRInformationConfirm.jsp; Line: 77]
          ResultSet rs; //[ /CreateCRInformationConfirm.jsp; Line: 78]
          //[ /CreateCRInformationConfirm.jsp; Line: 79]
          //[ /CreateCRInformationConfirm.jsp; Line: 80]
          if((MaterialType.equals("1") && (!sTestElementID.equals("null"))) || MaterialType.equals("2")) //[ /CreateCRInformationConfirm.jsp; Line: 81]
          { //[ /CreateCRInformationConfirm.jsp; Line: 82]
            //[ /CreateCRInformationConfirm.jsp; Line: 83]
            if(MaterialType.equals("1")){ //[ /CreateCRInformationConfirm.jsp; Line: 84]
              type="c"; //[ /CreateCRInformationConfirm.jsp; Line: 85]
              sType="condition"; //[ /CreateCRInformationConfirm.jsp; Line: 86]
              testElementID=Integer.parseInt(sTestElementID); //[ /CreateCRInformationConfirm.jsp; Line: 87]
              //[ /CreateCRInformationConfirm.jsp; Line: 88]
            } //[ /CreateCRInformationConfirm.jsp; Line: 89]
            else if(MaterialType.equals("2")){ //[ /CreateCRInformationConfirm.jsp; Line: 90]
              type="r"; //[ /CreateCRInformationConfirm.jsp; Line: 91]
              sType="result"; //[ /CreateCRInformationConfirm.jsp; Line: 92]
            } //[ /CreateCRInformationConfirm.jsp; Line: 93]
            String dis= request.getParameter("textarea"); //[ /CreateCRInformationConfirm.jsp; Line: 94]
            dis=rr.replaceString(dis); //[ /CreateCRInformationConfirm.jsp; Line: 95]
            dis=rr.restore(dis); //[ /CreateCRInformationConfirm.jsp; Line: 96]
            dis=dis.trim(); //[ /CreateCRInformationConfirm.jsp; Line: 97]
            //[ /CreateCRInformationConfirm.jsp; Line: 98]
            if(dis==null){ //[ /CreateCRInformationConfirm.jsp; Line: 99]
              session.setAttribute("Error","5.3"); //[ /CreateCRInformationConfirm.jsp; Line: 100]
              _writeText(response, out, _wl_block9, _wl_block9Bytes);
              //[ /CreateCRInformationConfirm.jsp; Line: 105]
              //[ /CreateCRInformationConfirm.jsp; Line: 106]
            } //[ /CreateCRInformationConfirm.jsp; Line: 107]
            else{ //[ /CreateCRInformationConfirm.jsp; Line: 108]
              //[ /CreateCRInformationConfirm.jsp; Line: 109]
              sql="select * from tctc_information where fun_p_id="+functionPointID+" and inf_type='"+type +"' and inf_dis='"+dis+"' and project_id="+projectID+" and uc_id="+useCaseID; //[ /CreateCRInformationConfirm.jsp; Line: 110]
              rs=myStatement1.executeQuery(sql); //[ /CreateCRInformationConfirm.jsp; Line: 111]
              if (rs.next()){ //[ /CreateCRInformationConfirm.jsp; Line: 112]
                rs.close(); //[ /CreateCRInformationConfirm.jsp; Line: 113]
                session.setAttribute("Error","5.2"); //[ /CreateCRInformationConfirm.jsp; Line: 114]
                _writeText(response, out, _wl_block10, _wl_block10Bytes);
                //[ /CreateCRInformationConfirm.jsp; Line: 119]
              } //[ /CreateCRInformationConfirm.jsp; Line: 120]
              else{ //[ /CreateCRInformationConfirm.jsp; Line: 121]
                //[ /CreateCRInformationConfirm.jsp; Line: 122]
                if(rr.checkString(dis)){ //[ /CreateCRInformationConfirm.jsp; Line: 123]
                  //[ /CreateCRInformationConfirm.jsp; Line: 124]
                  if(MaterialType.equals("1")){ //[ /CreateCRInformationConfirm.jsp; Line: 125]
                    sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id,element_id) values(seq_tctc_information.nextval,'" + type + "','" + dis + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"','"+testElementID+"')"; //[ /CreateCRInformationConfirm.jsp; Line: 126]
                  } //[ /CreateCRInformationConfirm.jsp; Line: 127]
                  else if(MaterialType.equals("2")){ //[ /CreateCRInformationConfirm.jsp; Line: 128]
                    sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id) values(seq_tctc_information.nextval,'" + type + "','" + dis + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"')"; //[ /CreateCRInformationConfirm.jsp; Line: 129]
                  } //[ /CreateCRInformationConfirm.jsp; Line: 130]
                  //[ /CreateCRInformationConfirm.jsp; Line: 131]
                  myStatement2.executeUpdate(sql); //[ /CreateCRInformationConfirm.jsp; Line: 132]
                  rs.close(); //[ /CreateCRInformationConfirm.jsp; Line: 133]
                  session.setAttribute("Type",type); //[ /CreateCRInformationConfirm.jsp; Line: 134]
                } //[ /CreateCRInformationConfirm.jsp; Line: 135]
                else{ //[ /CreateCRInformationConfirm.jsp; Line: 136]
                  session.setAttribute("Error","5.3"); //[ /CreateCRInformationConfirm.jsp; Line: 137]
                } //[ /CreateCRInformationConfirm.jsp; Line: 138]
                //[ /CreateCRInformationConfirm.jsp; Line: 139]
                _writeText(response, out, _wl_block11, _wl_block11Bytes);
                //[ /CreateCRInformationConfirm.jsp; Line: 144]
              } //[ /CreateCRInformationConfirm.jsp; Line: 145]
            } //[ /CreateCRInformationConfirm.jsp; Line: 146]
          } //[ /CreateCRInformationConfirm.jsp; Line: 147]
          else //[ /CreateCRInformationConfirm.jsp; Line: 148]
          { //[ /CreateCRInformationConfirm.jsp; Line: 149]
            session.setAttribute("Error","5.1"); //[ /CreateCRInformationConfirm.jsp; Line: 150]
            //[ /CreateCRInformationConfirm.jsp; Line: 151]
            _writeText(response, out, _wl_block12, _wl_block12Bytes);
            //[ /CreateCRInformationConfirm.jsp; Line: 156]
          } //[ /CreateCRInformationConfirm.jsp; Line: 157]
        } //[ /CreateCRInformationConfirm.jsp; Line: 158]
        _writeText(response, out, _wl_block13, _wl_block13Bytes);
        //[ /CreateCRInformationConfirm.jsp; Line: 160]
        myConn.close(); //[ /CreateCRInformationConfirm.jsp; Line: 161]
        myStatement1.close(); //[ /CreateCRInformationConfirm.jsp; Line: 162]
        myStatement2.close(); //[ /CreateCRInformationConfirm.jsp; Line: 163]
      } //[ /CreateCRInformationConfirm.jsp; Line: 164]
      _writeText(response, out, _wl_block14, _wl_block14Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
