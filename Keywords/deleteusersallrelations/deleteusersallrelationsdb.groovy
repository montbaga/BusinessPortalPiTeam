package deleteusersallrelations

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

import groovy.sql.Sql

public class deleteusersallrelationsdb {

	@Keyword

	public connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)


		sqlConnection("delete from contact_function_profile where ctt_id in (select id from contacts where USR_ID in (select  id from users where login_name like '%userauto%'))")
		sqlConnection("delete from account_manager where ctt_id in (select id from contacts where USR_ID in (select  id from users where login_name like'%userauto%'))")
		sqlConnection("delete from unit_permission where ctt_id in (select id from contacts where USR_ID in (select  id from users where login_name like'%userauto%'))")
		sqlConnection("delete from contacts_one_login where PRIMARY_CONTACT in (select ID from contacts where EMAIL like '%userauto%')")
		sqlConnection("delete from contacts where USR_ID in (select  id from users where login_name like '%userauto%')")
		sqlConnection("delete from password_history where USR_ID in (select  id from users where login_name like'%userauto%')")
		sqlConnection("delete from users where login_name like'%userauto%'")
	}
}
