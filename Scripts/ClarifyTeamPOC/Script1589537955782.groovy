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

WebUI.navigateToUrl('https://mijn.uat.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/clarify/SCOE/input_VOOR ZAKELIJK_username-hidden'), 'karthik.murugan@t-mobile.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/clarify/SCOE/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/clarify/SCOE/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/clarify/SCOE/a_Other'))

WebUI.click(findTestObject('Object Repository/clarify/SCOE/a_Order center'))

WebUI.click(findTestObject('Object Repository/clarify/SCOE/a_Order center mobile'))

WebUI.sendKeys(findTestObject('Object Repository/clarify/Page_My Tele2 Business/input_Search Customer Account_accName'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/clarify/Page_My Tele2 Business/input_Account Name_accId'), '900219003')

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/input_Account Type_search'))

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/td_Business'))

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/td_1112 XS  DIEMEN Wisselwerking 58'))

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/td_1112 XS DIEMEN Wisselwerking 58'))

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/a_FMC'))

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/a_Business Hosted Voice_productInfo'))

WebUI.setText(findTestObject('Object Repository/clarify/Page_My Tele2 Business/input_T-Mobile Customer Reference_sfQuestio_1fd742'), 
    'testcreatedbyMONTY')

WebUI.delay(1)



WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/div__mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/clarify/Page_My Tele2 Business/productprofile_1'))

WebUI.click(findTestObject('Object Repository/clarify/SCOE/Page_My Tele2 Business/productprofile_2'))

WebUI.click(findTestObject('Object Repository/clarify/products/Page_My Tele2 Business/productprofile_3'))

WebUI.click(findTestObject('Object Repository/clarify/service1/Page_My Tele2 Business/services1'))

WebUI.setText(findTestObject('Object Repository/clarify/service1box1/Page_My Tele2 Business/service1box1'), '1')

WebUI.click(findTestObject('Object Repository/clarify/service2/Page_My Tele2 Business/service2'))

WebUI.setText(findTestObject('Object Repository/clarify/service2box2/Page_My Tele2 Business/service2box2'), '2')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/clarify/salesforce/Page_My Tele2 Business/salesforceid'), '123456')

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/input_Grid Section_calculatePriceBtn'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/input_Qty_addToCart'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/input_Product successfully added to cart_to_1eda6b'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/span_Continue'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/span_Next'))

WebUI.click(findTestObject('Object Repository/clarify/button/Page_My Tele2 Business/button_Next'))

WebUI.click(findTestObject('Object Repository/clarify/button1/Page_My Tele2 Business/button_Next1'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/input_Send order confirmation to my email i_e578bb'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/span_t1O3XfaCd'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/mat-cell_OS-1122167'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/h2_Order Details  OS-1122167'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/span_Close'))

WebUI.takeScreenshot()

WebUI.closeBrowser()


