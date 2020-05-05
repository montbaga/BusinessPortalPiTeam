package cmdb

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows



import java.Sql.*
import java.sql.*

import com.kms.katalon.core.util.KeywordUtil

import groovy.sql.Sql
import internal.GlobalVariable

public class cmdbexport {

	@Keyword

	public connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)

		sqlConnection.eachRow("select REFERENCE , STATUS , CREATE_DATE from cmdb_aggregation WHERE create_date > CURRENT_TIMESTAMP -30/1440") { row ->
			println (row [0] + " - " + row [1] + " - " + row [2])

			if (row [1] == 'CREATED' ||   row [1] == 'BUSY' ||  row [1] == 'READY') {
				println('Database verification is Passed')
			}

			else {
				println('Database verification is Failed')
			}
		}
	}
}