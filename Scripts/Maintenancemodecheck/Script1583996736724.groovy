import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'datesnullindb.strenddatenull.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 'businessportal', 
    'p0rt0l')

CustomKeywords.'truemode.truemodedb.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 'businessportal', 
    'p0rt0l')

CustomKeywords.'commit.commitquery.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 'businessportal', 
    'p0rt0l')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.verifyTextPresent('We zijn voor u aan het werk!', true)

WebUI.takeScreenshot()

CustomKeywords.'falsemode.falsemodedb.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 'businessportal', 
    'p0rt0l')

CustomKeywords.'commit.commitquery.connection'('jdbc:oracle:thin:@//iuu-pordb01.dmz.lan:1521/PORUAT', 'businessportal', 
    'p0rt0l')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.takeScreenshot()

