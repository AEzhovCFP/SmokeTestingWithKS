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
import com.kms.katalon.core.testdata.InternalData

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tApplicant Screen...')

List<TestObject> items = [
	findTestObject('Policy/pge_Applicant/title_ApplicantInformation'),
	findTestObject('Policy/pge_Applicant/txt_EntityType'),
	findTestObject('Policy/pge_Applicant/txt_EntityName'),
	findTestObject('Policy/pge_Applicant/txt_FirstName'),
	findTestObject('Policy/pge_Applicant/txt_LastName'),
	findTestObject('Policy/pge_Applicant/txt_PrimaryPhone'),
	findTestObject('Policy/pge_Applicant/chk_InspectionContact'),
	findTestObject('Policy/pge_Applicant/txt_Address1'),
	findTestObject('Policy/pge_Applicant/txt_City'),
	findTestObject('Policy/pge_Applicant/txt_Zip'),
	findTestObject('Policy/pge_Applicant/btn_AddSecondaryInsured'),
	findTestObject('Policy/pge_Applicant/btn_EditVesting')
	
	]
	
for (TestObject to: items) {
	WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
}

//enter applicant information
WebUI.comment('\tAdding Applicant Information...')

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_EntityType'), EntityType)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_EntityName'), EntityName)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_FirstName'), ApplicantFName)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_LastName'), ApplicantLName)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_PrimaryPhone'), PrimaryPhone)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementNotChecked(findTestObject('Policy/pge_Applicant/chk_InspectionContact'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Applicant/chk_InspectionContact'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Adding property address
WebUI.comment('\tAdding Property Address...')

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_Address1'), ApplicantAddress1)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_City'), ApplicantCity)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_Applicant/txt_Zip'), ApplicantZip)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Applicant/chk_MailingAddressYes'))

// verifying address
WebUI.verifyElementPresent(findTestObject('Policy/pge_Applicant/btn_VerifyAddress'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Applicant/btn_VerifyAddress'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

def confidence = WebUI.getAttribute(findTestObject('Policy/pge_Applicant/txt_Confidence'), 'value')

if (confidence == '100') {
    WebUI.comment('\tAddress confidence is ' + confidence)
}

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Applicant/url_Accept'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Applicant/btn_EditVerifiedAddress'), GlobalVariable.gTimeOutSeconds)

// Adding Secondary Insured
CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Applicant/btn_AddSecondaryInsured'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

List<TestObject> secondaryInsuredItems = [
	findTestObject('Policy/pge_Applicant/title_SecondaryInsured'),
	findTestObject('Policy/pge_Applicant/txt_SecondaryEntityType'),
	findTestObject('Policy/pge_Applicant/txt_SecondaryFName'),
	findTestObject('Policy/pge_Applicant/txt_SecondaryLName'),
	]
	
	for (TestObject to: secondaryInsuredItems) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}
	
WebUI.comment('\tAdding Secondary Insured...')

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_SecondaryEntityType'), SecondaryEntityType)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Applicant/txt_SecondaryFName'), SecondaryFName)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_Applicant/txt_SecondaryLName'), SecondaryLName)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Edit vesting
CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Applicant/btn_EditVesting'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Applicant/title_FullVesting'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

