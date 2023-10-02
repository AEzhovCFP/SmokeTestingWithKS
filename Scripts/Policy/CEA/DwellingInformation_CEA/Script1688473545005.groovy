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

// verify page title
WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/title_DwellingInfo'), GlobalVariable.gTimeOutSeconds)

//select policy type
WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_PolicyType'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/drp_PolicyType'), PolicyType)

//select location type
WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_LocationType'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/drp_LocationType'), LocationType)

//verify additional fields are available
List<TestObject> dwellingElements = [
	findTestObject('Policy/pge_DwellingInformation/txt_YearBuilt'),
	findTestObject('Policy/pge_DwellingInformation/txt_Construction'),
	findTestObject('Policy/pge_DwellingInformation/txt_NumOfStories'),
	findTestObject('Policy/pge_DwellingInformation/txt_NumberOfFamilies'),
	findTestObject('Policy/pge_DwellingInformation/drp_FoundationType'),
	findTestObject('Policy/pge_DwellingInformation/txt_SquareFootage'),
	findTestObject('Policy/pge_DwellingInformation/drp_RoofType'),
	findTestObject('Policy/pge_DwellingInformation/txt_NumOfChimneys'),
	findTestObject('Policy/pge_DwellingInformation/drp_LivingSpace'),
	findTestObject('Policy/pge_DwellingInformation/drp_HazardReduction')
	]
	for (TestObject to: dwellingElements) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}
	
//enter dwelling information
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_YearBuilt'), YearBuilt)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_Construction'), Construction)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_NumOfStories'), NumOfStories)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_NumberOfFamilies'), NumberOfFamilies)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/drp_FoundationType'), FoundationType)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_SquareFootage'), SquareFootage)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/drp_RoofType'), RoofType)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_NumOfChimneys'), NumOfChimneys)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/drp_LivingSpace'), LivingSpace)
	CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/drp_HazardReduction'), HazardReduction)
	
//Dwelling Questionnaire
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_No'))
		
//Hazard Reduction Discount Information
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question1'))
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question2'))
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question3'))
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question4'))
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question5'))
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question6'))
	WebUI.click(findTestObject('Policy/pge_DwellingInformation/rb_Question7'))
	
	WebUI.comment('\tDwelling information added!!!')
	
	CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))
	
	WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)