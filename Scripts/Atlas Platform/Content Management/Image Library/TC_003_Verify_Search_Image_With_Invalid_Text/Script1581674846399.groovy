import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
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

<<<<<<< HEAD
<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/RLG-003 Validate Role Manager collapse button/Script1581659063897.groovy
WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)
=======
=======
<<<<<<< HEAD:Scripts/Atlas Platform/Content Management/Image Library/TC_003_Verify_Search_Image_With_Invalid_Text/Script1581674846399.groovy
>>>>>>> uday
not_run: WebUI.callTestCase(findTestCase('Atlas Platform/OnBoard/Login/LoginWithRootAdmin'), [('user_Email') : 'navaraj@totient.co.in'
        , ('user_Password') : 'Totient@123'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/contentmeu'))
<<<<<<< HEAD
>>>>>>> 87708f0dd43aa6bc23a6e8e66a1d986b699b4520:Scripts/Atlas Platform/Content Management/Image Library/TC_003_Verify_Search_Image_With_Invalid_Text/Script1581674846399.groovy
=======
=======
WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)
>>>>>>> master:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/RLG-003 Validate Role Manager collapse button/Script1581659063897.groovy
>>>>>>> uday

WebUI.click(findTestObject('Login_Page/Dashboard/Content Sub-Navigation/div_Images'))

WebUI.click(findTestObject('CONTENT/Image_Listing/all_Image_textwithcount'))

WebUI.clearText(findTestObject('CONTENT/Image_Listing/image_search_box'))

WebUI.delay(5)

WebUI.setText(findTestObject('CONTENT/Image_Listing/image_search_box'), 'aaaaa' + Keys.ENTER)

WebUI.delay(5)

String text = WebUI.getText(findTestObject('CONTENT/Image_Listing/showingtextforpagination'))

int resultfound_count = Integer.parseInt(((text.split('of')[1]).split(' ')[1]).trim())

WebUI.verifyEqual(resultfound_count, 0)

