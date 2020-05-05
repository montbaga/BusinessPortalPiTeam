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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

//for loop starts here to capture two Changes for BP
//for (int i = 0; i < 2; i++) {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://sso-business2.uat.tele2.nl/authenticationendpoint/login.do?client_id=cmM13VJPYU7hl1vH22ZdcIeG0T0a&commonAuthCallerPath=%2Foauth2%2Fauthorize&forceAuth=false&ip_address=MTAuMjA1LjAuMTY%3D&nonce=1586365528763&passiveAuth=false&redirect_uri=https%3A%2F%2Fmijn.uat.tele2zakelijk.nl%2FSsoComplete&response_type=code&scope=openid&state=2a4cf0a2-e1ee-48e4-96c0-a2f3eee5c766&tenantDomain=business.tele2.nl&sessionDataKey=fb2a8467-7077-4c0f-8cdd-e848b4eaf572&relyingParty=cmM13VJPYU7hl1vH22ZdcIeG0T0a&type=oidc&sp=BusinessPortalProvider&isSaaSApp=false&authenticators=BasicAuthenticator:LOCAL')

WebUI.setText(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'montycje')

WebUI.setEncryptedText(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'niOAEnx7ejjtLmabVBBF9A==')

WebUI.click(findTestObject('Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/newusermanagement/Page_My Tele2 Business/a_Settings'))

WebUI.click(findTestObject('Object Repository/newusermanagement/Page_My Tele2 Business/a_User management'))

