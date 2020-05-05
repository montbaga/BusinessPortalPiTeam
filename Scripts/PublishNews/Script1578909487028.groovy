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

WebUI.setText(findTestObject('Object Repository/input_VOOR ZAKELIJK_username-hidden'), 'abel.fokkinga@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/a_Settings'))

WebUI.click(findTestObject('Object Repository/a_Portal news management'))

WebUI.click(findTestObject('Object Repository/button_Create news item'))

WebUI.setText(findTestObject('Object Repository/input_Title_id_4__1_1_2_1_2'), 'Automation News Management')

WebUI.setText(findTestObject('Object Repository/body_html1'), '<div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: block;">/html[1]</div></div>')

not_run: WebUI.click(findTestObject('Object Repository/html_Rich Text Editor newsItemContenthtmlcu_099153'))

not_run: WebUI.click(findTestObject('Object Repository/html_Rich Text Editor newsItemContenthtmlcu_099153'))

WebUI.setText(findTestObject('Object Repository/body_Automation news to be published'), '<div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: block;">Automation news to be published</div></div>')

not_run: WebUI.click(findTestObject('Object Repository/html_Rich Text Editor newsItemContenthtmlcu_099153_1'))

not_run: WebUI.click(findTestObject('Object Repository/html_Rich Text Editor newsItemContenthtmlcu_099153_1'))

not_run: WebUI.setText(findTestObject('Object Repository/body_Automation news to be published'), '<div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;">Automation news to be published</div></div>')

WebUI.click(findTestObject('Object Repository/button_Submit news'))

WebUI.click(findTestObject('Object Repository/li_News created succesfully'))

String message = WebUI.getText(findTestObject('Object Repository/li_News created succesfully'))

WebUI.takeScreenshot()

println(message)

WebUI.closeBrowser()

