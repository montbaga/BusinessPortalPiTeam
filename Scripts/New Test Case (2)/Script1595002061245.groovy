import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import normal.keywords as keywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable


//Process p = Runtime.runtime.exec('C:/Users/montbaga/Desktop/cla/WinAppDriver.bat')
//p.waitFor()
//Runtime.runtime.exec('C:/Users/montbaga/Desktop/cla/WinAppDriver.bat')
//Runtime.runtime.exec('C:\\Users\\montbaga\\Desktop\\cla\\cla_502.exe')
//Windows.startApplication('C:\\Users\\montbaga\\Desktop\\cla\\cla_502.exe', FailureHandling.OPTIONAL)

//Runtime.runtime.exec("C:/Users/montbaga/Desktop/cla/cla_502.exe")


//KeywordUtil.markPassed('Marking test case passed as this is only involing other exe file')

String os = System.getProperty("os.name");
if (os.toLowerCase().indexOf("win") >= 0) {
	command = new String[1];
	command[0] = "C:/Users/montbaga/Desktop/cla/cla_502.bat";

	Process process = Runtime.getRuntime().exec(command).waitFor();
	BufferedReader is = new BufferedReader(
							new InputStreamReader(process.getInputStream()));
	String line;
	while ((line = is.readLine()) != null) {
	   System.out.println(line);
	}
}
