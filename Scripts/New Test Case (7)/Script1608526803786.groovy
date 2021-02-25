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

Windows.startApplicationWithTitle('C:\\ProgramData\\Microsoft\\AppV\\Client\\Integration\\B22F6B94-453C-4F91-A7AA-AE9B93A47C39\\Root\\ClarifyClient\\clarify.exe', 
    'clarify')

Windows.click(findWindowsObject('Object Repository/Button'))

Windows.click(findWindowsObject('Object Repository/Button(1)'))

Windows.click(findWindowsObject('Object Repository/Button(2)'))

Windows.setText(findWindowsObject('Object Repository/Window'), 'ClarifyCRM Login')

Windows.click(findWindowsObject('Object Repository/Edit'))

Windows.setText(findWindowsObject('Object Repository/Edit'), '')

Windows.click(findWindowsObject('Object Repository/Edit(1)'))

Windows.setText(findWindowsObject('Object Repository/Edit(1)'), 'claint')

Windows.click(findWindowsObject('Object Repository/Button(3)'))

