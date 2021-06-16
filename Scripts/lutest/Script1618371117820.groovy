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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_username-hidden'),
	'karthik.murugan@t-mobile.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_password'),
	'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Customer Assignment/a_Linking users'))
WebUI.delay(4)