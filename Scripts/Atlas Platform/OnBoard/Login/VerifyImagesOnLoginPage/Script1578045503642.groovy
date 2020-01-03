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

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/')

WebUI.verifyElementPresent(findTestObject('HeaderMenus/ampimage'), 0)

WebUI.verifyElementInViewport(findTestObject('LoginPage/backgroundImage'), 0)

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/init/380bfcf899971f7d559215551dc6c715.svg')

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('LoginPage/ampimagesvg'), 'd'), 'path("M 10.757 3.106 V 3.122 L 0 23.538 H 2.437 L 12.175 5.324 L 21.823 23.538 H 24.322 L 13.504 2.983 L 12.175 0.462 Z M 26.158 0 V 23.706 H 28.223 V 8.613 L 37.117 24 L 46.09 8.461 V 23.706 H 48.185 L 48.155 0.0460014 L 37.21 19.524 Z M 58.535 1.385 C 59.94 1.385 61.357 1.729 62.776 2.421 C 65.598 3.789 67 6.146 67 9.48 C 67 12.829 65.598 15.173 62.776 16.54 C 61.356 17.216 59.94 17.56 58.536 17.56 H 53.586 V 23.537 H 51.397 V 1.385 H 58.535 Z M 53.587 3.547 V 15.414 H 58.535 A 7.236 7.236 0 0 0 61.748 14.617 C 63.754 13.641 64.753 11.928 64.753 9.482 C 64.753 7.032 63.754 5.32 61.763 4.328 C 60.707 3.804 59.636 3.547 58.535 3.547 H 53.587 Z")')

