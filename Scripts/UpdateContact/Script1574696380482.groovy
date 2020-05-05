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

WebUI.callTestCase(findTestCase('Login_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/zk/customerAssignment')

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_User management'))

WebUI.click(findTestObject('Object Repository/Page_User Management/div_Select all customers'))

WebUI.click(findTestObject('Object Repository/Page_User Management/span_Arts En Zorg'))

WebUI.delay(2)
WebUI.refresh()


WebUI.click(findTestObject('Object Repository/iframeloginname/Page_User Management/input'))





