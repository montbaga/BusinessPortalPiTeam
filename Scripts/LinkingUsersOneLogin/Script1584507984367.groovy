import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

String selectAll = Keys.chord(Keys.CONTROL, 'a')

String charSet = 'abcdefghijklmno'

String charSet1 = '1234567890'

int length = 5

int length1 = 8

GlobalVariable.password = 'LEGoy6uz!!'

GlobalVariable.userid = ('linkusers' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.email = (('linkuser@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

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

//==========================================================================================================
String charSet2 = 'abcdefghijklmno'

String charSet3 = '1234567890'

int length2 = 5

int length3 = 8

GlobalVariable.password1 = 'LEGoy6uz!!'

GlobalVariable.userid1 = ('linkusers' + RandomStringUtils.random(length2, charSet2.toCharArray()))

GlobalVariable.email1 = (('linkuser@' + RandomStringUtils.random(length2, charSet2.toCharArray())) + '.com')

GlobalVariable.firstname1 = ('firstname' + RandomStringUtils.random(length2, charSet2.toCharArray()))

GlobalVariable.middlename1 = ('middlename' + RandomStringUtils.random(length2, charSet2.toCharArray()))

GlobalVariable.lastname1 = ('lastename' + RandomStringUtils.random(length2, charSet2.toCharArray()))

GlobalVariable.fixednumber1 = ('+31' + RandomStringUtils.random(length3, charSet3.toCharArray()))

GlobalVariable.mobilenumber1 = ('+31' + RandomStringUtils.random(length3, charSet3.toCharArray()))

println(GlobalVariable.userid1)

println(GlobalVariable.email1)

println(GlobalVariable.firstname1)

println(GlobalVariable.middlename1)

println(GlobalVariable.lastname1)

println(GlobalVariable.fixednumber1)

println(GlobalVariable.mobilenumber1)

//==================================================================================================================
//primary user creation

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 
    'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900204038')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_User management'))

//WebUI.click(findTestObject('Object Repository/Page_User Management/div_Select all customers'))
//WebUI.click(findTestObject('Object Repository/Page_User Management/span_Arts En Zorg'))
WebUI.delay(4)

//for (def rowNum=1; rowNum<=findTestData('New Test Data').getRowNumbers(); rowNum++) {
WebUI.click(findTestObject('Object Repository/Page_User Management/button_Add user'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'))

//WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), userid)
WebUI.setText(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'), GlobalVariable.userid)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_First name_contactEditFirstName'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_First name_contactEditFirstName'), GlobalVariable.firstname)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Middle name_contactEditMiddleName'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Middle name_contactEditMiddleName'), GlobalVariable.middlename)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Last name_contactEditLastName'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Last name_contactEditLastName'), GlobalVariable.lastname)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'), GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Fixed number_contactEditFixedNumber'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Fixed number_contactEditFixedNumber'), GlobalVariable.fixednumber)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Mobile number_contactEditMobileNumber'), GlobalVariable.mobilenumber)

WebUI.click(findTestObject('Object Repository/Page_User Management/span_Male'))

WebUI.delay(2)

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

//WebUI.click(findTestObject('Object Repository/Page_User Management/span_Invoice overview old invoices'))
WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))

WebUI.delay(5)

//secondary user creation

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 
    'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900157166')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_User management'))

//WebUI.click(findTestObject('Object Repository/Page_User Management/div_Select all customers'))
//WebUI.click(findTestObject('Object Repository/Page_User Management/span_Arts En Zorg'))

WebUI.delay(4)

//for (def rowNum=1; rowNum<=findTestData('New Test Data').getRowNumbers(); rowNum++) {
WebUI.click(findTestObject('Object Repository/Page_User Management/button_Add user'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'))

//WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), userid)
WebUI.setText(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'), GlobalVariable.userid1)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_First name_contactEditFirstName'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_First name_contactEditFirstName'), GlobalVariable.firstname1)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Middle name_contactEditMiddleName'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Middle name_contactEditMiddleName'), GlobalVariable.middlename1)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Last name_contactEditLastName'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Last name_contactEditLastName'), GlobalVariable.lastname1)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'), GlobalVariable.email1)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Fixed number_contactEditFixedNumber'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Fixed number_contactEditFixedNumber'), GlobalVariable.fixednumber1)

WebUI.click(findTestObject('Object Repository/Page_User Management/input_Email-address_contactEditEmail'))

WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Mobile number_contactEditMobileNumber'), GlobalVariable.mobilenumber1)

WebUI.click(findTestObject('Object Repository/Page_User Management/span_Male'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/password'), Keys.chord(selectAll))

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/password/Page_User Management/password'), GlobalVariable.password1)

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/confirmpassword'), Keys.chord(selectAll))

WebUI.sendKeys(findTestObject('Object Repository/password/Page_User Management/confirmpassword'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/password/Page_User Management/confirmpassword'), GlobalVariable.password1)

WebUI.click(findTestObject('Object Repository/Page_User Management/span_Yes'))

WebUI.click(findTestObject('Object Repository/Page_User Management/label'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/managerradiobutton/managerradiobutton_Yes'))

//WebUI.click(findTestObject('Object Repository/Page_User Management/span_Invoice overview old invoices'))
WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))

WebUI.delay(5)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 
    'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_Linking users'))

WebUI.click(findTestObject('linkingusers/Page_My Tele2 BusinessLinking Users/div_Add user'))

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_My Tele2 BusinessLinking Users/input_Account ID_primaryAccountId'), 
    '900204038')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_My Tele2 BusinessLinking Users/input_Email address_primaryEmail'), 
    GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_My Tele2 BusinessLinking Users/input_Account ID_secondaryAccountId'), 
    '900157166')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_My Tele2 BusinessLinking Users/input_Email address_secondaryEmail'), 
    GlobalVariable.email1)

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 BusinessLinking Users/input_Secondary_addUser'))

WebUI.takeScreenshot()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 
    GlobalVariable.userid)

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/2nduser'))

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()



