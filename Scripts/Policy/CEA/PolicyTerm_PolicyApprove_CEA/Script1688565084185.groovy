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

WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/btn_EffectiveDate'), GlobalVariable.gTimeOutSeconds)

EffectiveDate = WebUI.getAttribute(findTestObject('Policy/pge_PolicyTerm/btn_EffectiveDate'),'value')

println("Policy Effective Date is "+EffectiveDate)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/drp_PolicyTerm'), GlobalVariable.gTimeOutSeconds)

Term = WebUI.getText(findTestObject('Policy/pge_PolicyTerm/drp_PolicyTerm'))

println("Policy Term is: "+Term)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/lbl_PolicyExpDate'), GlobalVariable.gTimeOutSeconds)

ExpirationDate = WebUI.getText(findTestObject('Policy/pge_PolicyTerm/lbl_PolicyExpDate'))

println("Policy Expiration Date is: "+ExpirationDate)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/lbl_CompanionPolicyNum'), GlobalVariable.gTimeOutSeconds)

CompanionPolicy = WebUI.getText(findTestObject('Policy/pge_PolicyTerm/lbl_CompanionPolicyNum'))

println("Companion Policy Number is: "+CompanionPolicy)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/lbl_CompanionPolicyEffDate'), GlobalVariable.gTimeOutSeconds)

CompEffDate = WebUI.getText(findTestObject('Policy/pge_PolicyTerm/lbl_CompanionPolicyEffDate'))

println("Companion Policy Effective Date is: "+CompEffDate)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/lbl_CompanionPolicyExpDate'), GlobalVariable.gTimeOutSeconds)

CompExpDate = WebUI.getText(findTestObject('Policy/pge_PolicyTerm/lbl_CompanionPolicyExpDate'))

println("Companion Policy Expiration Date is: "+CompExpDate)

//Navigation to Dwelling Information page
CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Navigation to Dwelling Coverage page
CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

