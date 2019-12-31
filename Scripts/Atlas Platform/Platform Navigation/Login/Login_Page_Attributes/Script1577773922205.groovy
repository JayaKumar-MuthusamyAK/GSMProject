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

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net')

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/div_Email Address'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/div_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/svg_Email Address_svg-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/svg_Password_svg-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/div_ 2019 GS Marketing All Rights Reserved    Contact'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/div_Email AddressPasswordLog InForgot Password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Page/Page_/button_Log In'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/div_Forgot Password'), 0)

