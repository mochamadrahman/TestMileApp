import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// open browser and navigate to website
WebUI.openBrowser('https://dev.mile.app/request-demo')

// Maximize the Window
WebUI.maximizeWindow()

// set Email
WebUI.setText(findTestObject('Object Repository/TestUI_OR/Page_Mileapp  Request Demo/input_Email_email'), 'mrahmanhaddgmail.com')

// verfiy Element Email Notification
WebUI.verifyElementPresent(findTestObject('Object Repository/TestUI_OR/Page_Mileapp  Request Demo/span_The email field must be a valid email'), 5)


// close browser
WebUI.closeBrowser()


