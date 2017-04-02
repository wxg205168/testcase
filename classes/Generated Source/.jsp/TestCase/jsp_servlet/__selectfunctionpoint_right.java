/* compiled from JSP: /SelectFunctionPoint_Right.jsp
*
* This code was automatically generated at 8:46:27 on 2005-6-30
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
import java.sql.*; //[ /SelectFunctionPoint_Right.jsp; Line: 59]


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
* This code was automatically generated at 8:46:27 on 2005-6-30
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selectfunctionpoint_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectFunctionPoint_Right.jsp", 1120091940000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectFunctionPoint_Right.jsp", 1120091940000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n\r\n</head>\r\n\r\n<script language=\"JavaScript\">\r\n\r\nfunction isValid(form){\r\n  if(form.testelement.value!=\"\"){\r\n    return true;\r\n  }\r\n  else{\r\n    alert(\"Test Element Name can not be blank!\");\r\n    return false;\r\n  }\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"SelectFunctionPointConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[0].action=\"DeleteFunctionPointConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\nfunction testSubmit2()\r\n{\r\ndocument.forms[1].action=\"CreateFunctionPointConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n<form method=\"post\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-FunctionPoint-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n<table width=\"300\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Error:";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n\r\n<table width=\"300\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">You can select a FunctionPoint from list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">FunctionPoint Name </span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = " checked=\"checked\" /></TD>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = " /></TD>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n\r\n      <TD align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "<input type=\"hidden\" name=";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = " value=";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n\r\n  </TBODY>\r\n</TABLE>\r\n\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\">&nbsp;&nbsp;&nbsp;<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n</form>\r\n\r\n<form method=\"POST\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-Create-FunctionPoint.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n<table width=\"300\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Please input FunctionPoint information:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD height=\"25\" width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">FunctionPoint Name </span></TD>\r\n    </TR>\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=\"functionpoint\" type=\"text\" size=\"105\" maxlength=\"200\"></TD>\r\n    </TR>\r\n  </TBODY>\r\n</TABLE>\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\"  onClick=\"testSubmit2()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  
  
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
    
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /SelectFunctionPoint_Right.jsp; Line: 60]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectFunctionPoint_Right.jsp; Line: 60]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectFunctionPoint_Right.jsp; Line: 60]
        { // Don't need to synchronize on page scope //[ /SelectFunctionPoint_Right.jsp; Line: 60]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectFunctionPoint_Right.jsp; Line: 60]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectFunctionPoint_Right.jsp; Line: 60]
            tt = new mydb.DatabaseBean(); //[ /SelectFunctionPoint_Right.jsp; Line: 60]
            pageContext.setAttribute("tt", tt); //[ /SelectFunctionPoint_Right.jsp; Line: 60]
          } // end synchronized bean instantiation block... //[ /SelectFunctionPoint_Right.jsp; Line: 60]
        } // end synchronized bean scope block... //[ /SelectFunctionPoint_Right.jsp; Line: 60]
      } // end bean instantiation block... //[ /SelectFunctionPoint_Right.jsp; Line: 60]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /SelectFunctionPoint_Right.jsp; Line: 70]
      String sql=new String(); //[ /SelectFunctionPoint_Right.jsp; Line: 71]
      ResultSet rs; //[ /SelectFunctionPoint_Right.jsp; Line: 72]
      String sError=(String)session.getAttribute("Error"); //[ /SelectFunctionPoint_Right.jsp; Line: 73]
      String dis=new String(); //[ /SelectFunctionPoint_Right.jsp; Line: 74]
      //[ /SelectFunctionPoint_Right.jsp; Line: 75]
      if(sError.equals("3.1") || sError.equals("3.2") || sError.equals("3.3") || sError.equals("3.4") || sError.equals("4.1")) //[ /SelectFunctionPoint_Right.jsp; Line: 76]
      { //[ /SelectFunctionPoint_Right.jsp; Line: 77]
        session.setAttribute("Error","null"); //[ /SelectFunctionPoint_Right.jsp; Line: 78]
        sql="select error_dis from tctc_error where error_code='"+sError+"'"; //[ /SelectFunctionPoint_Right.jsp; Line: 79]
        rs=tt.executeQuery(sql); //[ /SelectFunctionPoint_Right.jsp; Line: 80]
        if(rs.next()) //[ /SelectFunctionPoint_Right.jsp; Line: 81]
        { //[ /SelectFunctionPoint_Right.jsp; Line: 82]
          dis=rs.getString("error_dis"); //[ /SelectFunctionPoint_Right.jsp; Line: 83]
          //[ /SelectFunctionPoint_Right.jsp; Line: 84]
          _writeText(response, out, _wl_block3, _wl_block3Bytes);
          out.print(String.valueOf(dis ));  //[ /SelectFunctionPoint_Right.jsp; Line: 90]
          _writeText(response, out, _wl_block4, _wl_block4Bytes);
          //[ /SelectFunctionPoint_Right.jsp; Line: 95]
        } //[ /SelectFunctionPoint_Right.jsp; Line: 96]
      } //[ /SelectFunctionPoint_Right.jsp; Line: 97]
      _writeText(response, out, _wl_block5, _wl_block5Bytes);
      //[ /SelectFunctionPoint_Right.jsp; Line: 117]
      String radioName=new String(); //[ /SelectFunctionPoint_Right.jsp; Line: 118]
      String textName=new String(); //[ /SelectFunctionPoint_Right.jsp; Line: 119]
      String functionPointName=new String(); //[ /SelectFunctionPoint_Right.jsp; Line: 120]
      int noData=0; //[ /SelectFunctionPoint_Right.jsp; Line: 121]
      //[ /SelectFunctionPoint_Right.jsp; Line: 122]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /SelectFunctionPoint_Right.jsp; Line: 123]
      String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /SelectFunctionPoint_Right.jsp; Line: 124]
      //[ /SelectFunctionPoint_Right.jsp; Line: 125]
      if(sProjectID.equals("null")){ //[ /SelectFunctionPoint_Right.jsp; Line: 126]
        //[ /SelectFunctionPoint_Right.jsp; Line: 127]
        session.setAttribute("Error","2.1"); //[ /SelectFunctionPoint_Right.jsp; Line: 128]
        _writeText(response, out, _wl_block6, _wl_block6Bytes);
        //[ /SelectFunctionPoint_Right.jsp; Line: 133]
      } //[ /SelectFunctionPoint_Right.jsp; Line: 134]
      else if(sUseCaseID.equals("null")){ //[ /SelectFunctionPoint_Right.jsp; Line: 135]
        session.setAttribute("Error","3.1"); //[ /SelectFunctionPoint_Right.jsp; Line: 136]
        _writeText(response, out, _wl_block7, _wl_block7Bytes);
        //[ /SelectFunctionPoint_Right.jsp; Line: 141]
      } //[ /SelectFunctionPoint_Right.jsp; Line: 142]
      else{ //[ /SelectFunctionPoint_Right.jsp; Line: 143]
        //[ /SelectFunctionPoint_Right.jsp; Line: 144]
        long projectID=Integer.parseInt(sProjectID); //[ /SelectFunctionPoint_Right.jsp; Line: 145]
        long useCaseID=Integer.parseInt(sUseCaseID); //[ /SelectFunctionPoint_Right.jsp; Line: 146]
        long functionPointID=0; //[ /SelectFunctionPoint_Right.jsp; Line: 147]
        //[ /SelectFunctionPoint_Right.jsp; Line: 148]
        int number=0; //[ /SelectFunctionPoint_Right.jsp; Line: 149]
        //[ /SelectFunctionPoint_Right.jsp; Line: 150]
        sql="select fun_p_id,fun_n from tctc_function_point where pro_id=" +projectID+" and uc_id="+useCaseID; //[ /SelectFunctionPoint_Right.jsp; Line: 151]
        rs=tt.executeQuery(sql); //[ /SelectFunctionPoint_Right.jsp; Line: 152]
        //[ /SelectFunctionPoint_Right.jsp; Line: 153]
        if(rs.next()){ //[ /SelectFunctionPoint_Right.jsp; Line: 154]
          noData=1; //[ /SelectFunctionPoint_Right.jsp; Line: 155]
          //[ /SelectFunctionPoint_Right.jsp; Line: 156]
          do{ //[ /SelectFunctionPoint_Right.jsp; Line: 157]
            functionPointID=rs.getLong("fun_p_id"); //[ /SelectFunctionPoint_Right.jsp; Line: 158]
            functionPointName=rs.getString("fun_n"); //[ /SelectFunctionPoint_Right.jsp; Line: 159]
            number=number+1; //[ /SelectFunctionPoint_Right.jsp; Line: 160]
            radioName=String.valueOf(number); //[ /SelectFunctionPoint_Right.jsp; Line: 161]
            textName="t"+String.valueOf(number); //[ /SelectFunctionPoint_Right.jsp; Line: 162]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /SelectFunctionPoint_Right.jsp; Line: 165]
            if(number==1){ //[ /SelectFunctionPoint_Right.jsp; Line: 166]
              _writeText(response, out, _wl_block9, _wl_block9Bytes);
              out.print(String.valueOf(radioName ));  //[ /SelectFunctionPoint_Right.jsp; Line: 168]
              _writeText(response, out, _wl_block10, _wl_block10Bytes);
              //[ /SelectFunctionPoint_Right.jsp; Line: 169]
            } //[ /SelectFunctionPoint_Right.jsp; Line: 170]
            else{ //[ /SelectFunctionPoint_Right.jsp; Line: 171]
              _writeText(response, out, _wl_block11, _wl_block11Bytes);
              out.print(String.valueOf(radioName ));  //[ /SelectFunctionPoint_Right.jsp; Line: 173]
              _writeText(response, out, _wl_block12, _wl_block12Bytes);
              //[ /SelectFunctionPoint_Right.jsp; Line: 174]
            } //[ /SelectFunctionPoint_Right.jsp; Line: 175]
            _writeText(response, out, _wl_block13, _wl_block13Bytes);
            out.print(String.valueOf(functionPointName ));  //[ /SelectFunctionPoint_Right.jsp; Line: 178]
            _writeText(response, out, _wl_block14, _wl_block14Bytes);
            out.print(String.valueOf(textName ));  //[ /SelectFunctionPoint_Right.jsp; Line: 178]
            _writeText(response, out, _wl_block15, _wl_block15Bytes);
            out.print(String.valueOf(functionPointID ));  //[ /SelectFunctionPoint_Right.jsp; Line: 178]
            _writeText(response, out, _wl_block16, _wl_block16Bytes);
            //[ /SelectFunctionPoint_Right.jsp; Line: 180]
          }while(rs.next()); //[ /SelectFunctionPoint_Right.jsp; Line: 181]
          rs.close(); //[ /SelectFunctionPoint_Right.jsp; Line: 182]
        } //[ /SelectFunctionPoint_Right.jsp; Line: 183]
      } //[ /SelectFunctionPoint_Right.jsp; Line: 184]
      _writeText(response, out, _wl_block17, _wl_block17Bytes);
      //[ /SelectFunctionPoint_Right.jsp; Line: 190]
      if(noData==1){ //[ /SelectFunctionPoint_Right.jsp; Line: 191]
        _writeText(response, out, _wl_block18, _wl_block18Bytes);
        //[ /SelectFunctionPoint_Right.jsp; Line: 201]
      } //[ /SelectFunctionPoint_Right.jsp; Line: 202]
      _writeText(response, out, _wl_block19, _wl_block19Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
