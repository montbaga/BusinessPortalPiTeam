import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

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

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_Customer Assignment/input_Search_txtAccountId'), '900163234')

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_Customer Assignment/button_Search'))

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_Customer Assignment/span_900163234'))

WebUI.delay(60)

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_Services/a_Settings'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Customer Assignment/a_Account management'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Accounts overview'))

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business - Accounts Overview/td_900163234'))

WebUI.delay(5)

//Giving Basic Profile FP to Account

String attr = WebUI.getAttribute(findTestObject('Object Repository/mobileconnectfp/basicfp/Page_My Tele2 Business - Account Details/bpbasicfp'), 'class')

println(attr)

if(attr.contains("checkbox unchecked"))
{
	WebUI.click(findTestObject('Object Repository/mobileconnectfp/basicfp/Page_My Tele2 Business - Account Details/bpbasicfp'))
}

else

{
	println("Basic FP is already checked")
}

//Giving Mobile Connect FP to Account

String attr1 = WebUI.getAttribute(findTestObject('Object Repository/mobileconnectfp/mcunchecked/Page_My Tele2 Business - Account Details/mcfpunchecked'), 'class')

println(attr1)

if(attr1.contains("checkbox unchecked"))
{
	WebUI.click(findTestObject('Object Repository/mobileconnectfp/mcunchecked/Page_My Tele2 Business - Account Details/mcfpunchecked'))
}

else

{
	println("MC FP is already checked")
}

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/input_Elektronische Faktuur_button'))

// create user now

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))

//WebUI.click(findTestObject('Object Repository/Page_User Management/div_Select all customers'))

//WebUI.click(findTestObject('Object Repository/Page_User Management/span_Arts En Zorg'))

WebUI.delay(4)

//for (def rowNum=1; rowNum<=findTestData('New Test Data').getRowNumbers(); rowNum++) {
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

WebUI.click(findTestObject('Object Repository/mobileconnectfp/Page_My Tele2 Business - Account Details/Page_User Management/mcfpuser'))

WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))

WebUI.delay(5)
