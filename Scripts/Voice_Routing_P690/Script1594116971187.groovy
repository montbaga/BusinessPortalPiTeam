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



Path = 'C:\\Users\\montbaga\\Desktop\\cla\\P502_Data.xlsx'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl/')

WebUI.setText(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/input_VOOR ZAKELIJK_username-hidden'), 'karthik.murugan@t-mobile.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/input_VOOR ZAKELIJK_password'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/input_VOOR ZAKELIJK_login-button'))

WebUI.click(findTestObject('Object Repository/scoeone/Page_Customer Assignment/a_Other'))

WebUI.click(findTestObject('Object Repository/SCOE/a_Order center'))

WebUI.click(findTestObject('Object Repository/scoeone/Page_Customer Assignment/a_Order'))

WebUI.click(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/span_Select Account'))

WebUI.setText(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/input_Account ID_Account_Id'), '900154467')

WebUI.click(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/input_Account Type_cmdsearch'))

WebUI.click(findTestObject('Object Repository/scoeone/Page_My Tele2 Business/a_900154467'))

//------------------------------------
WebUI.click(findTestObject('Object Repository/scoeone/span_new_order/Page_My Tele2 Business/click_New Order'))

WebUI.click(findTestObject('Object Repository/scoeone/invoice1/Page_My Tele2 Business/invoice1'))

WebUI.click(findTestObject('Object Repository/scoeone/invoice2/Page_My Tele2 Business/invoice2'))

WebUI.click(findTestObject('Object Repository/scoeone/product/Page_My Tele2 Business/span_Order'))

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('Object Repository/scoeone/dropdown/Page_My Tele2 Business/dropdownmenu'), '12', 
    true)

WebUI.setText(findTestObject('Object Repository/scoeone/salesforceid/Page_My Tele2 Business/input__sfid'), '123456')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/scoeone/DoneButton/Page_My Tele2 Business/continuebutton'))

WebUI.click(findTestObject('Object Repository/scoeone/shpcart/Page_My Tele2 Business/Shopping Cart'))

//WebUI.switchToWindowTitle('')
WebUI.click(findTestObject('Object Repository/scoeone/checkout/Page_My Tele2 Business/Check Out'))

WebUI.click(findTestObject('Object Repository/scoeone/checkout/Page_My Tele2 Business/Check Out'))

WebUI.delay(10)

WebUI.takeScreenshot()

Orderid = WebUI.getText(findTestObject('Object Repository/scoeone/ordernumber/Page_My Tele2 Business/ordernumber'))

println(Orderid)

CustomKeywords.'com.excel.WriteToExcel.writeToExcel'('P502 Orders', Orderid, 1, 1, Path)

WebUI.closeBrowser()

