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

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Roles_page/Create New Role_button'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Content Features'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/h2_Content Features'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/label_Template Library'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/label_Image Library'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/label_Access Library'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/label_Content Block Library'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/label_Offer Library'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Template_All Access'), 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Template_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Template_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Template_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Image_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Image_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Image_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Image_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Asset_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Asset_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Asset_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Asset_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Content_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Content_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Content_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Content_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Offer_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Offer_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Offer_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Content Features/Access_radioButton/Offer_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Template_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Template_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Template_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Image_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Image_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Image_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Asset_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Asset_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Asset_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Content_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Content_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Content_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Offer_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Offer_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Content Features/Access_labels/Offer_No Access'), 0)

