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

WebUI.waitForElementPresent(findTestObject('Object Repository/Claims/pge_KeyFacts/wel_PageTitle'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_natureofFire'), NatureofFire, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_Roomsaffected'), Roomsaffected, FailureHandling.STOP_ON_FAILURE)
	
WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_ppdamaged'), ppdamaged, FailureHandling.STOP_ON_FAILURE)
		
WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_homehabitable'), HomeHabitable, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_communicationanddocuments'), CommandDocs)

WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_natureofFire'), NatureofFire, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_Roomsaffected'), Roomsaffected, FailureHandling.STOP_ON_FAILURE)
	
WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_ppdamaged'), ppdamaged, FailureHandling.STOP_ON_FAILURE)
		
WebUI.setText(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/input_homehabitable'), HomeHabitable, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), 5, FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

WebUI.click(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Claims/pge_SideMenu/chk_KeyFacts'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_SideMenu/chk_KeyFacts'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Claims/pge_KeyFactsCFP/wel_Pagetitle'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), FailureHandling.STOP_ON_FAILURE)