package test;

import java.io.*;
import java.sql.*;
import javax.sql.*;
import java.lang.String;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.*;
import mydb.DatabaseBean;
import managestring.mystring;
import java.util.Date;
import java.text.DateFormat.*;
import javax.mail.*;
import javax.activation.*;
import java.util.Properties;
import javax.mail.internet.*;
import javax.mail.*;



public class test {
    public test() {
      Properties props = new Properties();
      Session sendMailSession;
      sendMailSession = Session.getInstance(props, null);
      Message newMessage = new MimeMessage(sendMailSession);


    }

private static void generateCell(HSSFWorkbook wb,short fontBold,short fontHeight,HSSFRow row,short alignment,short foregroundColor,short position,int type,String value){

    HSSFFont font = wb.createFont();
    font.setFontHeightInPoints(fontHeight);
    font.setBoldweight(fontBold);
    font.setFontName("Arial");

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
//    cell.setCellValue(value);
    cell.setCellValue(value);
}
private static void generateCell1(HSSFWorkbook wb,short fontBold,short fontHeight,HSSFRow row,short alignment,short position,int type,String value){

    HSSFFont font = wb.createFont();
    font.setFontHeightInPoints(fontHeight);
    font.setBoldweight(fontBold);
    font.setFontName("Arial");

    HSSFCellStyle style=wb.createCellStyle();
    style.setFont(font);
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

public static void main(String []args)throws IOException{

    HSSFWorkbook workbook = new HSSFWorkbook();
    String[] array_name=new String[3];
    array_name[0]="5.2 Improve VPOC1";
    array_name[1]="5.3 Improve VPOC2";
    array_name[2]="5.4 Improve VPOC3";
    HSSFRow row_matrix;
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

//    HSSFRow row_matrix;
/*
    //row 1
    row_matrix = sheet_matrix.createRow((short) 0);
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,(short)1,"6. TEST COVERAGE MATRIX");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)1,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)2,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)3,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)4,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)5,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)6,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)7,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)8,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)9,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)10,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)11,(short)1,"");
    sheet_matrix.addMergedRegion(new Region(0,(short)0,0,(short)11));

    //row 2
    row_matrix = sheet_matrix.createRow((short) 1);
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)1,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)2,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)3,(short)1,"Functional");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)4,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)5,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)6,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)7,(short)1,"Non-Functional");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)8,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)9,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)10,(short)1,"");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)11,(short)1,"");
    sheet_matrix.addMergedRegion(new Region(1,(short)3,1,(short)6));
    sheet_matrix.addMergedRegion(new Region(1,(short)7,1,(short)10));

    //row 3
    row_matrix = sheet_matrix.createRow((short) 2);
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,(short)0,(short)1,"Test Stream");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)1,(short)1,"# of Test Cases Per Test Stream");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)2,(short)1,"# of Conditions per Test Stream");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)3,(short)1,"Main Flow");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)4,(short)1,"Alternative Flow");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)5,(short)1,"Exceptional Flow");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)6,(short)1,"Abnormal Flow");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)7,(short)1,"Con-currency Test");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)8,(short)1,"Logging");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)9,(short)1,"Security");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)10,(short)1,"System Dependency Unavailable Check");
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)11,(short)1,"Total # of Test Conditions per Test Stream");
*/
    //row 4
    row_matrix = sheet_matrix.createRow((short) 0);
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,HSSFCell.CELL_TYPE_NUMERIC,String.valueOf(1.23));
    row_matrix = sheet_matrix.createRow((short) 1);
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,HSSFCell.CELL_TYPE_NUMERIC,"2");
    row_matrix = sheet_matrix.createRow((short) 2);
    generateCell(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)12,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.SKY_BLUE.index,(short)0,HSSFCell.CELL_TYPE_NUMERIC,"3");
    row_matrix = sheet_matrix.createRow((short) 3);

    generateCell1(workbook,HSSFFont.BOLDWEIGHT_BOLD,(short)9,row_matrix,HSSFCellStyle.ALIGN_CENTER,HSSFColor.WHITE.index,HSSFCell.CELL_TYPE_FORMULA,"sum(a1:a3)");

    // Write the output to a file
    FileOutputStream fileOut = new FileOutputStream("c:\\workbook.xls");
    workbook.write(fileOut);
    fileOut.close();



  }

}
