package com.excel

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword

public class ReadFromExcel {

	@Keyword
	def readFromExcel(String Path , String Sht, int row , int Col){

		//Path of the excel file
		FileInputStream fs = new FileInputStream('C:\\Users\\montbaga\\Desktop\\cla\\P502_Data.xlsx')

		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		//Get access to the sheet
		XSSFSheet sheet = workbook.getSheet(Sht);

		int rowCount = sheet.getLastRowNum();

		String Data = sheet.getRow(row).getCell(Col).getStringCellValue()

		return Data;

		fs.close()

	}
}