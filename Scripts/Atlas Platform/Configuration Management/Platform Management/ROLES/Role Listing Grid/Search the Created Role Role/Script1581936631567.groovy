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

<<<<<<< HEAD:Scripts/Atlas Platform/Platform Navigation/Logout/Logout/Script1581923469426.groovy
WebUI.click(findTestObject('Logout/My Account'))
=======
not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Navigation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)
>>>>>>> master:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy

WebUI.click(findTestObject('Logout/li_Log Out'))

<<<<<<< HEAD:Scripts/Atlas Platform/Platform Navigation/Logout/Logout/Script1581923469426.groovy
actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, 'https://atlas-dev.gsm.auto/', false)
=======
WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search Box'), GlobalVariable.ROLENAME1 + Keys.ENTER)

WebUI.verifyElementText(findTestObject('ROLES/Roles_page/role name'), GlobalVariable.ROLENAME1)
>>>>>>> master:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy

