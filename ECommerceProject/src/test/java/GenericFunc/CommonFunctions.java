package GenericFunc;
import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonFunctions {

	
	public void ReadExcelFile(String path,String SheetName) throws IOException {
		try {
			//FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook workbook=new XSSFWorkbook();
			Sheet sh=workbook.createSheet("Demo");
			
			 Row rows = sh.createRow(0);
		        rows.createCell(0).setCellValue("ID");
		        rows.createCell(1).setCellValue("Name");
		        rows.createCell(2).setCellValue("Score");
		       // -------------------------------------------------

		        Row row1 = sh.createRow(1);
		        row1.createCell(0).setCellValue(1);
		        row1.createCell(1).setCellValue("Kishor");
		        row1.createCell(2).setCellValue(95);
		        FileOutputStream fos=new FileOutputStream("Demo.xlsx");
		        workbook.write(fos);
		        workbook.close();
		        System.out.println("Excel file is created");
		     //   ---------------------------------
			//for loop
		        System.out.println("size="+sh.getLastRowNum());
		        System.out.println("size cell="+sh.getRow(1).getLastCellNum());
			for(int row=0;row<sh.getLastRowNum();row++) {
			for(int col=0;col<sh.getRow(row).getLastCellNum();col++) {
				System.out.println("Data present="+sh.getRow(row).getCell(col).getStringCellValue());
			}
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void GenerateTestNGXML(String SuiteName,String testName,String strParams,String className) {
		String format=String.format(
				

				"<!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\">\n"
				+"<suite name=\"%s\">\n"+
				"<test name=\"%s\">\n"+
				"<parameters name=\"strParams\" value=\"%s\"/>\n"+
				"<classes>\n"+
				"<class name=\"%s\"/>\n"+
				"</classes>\n"+
				"</test>\n"+
				"</suite>\n"
				
				, SuiteName,testName,strParams,className);
		//file write
		try {
			FileWriter fw=new FileWriter("testng.xml");
			fw.write(format);
			fw.close();
			System.out.println("File is Generated.....!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonFunctions cf=new CommonFunctions();
		try {
			//cf.GenerateTestNGXML("Regression", "Member Name Test", "Kishor", "MemberSearch");
		
			cf.ReadExcelFile("D:\\DailyCode\\ECommerceProject\\Resourse\\Demo.xlsx", "Demo");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
