package accountactivationstatus

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
import internal.GlobalVariable
import java.Sql.*
import java.sql.*
import org.openqa.selenium.*



import groovy.sql.Sql


public class accountactivationstatusget {

	@Keyword

	public List<String> connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)
		List<String> value = new ArrayList<>()

		sqlConnection.firstRow("select ACT_ID , TYPE ,  MILESTONE , MILESTONE_STATUS from PROVISIONING_PROCESS order by id desc fetch first 1 rows only").with { row ->

			//println(row [0])
			value.add(row [0])
			//println(row [1])
			value.add(row [1])
			//println(row [2])
			value.add(row [2])
			//println(row [3])
			value.add(row [3])
		}

		println(value)
		return(value)
	}
}
