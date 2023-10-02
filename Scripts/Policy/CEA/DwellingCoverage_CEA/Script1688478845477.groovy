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
WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/title_CoverageInfo'), GlobalVariable.gTimeOutSeconds)

//verify fields availability
List<TestObject> dwellingElements = [
	findTestObject('Policy/pge_DwellingCoverage/txt_CoverageA'),
	findTestObject('Policy/pge_DwellingCoverage/drp_DwellingDeduct'),
	findTestObject('Policy/pge_DwellingCoverage/drp_CoverageC'),
	findTestObject('Policy/pge_DwellingCoverage/drp_CoverageD'),
	findTestObject('Policy/pge_DwellingCoverage/drp_BuildingCode')
	]
	for (TestObject to: dwellingElements) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}
	
//select the values for dwelling coverage fields
CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_CoverageA'), CoverageA)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/drp_DwellingDeduct'), DwellingDeduct)

//CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/drp_CoverageC'), CoverageC)

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_CovC'))

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_CoverageCValue'))

/*WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/drp_PersonalPropertyDeduct'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/drp_PersonalPropertyDeduct'), PersonalPropertyDeduct)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/drp_CoverageD'), CoverageD)*/

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_CovD'))

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_CoverageDValue'))

/*CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/drp_BuildingCode'), BuildingCode)*/

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_BuildCode'))

WebUI.click(findTestObject('Policy/pge_DwellingCoverage/drp_BuildCodeValue'))

WebUI.comment('\tDwelling coverage added!!!')

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)


