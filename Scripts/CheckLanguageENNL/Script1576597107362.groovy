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
import normal.keywords as keywords
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/NLTOEN/Page_My Profile/span_abelfokkingatele2com'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Language/Page_My Profile/ENbluetickenabled'))) {
    WebUI.click(findTestObject('iframeNL'))
} else {
    println('iframeNL failed')
}

if (WebUI.verifyElementClickable(findTestObject('Object Repository/Page_My Profile/button_Save'))) {
    WebUI.click(findTestObject('Object Repository/Page_My Profile/button_Save'))
} else {
    WebUI.click(findTestObject('Object Repository/span_Opslaan'))
}

WebUI.scrollToPosition(50, 60)
WebUI.delay(15)

WebUI.verifyTextPresent('Diensten', true)

println('Dutch Language is PASSED')

WebUI.takeScreenshot()

if (WebUI.verifyElementVisible(findTestObject('Object Repository/NLredtickenabled'))) {
    WebUI.click(findTestObject('Object Repository/iframeEN'))
} else {
    println('iframeEN failed')
}

if (WebUI.verifyElementClickable(findTestObject('Object Repository/span_Opslaan'))) {
    WebUI.click(findTestObject('Object Repository/span_Opslaan'))
} else {
    WebUI.click(findTestObject('Object Repository/Page_My Profile/button_Save'))
}

WebUI.scrollToPosition(50, 60)

WebUI.delay(15)


WebUI.verifyTextPresent('Dashboard', true)

println('English Language is PASSED')

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

