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
import groovy.json.internal.Exceptions as Exceptions
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/')

WebUI.setText(findTestObject('Login_Page/Page_/input_Email Address_form-control'), Email)

WebUI.setText(findTestObject('Login_Page/Page_/input_Password_form-control'), Password)

WebUI.click(findTestObject('Login_Page/Page_/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/div_Invalid Email Format'), 30)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData('AMP').getValue(6, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

String email_clr_act = WebUI.getCSSValue(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData('AMP').getValue(
        5, 2))

WebUI.verifyEqual(email_clr_act, findTestData('AMP').getValue(6, 2), FailureHandling.CONTINUE_ON_FAILURE)

String email_err_font_size = WebUI.getCSSValue(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData(
        'AMP').getValue(5, 3))

WebUI.verifyEqual(email_err_font_size, findTestData('AMP').getValue(6, 3), FailureHandling.CONTINUE_ON_FAILURE)

String email_err_font_fmly = WebUI.getCSSValue(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData(
        'AMP').getValue(5, 4))

WebUI.verifyEqual(email_err_font_fmly, findTestData('AMP').getValue(6, 4), FailureHandling.CONTINUE_ON_FAILURE)

println(email_clr_act)

println(email_err_font_size)

println(email_err_font_fmly)

