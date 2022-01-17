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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Element/select_UsernameEmail addressPhone'), 'login_field_email', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_mx_Field_4'), 'dinhkhanh1406@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Email_password'), 'Mxioz+lr0b006vgNJrN/mA==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit'))

CustomKeywords.'khanh.wait.DelayTime'(10000)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify with another device'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify other device_mx_AccessibleButton_7edffc'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Rooms_mx_AccessibleButton mx_RoomSublis_27fc2e'))

WebUI.click(findTestObject('Object Repository/Page_Element/span_Create new room'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Create a private room_mx_Field_5'), 'Room test10')

WebUI.click(findTestObject('Object Repository/Page_Element/button_Create Room'))

WebUI.closeBrowser()

