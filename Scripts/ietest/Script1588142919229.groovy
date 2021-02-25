import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.swing.plaf.basic.BasicButtonListener.Actions

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.awt.Robot as Robot

import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')


WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_username-hidden'),
'USERAUTOMATIONINGEC')

WebUI.setText(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_password'),
	'LEGoy6uz!!')

WebUI.click(findTestObject('Object Repository/mobileconnectrec/Page_My Tele2 Business/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/hostedvoicefp/hvdashboard/Page_My Tele2 Business/hvlink'))

String TSCurl = WebUI.getUrl()

println(TSCurl)

WebUI.delay(5)

Robot rb = new Robot()

rb.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(1)

rb.keyRelease(KeyEvent.VK_ENTER)



WebUI.takeScreenshot()

if(TSCurl.contains("https://tsc.uat.tele2.nl"))
{
println("HV TSC SSO successfully done")
}
 else
 {
	 println("HV TSC SSO failed")
 }
