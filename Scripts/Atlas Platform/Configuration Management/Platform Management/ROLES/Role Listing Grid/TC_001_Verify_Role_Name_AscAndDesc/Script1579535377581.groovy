import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebElement as WebElement
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

WebUI.verifyElementPresent(findTestObject('HeaderMenus/adminmenu'), 0)

WebUI.click(findTestObject('HeaderMenus/adminmenu'))

WebUI.click(findTestObject('LoginPage/rolessubmenu'))

String text = WebUI.getText(findTestObject('ROLES/RoleListingPage/allrolestextwithcount'))

String totalcountintext = (text.split(' ')[2]).replace('(', '').replace(')', '').trim()

println(text)

println(totalcountintext)

int total = Integer.parseInt(totalcountintext)

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('ROLES/RoleListingPage/roleslisting'), 0)

int updatedCount = elements.size()

List<WebElement> roleNameList = new ArrayList<String>()

while (total != updatedCount) {
    for (WebElement e : elements) {
        roleNameList.add(e.getText())
    }
    
    WebUI.click(findTestObject('ROLES/RoleListingPage/nextIcon'))

    elements = WebUiCommonHelper.findWebElements(findTestObject('ROLES/RoleListingPage/roleslisting'), 0)

    updatedCount += elements.size()

    println(updatedCount)
}

println "ROLE NAME LIST : "+roleNameList

boolean isAscending = CustomKeywords.'web.CustomKeyword.checkListAscendingOrder'(roleNameList)

WebUI.verifyEqual(isAscending, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/contentmeu'))

WebUI.click(findTestObject('HeaderMenus/adminmenu'))

WebUI.click(findTestObject('LoginPage/rolessubmenu'))

WebUI.click(findTestObject('ROLES/RoleListingPage/span_Role'))

List<WebElement> elementslist = WebUiCommonHelper.findWebElements(findTestObject('ROLES/RoleListingPage/roleslisting'), 
    0)

int updatedCount1 = elementslist.size()

List<WebElement> roleNameListDesc = new ArrayList<String>()

while (total != updatedCount1) {
    for (WebElement e : elementslist) {
        roleNameListDesc.add(e.getText())
    }
    
    WebUI.click(findTestObject('ROLES/RoleListingPage/nextIcon'))

    elementslist = WebUiCommonHelper.findWebElements(findTestObject('ROLES/RoleListingPage/roleslisting'), 0)

    updatedCount1 += elementslist.size()

    println(updatedCount1)
}

println "ROLE NAME LIST : "+roleNameList 

println "ROLE NAME LIST : "+roleNameListDesc

boolean isDesc = CustomKeywords.'web.CustomKeyword.checkListDescendingOrder'(roleNameList, roleNameListDesc)

WebUI.verifyEqual(isDesc, true, FailureHandling.CONTINUE_ON_FAILURE)

