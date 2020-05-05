import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
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

int length = 3

int length1 = 9

GlobalVariable.organisationName = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.useridupdate = ('update' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orgemail = (('clarifysnc@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.orgmobile = RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.orgphone = RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.orgfirstname = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orgmiddlename = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orglastname = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.userid = ('userautomation' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.email = (('clarifysnc1@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_username-hidden'), 'sanchit.gupta')

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

WebUI.delay(60)

String valueuser = CustomKeywords.'mailuserpassword.mailuserpassworddb.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 
    'businessportal', 'p0rt0l')

String valuepassword = CustomKeywords.'mailuserpassword2ndvalue.mailuserpassword2ndvaluedb.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 
    'businessportal', 'p0rt0l')

println(valueuser)

println(valuepassword)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_username-hidden'), valueuser)

WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_password'), valuepassword)

WebUI.click(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_login-button'))

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

//--------------------------------------------------------------------------------------------------------------------

String charSetact = 'abcdefghijklmno'

String charSetnum = '1234567890'

GlobalVariable.password = 'LEGoy6uz!!'

int lengthact = 8



GlobalVariable.activatenewlogin = ('monty' + RandomStringUtils.random(length, charSetact.toCharArray()))

GlobalVariable.activatenewemail = (('activate@' + RandomStringUtils.random(length, charSetact.toCharArray())) + '.com')

GlobalVariable.activatephonenumber = ('020' + RandomStringUtils.random(lengthact, charSetnum.toCharArray()))

println(GlobalVariable.activatenewlogin)

println(GlobalVariable.activatenewemail)

println(GlobalVariable.activatephonenumber)


WebUI.selectOptionByValue(findTestObject('Object Repository/activateaccount/Page_Mijn Tele2 Zakelijk - Registreer Account/select_NederlandsEnglish'), 
    '22045', true)

WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Setup Account/input_Username_loginName'), GlobalVariable.activatenewlogin)
WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Setup Account/input_E-mail_email'), 
    GlobalVariable.activatenewemail)



WebUI.click(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Setup Account/input__button'))

WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Fill In Your Details/input_Password_password'), 
    GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Fill In Your Details/input_Confirmation password_password2'), 
    GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Fill In Your Details/input_First name_firstName'), 
    GlobalVariable.firstname)

WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Fill In Your Details/input_Last name_lastName'), 
    GlobalVariable.lastname)

WebUI.setText(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Fill In Your Details/input_Phone number_phoneNumber'), 
    GlobalVariable.activatephonenumber)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/activateaccount/Page_My Tele2 Business - Fill In Your Details/input_Language_button'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_username-hidden'), GlobalVariable.activatenewlogin)

WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_login-button'))

WebUI.takeScreenshot()

List<String> clarifyvalue =  CustomKeywords.'clarifysync.clarifysyncdb.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 'businessportal', 
    'p0rt0l')



if (clarifyvalue.get(0) == null || 'null'.equals(clarifyvalue.get(0))) 
      { 
	println('Clarify sync for Consolidator Contact is passed ')
	}
	else {
	println('Clarify sync for Consolidator Contact is failed ')
	     }
	
if (clarifyvalue.get(1) != null && !'null'.equals(clarifyvalue.get(1))) 
       { 
	println('Clarify sync for Non Consolidator Contact is passed ')
        }
else 
      {
println('Clarify sync for Non Consolidator Contact is failed ')
      }

	 WebUI.click(findTestObject('Object Repository/newusermanagement/Page_My Tele2 Business/a_Settings'))

WebUI.click(findTestObject('Object Repository/newusermanagement/Page_My Tele2 Business/a_User management'))
	  
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
		  
		  WebUI.takeScreenshot()
		  
		  println(successmessage1)
		  
		  if (successmessage1.contains('Contact updated successfully')) {
			  println('Contact has been created successfully :) ')
		  } else {
			  println('Contact has not been created successfully  :( ')
		  }
	  
		  WebUI.delay(5)
	  
	  
	  WebUI.click(findTestObject('Object Repository/newusermanagement/Page_My Tele2 Business/a_Settings'))

WebUI.click(findTestObject('Object Repository/newusermanagement/Page_My Tele2 Business/a_User management'))
	  
	  WebUI.setText(findTestObject('Object Repository/SearchLoginName/searchloginame'), GlobalVariable.userid)
	  
	  WebUI.click(findTestObject('Object Repository/searchuser/selectsearcheduser'))
	  
	  WebUI.click(findTestObject('Object Repository/Page_User Management/input_User ID_requestAccountFirstName'))
	  
		  //WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), userid)
		  WebUI.setText(findTestObject('Page_User Management/input_User ID_requestAccountFirstName'), GlobalVariable.useridupdate)
		  
		  WebUI.click(findTestObject('Object Repository/Page_User Management/button_Save'))
		  
		  String successmessage = WebUI.getText(findTestObject('Object Repository/SCOE/contactupdatesuccess'))
		  
		  WebUI.takeScreenshot()
		  
		  println(successmessage)
		  
		  if (successmessage.contains('Your details have been changed successfully.')) {
			  println('Contact has been updated and saved successfully :) ')
		  } else {
			  println('Contact has not been updated and saved successfully  :( ')
		  }
	  
	  




