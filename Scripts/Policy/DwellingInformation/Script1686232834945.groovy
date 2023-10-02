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

// add dwelling informations
WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

List<TestObject> dwellingElements = [
	findTestObject('Policy/pge_DwellingInformation/title_DwellingInfo'),
	findTestObject('Policy/pge_DwellingInformation/txt_CoveredPerils'),
	findTestObject('Policy/pge_DwellingInformation/txt_LocationType'),
	findTestObject('Policy/pge_DwellingInformation/txt_Construction'),
	findTestObject('Policy/pge_DwellingInformation/txt_YearBuilt'),
	findTestObject('Policy/pge_DwellingInformation/txt_NumberOfFamilies'),
	findTestObject('Policy/pge_DwellingInformation/txt_ShortTermRental'),
	findTestObject('Policy/pge_DwellingInformation/txt_Occupancy'),
	findTestObject('Policy/pge_DwellingInformation/txt_NumberOfStory'),
	findTestObject('Policy/pge_DwellingInformation/txt_RoofUpdateYear')
	]
	
	for (TestObject to: dwellingElements) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}


WebUI.comment('\tAdding Dwelling Information...')

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_CoveredPerils'), GlobalVariable.gCoveredPerils)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_LocationType'), GlobalVariable.gDwellingType)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_Construction'), GlobalVariable.gConstruction)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_YearBuilt'), GlobalVariable.gYearBuilt)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_NumberOfFamilies'), GlobalVariable.gFamilies)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_ShortTermRental'), GlobalVariable.gRental)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_Occupancy'), GlobalVariable.gOccupancy)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingInformation/txt_NumberOfStory'), GlobalVariable.gStory)

def roofUpdateYear = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/txt_RoofUpdateYear'), 'value')

WebUI.verifyMatch(roofUpdateYear, GlobalVariable.gYearBuilt, false)

WebUI.comment('\tDwelling information added!!!')

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

