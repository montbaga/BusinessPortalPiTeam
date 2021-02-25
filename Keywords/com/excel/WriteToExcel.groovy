package com.excel

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword

public class WriteToExcel {

	@Keyword
	def void writeToExcel(String iSht , String order_id , int Rno , int Cno, String Path){
		FileInputStream file = new FileInputStream (new File(Path))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(iSht)

		//Write data to excel’
		XSSFRow row = sheet.getRow(Rno)

		if (row==null){
			row = sheet.createRow(Rno);
		}

		Cell cell = row.createCell(Cno);
		cell.setCellValue(order_id);
		FileOutputStream fos = new FileOutputStream(Path);
		workbook.write(fos);
		file.close();
	}
}
