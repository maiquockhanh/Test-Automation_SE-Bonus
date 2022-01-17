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

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_mx_Field_4'), 'quangvust201@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Email_password'), 'yyMQ+2z7KLrzMfMo5CXoHw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Element/input_Email_password'), Keys.chord(Keys.ENTER))

CustomKeywords.'vu.wait.DelayTime'(20000)

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Verify with another device'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Verify other device_mx_AccessibleButton_7edffc'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Matrix HQ'))

WebUI.closeBrowser()

