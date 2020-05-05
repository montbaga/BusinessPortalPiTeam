package activate2fano

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
import groovy.sql.Sql


import internal.GlobalVariable


public class activate2fanodb {

	@Keyword

	public connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)

		//sqlConnection("UPDATE(SELECT * FROM accounts WHERE account_id = '900157320') SET activated_2fa = 'Y'")


		//sqlConnection("update accounts set ACTIVATED_2FA = 'Y' where ACCOUNT_ID = '900157320'")
		//sqlConnection("select * from accounts where ACCOUNT_ID = '900157320'")
		sqlConnection("update accounts set ACTIVATED_2FA = 'N'")
	}
}

