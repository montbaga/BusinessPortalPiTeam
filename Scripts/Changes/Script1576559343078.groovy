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

//for loop starts here to capture two Changes for BP
//for (int i = 0; i < 2; i++) {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900154467')
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/Page_Services/td_Zakelijk Mobiel 4G_id_3__3_1_1_3_1_4'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Services/button_Change'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Select change type'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_4x ISDN2'))

//WebUI.setText(findTestObject('Object Repository/Page_Services/input_Re-installation with router kit A (AT_9b24c5'), 'check')

WebUI.click(findTestObject('Object Repository/Page_Services/i_Re-installation with router kit A (ATM cr_83c652'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/movecalendar'))

WebUI.click(findTestObject('Object Repository/td_21'))

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea__id_4__9_5_4_4'), 'check')

/*WebUI.click(findTestObject('Object Repository/Page_Services/button_Send notifications_id_4__9_5_5_1_2_2'))

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_1_1'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_2_1'), 't@t.com')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_3_1'), '+3111111111')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_4_1'), '+3111111111')
*/
WebUI.click(findTestObject('Object Repository/Page_Services/button_Send'))

WebUI.click(findTestObject('Object Repository/Page_Services/div_pmessage'))

String message = WebUI.getText(findTestObject('Object Repository/Page_Services/div_pmessage'))

WebUI.takeScreenshot()

println(message)

WebUI.click(findTestObject('Object Repository/Page_Services/div_Mobile BHjePhKberrZ 457 IBdRylB_closer'))

