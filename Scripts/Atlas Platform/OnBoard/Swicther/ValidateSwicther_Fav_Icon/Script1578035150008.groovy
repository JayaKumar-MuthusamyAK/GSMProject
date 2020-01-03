import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.Color

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Atlas Platform/OnBoard/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/favorite_icon'))

String color1 = WebUI.getCSSValue(findTestObject('Swicther/favorite_icon_check'), 'd')//favorite_icon_check //grey

WebUI.click(findTestObject('Swicther/favorite_icon'))

String color2 = WebUI.getCSSValue(findTestObject('Swicther/favorite_icon_check'), 'd')

WebUI.verifyEqual("path(\"M 6.01 5 L 10 8.955 L 8.946 10 L 5 6.09 L 1.054 10 L 0 8.955 L 3.991 5 L 0 1.045 L 1.054 0 L 5 3.91 L 8.946 0 L 10 1.045 Z\")", color2)


