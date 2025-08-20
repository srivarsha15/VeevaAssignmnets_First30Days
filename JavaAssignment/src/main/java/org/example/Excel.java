package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

import java.util.Scanner;

public class Excel {
//    public static void write(int r,int c, Object val) throws FileNotFoundException,IOException {
//
//        FileInputStream file = new FileInputStream("/Users/srivarsha.thatikonda/Downloads/Sample_Excel_Data.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet=workbook.getSheetAt(0);
//        Row row=sheet.getRow(r);
//        Cell cell= row.getCell(c);
//        if(cell.getCellType()==CellType.STRING){
//            cell.setCellValue(val.toString());
//            System.out.println(cell.getStringCellValue());
//        }
//        else if(cell.getCellType()==CellType.NUMERIC){
//            cell.setCellValue(Double.parseDouble((String) val));
//            System.out.println(cell.getNumericCellValue());
//        }
//
////        workbook.write(file);
//
//    }
//    public static void read(int r,int c) throws FileNotFoundException,IOException {
//
//        FileInputStream file = new FileInputStream("/Users/srivarsha.thatikonda/Downloads/Sample_Excel_Data.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet=workbook.getSheetAt(0);
//        Cell cell=sheet.getRow(r).getCell(c);
//        if(cell.getCellType()== CellType.STRING){
//            System.out.println(cell.getStringCellValue());
//        }
//        else if(cell.getCellType()==CellType.NUMERIC){
//            System.out.println(cell.getNumericCellValue());
//        }
//    }
      public static void readAndUpdate(String value,String field,String updateValue) throws IOException {
          FileInputStream file=new FileInputStream("/Users/srivarsha.thatikonda/Downloads/Sample_Excel_Data.xlsx");
          XSSFWorkbook workbook=new XSSFWorkbook(file);
          XSSFSheet sheet=workbook.getSheetAt(0);
          for (int i=0;i<=sheet.getLastRowNum();i++) {
              Row row=sheet.getRow(i);
              if (row==null)
                  continue;
              Cell firstCell = row.getCell(0);
              if (firstCell!=null && firstCell.getStringCellValue().equals(value)) {
                  Row header = sheet.getRow(0);
                  for (int j=0;j<header.getLastCellNum();j++) {
                      Cell fieldName=header.getCell(j);
                      if (fieldName.getStringCellValue().equals(field)) {
                          Cell target=row.getCell(j);
                          if (target==null) {
                              target=row.createCell(j);
                          }
                          target.setCellValue(updateValue);
                          System.out.println("Updated the cell value");
                          break;
                      }
                  }
                  break;
              }
          }
          file.close();
          FileOutputStream out = new FileOutputStream("/Users/srivarsha.thatikonda/Downloads/Sample_Excel_Data.xlsx");
          workbook.write(out);
          workbook.close();
          out.close();

      }
      public static void main(String args[]) throws IOException {
          readAndUpdate("David","Email","david@gmail.com");
      }


}
