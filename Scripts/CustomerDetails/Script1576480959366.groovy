import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')



WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

    WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

    WebUI.click(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))
	
 
	WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900154467')
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))
	

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))


WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Customer details'))
WebUI.delay(4)
//WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Select all customers'))

//WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Bnvtd BU4'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Customer Details'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Account ID'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Customer Name'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Invoice settings'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Customer Number'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Location Name'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Address'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Bank Account Number'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Payment Method'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/div_Receipt Method'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Customer Details/td_Postbus 20301 S-GRAVENHAGE_mainPane_3_2_2_1_4'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Location details'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Customer Number'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Location Name'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_Address'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/span_City'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details/legend_Invoice settings'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Customer Details/button_Cancel'))

