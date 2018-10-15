package com.gladminds.ABCare.AfterBuy.GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadSpreadData {

	private static FileInputStream fis = null;
	private static XSSFWorkbook wb     = null; 
	private static XSSFSheet  sheet    = null;
	private static XSSFCell   cell     = null;

	
	public static int getLastRow(String sheetName) throws IOException {
		fis = new FileInputStream(new File("Test Data\\cbmsDataSheet.xlsx"));
		 wb = new XSSFWorkbook(fis);
		int index = wb.getSheetIndex(sheetName);
	   if(index>=0) {
		  int lastRowNumber =  wb.getSheet(sheetName).getLastRowNum();
		  return lastRowNumber;
	   }
	   else {
		   return -1;
	   }		   
	}
	public static int getCellRowNum(String sheetName, int cellNum) throws IOException {
		for(int i =1;i<=getLastRow(sheetName);i++) {
		String cellValue = wb.getSheet(sheetName).getRow(i).getCell(cellNum).getStringCellValue();
		if(cellValue.equalsIgnoreCase("No")) {
			return i;
		}
		else {
			return -1;
		}
		}
		return -1;
	}
	     
		public static String getEachCellValue(String sheetName, int rowNumber, int cellNumber) {
	    	 
	    	cell =  wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber);
	    	
	     if(cell !=null) {    	
	    	CellType type = cell.getCellTypeEnum();
	    	
	    	switch (type) {
			
	    	case STRING:
				return cell.getStringCellValue();
			
	    	case BOOLEAN:
           boolean b = cell.getBooleanCellValue();
          return String.valueOf(b);
			
	    	case FORMULA:
				double val = cell.getNumericCellValue();
				return String.valueOf(val);
			
	    	case NUMERIC:
				double val1 = cell.getNumericCellValue();
			
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dat = cell.getDateCellValue();
					return String.valueOf(dat);
				}
				else {
					 Double value = cell.getNumericCellValue();
	                    Long longValue = value.longValue();
	                   
	                    return String.valueOf(longValue);
				}
				
			default:
				System.out.println("cell type is unrecognized");
				break;
			}
			
	     }
		return "";
	     }
		public static void setCellValue(String sheetName ,int rowNumber, int cellNumber, String value) throws IOException {
			FileOutputStream fos = new FileOutputStream(new File("Test Data\\cbmsDataSheet.xlsx"));
			wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).setCellValue(value);
			wb.write(fos);
			fos.close();
		}
	public static void main(String[] args) throws IOException {
		String sheetName = "User";
System.out.println("last row num is : "+ReadSpreadData.getLastRow(sheetName));
System.out.println("No value found in row No. : "+getCellRowNum(sheetName, 17));
System.out.println(getEachCellValue(sheetName, 1, 0));
System.out.println(getEachCellValue(sheetName, 1, 1));
System.out.println(getEachCellValue(sheetName, 1, 2));
System.out.println(getEachCellValue(sheetName, 1, 3));
System.out.println(getEachCellValue(sheetName, 1, 4));
System.out.println(getEachCellValue(sheetName, 1, 5));
System.out.println(getEachCellValue(sheetName, 1, 6));
System.out.println(getEachCellValue(sheetName, 1, 7));
System.out.println(getEachCellValue(sheetName, 1, 8));
System.out.println(getEachCellValue(sheetName, 1, 9));
System.out.println(getEachCellValue(sheetName, 1, 10));
System.out.println(getEachCellValue(sheetName, 1, 11));
ReadSpreadData.setCellValue(sheetName, 1, 17, "updated");
	}

}
