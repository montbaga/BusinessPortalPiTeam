import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys
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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

String selectAll = Keys.chord(Keys.CONTROL, 'a')

GlobalVariable.password = 'LEGoy6uz!!'

String charSet = 'abcdefghijklmno'

String charSet1 = '1234567890'

int length = 5

int length1 = 8

GlobalVariable.userid = ('userautomation' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.email = (('auto@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.firstname = ('firstname' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.middlename = ('middlename' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.lastname = ('lastename' + RandomStringUtils.random(length, charSet.toCharArray()))

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

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_username-hidden'), 
    'karthik.murugan@t-mobile.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_password'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_Customer Assignment/input_Search_txtAccountId'), '900219046')


WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_Customer Assignment/button_Search'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_Services/a_Settings'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Customer Assignment/a_Account management'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Accounts overview'))

WebUI.click(findTestObject('Object Repository/hostedvoicefp/hostedvoiceaccountoverview/Page_My Tele2 Business - Accounts Overview/td_900219046'))

WebUI.delay(5)

//Giving Basic Profile FP to Account
String attr = WebUI.getAttribute(findTestObject('Object Repository/hostedvoicefp/hostedvoicefp/Page_My Tele2 Business - Account Details/hostedvoicefp'), 
    'class')

println(attr)

if (attr.contains('checkbox unchecked')) {
    //WebUI.click(findTestObject('Object Repository/hostedvoicefp/hostedvoicefp/Page_My Tele2 Business - Accounts Overview/hostedvoicefp'))
	WebUI.click(findTestObject('Object Repository/hostedvoicefp/hostedvoicefp/Page_My Tele2 Business - Account Details/hostedvoicefp'))
} else {
    println('Hosted Voice  FP is already checked')
}

//----------
WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/input_Elektronische Faktuur_button'))

// create user now
WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_User Management/button_Add user'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'))

//WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), userid)
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

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/password'), Keys.chord(selectAll))

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/password/Page_User Management/password'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/confirmpassword'), Keys.chord(selectAll))

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/confirmpassword'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/password/Page_User Management/confirmpassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_User Management/span_Yes'))

WebUI.click(findTestObject('Object Repository/Page_User Management/label'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/managerradiobutton/managerradiobutton_Yes'))

WebUI.click(findTestObject('Object Repository/hostedvoicefp/hvfpuser/Page_User Management/hostevoicefpuser'))

WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))

WebUI.delay(5)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_username-hidden'), 
    GlobalVariable.userid)

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/hostedvoicefp/hvdashboard/Page_My Tele2 Business/hvlink'))

String TSCurl = WebUI.getUrl()

println(TSCurl)

WebUI.delay(5)

Robot rb = new Robot()

rb.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(1)

rb.keyRelease(KeyEvent.VK_ENTER)

if(TSCurl.contains("https://tsc.uat.tele2.nl"))
{
println("HV TSC SSO successfully done")
}
 else
 {
	 println("HV TSC SSO failed")
 }

