package readexcel

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable
import java.io.FileInputStream;
import java.io.IOException
public class readexceldownload {


	String DownloadPath = 'C:\\monty'
	@Keyword
	//Read excel cell value by passing the path of the file
	public boolean Excel_Read(String DownloadPath) {
		try {
			// Specify the path of file

			File dir = new File(DownloadPath);
			File src=new java.io.File(DownloadPath)




			// load file
			FileInputStream fis=new FileInputStream(src)

			// Load workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis)

			// Load sheet- Here we are loading first sheet only
			XSSFSheet sh1= wb.getSheetAt(0)
			// getRow() specify which row we want to read and getCell() specify which column to read.
			// getStringCellValue() specify that we are reading String data.
			GlobalVariable.VerifyExcelText = sh1.getRow(2).getCell(0).getStringCellValue()
			System.out.println(GlobalVariable.VerifyExcelText)




			// Exception handling if the cell value is empty
		} catch (Exception e) {

			System.out.println(e.getMessage())

		}
		//WindowsUtils.killByName("EXCEL.exe")
	}

}
