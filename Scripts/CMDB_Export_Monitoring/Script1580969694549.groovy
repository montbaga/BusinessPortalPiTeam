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

String date = new Date().format('dd-MMM-yy').toUpperCase()

println(date)


WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/cmdb/input_Search_txtAccountId'), '900208918')

WebUI.click(findTestObject('Object Repository/cmdb/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/cmdb/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/cmdb/button_CMDB report'))

WebUI.click(findTestObject('Object Repository/cmdb/a_CMDB report (all products)'))

WebUI.delay(2)

WebUI.takeScreenshot()

String text = WebUI.getText(findTestObject('Object Repository/cmdb/li_Thank you for the requested CMDB report _af8121'))

println(text)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/cmdb/button_CMDB report'))

WebUI.delay(2)

String text1 = WebUI.getText(findTestObject('Object Repository/cmdb/a_Report is being generated'))

println(text1)

WebUI.callTestCase(findTestCase('db_cmdb'), [:], FailureHandling.STOP_ON_FAILURE)

println('Database Validation is successfully done')


