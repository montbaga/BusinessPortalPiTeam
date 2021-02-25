import java.*

import com.thoughtworks.selenium.webdriven.Windows

/*String charSet = 'abcdefghijklmno'

String charSet1 = '1234567890'

int length = 3

int length1 = 9

GlobalVariable.organisationName = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.useridupdate = ('update' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orgemail = (('scoe@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.orgmobile = RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.orgphone = RandomStringUtils.random(length1, charSet1.toCharArray())

GlobalVariable.orgfirstname = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orgmiddlename = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.orglastname = ('monty' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.userid = ('userautomation' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.email = (('auto@' + RandomStringUtils.random(length, charSet.toCharArray())) + '.com')

GlobalVariable.firstname = ('firstname' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.middlename = ('middlename' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.lastname = ('lastename' + RandomStringUtils.random(length, charSet.toCharArray()))

GlobalVariable.fixednumber = ('+31' + RandomStringUtils.random(length1, charSet1.toCharArray()))

GlobalVariable.mobilenumber = ('+31' + RandomStringUtils.random(length1, charSet1.toCharArray()))

println(GlobalVariable.userid)

println(GlobalVariable.email)

println(GlobalVariable.firstname)

println(GlobalVariable.middlename)

println(GlobalVariable.lastname)

println(GlobalVariable.fixednumber)

println(GlobalVariable.mobilenumber)

println(GlobalVariable.organisationName)

println(GlobalVariable.orgmobile)

println(GlobalVariable.orgphone)

println(GlobalVariable.orgfirstname)

println(GlobalVariable.orgmiddlename)

println(GlobalVariable.orglastname)

println(GlobalVariable.useridupdate)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mijn.int.tele2zakelijk.nl')

WebUI.setText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_username-hidden'), 'karthik.murugan@t-mobile.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_password'), 'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Object Repository/SCOE/input_VOOR ZAKELIJK_login-button'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/SCOE/a_Other'))

WebUI.click(findTestObject('Object Repository/SCOE/a_Order center'))

WebUI.click(findTestObject('Object Repository/SCOE/a_Order center mobile'))

WebUI.click(findTestObject('Object Repository/SCOE/input_Account Type_createAccount'))

WebUI.setText(findTestObject('Object Repository/SCOE/input_Invoice Details_organisationName'), GlobalVariable.organisationName)

WebUI.click(findTestObject('Object Repository/SCOE/div_KVK Number_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/SCOE/div_VAT Number_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/SCOE/button_Next'))

WebUI.setText(findTestObject('Object Repository/SCOE/input_Invoice Language_firstName'), GlobalVariable.orgfirstname)

WebUI.setText(findTestObject('Object Repository/SCOE/input_First Name_middleName'), GlobalVariable.orgmiddlename)

WebUI.setText(findTestObject('Object Repository/SCOE/input_Middle Name_lastName'), GlobalVariable.orglastname)

WebUI.setText(findTestObject('Object Repository/SCOE/input_ 31_phone'), GlobalVariable.orgphone)

WebUI.click(findTestObject('Object Repository/SCOE/div_Mobile'))

WebUI.setText(findTestObject('Object Repository/SCOE/input_ 31_mobile'), GlobalVariable.orgmobile)

WebUI.setText(findTestObject('Object Repository/SCOE/input_Fax_email'), GlobalVariable.orgemail)

WebUI.click(findTestObject('Object Repository/scoe1/button_Next_scoe'))

WebUI.click(findTestObject('Object Repository/SCOE/div_Next_mat-checkbox-inner-container'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/scoe2/button_Next_scoe1'))

WebUI.setText(findTestObject('Object Repository/SCOE/input_Address Country_postalCode'), '1112 XN')

WebUI.setText(findTestObject('Object Repository/SCOE/input_Postal Code_houseNumber'), '42')

WebUI.click(findTestObject('Object Repository/SCOE/button_Check Address'))

WebUI.click(findTestObject('Object Repository/SCOE/mat-cell_Diemerhof'))

WebUI.click(findTestObject('Object Repository/scoe3/button_Next_scoe2'))

WebUI.click(findTestObject('Object Repository/SCOE/div_Direct Debit'))

WebUI.click(findTestObject('Object Repository/SCOE/span_Bank Giro'))

WebUI.click(findTestObject('Object Repository/SCOE/button_Create Account'))

WebUI.delay(20)

WebUI.takeScreenshot()

Robot rb = new Robot()

rb.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(1)

rb.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/td_1112 XS  DIEMEN, Wisselwerking 58'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/td_S00598831'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/a_Data'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/a_Cryptodienst_productInfo'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/span__mydpicon icon-mydpcalendar'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/span_Today'))

WebUI.setText(findTestObject('Object Repository/Page_My Tele2 Business/input__sfQuestionTextBox'), '123456')

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/input_Grid Section_calculatePriceBtn'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/input_Qty_addToCart'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/input_Product successfully added to cart._t_be3a62'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/span_Continue'))

WebUI.click(findTestObject('Object Repository/clarify2/Page_My Tele2 Business/span_Next'))

WebUI.click(findTestObject('Object Repository/clarify/button/Page_My Tele2 Business/button_Next'))

WebUI.click(findTestObject('Object Repository/clarify/button1/Page_My Tele2 Business/button_Next1'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/input_Send order confirmation to my email i_e578bb'))

WebUI.click(findTestObject('Object Repository/Page_My Tele2 Business/span_tTxOcah5m'))

String Orderid = WebUI.getText(findTestObject('Object Repository/Page_My Tele2 Business/mat-cell_OS-2149778'))

println(Orderid)

Path = 'C:\\Users\\montbaga\\Desktop\\cla\\P502_Data.xlsx'

CustomKeywords.'com.excel.WriteToExcel.writeToExcel'('P502 Orders', Orderid, 1, 1, Path)
*/
Clarify_Auto = 'C:\\Users\\montbaga\\Desktop\\cla\\cla_502.exe'
Runtime.getRuntime().exec(Clarify_Auto)





