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

WebUI.switchToFrame(findTestObject('Object Repository/Claims/pge_Vehicle/wel_VehicleFrame'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Claims/pge_Vehicle/wel_Vehicle'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_Vehicle/wel_Vehicle'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_Vehicle/input_Type'), vehicleType, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_Vehicle/input_Year'), year, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Object Repository/Claims/pge_Vehicle/input_Make'), make, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_Vehicle/input_Make'), make)
Thread.sleep(3000)
CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_Vehicle/input_Make'), make)
WebUI.setText(findTestObject('Object Repository/Claims/pge_Vehicle/input_Model'), model, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_Vehicle/btn_SaveAndClose'), FailureHandling.STOP_ON_FAILURE)