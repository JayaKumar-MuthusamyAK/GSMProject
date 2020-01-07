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

WebUI.callTestCase(findTestCase('Atlas Platform/OnBoard/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

String initiallyselectedtext = WebUI.getText(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/accounts_tab_swicther'))

String selectedtext = WebUI.getText(findTestObject('Swicther/account_tab_first_values'))

WebUI.click(findTestObject('Swicther/account_tab_first_values'))

WebUI.verifyNotEqual(initiallyselectedtext, (selectedtext.split('Last')[0]).trim())

String currentlySelectedText = WebUI.getText(findTestObject('Swicther/swicthermenutext'))

WebUI.verifyEqual(currentlySelectedText.trim(), (selectedtext.split('Last')[0]).trim())
