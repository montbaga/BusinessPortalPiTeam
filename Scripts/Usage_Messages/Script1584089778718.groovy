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

WebUI.setText(findTestObject('Object Repository/usage/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'abel.fokkinga@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/usage/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/usage/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/usage/OUTAGESINUAT/input_Search_txtAccountId'), '900218868')

WebUI.click(findTestObject('Object Repository/usage/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/usage/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/usage/Page_Services/a_Other'))

WebUI.click(findTestObject('Object Repository/usage/Page_Customer Assignment/a_Reporting'))

WebUI.click(findTestObject('Object Repository/usage/Page_Services/a_Usage messages'))

WebUI.verifyTextPresent('% of extra data bundle used', true)

