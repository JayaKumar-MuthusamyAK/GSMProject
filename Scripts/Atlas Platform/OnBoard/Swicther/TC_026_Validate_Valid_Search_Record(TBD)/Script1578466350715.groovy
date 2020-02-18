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
import java.sql.*

CustomKeywords.'web.MySQLDataBase.conncetDBWithOutParams'()

ResultSet rs = CustomKeywords.'web.MySQLDataBase.executeQuery'('select account.name from atlas_config.account INNER join atlas_config.account_access ON account_access.account_id=account.account_id where user_id=2;')

ResultSet rs1 = CustomKeywords.'web.MySQLDataBase.executeQuery'('select count(*) AS total from atlas_config.account INNER join atlas_config.account_access ON account_access.account_id=account.account_id where user_id=2;')

def count

while (rs1.next()) {
    count = rs1.getInt('total')

    println(count)
}

/*select account.name, account_access.user_id from atlas_config.account INNER join atlas_config.account_access ON account_access.account_id=account.account_id where user_id='2';
*/
while (rs.next()) {
    println(rs.getString('name'))
}

