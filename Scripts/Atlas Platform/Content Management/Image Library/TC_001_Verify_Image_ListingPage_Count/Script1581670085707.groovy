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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Atlas Platform/OnBoard/Login/LoginWithRootAdmin'), [('user_Email') : 'navaraj@totient.co.in'
        , ('user_Password') : 'Totient@123'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/contentmeu'))

WebUI.click(findTestObject('Login_Page/Dashboard/Content Sub-Navigation/div_Images'))

WebUI.click(findTestObject('Object Repository/CONTENT/Images/all_Image_textwithcount'))

String getText = WebUI.getText(findTestObject('Object Repository/CONTENT/Images/all_Image_textwithcount'))

println(getText)

String totalcountintext = (getText.split(' ')[2]).replace('(', '').replace(')', '').trim()

int total = Integer.parseInt(totalcountintext)

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('CONTENT/Images/column1_Image_Name_Values'), 
    0)

int pageValueCount = elements.size()

if(total>10){
	while (total != pageValueCount) {
		WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))
	
		elements = WebUiCommonHelper.findWebElements(findTestObject('CONTENT/Images/column1_Image_Name_Values'), 0)
	
		pageValueCount += elements.size()
	
		//println(pageValueCount)
	}
}


WebUI.verifyEqual(total, pageValueCount);



not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/image_search_box'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/column_name_image'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/upload_image_button'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/column_name_channel'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/column_name_shared_to'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/column_name_created'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/column_name_modified'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/pageTotal_count'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/pagination_textbox'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/pageTotal_count'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/showingtextforpagination'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/image_expand_icon'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/count_for_recently_edited'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/count_for_recently_edited'))

not_run: WebUI.click(findTestObject('Object Repository/CONTENT/Images/count_for_recently_shared'))

not_run: WebUI.closeBrowser()

