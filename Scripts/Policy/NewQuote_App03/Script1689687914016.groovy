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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

// click new quote button
WebUI.verifyElementPresent(findTestObject('Policy/pge_NewQuote/btn_NewQuote'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_NewQuote/btn_NewQuote'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//select brokerage and broker
WebUI.verifyElementPresent(findTestObject('Policy/pge_NewQuote/btn_Brokerage'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_NewQuote/btn_Brokerage'))

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_NewQuote/drp_brokerage'), Brokerage)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_NewQuote/drp_BrokerName'), BrokerName)

//select lob and product
WebUI.verifyElementPresent(findTestObject('Policy/pge_NewQuote/btn_DWF'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_NewQuote/btn_DWF'))

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_NewQuote/txt_Product'), GlobalVariable.gPproduct2023)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//click start button
WebUI.verifyElementPresent(findTestObject('Policy/pge_NewQuote/btn_Start'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_NewQuote/btn_Start'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

