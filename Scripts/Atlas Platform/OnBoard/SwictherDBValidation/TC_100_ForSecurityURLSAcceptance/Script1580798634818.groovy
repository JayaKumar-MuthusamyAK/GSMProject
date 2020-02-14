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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ec2-3-133-54-242.us-east-2.compute.amazonaws.com:9092/services/message/api/programs')

WebUI.click(findTestObject('LoginPage/httpAdvanceBtn'))

WebUI.click(findTestObject('LoginPage/httpsproceedlink'))

WebUI.navigateToUrl('https://3.19.246.255:9090/services/configuration/api/authenticate')

WebUI.click(findTestObject('LoginPage/httpAdvanceBtn'))

WebUI.click(findTestObject('LoginPage/httpsproceedlink'))

WebUI.navigateToUrl('https://ec2-3-133-54-242.us-east-2.compute.amazonaws.com:8080/services/data/api/data-sources?search=Repair&filters=ACTIVE&page=0&size=20&sort=accountId,DESC')

WebUI.click(findTestObject('LoginPage/httpAdvanceBtn'))

WebUI.click(findTestObject('LoginPage/httpsproceedlink'))

WebUI.navigateToUrl('https://3.19.246.255:9091/services/content/api/images?page=0&size=10')

WebUI.click(findTestObject('LoginPage/httpAdvanceBtn'))

WebUI.click(findTestObject('LoginPage/httpsproceedlink'))

