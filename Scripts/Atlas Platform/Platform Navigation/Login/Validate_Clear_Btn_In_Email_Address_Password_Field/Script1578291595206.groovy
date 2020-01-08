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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/')

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), email, FailureHandling.CONTINUE_ON_FAILURE)

<<<<<<< HEAD:Scripts/Atlas Platform/Platform Navigation/Login/Validate_Clear_Btn_In_Email_Address_Password_Field/Script1578291595206.groovy
WebUI.click(findTestObject('Login_Page/Page_/Email Address_clear_svg-icon'), FailureHandling.CONTINUE_ON_FAILURE)

getEmail = WebUI.getText(findTestObject('Login_Page/Page_/email address placeholder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/email address placeholder'), '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Login_Page/Page_/Password placeholder'), password, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Login_Page/Page_/Password_clear_svg-icon'), FailureHandling.CONTINUE_ON_FAILURE)
=======
WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/div_Password'), 0)
>>>>>>> 04a6398fb4e214a4c7cb9fceb064be1469783ad6:Scripts/Atlas Platform/Platform Navigation/Login/Login_Page_Attributes/Script1577773922205.groovy

String getPassword = WebUI.getText(findTestObject('Login_Page/Page_/Password placeholder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Password placeholder'), '', FailureHandling.CONTINUE_ON_FAILURE)

