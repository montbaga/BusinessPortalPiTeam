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

String randomStr = 'CS20S01' + RandomStringUtils.random(length, charSet.toCharArray())

/*Date fomatting for RFC flow*/
SimpleDateFormat formatter = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss.SSS')

String strDate = formatter.format(new Date()).replace(' ', 'T')

println(strDate)

println(randomStr)

WS.sendRequest(findTestObject('OutageCreate', [('outageId') : randomStr, ('startDate') : strDate]))

WS.delay(2)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_username-hidden'), 'jelle.van-wijk@tele2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/OUTAGESINUAT/input_Search_txtAccountId'), '900154467')

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/div_Wrdg Zu Qkrx_rt-td'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/a_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/span_0'))

WebUI.click(findTestObject('Object Repository/OUTAGESINUAT/button_Current network outages'))

WebUI.takeScreenshot()

WebUI.delay(1)

String InitialStatus = WebUI.getText(findTestObject('Object Repository/Outage_Status/outagestatus'))

println(InitialStatus)

WS.sendRequest(findTestObject('OutageUpdate', [('outageId') : randomStr, ('startDate') : strDate]))

WS.delay(2)

WS.sendRequest(findTestObject('OutageClose', [('outageId') : randomStr, ('startDate') : strDate]))

WebUI.refresh()

WebUI.takeScreenshot()

String LastStatus = WebUI.getText(findTestObject('Object Repository/Outage_Status/outagestatus'))

println(LastStatus)

if ((InitialStatus == 'Started') && (LastStatus == 'Completed')) {
    println('Network Outage was successfully created , updated and closed')
} else {
    KeywordUtil.markFailed('Network Outage is Failed')
}

