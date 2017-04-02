package excel;

import java.io.*;
import java.sql.*;
import javax.sql.*;
import java.lang.String;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.*;
import mydb.DatabaseBean;
import managestring.mystring;
import java.io.File;


public class GenerateExcel{

  public GenerateExcel() {
    File myfile=new File("\\..\\tsgs");
    File[] tempfile=myfile.listFiles();

    for(int i=0;i<tempfile.length;i++){
      tempfile[i].delete();
    }

  }

private static void generateCell(HSSFWorkbook wb,HSSFRow row,short foregroundColor,short position,int type,String value){

    HSSFCellStyle style=wb.createCellStyle();
    style.setFillForegroundColor(foregroundColor);
    style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
    style.setWrapText(true);
    style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
    HSSFCell cell=row.createCell(position);
    cell.setCellStyle(style);
    cell.setCellType(type);
    cell.setCellValue(value);
}

  public void getExcel(String projectID,String fileName){

    try {
      DatabaseBean tt = new DatabaseBean();

      DataSource ds=null;
      ds=tt.getDataSource();
      Connection myConn=null;
      Statement myStatement7=null;
      Statement myStatement1=null;
      Statement myStatement2=null;
      Statement myStatement3=null;
      Statement myStatement4=null;
      Statement myStatement5=null;
      Statement myStatement6=null;
      myConn=ds.getConnection();
      myStatement1=myConn.createStatement();
      myStatement2=myConn.createStatement();
      myStatement3=myConn.createStatement();
      myStatement4=myConn.createStatement();
      myStatement5=myConn.createStatement();
      myStatement6=myConn.createStatement();
      myStatement7=myConn.createStatement();

      String sql = new String();
      String sCondition=new String();
      String sResult=new String();
      String functionPointName=new String();
      long functionPointID = 0;
      ResultSet rs1;
      ResultSet rs2;
      ResultSet rs3;
      ResultSet rs4;
      ResultSet rs5;
      ResultSet rs6;
      rs6=null;
      rs5=null;
      rs4=null;
      rs3=null;
      rs2=null;
      rs1=null;
      int first2=0;
      int first3=0;
      String temp[];
      mystring rr=new mystring();
      String condition1=new String();
      String ucName=new String();
      long ucID=0;
      int oneRow = 0;

      int rowNumber=0;
      HSSFSheet sheet;
      HSSFRow row;
      HSSFCell cell;
      HSSFPrintSetup ps;
      HSSFHeader header;

      HSSFSheet sheet3;
      HSSFHeader header3;
      HSSFFooter footer3;
      HSSFRow rowc0;
      HSSFRow rowc1;
      HSSFRow rowc2;
      HSSFRow rowc3;
      HSSFRow rowc4;
      HSSFRow rowc5;
      HSSFCell cellc0;
      HSSFCell cellc1;
      HSSFCell cellc2;
      HSSFCell cellc3;
      HSSFCell cellc4;
      HSSFCell cellc5;
      HSSFCell cellc6;
      HSSFCell cellc7;
      HSSFCell cellc8;
      HSSFCell cellc9;
      HSSFCell cellc10;
      HSSFCell cellc11;
      HSSFCell cellc12;
      HSSFCell cellc13;
      HSSFCell cellc14;
      HSSFRow rowci;
      HSSFCell cellcij;
      HSSFRow rowc9;
      HSSFCell cellc90;
      HSSFCell cellc91;
      HSSFCell cellc92;
      HSSFCell cellc93;
      HSSFCell cellc94;
      HSSFCell cellc95;
      HSSFCell cellc96;
      HSSFCell cellc97;
      HSSFCell cellc98;
      HSSFCell cellc99;
      HSSFCell cellc910;
      HSSFRow rowc10;
      HSSFCell cellc100;
      HSSFCell cellc101;
      HSSFCell cellc102;
      HSSFCell cellc103;
      HSSFCell cellc104;
      HSSFCell cellc105;
      HSSFCell cellc106;
      HSSFCell cellc107;
      HSSFCell cellc108;
      HSSFCell cellc109;
      HSSFCell cellc1010;
      HSSFRow rowc12;
      HSSFCell cellc120;
      HSSFCell cellc121;
      HSSFCell cellc122;
      HSSFCell cellc123;
      HSSFCell cellc124;
      HSSFCell cellc125;
      HSSFCell cellc126;
      HSSFCell cellc127;
      HSSFCell cellc128;
      HSSFCell cellc129;
      HSSFCell cellc1210;

      HSSFRow rowc13;
      HSSFCell cellc130;
      HSSFCell cellc131;
      HSSFCell cellc132;
      HSSFCell cellc133;
      HSSFCell cellc134;
      HSSFCell cellc135;
      HSSFCell cellc136;
      HSSFCell cellc137;
      HSSFCell cellc138;
      HSSFCell cellc139;
      HSSFCell cellc1310;

      HSSFRow rowc14;
      HSSFCell cellc140;
      HSSFCell cellc141;
      HSSFCell cellc142;
      HSSFCell cellc143;
      HSSFCell cellc144;
      HSSFCell cellc145;
      HSSFCell cellc146;
      HSSFCell cellc147;
      HSSFCell cellc148;
      HSSFCell cellc149;
      HSSFCell cellc1410;

      String[] array_name;

      int sheetNumber=2;
      String type=new String();

      HSSFWorkbook workbook = new HSSFWorkbook();
      HSSFCellStyle cs = workbook.createCellStyle();
      cs.setWrapText( true );

      sheet=workbook.createSheet("Cover Page");
      header = sheet.getHeader();
      //header.setCenter("Center Header");
      header.setLeft("PSA Corporation Ltd Confidential");
      header.setRight("Project Name from DB");
      HSSFFooter footer = sheet.getFooter();
      footer.setCenter("Page " + HSSFFooter.page() + " of " +HSSFFooter.numPages());

      HSSFRow row0=sheet.createRow((short)0);
      HSSFRow row1=sheet.createRow((short)1);
      HSSFRow row2=sheet.createRow((short)2);
      HSSFRow row3=sheet.createRow((short)3);
      HSSFRow row4=sheet.createRow((short)4);
      HSSFRow row5=sheet.createRow((short)5);
      HSSFRow row6=sheet.createRow((short)6);
      HSSFRow row7=sheet.createRow((short)7);
      HSSFRow row8=sheet.createRow((short)8);
      HSSFRow row9=sheet.createRow((short)9);
      HSSFRow row10=sheet.createRow((short)10);
      HSSFRow row11=sheet.createRow((short)11);
      HSSFRow row12=sheet.createRow((short)12);
      HSSFRow row13=sheet.createRow((short)13);
      HSSFRow row14=sheet.createRow((short)14);
      HSSFRow row15=sheet.createRow((short)15);
      HSSFRow row16=sheet.createRow((short)16);
      HSSFRow row17=sheet.createRow((short)17);
      HSSFRow row18=sheet.createRow((short)18);
      HSSFRow row19=sheet.createRow((short)19);
      HSSFRow row20=sheet.createRow((short)20);
      HSSFRow row21=sheet.createRow((short)21);
      HSSFRow row22=sheet.createRow((short)22);
      HSSFRow row23=sheet.createRow((short)23);
      HSSFRow row24=sheet.createRow((short)24);

      //set column width
      sheet.setColumnWidth( (short) 0, (short) ( ( 50 * 3 ) / ( (double) 1 / 20 ) ) );
      sheet.setColumnWidth( (short) 1, (short) ( ( 50 * 4 ) / ( (double) 1 / 20 ) ) );
      sheet.setColumnWidth( (short) 2, (short) ( ( 50 * 3 ) / ( (double) 1 / 20 ) ) );
      sheet.setColumnWidth( (short) 3, (short) ( ( 50 * 3 ) / ( (double) 1 / 20 ) ) );
      sheet.setColumnWidth( (short) 4, (short) ( ( 50 * 4 ) / ( (double) 1 / 20 ) ) );
      sheet.setColumnWidth( (short) 5, (short) ( ( 50 * 5 ) / ( (double) 1 / 20 ) ) );

    //Merging cells
      sheet.addMergedRegion(new Region(0,(short)0,4,(short)5));
      sheet.addMergedRegion(new Region(5,(short)0,5,(short)5));
      sheet.addMergedRegion(new Region(6,(short)0,6,(short)5));
      sheet.addMergedRegion(new Region(10,(short)1,10,(short)5));
      sheet.addMergedRegion(new Region(11,(short)1,11,(short)3));
      sheet.addMergedRegion(new Region(12,(short)3,12,(short)5));
      sheet.addMergedRegion(new Region(13,(short)3,13,(short)5));
      sheet.addMergedRegion(new Region(14,(short)3,14,(short)5));
      sheet.addMergedRegion(new Region(17,(short)0,17,(short)5));
      sheet.addMergedRegion(new Region(18,(short)0,18,(short)1));
      sheet.addMergedRegion(new Region(18,(short)2,18,(short)3));
      sheet.addMergedRegion(new Region(19,(short)0,19,(short)1));
      sheet.addMergedRegion(new Region(19,(short)2,19,(short)3));
      sheet.addMergedRegion(new Region(20,(short)0,20,(short)1));
      sheet.addMergedRegion(new Region(20,(short)2,20,(short)3));
      sheet.addMergedRegion(new Region(21,(short)0,21,(short)5));
      sheet.addMergedRegion(new Region(22,(short)0,22,(short)1));
      sheet.addMergedRegion(new Region(22,(short)2,22,(short)3));
      sheet.addMergedRegion(new Region(23,(short)0,23,(short)1));
      sheet.addMergedRegion(new Region(23,(short)2,23,(short)3));
      sheet.addMergedRegion(new Region(24,(short)0,24,(short)1));
      sheet.addMergedRegion(new Region(24,(short)2,24,(short)3));

      //		       font:12 bule bold.
      HSSFFont font = workbook.createFont();
      font.setFontHeightInPoints((short)12);
      font.setFontName("Arial");
      font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font.setColor(HSSFColor.BLUE.index);
      //		     font1:12 black bold.
      HSSFFont font1 = workbook.createFont();
      font1.setFontHeightInPoints((short)12);
      font1.setFontName("Arial");
      font1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font1.setColor(HSSFColor.BLACK.index);
      //		      font2:9 black bold.
      HSSFFont font2 = workbook.createFont();
      font2.setFontHeightInPoints((short)9);
      font2.setFontName("Arial");
      font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font2.setColor(HSSFColor.BLACK.index);
      //		      font3:9 bule bold.
      HSSFFont font3 = workbook.createFont();
      font3.setFontHeightInPoints((short)9);
      font3.setFontName("Arial");
      font3.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font3.setColor(HSSFColor.BLUE.index);
      //		      font4:9 blue
      HSSFFont font4 = workbook.createFont();
      font4.setFontHeightInPoints((short)9);
      font4.setFontName("Arial");
      //font4.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font4.setColor(HSSFColor.BLUE.index);
      //		      font5:12 white bold
      HSSFFont font5 = workbook.createFont();
      font5.setFontHeightInPoints((short)12);
      font5.setFontName("Arial");
      font5.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font5.setColor(HSSFColor.WHITE.index);

      //		      font6:9 white bold
      HSSFFont font6 = workbook.createFont();
      font6.setFontHeightInPoints((short)9);
      font6.setFontName("Arial");
      font6.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      font6.setColor(HSSFColor.WHITE.index);

      //		      borders except bottom and no background colour. font:12 bule bold.
      HSSFCellStyle style = workbook.createCellStyle();
      style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style.setLeftBorderColor(HSSFColor.BLACK.index);
      style.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style.setRightBorderColor(HSSFColor.BLACK.index);
      style.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style.setTopBorderColor(HSSFColor.BLACK.index);
      style.setWrapText( true );
      style.setFont(font);

      //borders except top and no background colour. font1:12 black bold.
      HSSFCellStyle style1 = workbook.createCellStyle();
      style1.setWrapText( true );
      style1.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style1.setBottomBorderColor(HSSFColor.BLACK.index);
      style1.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style1.setLeftBorderColor(HSSFColor.BLACK.index);
      style1.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style1.setRightBorderColor(HSSFColor.BLACK.index);
      style1.setFont(font1);

      //	 	      borders all round and backgroud colour is blue. font2:9 black bold.
      HSSFCellStyle style2 = workbook.createCellStyle();
      style2.setWrapText( true );
      style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style2.setBottomBorderColor(HSSFColor.BLACK.index);
      style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style2.setLeftBorderColor(HSSFColor.BLACK.index);
      style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style2.setRightBorderColor(HSSFColor.BLACK.index);
      style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style2.setTopBorderColor(HSSFColor.BLACK.index);
      style2.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
      style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style2.setFont(font2);

      //	 	    borders all round no backgroud colour.font3:9 bule bold
      HSSFCellStyle style3 = workbook.createCellStyle();
      style3.setWrapText( true );
      style3.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style3.setBottomBorderColor(HSSFColor.BLACK.index);
      style3.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style3.setLeftBorderColor(HSSFColor.BLACK.index);
      style3.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style3.setRightBorderColor(HSSFColor.BLACK.index);
      style3.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style3.setTopBorderColor(HSSFColor.BLACK.index);
      style3.setFillForegroundColor(HSSFColor.WHITE.index);
      style3.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
      style3.setFont(font3);

      //date cell
      HSSFCellStyle style4 = workbook.createCellStyle();
      style4.setWrapText( true );
      style4.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style4.setBottomBorderColor(HSSFColor.BLACK.index);
      style4.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style4.setLeftBorderColor(HSSFColor.BLACK.index);
      style4.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style4.setRightBorderColor(HSSFColor.BLACK.index);
      style4.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style4.setTopBorderColor(HSSFColor.BLACK.index);
      style4.setDataFormat(HSSFDataFormat.getBuiltinFormat("d-mmm-yy"));
      style4.setFont(font3);

      //	 	     borders all round no backgroud colour.font2:9 black bold.
      HSSFCellStyle style5 = workbook.createCellStyle();
      style5.setWrapText( true );
      style5.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style5.setBottomBorderColor(HSSFColor.BLACK.index);
      style5.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style5.setLeftBorderColor(HSSFColor.BLACK.index);
      style5.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style5.setRightBorderColor(HSSFColor.BLACK.index);
      style5.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style5.setTopBorderColor(HSSFColor.BLACK.index);
      style5.setFont(font2);

      //borders all round and backgroud colour is sky blue.font1:12 black bold.
      HSSFCellStyle style6 = workbook.createCellStyle();
      style6.setWrapText( true );
      style6.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style6.setBottomBorderColor(HSSFColor.BLACK.index);
      style6.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style6.setLeftBorderColor(HSSFColor.BLACK.index);
      style6.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style6.setRightBorderColor(HSSFColor.BLACK.index);
      style6.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style6.setTopBorderColor(HSSFColor.BLACK.index);
      style6.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
      style6.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style6.setFont(font1);

      //	 	    borders all round and not background colour. font blue 9.
      HSSFCellStyle style7 = workbook.createCellStyle();
      style7.setWrapText( true );
      style7.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style7.setBottomBorderColor(HSSFColor.BLACK.index);
      style7.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style7.setLeftBorderColor(HSSFColor.BLACK.index);
      style7.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style7.setRightBorderColor(HSSFColor.BLACK.index);
      style7.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style7.setTopBorderColor(HSSFColor.BLACK.index);
      style7.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
      style7.setFont(font4);

      //	 	      Style the cell with no border  font2:9 black bold.
      HSSFCellStyle style8 = workbook.createCellStyle();
      style8.setWrapText( true );
      style8.setFont(font2);

      //	 	      Style the cell with no border and  font blue 9.
      HSSFCellStyle style9 = workbook.createCellStyle();
      style9.setWrapText( true );
      style9.setFont(font4);

      //	 	     borders all round and backgroud colour is blue font white 12.
      HSSFCellStyle style10 = workbook.createCellStyle();
      style10.setWrapText( true );
      style10.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style10.setBottomBorderColor(HSSFColor.BLACK.index);
      style10.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style10.setLeftBorderColor(HSSFColor.BLACK.index);
      style10.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style10.setRightBorderColor(HSSFColor.BLACK.index);
      style10.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style10.setTopBorderColor(HSSFColor.BLACK.index);
      style10.setFillForegroundColor(HSSFColor.BLUE.index);
      style10.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style10.setFillBackgroundColor(HSSFColor.BLUE.index);
      style10.setVerticalAlignment((short)1);
      style10.setAlignment(HSSFCellStyle.ALIGN_CENTER);
      style10.setFont(font5);

      //	 	      Style the cell with borders all round and backgroud colour is blue font white 9.
      HSSFCellStyle style11 = workbook.createCellStyle();
      style11.setWrapText( true );
      style11.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style11.setBottomBorderColor(HSSFColor.BLACK.index);
      style11.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style11.setLeftBorderColor(HSSFColor.BLACK.index);
      style11.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style11.setRightBorderColor(HSSFColor.BLACK.index);
      style11.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style11.setTopBorderColor(HSSFColor.BLACK.index);
      style11.setFillForegroundColor(HSSFColor.BLUE.index);
      style11.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style11.setFont(font6);

      //	 	      Style the cell with borders all round and backgroud colour is blue font white 9.
      HSSFCellStyle style12 = workbook.createCellStyle();
      style12.setWrapText( true );
      style12.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style12.setBottomBorderColor(HSSFColor.BLACK.index);
      style12.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style12.setLeftBorderColor(HSSFColor.BLACK.index);
      style12.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style12.setRightBorderColor(HSSFColor.BLACK.index);
      style12.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style12.setTopBorderColor(HSSFColor.BLACK.index);
      style12.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
      style12.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style12.setAlignment(HSSFCellStyle.ALIGN_CENTER);
      style12.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
      style12.setFont(font2);

      HSSFCellStyle style13 = workbook.createCellStyle();
      style13.setWrapText( true );
      style13.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
      style13.setFont(font);

      cell = row5.createCell((short) 0);
      cell.setCellValue("<Project name> <System Name>");
      cell.setCellStyle(style);
      HSSFCell cell1 = row5.createCell((short) 1);
      cell1.setCellStyle(style);
      HSSFCell cell2 = row5.createCell((short) 2);
      cell2.setCellStyle(style);
      HSSFCell cell3 = row5.createCell((short) 3);
      cell3.setCellStyle(style);
      HSSFCell cell4 = row5.createCell((short) 4);
      cell4.setCellStyle(style);
      HSSFCell cell5 = row5.createCell((short) 5);
      cell5.setCellStyle(style);

      HSSFCell cell6 = row6.createCell((short) 0);
      cell6.setCellValue("<Module/SIT> Test Specification & Test Coverage Matrix");
      HSSFCell cell7 = row6.createCell((short) 1);
      HSSFCell cell8 = row6.createCell((short) 2);
      HSSFCell cell9 = row6.createCell((short) 3);
      HSSFCell cell10 = row6.createCell((short) 4);
      HSSFCell cell11 = row6.createCell((short) 5);

      HSSFCell cell12 = row9.createCell((short) 0);
      cell12.setCellValue("Project:");
      HSSFCell cell13 = row9.createCell((short) 1);
      HSSFCell cell14 = row9.createCell((short) 2);
      cell14.setCellValue("Version No:");
      HSSFCell cell15 = row9.createCell((short) 3);
      HSSFCell cell16 = row9.createCell((short) 4);
      cell16.setCellValue("Version Date:");
      HSSFCell cell17 = row9.createCell((short) 5);

      HSSFCell cell18 = row10.createCell((short) 0);
      cell18.setCellValue("Title:");
      HSSFCell cell19 = row10.createCell((short) 1);
      cell19.setCellValue("Test Specification & Test Coverage Matrix Template");
      HSSFCell cell20 = row10.createCell((short) 2);
      HSSFCell cell21 = row10.createCell((short) 3);
      HSSFCell cell22 = row10.createCell((short) 4);
      HSSFCell cell23 = row10.createCell((short) 5);

      HSSFCell cell24 = row11.createCell((short) 0);
      cell24.setCellValue("Filename:");
      HSSFCell cell25 = row11.createCell((short) 1);
      cell25.setCellValue("Test Spec and Test Coverage Matrix");
      HSSFCell cell26 = row11.createCell((short) 2);
      HSSFCell cell27 = row11.createCell((short) 3);
      HSSFCell cell28 = row11.createCell((short) 4);
      cell28.setCellValue("Template:");
      HSSFCell cell29 = row11.createCell((short) 5);

      HSSFCell cell30 = row12.createCell((short) 0);
      cell30.setCellValue("Version");
      HSSFCell cell31 = row12.createCell((short) 1);
      cell31.setCellValue("Date");
      HSSFCell cell32 = row12.createCell((short) 2);
      cell32.setCellValue("By");
      HSSFCell cell33 = row12.createCell((short) 3);
      cell33.setCellValue("Summary");
      HSSFCell cell34 = row12.createCell((short) 4);
      HSSFCell cell35 = row12.createCell((short) 5);

      HSSFCell cell36 = row13.createCell((short) 0);
      HSSFCell cell37 = row13.createCell((short) 1);
      HSSFCell cell38 = row13.createCell((short) 2);
      HSSFCell cell39 = row13.createCell((short) 3);
      HSSFCell cell40 = row13.createCell((short) 4);
      HSSFCell cell41 = row13.createCell((short) 5);

      HSSFCell cell42 = row14.createCell((short) 0);
      HSSFCell cell43 = row14.createCell((short) 1);
      HSSFCell cell44 = row14.createCell((short) 2);
      HSSFCell cell45 = row14.createCell((short) 3);
      HSSFCell cell46 = row14.createCell((short) 4);
      HSSFCell cell47 = row14.createCell((short) 5);

      HSSFCell cell48 = row17.createCell((short) 0);
      cell48.setCellValue("REVIEWED BY:");
      HSSFCell cell49 = row17.createCell((short) 1);
      HSSFCell cell50 = row17.createCell((short) 2);
      HSSFCell cell51 = row17.createCell((short) 3);
      HSSFCell cell52 = row17.createCell((short) 4);
      HSSFCell cell53 = row17.createCell((short) 5);

      HSSFCell cell54 = row18.createCell((short) 0);
      cell54.setCellValue("Title");
      cell54.setCellStyle(style5);
      HSSFCell cell55 = row18.createCell((short) 1);
      cell55.setCellStyle(style5);
      HSSFCell cell56 = row18.createCell((short) 2);
      cell56.setCellValue("R & A by");
      cell56.setCellStyle(style5);
      HSSFCell cell57 = row18.createCell((short) 3);
      cell57.setCellStyle(style5);
      HSSFCell cell58 = row18.createCell((short) 4);
      cell58.setCellValue("Signature");
      cell58.setCellStyle(style5);
      HSSFCell cell59 = row18.createCell((short) 5);
      cell59.setCellValue("Date");
      cell59.setCellStyle(style5);

      HSSFCell cell60 = row19.createCell((short) 0);
      cell60.setCellValue("Project Leader");
      cell60.setCellStyle(style5);
      HSSFCell cell61 = row19.createCell((short) 1);
      cell61.setCellStyle(style5);
      HSSFCell cell62 = row19.createCell((short) 2);
      HSSFCell cell63 = row19.createCell((short) 3);
      HSSFCell cell64 = row19.createCell((short) 4);
      HSSFCell cell65 = row19.createCell((short) 5);

      HSSFCell cell66 = row20.createCell((short) 0);
      cell66.setCellStyle(style5);
      HSSFCell cell67 = row20.createCell((short) 1);
      cell67.setCellStyle(style5);
      HSSFCell cell68 = row20.createCell((short) 2);
      HSSFCell cell69= row20.createCell((short) 3);
      HSSFCell cell70 = row20.createCell((short) 4);
      HSSFCell cell71 = row20.createCell((short) 5);

      HSSFCell cell72 = row21.createCell((short) 0);
      cell72.setCellValue("APPROVED BY:");
      HSSFCell cell73 = row21.createCell((short) 1);
      HSSFCell cell74 = row21.createCell((short) 2);
      HSSFCell cell75 = row21.createCell((short) 3);
      HSSFCell cell76 = row21.createCell((short) 4);
      HSSFCell cell77 = row21.createCell((short) 5);

      HSSFCell cell78 = row22.createCell((short) 0);
      cell78.setCellValue("Title");
      cell78.setCellStyle(style5);
      HSSFCell cell79 = row22.createCell((short) 1);
      cell79.setCellStyle(style5);
      HSSFCell cell80 = row22.createCell((short) 2);
      cell80.setCellValue("Approved by");
      cell80.setCellStyle(style5);
      HSSFCell cell81 = row22.createCell((short) 3);
      cell81.setCellStyle(style5);
      HSSFCell cell82 = row22.createCell((short) 4);
      cell82.setCellValue("Signature");
      cell82.setCellStyle(style5);
      HSSFCell cell83 = row22.createCell((short) 5);
      cell83.setCellValue("Date");
      cell83.setCellStyle(style5);

      HSSFCell cell84 = row23.createCell((short) 0);
      cell84.setCellValue("Project Manager");
      cell84.setCellStyle(style5);
      HSSFCell cell85 = row23.createCell((short) 1);
      cell85.setCellStyle(style5);
      HSSFCell cell86 = row23.createCell((short) 2);
      HSSFCell cell87 = row23.createCell((short) 3);
      HSSFCell cell88 = row23.createCell((short) 4);
      HSSFCell cell89 = row23.createCell((short) 5);

      HSSFCell cell90 = row24.createCell((short) 0);
      cell90.setCellValue("Project Director");
      cell90.setCellStyle(style5);
      HSSFCell cell91 = row24.createCell((short) 1);
      cell91.setCellStyle(style5);
      HSSFCell cell92 = row24.createCell((short) 2);
      HSSFCell cell93 = row24.createCell((short) 3);
      HSSFCell cell94 = row24.createCell((short) 4);
      HSSFCell cell95 = row24.createCell((short) 5);

      cell6.setCellStyle(style1);
      cell7.setCellStyle(style1);
      cell8.setCellStyle(style1);
      cell9.setCellStyle(style1);
      cell10.setCellStyle(style1);
      cell11.setCellStyle(style1);

      cell12.setCellStyle(style2);
      cell14.setCellStyle(style2);
      cell16.setCellStyle(style2);
      cell18.setCellStyle(style2);
      cell24.setCellStyle(style2);
      cell28.setCellStyle(style2);
      cell30.setCellStyle(style2);
      cell31.setCellStyle(style2);
      cell32.setCellStyle(style2);
      cell33.setCellStyle(style2);
      cell34.setCellStyle(style2);
      cell35.setCellStyle(style2);
      cell48.setCellStyle(style2);
      cell49.setCellStyle(style2);
      cell50.setCellStyle(style2);
      cell51.setCellStyle(style2);
      cell52.setCellStyle(style2);
      cell53.setCellStyle(style2);
      cell72.setCellStyle(style2);
      cell73.setCellStyle(style2);
      cell74.setCellStyle(style2);
      cell75.setCellStyle(style2);
      cell76.setCellStyle(style2);
      cell77.setCellStyle(style2);

      //		      Style the cell with borders all round no backgroud colour.

      cell13.setCellStyle(style3);
      cell15.setCellStyle(style3);
      cell19.setCellStyle(style3);
      cell20.setCellStyle(style3);
      cell21.setCellStyle(style3);
      cell22.setCellStyle(style3);
      cell23.setCellStyle(style3);
      cell25.setCellStyle(style3);
      cell26.setCellStyle(style3);
      cell27.setCellStyle(style3);
      cell29.setCellStyle(style3);
      cell36.setCellStyle(style3);
      cell38.setCellStyle(style3);
      cell39.setCellStyle(style3);
      cell40.setCellStyle(style3);
      cell41.setCellStyle(style3);
      cell42.setCellStyle(style3);
      cell44.setCellStyle(style3);
      cell45.setCellStyle(style3);
      cell46.setCellStyle(style3);
      cell47.setCellStyle(style3);
      cell62.setCellStyle(style3);
      cell64.setCellStyle(style3);
      cell68.setCellStyle(style3);
      cell69.setCellStyle(style3);
      cell70.setCellStyle(style3);
      cell86.setCellStyle(style3);
      cell87.setCellStyle(style3);
      cell88.setCellStyle(style3);
      cell92.setCellStyle(style3);
      cell93.setCellStyle(style3);
      cell94.setCellStyle(style3);

      //date

      cell17.setCellStyle(style4);
      cell37.setCellStyle(style4);
      cell43.setCellStyle(style4);
      cell65.setCellStyle(style4);
      cell71.setCellStyle(style4);
      cell89.setCellStyle(style4);
      cell95.setCellStyle(style4);

      //sheet1 is 1 - 4 Test Scope & Requirements
      HSSFSheet sheet1=workbook.createSheet("1 - 4 Test Scope & Requirements");
      HSSFHeader header1 = sheet1.getHeader();
      header1.setLeft("PSA Corporation Ltd Confidential");
      header1.setRight("Project Name from DB");
      HSSFFooter footer1 = sheet1.getFooter();
      footer1.setLeft("1 - 4 Test Scope & Requirements");
      footer1.setRight("Page " + HSSFFooter.page() + " of " +HSSFFooter.numPages());

      sheet1.setColumnWidth( (short) 0, (short) ( ( 50 * 25 ) / ( (double) 1 / 20 ) ) );
      for (int i=0;i<=47;i++)
      {
        HSSFRow rowti=sheet1.createRow((short)i);
        if (i==0){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("1.   INTRODUCTION");
          cellti.setCellStyle(style6);
        }
        else if (i==8){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("2.   FEATURES");
          cellti.setCellStyle(style6);
        }
        else if (i==9){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("2.1 Features to be tested");
          cellti.setCellStyle(style2);
        }
        else if (i==16){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("2.2 Features not to be tested");
          cellti.setCellStyle(style2);
        }
        else if (i==24){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("3.  TEST OUTPUTS");
          cellti.setCellStyle(style6);
        }
        else if (i==25){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("- TERs (Test Error Records)   ");
          cellti.setCellStyle(style7);
        }
        else if (i==26){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("- TIL (Test Incident Log)     ");
          cellti.setCellStyle(style7);
        }
        else if (i==27){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("- Test Summary Report (TSR)   ");
          cellti.setCellStyle(style7);
        }
        else if (i==28){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("- Reports and Screen dumps ");
          cellti.setCellStyle(style7);
        }
        else if (i==30){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("4.   ENVIRONMENTAL NEEDS ");
          cellti.setCellStyle(style6);
        }
        else if (i==31){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("4.1 Software and Hardware Requirements");
          cellti.setCellStyle(style2);
        }
        else if (i==33){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("Software Requirements");
          cellti.setCellStyle(style5);
        }
        else if (i==37){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("Hardware Requirements");
          cellti.setCellStyle(style5);
        }
        else if (i==44){
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellValue("4.2 Configuration");
          cellti.setCellStyle(style2);
        }
        else {
          HSSFCell cellti = rowti.createCell((short) 0);
          cellti.setCellStyle(style7);
        }
      }

      //sheet 5.1 Data Preparation
      HSSFSheet sheet2=workbook.createSheet("5.1 Data Preparation");
      String sheetName=workbook.getSheetName(2);
      //System.out.println(sheetName);
      HSSFHeader header2 = sheet2.getHeader();
      header2.setLeft("PSA Corporation Ltd Confidential");
      header2.setRight("Project Name from DB");
      HSSFFooter footer2 = sheet2.getFooter();
      footer2.setLeft(sheetName);
      footer2.setRight("Page " + HSSFFooter.page() + " of " +HSSFFooter.numPages());

      for(int i=0;i<=7;i++)
      {
        sheet2.addMergedRegion(new Region(i,(short)0,i,(short)8));
      }

      HSSFRow rowd0=sheet2.createRow((short)0);
      HSSFCell celld0 = rowd0.createCell((short) 0);
      celld0.setCellValue("5.1 Data Preparation");
      celld0.setCellStyle(style13);
      int array_number=0;
      String ucName1=new String();

//      sql="select uc_id from tctc_test_case where pro_id=" + Integer.parseInt(projectID) + " " + " group by uc_id";
      sql="select uc_id from tctc_uc where project_id=" + Integer.parseInt(projectID) + " " + " group by uc_id";

      rs5=myStatement1.executeQuery(sql);
      rs5.next();
      do
      {
        array_number++;
      }while(rs5.next());
      array_name=new String[array_number];

      System.out.println(array_number);

      array_number=0;

//      sql="select uc_id from tctc_test_case where pro_id=" + Integer.parseInt(projectID) + " " + " group by uc_id";
      sql="select uc_id from tctc_uc where project_id="+Integer.parseInt(projectID)+" order by uc_sort_id";
      rs5=myStatement1.executeQuery(sql);

      if(rs5.next()){

        do{
          rowNumber=14;
          ucID=rs5.getLong("uc_id");
          sql="select uc_ab,uc_name from tctc_uc where uc_id="+ucID;
          rs6=myStatement2.executeQuery(sql);

          if(rs6.next()){

   //         sql="select fun_p_id from tctc_test_case where uc_id=" + ucID +" and pro_id=" + Integer.parseInt(projectID) + " group by fun_p_id";
            sql="select fun_p_id from tctc_function_point where uc_id=" + ucID +" and pro_id=" + Integer.parseInt(projectID)+" order by fun_sort_id";
            rs1 = myStatement3.executeQuery(sql);
            if(rs1.next()){

              ucName=rs6.getString("uc_ab");
              ucName1=rs6.getString("uc_name");
              ucName1="5."+sheetNumber+ucName1;
              ucName="5."+sheetNumber+ucName;
              array_name[array_number]=ucName;

              array_number++;
              sheetNumber++;

              //create sheet
              sheet3=workbook.createSheet(ucName);

              header3 = sheet3.getHeader();
              header3.setLeft("PSA Corporation Ltd Confidential");
              header3.setRight("Project Name from DB");
              footer3 = sheet3.getFooter();
              footer3.setLeft(ucName);
              footer3.setRight("Page " + HSSFFooter.page() + " of " +HSSFFooter.numPages());

              //set col width
              sheet3.setColumnWidth( (short) 0, (short) ( ( 50 * 3 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 1, (short) ( ( 50 * 4 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 2, (short) ( ( 50 * 4 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 3, (short) ( ( 50 * 3 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 4, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 5, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 6, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 7, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 8, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 9, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
              sheet3.setColumnWidth( (short) 10, (short) ( ( 50 * 5 ) / ( (double) 1 / 20 ) ) );

              for(int i=0;i<=8;i++)
              {
                sheet3.addMergedRegion(new Region(i,(short)0,i,(short)10));
              }
              sheet3.addMergedRegion(new Region(12,(short)0,12,(short)10));
              sheet3.addMergedRegion(new Region(13,(short)0,14,(short)0));
              sheet3.addMergedRegion(new Region(13,(short)1,14,(short)1));
              sheet3.addMergedRegion(new Region(13,(short)2,14,(short)2));
              sheet3.addMergedRegion(new Region(13,(short)3,14,(short)3));
              sheet3.addMergedRegion(new Region(13,(short)4,13,(short)9));
              sheet3.addMergedRegion(new Region(13,(short)10,14,(short)10));

              rowc0=sheet3.createRow((short)0);
              rowc1=sheet3.createRow((short)1);
              rowc2=sheet3.createRow((short)2);
              rowc3=sheet3.createRow((short)3);
              rowc4=sheet3.createRow((short)4);
              rowc5=sheet3.createRow((short)5);

              cellc0 = rowc0.createCell((short) 0);
              cellc0.setCellValue(ucName1);
              cellc0.setCellStyle(style13);
              cellc1 = rowc1.createCell((short) 0);
              cellc1.setCellValue("Pre-requisite");
              cellc1.setCellStyle(style8);
              cellc2 = rowc2.createCell((short) 0);
              cellc2.setCellStyle(style9);
              cellc3 = rowc3.createCell((short) 0);
              cellc3.setCellStyle(style9);

              cellc4 = rowc4.createCell((short) 0);
              cellc4.setCellValue("CRITERIA/PURPOSE");
              cellc4.setCellStyle(style2);
              cellc5 = rowc4.createCell((short) 1);
              cellc5.setCellStyle(style2);
              cellc6 = rowc4.createCell((short) 2);
              cellc6.setCellStyle(style2);
              cellc7 = rowc4.createCell((short) 3);
              cellc7.setCellStyle(style2);
              cellc8 = rowc4.createCell((short) 4);
              cellc8.setCellStyle(style2);
              cellc9 = rowc4.createCell((short) 5);
              cellc9.setCellStyle(style2);
              cellc10 = rowc4.createCell((short) 6);
              cellc10.setCellStyle(style2);
              cellc11 = rowc4.createCell((short) 7);
              cellc11.setCellStyle(style2);
              cellc12 = rowc4.createCell((short) 8);
              cellc12.setCellStyle(style2);
              cellc13 = rowc4.createCell((short) 9);
              cellc13.setCellStyle(style2);
              cellc14 = rowc4.createCell((short) 10);
              cellc14.setCellStyle(style2);

              for (int i=5;i<=7;i++)
              {
                rowci=sheet3.createRow((short)i);
                for (int j=0;j<=10;j++)
                {
                  cellcij = rowci.createCell((short) j);
                  cellcij.setCellStyle(style7);
                }
              }

              for (int i=8;i<=8;i++)
              {
                rowci=sheet3.createRow((short)i);
                for (int j=0;j<=10;j++)
                {
                  cellcij = rowci.createCell((short) j);
                  cellcij.setCellStyle(style10);
                  cellcij.setCellValue("AUTO COMPUTED Test Coverage Matrix for this Test Stream ");
                }
              }

              rowc9=sheet3.createRow((short)9);
              cellc90 = rowc9.createCell((short) 0);
              cellc90.setCellStyle(style12);
              cellc90.setCellValue("# of Test Cases Per Test Stream");
              cellc91 = rowc9.createCell((short) 1);
              cellc91.setCellStyle(style12);
              cellc91.setCellValue("# of Conditions per Test Stream");
              cellc92 = rowc9.createCell((short) 2);
              cellc92.setCellStyle(style12);
              cellc92.setCellValue("Main Flow");
              cellc93 = rowc9.createCell((short) 3);
              cellc93.setCellStyle(style12);
              cellc93.setCellValue("Alternative Flow");
              cellc94 = rowc9.createCell((short) 4);
              cellc94.setCellStyle(style12);
              cellc94.setCellValue("Exceptional Flow");
              cellc95 = rowc9.createCell((short) 5);
              cellc95.setCellStyle(style12);
              cellc95.setCellValue("Abnormal Flow");
              cellc96 = rowc9.createCell((short) 6);
              cellc96.setCellStyle(style12);
              cellc96.setCellValue("Con-currency Test");
              cellc97 = rowc9.createCell((short) 7);
              cellc97.setCellStyle(style12);
              cellc97.setCellValue("Logging");
              cellc98 = rowc9.createCell((short) 8);
              cellc98.setCellStyle(style12);
              cellc98.setCellValue("Security");
              cellc99 = rowc9.createCell((short) 9);
              cellc99.setCellStyle(style12);
              cellc99.setCellValue("# System Dependency Unavailable Check");
              cellc910 = rowc9.createCell((short) 10);
              cellc910.setCellStyle(style12);
              cellc910.setCellValue("# Total # of Test Conditions per Test Stream");

              rowc10=sheet3.createRow((short)10);
              cellc100 = rowc10.createCell((short) 0);
              cellc100.setCellStyle(style11);
              cellc100.setCellFormula("COUNTA(A16:A2000)");
              cellc101 = rowc10.createCell((short) 1);
              cellc101.setCellStyle(style11);
              cellc101.setCellFormula("COUNTA(B16:B2000)");
              cellc102 = rowc10.createCell((short) 2);
              cellc102.setCellStyle(style11);
              cellc102.setCellFormula("COUNTIF(D16:D2000,\"main flow\")");
              cellc103 = rowc10.createCell((short) 3);
              cellc103.setCellStyle(style11);
              cellc103.setCellFormula("COUNTIF(D16:D2000,\"alternative\")");
              cellc104 = rowc10.createCell((short) 4);
              cellc104.setCellStyle(style11);
              cellc104.setCellFormula("COUNTIF(D16:D2000,\"exceptional\")");
              cellc105 = rowc10.createCell((short) 5);
              cellc105.setCellStyle(style11);
              cellc105.setCellFormula("COUNTIF(D16:D2000,\"abnormal\")");
              cellc106 = rowc10.createCell((short) 6);
              cellc106.setCellStyle(style11);
              cellc106.setCellFormula("COUNTIF(D16:D2000,\"concurrency\")");
              cellc107 = rowc10.createCell((short) 7);
              cellc107.setCellStyle(style11);
              cellc107.setCellFormula("COUNTIF(D16:D2000,\"logging\")");
              cellc108 = rowc10.createCell((short) 8);
              cellc108.setCellStyle(style11);
              cellc108.setCellFormula("COUNTIF(D16:D2000,\"security\")");
              cellc109 = rowc10.createCell((short) 9);
              cellc109.setCellStyle(style11);
              cellc109.setCellFormula("COUNTIF(D16:D2000,\"system dependency\")");
              cellc1010 = rowc10.createCell((short) 10);
              cellc1010.setCellStyle(style11);
              cellc1010.setCellFormula("SUM(C11:J11)");

              rowc12=sheet3.createRow((short)12);
              cellc120 = rowc12.createCell((short) 0);
              cellc120.setCellStyle(style2);
              cellc121 = rowc12.createCell((short) 1);
              cellc121.setCellStyle(style2);
              cellc122 = rowc12.createCell((short) 2);
              cellc122.setCellStyle(style2);
              cellc123 = rowc12.createCell((short) 3);
              cellc123.setCellStyle(style2);
              cellc124 = rowc12.createCell((short) 4);
              cellc124.setCellStyle(style2);
              cellc125 = rowc12.createCell((short) 5);
              cellc125.setCellStyle(style2);
              cellc126 = rowc12.createCell((short) 6);
              cellc126.setCellStyle(style2);
              cellc127 = rowc12.createCell((short) 7);
              cellc127.setCellStyle(style2);
              cellc128 = rowc12.createCell((short) 8);
              cellc128.setCellStyle(style2);
              cellc129 = rowc12.createCell((short) 9);
              cellc129.setCellStyle(style2);
              cellc1210 = rowc12.createCell((short) 10);
              cellc1210.setCellStyle(style2);

              rowc13=sheet3.createRow((short)13);
              cellc130 = rowc13.createCell((short) 0);
              cellc130.setCellStyle(style12);
              cellc130.setCellValue("TEST OBJECTIVES");
              cellc131 = rowc13.createCell((short) 1);
              cellc131.setCellStyle(style12);
              cellc131.setCellValue("TEST CONDITIONS");
              cellc132 = rowc13.createCell((short) 2);
              cellc132.setCellStyle(style12);
              cellc132.setCellValue("EXPECTED RESULTS");
              cellc133 = rowc13.createCell((short) 3);
              cellc133.setCellStyle(style12);
              cellc133.setCellValue("TEST COVERAGE");
              cellc134 = rowc13.createCell((short) 4);
              cellc134.setCellStyle(style12);
              cellc134.setCellValue("ACTUAL RESULT");
              cellc135 = rowc13.createCell((short) 5);
              cellc135.setCellStyle(style12);
              cellc136 = rowc13.createCell((short) 6);
              cellc136.setCellStyle(style12);
              cellc137 = rowc13.createCell((short) 7);
              cellc137.setCellStyle(style12);
              cellc138 = rowc13.createCell((short) 8);
              cellc138.setCellStyle(style12);
              cellc139 = rowc13.createCell((short) 9);
              cellc139.setCellStyle(style12);
              cellc1310 = rowc13.createCell((short) 10);
              cellc1310.setCellStyle(style12);
              cellc1310.setCellValue("REMARKS");

              rowc14=sheet3.createRow((short)14);
              cellc140 = rowc14.createCell((short) 0);
              cellc140.setCellStyle(style12);
              cellc141 = rowc14.createCell((short) 1);
              cellc141.setCellStyle(style12);
              cellc142 = rowc14.createCell((short) 2);
              cellc142.setCellStyle(style12);
              cellc143 = rowc14.createCell((short) 3);
              cellc143.setCellStyle(style12);
              cellc144 = rowc14.createCell((short) 4);
              cellc144.setCellStyle(style2);
              cellc144.setCellValue("SIT1");
              cellc145 = rowc14.createCell((short) 5);
              cellc145.setCellStyle(style2);
              cellc145.setCellValue("TT1");
              cellc146 = rowc14.createCell((short) 6);
              cellc146.setCellStyle(style2);
              cellc146.setCellValue("TT2");
              cellc147 = rowc14.createCell((short) 7);
              cellc147.setCellStyle(style2);
              cellc147.setCellValue("SIT2");
              cellc148 = rowc14.createCell((short) 8);
              cellc148.setCellStyle(style2);
              cellc148.setCellValue("TT1");
              cellc149 = rowc14.createCell((short) 9);
              cellc149.setCellStyle(style2);
              cellc149.setCellValue("TT2");
              cellc1410 = rowc14.createCell((short) 10);
              cellc1410.setCellStyle(style2);

              do {


                oneRow = 0;

                functionPointID = rs1.getLong("fun_p_id");

                sql = "select fun_n from tctc_function_point where fun_p_id=" +
                functionPointID;
                rs3 = myStatement4.executeQuery(sql);
                rs3.next();
                functionPointName = rs3.getString("fun_n");

                sql =
                "select condition,result,test_case_type from tctc_test_case where uc_id=" + ucID + " and fun_p_id=" +
                functionPointID + " " + "and pro_id=" +
                Integer.parseInt(projectID);
                rs2 = myStatement5.executeQuery(sql);

                while (rs2.next()) {


                  sCondition = rs2.getString("condition");
                  sResult = rs2.getString("result");
                  type=rs2.getString("test_case_type");

                  first2 = 1;
                  first3 = 1;

                  temp = rr.getID(sCondition);

                  sql = "select inf_dis from tctc_information where inf_id in ( ";
                  for (int i = 0; i < temp.length; i++) {
                    if (first2 == 1) {
                      sql = sql + Integer.parseInt(temp[i]);
                      first2 = 0;
                    }
                    else {
                      sql = sql + "," + Integer.parseInt(temp[i]);
                    }
                  }
//                  sql = sql + ") order by inf_id";
                  sql = sql + ")";

                  rs4 = myStatement6.executeQuery(sql);
                  first2 = 1;

                  while (rs4.next()) {
                    condition1 = rs4.getString("inf_dis");
                    if (first2 == 1) {
                      sCondition = condition1;
                      first2 = 0;
                    }
                    else {
                      sCondition = sCondition + "\n" + condition1;
                    }
                  }

                  sCondition = rr.restoreString(sCondition);

                  temp = rr.getID(sResult);

                  sql = "select inf_dis from tctc_information where inf_id in ( ";
                  for (int i = 0; i < temp.length; i++) {
                    if (first3 == 1) {
                      sql = sql + Integer.parseInt(temp[i]);
                      first3 = 0;
                    }
                    else {
                      sql = sql + "," + Integer.parseInt(temp[i]);
                    }
                  }
                  sql = sql + ")";

                  rs4 = myStatement7.executeQuery(sql);
                  first3 = 1;

                  while (rs4.next()) {
                    condition1 = rs4.getString("inf_dis");
                    if (first3 == 1) {
                      sResult = condition1;
                      first3 = 0;
                    }
                    else {
                      sResult = sResult + "\n" + condition1;
                    }
                  }

                  sResult = rr.restoreString(sResult);

                  rowNumber = rowNumber + 1;

                  row = sheet3.createRow( (short) rowNumber);

                  cell = row.createCell( (short) 0);
                  if (oneRow == 0) {
                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                    cell.setCellValue(functionPointName);
                    cell.setCellStyle(style7);
                  }
                  else{
                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                    cell.setCellValue("");
                    cell.setCellStyle(style7);
                 }

                  cell = row.createCell( (short) 1);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue(sCondition);
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 2);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue(sResult);
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 3);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue(type);
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 4);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 5);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 6);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 7);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 8);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 9);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                  cell = row.createCell( (short) 10);
                  cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                  cell.setCellValue("");
                  cell.setCellStyle(style7);

                 oneRow = oneRow + 1;
                }
                oneRow = 0;
              }
              while (rs1.next());
            }
          }
        }while(rs5.next());
      }




      //Create "6. Test Coverage Matrix"
      HSSFSheet sheet_matrix;
      sheet_matrix = workbook.createSheet("6. Test Coverage Matrix");
      sheet_matrix.setColumnWidth( (short) 0, (short) ( ( 50 * 10 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 1, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 2, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 3, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 4, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 5, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 6, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 7, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 8, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 9, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 10, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );
      sheet_matrix.setColumnWidth( (short) 11, (short) ( ( 50 * 2 ) / ( (double) 1 / 20 ) ) );

      HSSFRow row_matrix;

      //row 1
      row_matrix = sheet_matrix.createRow((short) 0);
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,(short)1,"6. TEST COVERAGE MATRIX");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)1,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)2,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)3,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)4,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)5,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)6,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)7,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)8,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)9,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)10,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)11,(short)1,"");
      sheet_matrix.addMergedRegion(new Region(0,(short)0,0,(short)11));

      //row 2
      row_matrix = sheet_matrix.createRow((short) 1);
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)1,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)2,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)3,(short)1,"Functional");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)4,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)5,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)6,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)7,(short)1,"Non-Functional");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)8,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)9,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)10,(short)1,"");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)11,(short)1,"");
      sheet_matrix.addMergedRegion(new Region(1,(short)3,1,(short)6));
      sheet_matrix.addMergedRegion(new Region(1,(short)7,1,(short)10));

      //row 3
      row_matrix = sheet_matrix.createRow((short) 2);
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,(short)1,"Test Stream");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)1,(short)1,"# of Test Cases Per Test Stream");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)2,(short)1,"# of Conditions per Test Stream");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)3,(short)1,"Main Flow");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)4,(short)1,"Alternative Flow");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)5,(short)1,"Exceptional Flow");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)6,(short)1,"Abnormal Flow");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)7,(short)1,"Con-currency Test");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)8,(short)1,"Logging");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)9,(short)1,"Security");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)10,(short)1,"System Dependency Unavailable Check");
      generateCell(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)11,(short)1,"Total # of Test Conditions per Test Stream");

      //row 4
      String temp_value=new String();
      int array_len=array_name.length;
      int row_begin=3;

      for(int i=0;i<array_len;i++)
      {
      row_matrix = sheet_matrix.createRow((short) row_begin);

      temp_value="'"+array_name[i]+"'"+"!A1";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_NORMAL,(short)9,row_matrix,HSSFCellStyle.ALIGN_LEFT,HSSFColor.WHITE.index,(short)0,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!A11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)1,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!B11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)2,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!C11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)3,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!D11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)4,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!E11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)5,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!F11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)6,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!G11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)7,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!H11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)8,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!I11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)9,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!J11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)10,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="'"+array_name[i]+"'"+"!K11";
      generateCell1(HSSFColor.BLACK.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)11,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      row_begin++;
      }

      //row last
      row_matrix = sheet_matrix.createRow((short) row_begin);

      generateCell(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_LEFT,HSSFColor.BLUE.index,(short)0,(short)1,"Total (Autocompute)");
      temp_value="sum(B4:B"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)1,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(C4:C"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)2,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(D4:D"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)3,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(E4:E"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)4,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(F4:F"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)5,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(G4:G"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)6,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(H4:H"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)7,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(I4:I"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)8,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(J4:J"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)9,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(K4:K"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)10,HSSFCell.CELL_TYPE_FORMULA,temp_value);
      temp_value="sum(L4:L"+String.valueOf(row_begin)+")";
      generateCell1(HSSFColor.WHITE.index,workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.BLUE.index,(short)11,HSSFCell.CELL_TYPE_FORMULA,temp_value);


      FileOutputStream fOut = new FileOutputStream(fileName);
      workbook.write(fOut);
      fOut.flush();
      fOut.close();

      rs1.close();
      rs2.close();
      rs3.close();
      rs4.close();
      rs5.close();
      rs6.close();

      myConn.close();
      myStatement1.close();
      myStatement2.close();
      myStatement3.close();
      myStatement4.close();
      myStatement5.close();
      myStatement6.close();
      myStatement7.close();

    }
    catch(Exception ex) {
      System.err.println("Error is:"+ex.getMessage());
    }
  }


  private static void generateCell(short fontColor,HSSFWorkbook wb,short fontBold,short fontHeight,HSSFRow row,short alignment,short foregroundColor,short position,int type,String value){

      HSSFFont font = wb.createFont();
      font.setFontHeightInPoints(fontHeight);
      font.setBoldweight(fontBold);
      font.setFontName("Arial");
      font.setColor(fontColor);

      HSSFCellStyle style=wb.createCellStyle();
      style.setFont(font);
      style.setFillForegroundColor(foregroundColor);
      style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style.setWrapText(true);
      style.setAlignment(alignment);
      style.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
      style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style.setBottomBorderColor(HSSFColor.BLACK.index);
      style.setLeftBorderColor(HSSFColor.BLACK.index);
      style.setTopBorderColor(HSSFColor.BLACK.index);
      style.setRightBorderColor(HSSFColor.BLACK.index);

      HSSFCell cell=row.createCell(position);
      cell.setCellStyle(style);
      cell.setCellType(type);
      cell.setCellValue(value);
  }
  private static void generateCell1(short fontColor,HSSFWorkbook wb,short fontBold,short fontHeight,HSSFRow row,short alignment,short foregroundColor,short position,int type,String value){

      HSSFFont font = wb.createFont();
      font.setFontHeightInPoints(fontHeight);
      font.setBoldweight(fontBold);
      font.setFontName("Arial");
      font.setColor(fontColor);

      HSSFCellStyle style=wb.createCellStyle();
      style.setFont(font);
      style.setFillForegroundColor(foregroundColor);
      style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style.setWrapText(true);
      style.setAlignment(alignment);
      style.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
      style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style.setBottomBorderColor(HSSFColor.BLACK.index);
      style.setLeftBorderColor(HSSFColor.BLACK.index);
      style.setTopBorderColor(HSSFColor.BLACK.index);
      style.setRightBorderColor(HSSFColor.BLACK.index);

      HSSFCell cell=row.createCell(position);
      cell.setCellStyle(style);
      cell.setCellType(type);
      cell.setCellFormula(value);
  }

}
