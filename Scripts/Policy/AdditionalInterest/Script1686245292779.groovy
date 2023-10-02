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

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/title_AdditonalInterests'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tAdditional Interests Screen...')

// add additional interest
WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/btn_AddAdditionalInterest'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_AdditionalInterest/btn_AddAdditionalInterest'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/title_AdditionalInterestPopup'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tAdd Additional Interests Details...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestType'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestType'), GlobalVariable.gInterestType)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_Type'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_Type'), GlobalVariable.gInterest)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestFName'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestFName'), GlobalVariable.gInterestFName)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestLName'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestLName'), GlobalVariable.gInterestLName)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestAddress1'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestAddress1'), GlobalVariable.gInterestAddress1)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestCity'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestCity'), GlobalVariable.gInterestCity)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestZip'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestZip'), GlobalVariable.gInterestZip)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/txt_InterestPhone'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_AdditionalInterest/txt_InterestPhone'), GlobalVariable.gInterestPhone)

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/url_Verify'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_AdditionalInterest/url_Verify'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

def gStatus = WebUI.getAttribute(findTestObject('Policy/pge_AdditionalInterest/txt_GeocodeStatus'), 'value')

if (gStatus.contains(GlobalVariable.gInterestGeocodeStatus)) {
    WebUI.comment('\tAdditional Interest Address Verified!!!')
}

WebUI.verifyElementPresent(findTestObject('Policy/pge_AdditionalInterest/url_EditVerifiedAddress'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_AdditionalInterest/btn_Ok'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

def policyDesigneeInfo = WebUI.getText(findTestObject('Policy/pge_AdditionalInterest/lbl_PolicyDesigneeInfo'))

if (policyDesigneeInfo.contains(GlobalVariable.gInterestFName)) {
    WebUI.comment('\tAdditional Interest Successfully Added!!!')
}

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

