import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

String charSet = 'abcdefghijklmno'

String charSet1 = '1234567890'

int length = 5

int length1 = 8

GlobalVariable.userid = ('userautomation' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.email = (('auto@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.firstname = ('firstname' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.middlename = ('middlename' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.lastname = ('lastname' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.fixednumber = ('+31' + RandomStringUtils.random(length1, charSet1.toCharArray()))

GlobalVariable.mobilenumber = ('+31' + RandomStringUtils.random(length1, charSet1.toCharArray()))

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

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_VOOR ZAKELIJK_username-hidden'), 'abel.fokkinga@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/BP Tele2 NL/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/a_User management'))

WebUI.click(findTestObject('Object Repository/Page_User Management/div_Select an Account'))


WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Select an Account_layoutPane_2_1_1_2_1_1'), 'BP User Management for Tele2 NL')

if(WebUI.verifyElementVisible(findTestObject('Object Repository/Page_User Management/span_BP User Management for Tele2 NL'))) {
	WebUI.click(findTestObject('Object Repository/Page_User Management/span_BP User Management for Tele2 NL'))
}

else {
	
	WebUI.click(findTestObject('Object Repository/BP Tele2 NL/div_Select all customers'))
	WebUI.click(findTestObject('Object Repository/BP Tele2 NL/div_BP User Management for Tele2 NL'))}

    //WebUI.click(findTestObject('Object Repository/Page_User Management/span_BP User Management for Tele2 NL'))
//} else {
  //  WebUI.click(findTestObject('Object Repository/div_Select all customers'))

    //WebUI.setText(findTestObject('Object Repository/input_Select all customers_layoutPane_2_2_1_2_1_1'), 'BP User Management for Tele2 NL')

    //WebUI.delay(1)

    //WebUI.click(findTestObject('Object Repository/span_BP User Management for Tele2 NL'))

    WebUI.delay(3)
//}

 /* WebUI.click(findTestObject('Object Repository/BP Tele2 NL/a_Settings'))
  WebUI.click(findTestObject('Object Repository/BP Tele2 NL/a_User management'))
   WebUI.click(findTestObject('Object Repository/BP Tele2 NL/div_Select all customers'))
   WebUI.click(findTestObject('Object Repository/BP Tele2 NL/div_BP User Management for Tele2 NL'))
   
   WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/BP Tele2 NL/button_Add user'))

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_User ID_requestAccountFirstName'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_User ID_requestAccountFirstName'), GlobalVariable.userid)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_First name_contactEditFirstName'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_First name_contactEditFirstName'), GlobalVariable.firstname)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_Middle name_contactEditMiddleName'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_Middle name_contactEditMiddleName'), GlobalVariable.middlename)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_Last name_contactEditLastName'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_Last name_contactEditLastName'), GlobalVariable.lastname)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_Email-address_contactEditEmail'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_Email-address_contactEditEmail'), GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_Fixed number_contactEditFixedNumber'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_Fixed number_contactEditFixedNumber'), GlobalVariable.fixednumber)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/input_Email-address_contactEditEmail'))

WebUI.setText(findTestObject('Object Repository/BP Tele2 NL/input_Mobile number_contactEditMobileNumber'), GlobalVariable.mobilenumber)

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/span_Male'))

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/span_Yes'))

WebUI.click(findTestObject('Object Repository/BP Tele2 NL/label'))

// WebUI.click(findTestObject('Object Repository/BP Tele2 NL/span_Male'))
//    WebUI.click(findTestObject('Object Repository/BP Tele2 NL/span_Yes'))
WebUI.click(findTestObject('Object Repository/managerradiobutton/managerradiobutton_Yes'))

//WebUI.click(findTestObject('Object Repository/label'))
WebUI.delay(2)

// WebUI.click(findTestObject('Object Repository/BP Tele2 NL/span_Invoice overview old invoices'))
WebUI.click(findTestObject('Object Repository/BP Tele2 NL/button_Save'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))

WebUI.setText(findTestObject('Object Repository/SearchLoginName/searchloginame'), GlobalVariable.userid)

WebUI.click(findTestObject('Object Repository/searchuser/selectsearcheduser'))

String CalviRole = WebUI.getText(findTestObject('Object Repository/calvirole/Partnerrole'))

println(CalviRole)

if (CalviRole.contains('Tele2 Support user')) {
    println('Calvi Flow for Tele2 Support user is passed in UI :) ')
} else {
    println('Calvi Flow for Tele2 Support user is not passed in UI)  :( ')
}

WebUI.delay(20)

WebUI.callTestCase(findTestCase('db_select'), [:], FailureHandling.STOP_ON_FAILURE)

println('Calvi Flow for Tele2 Support user is passed in Database')
*/
