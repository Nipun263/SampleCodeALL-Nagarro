package com.Pages;

import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReading {
	
	public static WebDriver driver ; 
	
	
	public ExcelReading(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void readExcelSheet() throws IOException {
		String file = System.getProperty("user.dir");
		
		String excelSheet = file + "\\Sample Excel.xlsx";
		
		XSSFWorkbook WB = new XSSFWorkbook(excelSheet);
		
		XSSFSheet sheet = WB.getSheet("Data43");
		
		int row_count = sheet.getLastRowNum();
		
		for (int i = 0 ; i <= row_count ; i ++) {
			XSSFRow roww = sheet.getRow(i);
			
			System.out.println("********New Row with Row # " +  sheet.getRow(i).getRowNum());
			
			int cell_count = roww.getLastCellNum();
			
				for (int j = 0 ; j <cell_count ; j ++ ) {
					String cell_Data = roww.getCell(j).toString();
				//	System.out.println("***** First ");
					System.out.println(cell_Data);
					}
			
		}
		
		
			
		}
		
		
		
		}
		
	




