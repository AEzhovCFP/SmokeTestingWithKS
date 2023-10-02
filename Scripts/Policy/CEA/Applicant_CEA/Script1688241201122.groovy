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

//Applicant screen
WebUI.comment('\tApplicant Screen...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_Applicant/title_ApplicantInformation'),GlobalVariable.gTimeOutSeconds)

//Verify Applicant screen items
List<TestObject> items = [
	findTestObject('Policy/pge_Applicant/title_ApplicantInformation'),
	findTestObject('Policy/pge_Applicant/txt_EntityType'),
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

//Navigate to Policy Term screen
WebUI.click(findTestObject('Policy/Navigation/btn_Next'))