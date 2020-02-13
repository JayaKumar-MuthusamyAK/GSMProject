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

LpTitle = WebUI.getWindowTitle()

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), Email)

WebUI.setText(findTestObject('Login_Page/Page_/Password placeholder'), Password)

WebUI.click(findTestObject('Login_Page/Page_/Log In button'))

WebUI.click(findTestObject('Login_Page/Dashboard/ADMIN Module'))

WebUI.click(findTestObject('Login_Page/Roles/div_Roles'))

currentUrl = WebUI.getUrl()

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(currentUrl)

LpTitle2 = WebUI.getWindowTitle()

WebUI.verifyEqual(LpTitle, LpTitle2)
