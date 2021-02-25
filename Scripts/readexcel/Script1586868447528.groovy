import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.format.DateTimeFormatter

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_username-hidden'), 'abel.fokkinga@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/Page_Mijn Tele2 Zakelijk/input_VOOR ZAKELIJK_login-button'))

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900154467')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/Page_Customer Assignment/a_Dashboard'))

WebUI.delay(2)

//WebUI.verifyTextPresent('Select a location to show the incidents, changes and orders', true)
WebUI.takeScreenshot()

//WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/div_Select an Account'))
//WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_BU4'))
//WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Account Incidents Changes and Orders Overview'))
WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Incidents'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Changes'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Orders'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/input_Filter_tabBox_3_4_1_3'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Order type'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Action needed'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/span_Status'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/button_Clear filters'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/button_Active'))

Thread.sleep(2000)

WebUI.click(findTestObject('Page_Welcome to Business Portal/button_Export'))

WebUI.click(findTestObject('Page_Welcome to Business Portal/a_Excel 2007'))

WebUI.delay(10)




CustomKeywords.'readexcel.readexceldownload.Excel_Read



//DownloadManager dm = new DownloadManager()
//File dmf = dm.LastDownloadedFile()


//println(dmf)


//ExcelDocument mydocument = new ExcelDocument(dmf)

//aseprintln(mydocument.getCellText(0, 0))


