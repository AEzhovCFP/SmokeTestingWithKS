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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_PolicySearch/wel_Search'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_PolicySearch/btn_UnknownPolicy'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_PolicySearch/input_policysearchbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_PolicySearch/input_policysearchbox'), PolicySearch, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_PolicySearch/btn_Search'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_PolicySearch/btn_UnknownPolicy'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/Claims/pge_PolicySearch/btn_SaveandContinue'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)