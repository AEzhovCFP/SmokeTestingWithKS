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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.switchToWindowIndex(0, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Object Repository/Claims/pge_HomePage/wel_HomePageFrame'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_HomePage/txt_PageTitle'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_HomePage/input_ClaimNumber'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.SetTextAndEnter'(findTestObject('Object Repository/Claims/pge_HomePage/input_ClaimNumber'), GlobalVariable.gClaimNumber)

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Claims/pge_ClaimSummary/wel_PageTitle'), 5, FailureHandling.STOP_ON_FAILURE)

String actualClaimNumber=WebUI.getText(findTestObject('Object Repository/Claims/pge_ClaimSummary/lnk_ClaimNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(actualClaimNumber, GlobalVariable.gClaimNumber, false, FailureHandling.STOP_ON_FAILURE)