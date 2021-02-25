import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.util.regex.Matcher
import java.util.regex.Pattern
import java.util.regex.Pattern.All


//for (int i = 0; i < 2; i++) {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900154467')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/Page_Services/td_Zakelijk Mobiel 4G_id_3__3_1_1_3_1_4'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Page_Services/button_Incident_1'))

WebUI.click(findTestObject('Object Repository/Page_Services/button_Incident_1'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Select incident type'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Loss of functionality'))

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Prio 5_id_4__9_5_3_3'), 'testautomation')

WebUI.click(findTestObject('Object Repository/Page_Services/input_Prio 5_id_4__9_5_3_4-real'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/movecalendar'))

WebUI.click(findTestObject('Object Repository/td_21'))


WebUI.delay(2)



WebUI.setText(findTestObject('Object Repository/Page_Services/textarea__id_4__9_5_4_4'), 'CHECK')

/*WebUI.click(findTestObject('Object Repository/Page_Services/button_Send notifications_id_4__9_5_5_1_2_2'))

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_1_1'), 'hcek')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_2_1'), 't@t.com')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_3_1'), '+311111111')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__9_5_5_1_2_1_2_1_4_1'), '+311111111')

WebUI.click(findTestObject('Object Repository/Page_Services/div_Name Email MobileFixedSend notifications'))
*/
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Services/button_Send_Incident'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Services/div_pmessage'))


String message = WebUI.getText(findTestObject('Object Repository/Page_Services/div_pmessage'))

WebUI.takeScreenshot()

println(message)

WebUI.click(findTestObject('Object Repository/Page_Services/div_Mobile BHjePhKberrZ 457 IBdRylB_closer'))

WebUI.closeBrowser()

