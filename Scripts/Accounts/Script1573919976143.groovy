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

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.waitForPageLoad(0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Customer Assignment/a_Account management'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Accounts overview'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Accounts Overview/td_900154467'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/a_See News Messages_checkbox unchecked'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/input_Elektronische Faktuur_button'))

//WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/div_The changed functiongroups assignment h_ea76ce'))
Thread.sleep(2000)

String message = WebUI.getText(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/div_The changed functiongroups assignment h_ea76ce'))

WebUI.takeScreenshot()

println(message)

WebUI.click(findTestObject('Object Repository/FPClose/Page_My Tele2 Business - Account Details/div_Delete_closer'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/a_See News Messages_checkbox unchecked'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/input_Elektronische Faktuur_button'))

Thread.sleep(2000)

WebUI.takeScreenshot()

String message1 = WebUI.getText(findTestObject('Object Repository/Page_My Tele2 Business - Account Details/div_The changed functiongroups assignment h_ea76ce'))

println(message1)

WebUI.click(findTestObject('Object Repository/FPClose/Page_My Tele2 Business - Account Details/div_Delete_closer'))

WebUI.closeBrowser()

