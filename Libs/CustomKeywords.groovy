
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.sql.Connection

import com.katalon.plugin.keyword.connection.DBType

import java.sql.ResultSet

import com.kms.katalon.core.testobject.TestObject


def static "com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults"(
    	String testcaseName	
     , 	String exception	
     , 	String results	) {
    (new com.kms.katalon.keyword.testlink.TestlinkKeywords()).updateResults(
        	testcaseName
         , 	exception
         , 	results)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.execute"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).execute(
        	conn
         , 	queryString)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection"(
    	DBType type	
     , 	String server	
     , 	String port	
     , 	String dbName	
     , 	String userName	
     , 	String Password	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).createConnection(
        	type
         , 	server
         , 	port
         , 	dbName
         , 	userName
         , 	Password)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeQuery(
        	conn
         , 	queryString)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeUpdate(
        	conn
         , 	queryString)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection"() {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).getGlobalConnection()
}

def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
}

def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection"(
    	String fileName	
     , 	String query	
     , 	String user	
     , 	String password	
     , 	DBType dbType	
     , 	String host	
     , 	String port	
     , 	String dbName	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingInternalConnection(
        	fileName
         , 	query
         , 	user
         , 	password
         , 	dbType
         , 	host
         , 	port
         , 	dbName)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).isEmptyResult(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue"(
    	ResultSet rs	
     , 	int fromRowIndex	
     , 	int toRowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListRowValue(
        	rs
         , 	fromRowIndex
         , 	toRowIndex)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnName)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	int columnIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnIndex)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	columnName)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	colIndex)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}

def static "web.MySQLDataBase.connectDB"(
    	String url	
     , 	String dbname	
     , 	String port	
     , 	String username	
     , 	String password	) {
    (new web.MySQLDataBase()).connectDB(
        	url
         , 	dbname
         , 	port
         , 	username
         , 	password)
}

def static "web.MySQLDataBase.conncetDBWithOutParams"() {
    (new web.MySQLDataBase()).conncetDBWithOutParams()
}

def static "web.MySQLDataBase.executeQuery"(
    	String queryString	) {
    (new web.MySQLDataBase()).executeQuery(
        	queryString)
}

def static "web.MySQLDataBase.closeDatabaseConnection"() {
    (new web.MySQLDataBase()).closeDatabaseConnection()
}

def static "web.CustomKeyword.randomPhoneNumberGenerator"() {
    (new web.CustomKeyword()).randomPhoneNumberGenerator()
}

def static "web.CustomKeyword.randomEmailIDGenerator"() {
    (new web.CustomKeyword()).randomEmailIDGenerator()
}

def static "web.CustomKeyword.getTitle"() {
    (new web.CustomKeyword()).getTitle()
}

def static "web.CustomKeyword.takeScreenShot"() {
    (new web.CustomKeyword()).takeScreenShot()
}

def static "web.CustomKeyword.isBrokenLinkchecker"(
    	URL url	) {
    (new web.CustomKeyword()).isBrokenLinkchecker(
        	url)
}

def static "web.CustomKeyword.CompareBothImages"(
    	TestObject testObjectoftheimage	
     , 	String pathoftheimage	) {
    (new web.CustomKeyword()).CompareBothImages(
        	testObjectoftheimage
         , 	pathoftheimage)
}

def static "web.CustomKeyword.checkListAscendingOrder"(
    	List<String> listOfString	) {
    (new web.CustomKeyword()).checkListAscendingOrder(
        	listOfString)
}

def static "web.CustomKeyword.checkListDescendingOrder"(
    	List<String> listOfString	
     , 	List<String> listOfStringWithDesc	) {
    (new web.CustomKeyword()).checkListDescendingOrder(
        	listOfString
         , 	listOfStringWithDesc)
}

def static "web.CustomKeyword.getrandomStingValue"(
    	List<String> listOfString	) {
    (new web.CustomKeyword()).getrandomStingValue(
        	listOfString)
}

def static "web.CustomKeyword.getCookiesValue"() {
    (new web.CustomKeyword()).getCookiesValue()
}

def static "web.CustomKeyword.selectDropDownValue"(
    	List<WebElement> webelements	
     , 	String value	) {
    (new web.CustomKeyword()).selectDropDownValue(
        	webelements
         , 	value)
}

def static "web.CustomKeyword.getRandomString"() {
    (new web.CustomKeyword()).getRandomString()
}

def static "web.CustomKeyword.getRandomName"(
    	String name	) {
    (new web.CustomKeyword()).getRandomName(
        	name)
}
