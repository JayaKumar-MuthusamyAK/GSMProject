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

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('ROLES/Role_Navigation/a_ADMIN'))

WebUI.click(findTestObject('ROLES/Roles_page/Hamburger/button_hamburger'))

WebUI.delay(1)

WebUI.click(findTestObject('ROLES/Roles_page/Hamburger/a_Edit'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/Clear_button'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('xlsx files/Roles').getValue(
        3, 2))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/div_Create'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/Yes_Save_button'))

WebUI.verifyElementText(findTestObject('ROLES/Roles_page/Search text field/validate created role'), findTestData('xlsx files/Roles').getValue(
        3, 2))

