import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.deleteClause_scope as deleteClause_scope
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String charSet = '0123456789'

int length = 4

String randomStr = 'RFC' + RandomStringUtils.random(length, charSet.toCharArray())

/*Date fomatting for RFC flow*/
SimpleDateFormat formatter = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss.SSS')

String strDate = formatter.format(new Date()).replace(' ', 'T')
String endDate = formatter.format(new Date()).replace(' ', 'T')

println(strDate)
println(endDate)
println(randomStr)

WS.sendRequest(findTestObject('RFCCreate', [('rfcid') : randomStr, ('startDate') : strDate , ('endDate') : endDate]))
WS.delay(2)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_username-hidden'), 'abel.fokkinga@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900153242')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/a_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/Page_Welcome to Business Portal/newincidents'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/currennetworkoutages'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/dropdownclick/dropdownclick'))

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/span_Maintenance'))

WebUI.takeScreenshot()


String InitialStatus1 = WebUI.getText(findTestObject('Object Repository/rfcstatus/rfcstatus'))
println(InitialStatus1)

WS.sendRequest(findTestObject('RFCCancel', [('rfcid') : randomStr, ('startDate') : strDate , ('endDate') : endDate]))
WS.delay(1)

WebUI.refresh()
WebUI.click(findTestObject('Object Repository/OutageTypeFilter/dropdownclick/dropdownclick'))

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/span_Maintenance'))

WebUI.takeScreenshot()


String LastStatus1 = WebUI.getText(findTestObject('Object Repository/rfcstatus/rfcstatus'))
println(LastStatus1)

if (InitialStatus1 ==  'Started'  && LastStatus1 == 'Canceled'){
	println('RFC Outage was successfully created  and canceled')
}

else {KeywordUtil.markFailed('RFC Outage is Failed')}


String charSet1 = '0123456789'

int length1 = 4

String randomStr1 = 'RFC' + RandomStringUtils.random(length1, charSet1.toCharArray())

/*Date fomatting for RFC flow*/
SimpleDateFormat formatter1 = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss.SSS')

String strDate1 = formatter1.format(new Date()).replace(' ', 'T')
String endDate1 = formatter1.format(new Date()).replace(' ', 'T')

println(strDate1)
println(endDate1)
println(randomStr1)

WS.sendRequest(findTestObject('RFCCreate', [('rfcid') : randomStr1, ('startDate') : strDate1 , ('endDate') : endDate1]))
WS.delay(2)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900153242')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/a_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/Page_Welcome to Business Portal/newincidents'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/currennetworkoutages'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/dropdownclick/dropdownclick'))

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/span_Maintenance'))

WebUI.takeScreenshot()


String InitialStatus2 = WebUI.getText(findTestObject('Object Repository/rfcstatus/rfcstatus'))
println(InitialStatus2)

WS.sendRequest(findTestObject('RFCFailed', [('rfcid') : randomStr1, ('startDate') : strDate1 , ('endDate') : endDate1]))
WS.delay(1)

WebUI.refresh()
WebUI.click(findTestObject('Object Repository/OutageTypeFilter/dropdownclick/dropdownclick'))

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/span_Maintenance'))

WebUI.takeScreenshot()


String LastStatus2 = WebUI.getText(findTestObject('Object Repository/rfcstatus/rfcstatus'))
println(LastStatus2)

if (InitialStatus2 ==  'Started'  && LastStatus2 == 'Completed'){
	println('RFC Outage was successfully created  and failed')
}

else {KeywordUtil.markFailed('RFC Outage is Failed')}



String charSet2 = '0123456789'



int length2 = 4

String randomStr2 = 'RFC' + RandomStringUtils.random(length2, charSet2.toCharArray())

/*Date fomatting for RFC flow*/
SimpleDateFormat formatter2 = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss.SSS')

String strDate2 = formatter2.format(new Date()).replace(' ', 'T')
String endDate2 = formatter2.format(new Date()).replace(' ', 'T')

println(strDate2)
println(endDate2)
println(randomStr2)

WS.sendRequest(findTestObject('RFCCreate', [('rfcid') : randomStr2, ('startDate') : strDate2 , ('endDate') : endDate2]))
WS.delay(2)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900153242')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/a_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Welcome to Business Portal/Page_Welcome to Business Portal/newincidents'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/currennetworkoutages'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/dropdownclick/dropdownclick'))

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/span_Maintenance'))

String InitialStatus3 = WebUI.getText(findTestObject('Object Repository/rfcstatus/rfcstatus'))
println(InitialStatus3)

WS.sendRequest(findTestObject('RFCComplete', [('rfcid') : randomStr2, ('startDate') : strDate2 , ('endDate') : endDate2]))
WS.delay(1)

WebUI.refresh()
WebUI.click(findTestObject('Object Repository/OutageTypeFilter/dropdownclick/dropdownclick'))

WebUI.click(findTestObject('Object Repository/OutageTypeFilter/span_Maintenance'))

WebUI.takeScreenshot()


String LastStatus3 = WebUI.getText(findTestObject('Object Repository/rfcstatus/rfcstatus'))
println(LastStatus3)

if (InitialStatus3 ==  'Started'  && LastStatus3 == 'Completed'){
	println('RFC Outage was successfully created  and Closed')
}

else {KeywordUtil.markFailed('RFC Outage is Failed')}