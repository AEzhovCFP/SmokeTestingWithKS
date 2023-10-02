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

WebUI.switchToFrame(findTestObject('Claims/pge_PolicyDetails/wel_PolicyDetailsFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Claims/pge_PolicyDetails/input_PolicyNumber'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_PolicyDetails/input_PolicyNumber'), policyNumber, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_PolicyDetails/input_Status'), status, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_PolicyDetails/input_EffectiveDate'), effectiveDate, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_PolicyDetails/input_ExpirationDate'), expirationDate, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_PolicyDetails/input_Type'), type, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_AddressLine1'), addressLine1, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_City'), city, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_State'), state, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_Zipcode'), zipcode, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_PolicyDetails/input_Ssn'), ssn, FailureHandling.STOP_ON_FAILURE)

//Thread.sleep(5000)

WebUI.click(findTestObject('Claims/pge_PolicyDetails/btn_SaveAndClose'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)