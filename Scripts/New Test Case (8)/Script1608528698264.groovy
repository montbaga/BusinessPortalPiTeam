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

Windows.startApplicationWithTitle('C:\\Windows\\notepad.exe', 'Untitled - Notepad')

Windows.clickElementOffset(findWindowsObject('Object Repository/desktop2/TitleBar'), 767, 114)

Windows.setText(findWindowsObject('Object Repository/desktop2/Document'), 'test')

Windows.clickElementOffset(findWindowsObject('Object Repository/desktop2/TitleBar'), 1498, 95)

Windows.clickElementOffset(findWindowsObject('Object Repository/desktop2/Button'), 603, 97)

Windows.clickElementOffset(findWindowsObject('Object Repository/desktop2/Button(1)'), 406, 202)

Windows.clickElementOffset(findWindowsObject('Object Repository/desktop2/Button(2)'), 564, 94)

