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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 
    'linkusersiajna')

WebUI.setText(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'LEGoy6uz!!')

WebUI.click(findTestObject('Object Repository/linkingusers/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/2nduser'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/1stuser'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/2nduser'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/1stuser'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/2nduser'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/1stuser'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/onelogindropdown'))

WebUI.click(findTestObject('Object Repository/linkingusers/Page_My Tele2 Business/2nduser'))

WebUI.click(findTestObject('Object Repository/Language/logout/Page_Customer Assignment/logout_button'))

WebUI.maximizeWindow()

WebUI.verifyImagePresent(findTestObject('imagetest'))

