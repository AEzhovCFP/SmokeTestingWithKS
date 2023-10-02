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

WebUI.comment('\tApplicant Information Screen...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_Applicant/title_ApplicantInformation'), 10)

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.click(findTestObject('Policy/Navigation/btn_Next')) 

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/title_DwellingInfo'),10)

WebUI.setText(findTestObject('Policy/pge_DwellingInformation/txt_CoveredPerils'), CoveredPerils_Updated)

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/title_CoverageInfo'), 10)

WebUI.setText(findTestObject('Policy/pge_DwellingCoverage/txt_DwellingLimit'), DwellingLimit_Updated)

WebUI.setText(findTestObject('Policy/pge_DwellingCoverage/txt_Deductible'), Deductible_Updated)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/btn_AddOtherStructure'),10)

WebUI.click(findTestObject('Policy/pge_DwellingInformation/btn_AddOtherStructure'))

List<TestObject> ScheduledOtherStructures = [
	findTestObject('Policy/pge_DwellingCoverage/btn_AddStructure'),
	findTestObject('Policy/pge_DwellingCoverage/btn_OK'),
	findTestObject('Policy/pge_DwellingInformation/btn_Cancel')
	]
	
	for (TestObject to: ScheduledOtherStructures) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}

	WebUI.click(findTestObject('Policy/pge_DwellingCoverage/btn_AddStructure'))
	
	WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)
	
	//Add Structure pop up screen
	
	List<TestObject> AddStructure = [
		findTestObject('Policy/pge_DwellingCoverage/drp_Type'),
		findTestObject('Policy/pge_DwellingCoverage/txt_Description'),
		findTestObject('Policy/pge_DwellingCoverage/txt_CoverageLimit'),
		findTestObject('Policy/pge_DwellingCoverage/btn_Delete')
		]
		
		for (TestObject to: AddStructure) {
			WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
		}
				
WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_Type1'))

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_TypeValue'))

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_Description'), Description)

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_CoverageLimit'), CoverageLimit)

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/btn_OK'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/title_CoverageInfo'), 10)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/lbl_OtherStructures'),10)

/*WebUI.verifyElementNotClickable(findTestObject('Policy/pge_DwellingCoverage/lbl_OtherStructures'))

String actual = WebUI.getText(findTestObject('Policy/pge_DwellingCoverage/txt_OtherStructures_Value'))

println('Other Structures value is: ' +actual)

WebUI.verifyMatch(actual,OtherStructures_Value, false)*/

//Navigate to Pricing screen

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.click(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/title_Pricing'),10)



		