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

WebUI.callTestCase(findTestCase('Login_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CallTestCASE/Page_Customer Assignment/input_Search_layoutPane_2_1_3'), 'JN3')

WebUI.sendKeys(findTestObject('Object Repository/CallTestCASE/Page_Customer Assignment/input_Search_layoutPane_2_1_3'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/CallTestCASE/Page_Customer Assignment/span_Autoriteit Persoonsgegevens JN3'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/CallTestCASE/Page_Services/td_IP-VPN'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Services/button_Incident'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Select incident type'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Service down'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Service down_1'))

WebUI.click(findTestObject('Object Repository/Page_Services/span_Loss of functionality'))

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea_Did the service work well_id_4__8__5f967f'), 'dsgdsgsdsfsfdf')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Prio 2_id_4__8_5_3_3'), 'dsfdsfdsfsdf')

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea_What have you already examined_id__c5b80e'), 'fsdfdsfdsf')

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea_What is the source IP-adress and t_17a9f2'), 'sfsdfdfds')

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea_Please upload ping and traceroute _74d9ed'), 'dsfdssdfdsf')

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea_Who is the contactperson at your l_c77032'), 'dsffsddsfds')

WebUI.click(findTestObject('Object Repository/Page_Services/i_Prio 2_id_4__8_5_3_4-btn'))

WebUI.click(findTestObject('Object Repository/Page_Services/td_29'))

WebUI.setText(findTestObject('Object Repository/Page_Services/textarea__id_4__8_5_4_4'), 'fggfhhgfhgfhgfhgfvcbvcb')

WebUI.click(findTestObject('Object Repository/Page_Services/button_Send notifications_id_4__8_5_5_1_2_2'))

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__8_5_5_1_2_1_2_1_1_1'), 'monty')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__8_5_5_1_2_1_2_1_2_1'), 't@t.com')

WebUI.setText(findTestObject('Object Repository/Page_Services/input_Send notifications_id_4__8_5_5_1_2_1_2_1_3_1'), '+311111111')

WebUI.click(findTestObject('Object Repository/Page_Services/button_Send'))

WebUI.click(findTestObject('Object Repository/Page_Services/li_Your ticket has been sent to our Service_a98d45'))

String message = WebUI.getText(findTestObject('Object Repository/Page_Services/li_Your ticket has been sent to our Service_a98d45'))
println message

WebUI.click(findTestObject('Object Repository/Page_Services/div_IP-VPN Bezuidenhoutseweg 30 S-GRAVENHAG_14bcca'))

