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

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/title_InsuranceHistory'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tInsurance History Screen...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/btn_AddCarrier'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_InsuranceHistory/btn_AddCarrier'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/title_CoverageDetails'), GlobalVariable.gTimeOutSeconds)

// add carrier details
WebUI.comment('\tAdd carrier details...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/txt_CarrierName'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_InsuranceHistory/txt_CarrierName'), carrierName)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/txt_PriorPolicyNo'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_InsuranceHistory/txt_PriorPolicyNo'), priorPolicyNo)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/txt_EffectiveDate'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_InsuranceHistory/txt_EffectiveDate'), effectiveDate)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/txt_ExpiryDate'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_InsuranceHistory/txt_ExpiryDate'), expiryDate)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/txt_Reason'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_InsuranceHistory/txt_Reason'), terminationReason)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InsuranceHistory/btn_Ok'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_InsuranceHistory/btn_Ok'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

