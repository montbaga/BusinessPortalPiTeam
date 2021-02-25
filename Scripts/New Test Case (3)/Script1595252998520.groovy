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

Windows.startApplicationWithTitle('C:\\ProgramData\\App-V\\B22F6B94-453C-4F91-A7AA-AE9B93A47C39\\5F265472-E532-4A5B-AF4E-08349E92C512\\Root\\ClarifyClient\\clarify.exe', 
    'ClarifyCRM')

Windows.click(findWindowsObject('Object Repository/desktop2/Edit'))

Windows.click(findWindowsObject('Object Repository/desktop2/Edit'))

Windows.click(findWindowsObject('Object Repository/desktop2/Edit'))

Windows.click(findWindowsObject('Object Repository/desktop2/Edit'))

Windows.setText(findWindowsObject('Object Repository/desktop2/Edit'), 'G0ldf1nger')

Windows.click(findWindowsObject('Object Repository/desktop2/Button'))

Windows.delay(20)

Windows.click(findWindowsObject('desktop/Button(1)'))

Windows.rightClick(findWindowsObject('desktop/Button(1)'))

Windows.click(findWindowsObject('desktop/Button(1)'))

Windows.rightClick(findWindowsObject('Object Repository/desktop2/TreeItem'))

Windows.click(findWindowsObject('Object Repository/desktop2/TreeItem(1)'))

Windows.click(findWindowsObject('Object Repository/desktop2/TreeItem'))

Windows.rightClick(findWindowsObject('Object Repository/desktop2/TreeItem'))

Windows.rightClick(findWindowsObject('Object Repository/desktop2/TreeItem'))

Windows.click(findWindowsObject('Object Repository/desktop2/Pane'))

Windows.doubleClick(findWindowsObject('Object Repository/desktop2/MenuItem'))

Windows.click(findWindowsObject('Object Repository/desktop2/CheckBox'))

Windows.rightClick(findWindowsObject('Object Repository/desktop2/CheckBox'))

Windows.click(findWindowsObject('Object Repository/desktop2/Text'))

