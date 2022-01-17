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

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username'), 'maiquockhanh_')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password'), 'B5OifyXcTUtvDK3C7UbPMw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Element/input_Username_password'), Keys.chord(Keys.ENTER))

CustomKeywords.'wait.wait.DelayTime'(7000)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify with another device'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify other device_mx_AccessibleButton_7edffc'))

WebUI.click(findTestObject('Object Repository/Page_Element/span_M'))

WebUI.click(findTestObject('Object Repository/Page_Element  MQK space/div_General'))

WebUI.click(findTestObject('Object Repository/Page_Element  General/div_Invite to just this room'))

WebUI.setText(findTestObject('Object Repository/Page_Element  General/input_share this room_focus-visible'), 'qwrqwasdasdrwq@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Element  General/div_Invite'))

WebUI.closeBrowser()

