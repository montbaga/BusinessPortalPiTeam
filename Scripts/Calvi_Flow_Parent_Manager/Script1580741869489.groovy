import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

String charSet = 'abcdefghijklmno'
String charSet1 = '1234567890'

int length = 5
int length1 = 8

GlobalVariable.userid = ('userautomation' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.email = (('auto@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.firstname = 'firstname' + RandomStringUtils.random(length, charSet.toCharArray())

GlobalVariable.middlename = 'middlename' + RandomStringUtils.random(length, charSet.toCharArray())

GlobalVariable.lastname = 'lastname' + RandomStringUtils.random(length, charSet.toCharArray())

GlobalVariable.fixednumber = '+31' + RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.mobilenumber = '+31' + RandomStringUtils.random(length1, charSet1.toCharArray())


println(GlobalVariable.userid)

println(GlobalVariable.email)

println(GlobalVariable.firstname)

println(GlobalVariable.middlename)

println(GlobalVariable.lastname)

println(GlobalVariable.fixednumber)

println(GlobalVariable.mobilenumber)


WebUI.callTestCase(findTestCase('deleteusersallreelations'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('db_commit'), [:], FailureHandling.STOP_ON_FAILURE)

	
	
	
	WebUI.openBrowser('')
	
	WebUI.maximizeWindow()
	
	WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')
	
	WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_login-button'))
	
	WebUI.waitForPageLoad(0)
	
	WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900153024')
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))
	
	WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))
	
	WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))
	
	WebUI.delay(4)
	
	WebUI.click(findTestObject('Object Repository/Page_User Management/button_Add user'))
	
	WebUI.scrollToPosition(0, 0)
	
	
		 WebUI.click(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'))
	
	  
		WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), GlobalVariable.userid)
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/input_First name_contactEditFirstName'))
	
		WebUI.setText(findTestObject('Page_User Management/input_First name_contactEditFirstName'), GlobalVariable.firstname)
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/input_Middle name_contactEditMiddleName'))
	
		WebUI.setText(findTestObject('Page_User Management/input_Middle name_contactEditMiddleName'), GlobalVariable.middlename)
		
		WebUI.click(findTestObject('Object Repository/Page_User Management/input_Last name_contactEditLastName'))
	
		WebUI.setText(findTestObject('Page_User Management/input_Last name_contactEditLastName'), GlobalVariable.lastname)
			   
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'))
	
		WebUI.setText(findTestObject('Page_User Management/input_Email-address_contactEditEmail'), GlobalVariable.email)
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/input_Fixed number_contactEditFixedNumber'))
	
		WebUI.setText(findTestObject('Page_User Management/input_Fixed number_contactEditFixedNumber'), GlobalVariable.fixednumber)
	
		WebUI.click(findTestObject('Page_User Management/input_Email-address_contactEditEmail'))
	
		WebUI.setText(findTestObject('Page_User Management/input_Mobile number_contactEditMobileNumber'), GlobalVariable.mobilenumber)
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/span_Male'))
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/span_Yes'))
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/label'))
	
	//	WebUI.click(findTestObject('Object Repository/Page_User Management/span_Male'))
	
	//	WebUI.click(findTestObject('Object Repository/Page_User Management/span_Yes'))
		
		
		
		WebUI.delay(2)
		
		
		WebUI.click(findTestObject('Object Repository/managerradiobutton/managerradiobutton_Yes'))
	
		//WebUI.click(findTestObject('Object Repository/label'))
	
		WebUI.delay(3)
	
		//WebUI.click(findTestObject('Object Repository/Page_User Management/span_Invoice overview old invoices'))
	
		WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))
	
		WebUI.delay(8)
		
	
	
	WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))
	
	WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))
	
	WebUI.setText(findTestObject('Object Repository/SearchLoginName/searchloginame'), GlobalVariable.userid)
	
	WebUI.click(findTestObject('Object Repository/searchuser/selectsearcheduser'))
	
	String CalviRole = WebUI.getText(findTestObject('Object Repository/calvirole/calvirole'))
	
	println(CalviRole)
	
		if (CalviRole.contains("Parent manager")) {
			println("Calvi Flow for Parent Manager is passed in UI :) ")
		  } else {
			println("Calvi Flow for Parent Manager is not passed in UI)  :( ")
		  }
	
	
	WebUI.delay(20)
	


WebUI.callTestCase(findTestCase('db_select'), [:], FailureHandling.STOP_ON_FAILURE)

println("Calvi Flow for Parent Manager is passed in Database")

