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

WebUI.navigateToUrl('https://sso-business2.uat.tele2.nl/authenticationendpoint/login.do?client_id=cmM13VJPYU7hl1vH22ZdcIeG0T0a&commonAuthCallerPath=%2Foauth2%2Fauthorize&forceAuth=false&ip_address=MTAuMjA1LjAuMTU%3D&nonce=1581095929364&passiveAuth=false&redirect_uri=https%3A%2F%2Fmijn.uat.tele2zakelijk.nl%2FSsoComplete&response_type=code&scope=openid&state=e78cd144-9295-4480-806f-56365adc1513&tenantDomain=business.tele2.nl&sessionDataKey=d752d5e9-f712-4318-a2bd-3744d27dbf2a&relyingParty=cmM13VJPYU7hl1vH22ZdcIeG0T0a&type=oidc&sp=BusinessPortalProvider&isSaaSApp=false&authenticators=BasicAuthenticator:LOCAL')

WebUI.setText(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'karthik.murugan')

WebUI.setEncryptedText(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'))

WebUI.setText(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'karthik.murugan@tele2.com')

WebUI.setEncryptedText(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.sendKeys(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Customer Assignment/a_Other'))

WebUI.click(findTestObject('Object Repository/SCOE/a_Order center'))

WebUI.click(findTestObject('Page_Customer Assignment/a_Order center mobile'))

