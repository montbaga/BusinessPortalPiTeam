import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling

String charSet = 'abcdefghijklmno'

String charSet1 = '1234567890'

int length = 3

int length1 = 9

GlobalVariable.organisationName = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.useridupdate = ('update' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orgemail = (('scoe@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.orgmobile = RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.orgphone = RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.orgfirstname = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orgmiddlename = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orglastname = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

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

println(GlobalVariable.organisationName)

println(GlobalVariable.orgmobile)

println(GlobalVariable.orgphone)

println(GlobalVariable.orgfirstname)

println(GlobalVariable.orgmiddlename)

println(GlobalVariable.orglastname)

println(GlobalVariable.useridupdate)




try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

    WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_username-hidden'), 'karthik.murugan@t-mobile.nl')

    WebUI.setEncryptedText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

    WebUI.click(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_login-button'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Object Repository/SCOE/a_Other'))

    WebUI.click(findTestObject('Object Repository/SCOE/a_Order center'))

    WebUI.click(findTestObject('Object Repository/SCOE/a_Order center mobile'))

    WebUI.click(findTestObject('Object Repository/SCOE/input_Account Type_createAccount'))

    WebUI.setText(findTestObject('Object Repository/SCOE/input_Invoice Details_organisationName'), GlobalVariable.organisationName)

    WebUI.click(findTestObject('Object Repository/SCOE/div_KVK Number_mat-checkbox-inner-container'))

    WebUI.click(findTestObject('Object Repository/SCOE/div_VAT Number_mat-checkbox-inner-container'))

    WebUI.click(findTestObject('Object Repository/SCOE/button_Next'))

    WebUI.setText(findTestObject('Object Repository/SCOE/input_Invoice Language_firstName'), GlobalVariable.orgfirstname)

    WebUI.setText(findTestObject('Object Repository/SCOE/input_First Name_middleName'), GlobalVariable.orgmiddlename)

    WebUI.setText(findTestObject('Object Repository/SCOE/input_Middle Name_lastName'), GlobalVariable.orglastname)

    WebUI.setText(findTestObject('Object Repository/SCOE/input_ 31_phone'), GlobalVariable.orgphone)

    WebUI.click(findTestObject('Object Repository/SCOE/div_Mobile'))

    WebUI.setText(findTestObject('Object Repository/SCOE/input_ 31_mobile'), GlobalVariable.orgmobile)

    WebUI.setText(findTestObject('Object Repository/SCOE/input_Fax_email'), GlobalVariable.orgemail)

    WebUI.click(findTestObject('Object Repository/scoe1/button_Next_scoe'))

    WebUI.click(findTestObject('Object Repository/SCOE/div_Next_mat-checkbox-inner-container'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/scoe2/button_Next_scoe1'))

    WebUI.setText(findTestObject('Object Repository/SCOE/input_Address Country_postalCode'), '1112 XN')

    WebUI.setText(findTestObject('Object Repository/SCOE/input_Postal Code_houseNumber'), '42')

    WebUI.click(findTestObject('Object Repository/SCOE/button_Check Address'))

    WebUI.click(findTestObject('Object Repository/SCOE/mat-cell_Diemerhof'))

    WebUI.click(findTestObject('Object Repository/scoe3/button_Next_scoe2'))

    WebUI.click(findTestObject('Object Repository/SCOE/div_Direct Debit'))

    WebUI.click(findTestObject('Object Repository/SCOE/span_Bank Giro'))

    WebUI.click(findTestObject('Object Repository/SCOE/button_Create Account'))
	
	WebUI.delay(3)
	
	WebUI.takeScreenshot()

    //String AccountName = WebUI.getText(findTestObject('Object Repository/SCOE/div_MONTY20S02AGAIN'))
    //WebUI.delay(2)
    //println(AccountName)
    WebUI.click(findTestObject('Object Repository/SCOE/back-button'))

    WebUI.delay(10)

    WebUI.setText(findTestObject('Object Repository/SCOE/CustomerName'), GlobalVariable.organisationName)

    WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

    WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

    WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))

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

    WebUI.click(findTestObject('Object Repository/Page_User Management/span_Yes'))

    WebUI.click(findTestObject('Object Repository/Page_User Management/label'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/managerradiobutton/managerradiobutton_Yes'))

    //WebUI.click(findTestObject('Object Repository/Page_User Management/span_Invoice overview old invoices'))
    WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))
	
	String successmessage1 = WebUI.getText(findTestObject('Object Repository/SCOE/contactupdatesuccess'))
	
	println(successmessage1)
	
	if (successmessage1.contains('Contact updated successfully')) {
		println('Contact has been created successfully :) ')
	} else {
		println('Contact has not been created successfully  :( ')
	}

    WebUI.delay(5)
}
catch (Exception e) {
    println("Exception: $e")
} 

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))

WebUI.setText(findTestObject('Object Repository/SearchLoginName/searchloginame'), GlobalVariable.userid)

WebUI.click(findTestObject('Object Repository/searchuser/selectsearcheduser'))

WebUI.click(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'))

	//WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), userid)
	WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), GlobalVariable.useridupdate)
	
	WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))
	
	String successmessage = WebUI.getText(findTestObject('Object Repository/SCOE/contactupdatesuccess'))
	
	println(successmessage)
	
	if (successmessage.contains('Your details have been changed successfully.')) {
		println('Contact has been updated and saved successfully :) ')
	} else {
		println('Contact has not been updated and saved successfully  :( ')
	}


	




