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

// add coverage informations
WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/title_CoverageInfo'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tAdding Coverage Information...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/txt_DwellingLimit'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_DwellingLimit'), GlobalVariable.gDwellingLimit)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/txt_Deductible'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_Deductible'), GlobalVariable.gDeductible)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/txt_PersonalProperty'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_PersonalProperty'), GlobalVariable.gPersonalProperty)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/txt_FairRental'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_DwellingCoverage/txt_FairRental'), GlobalVariable.gFairRental)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingCoverage/txt_OrdinanceOrLaw'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_DwellingCoverage/txt_OrdinanceOrLaw'), GlobalVariable.gOrdinanceOrLaw)

def total = WebUI.getAttribute(findTestObject('Policy/pge_DwellingCoverage/txt_TotalCoverage'), 'value')

WebUI.verifyMatch(total, GlobalVariable.gTotalCoverage, false)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

