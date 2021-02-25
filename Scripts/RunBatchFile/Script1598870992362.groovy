import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Process p = Runtime.getRuntime().exec('C:/Users/montbaga/Desktop/POC-BP/POC-BP/cla.bat')

p.waitFor()

WebUI.delay(15)

Windows.clearText(findWindowsObject('Object Repository/desktop/Edit'))

Windows.setText(findWindowsObject('Object Repository/desktop/Edit'), 'sa')

Windows.setText(findWindowsObject('Object Repository/desktop/Edit(1)'), 'G0ldf1nger')

Windows.clearText(findWindowsObject('Object Repository/desktop/Edit(2)'))

Windows.setText(findWindowsObject('Object Repository/desktop/Edit(2)'), 'clauat')

Windows.clearText(findWindowsObject('Object Repository/desktop/Edit(3)'))

Windows.setText(findWindowsObject('Object Repository/desktop/Edit(3)'), 'clauat')

Windows.click(findWindowsObject('Object Repository/desktop/Button'))

Windows.delay(30)

