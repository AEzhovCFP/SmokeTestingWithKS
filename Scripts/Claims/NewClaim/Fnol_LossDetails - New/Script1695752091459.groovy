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

//WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.waitForElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/wel_PageTitle'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/wel_PageTitle'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), reportedBy, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_typeofLoss'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_typeofLoss'), TypeofLoss, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), CauseofLoss, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), 5, FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

//WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), CauseofLoss, FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_LossDetails/input_LossCause'), lossCause)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_LossDetails/input_typeofLoss'), TypeofLoss)

Thread.sleep(9000)

WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/txt_LossDescription'), lossDescription, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_LossDetails/drp_COLlist'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), CauseofLoss, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), reportedBy, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_LossDetails/input_CauseofLoss'), CauseofLoss)

Thread.sleep(8000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), reportedBy, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_LossDetails/input_ReportedBy'), reportedBy)

//WebUI.setText(findTestObject('Object Repository/Claims/pge_LossDetails/txt_LossDescription'), lossDescription, FailureHandling.STOP_ON_FAILURE)




//WebUI.verifyElementPresent('Claims/pge_Common/input_AddressLine1', 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_AddressLine1'), addressLine1, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Claims/pge_Common/input_Zipcode'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_Zipcode'), zipcode, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Claims/pge_Common/input_City'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_City'), city, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Claims/pge_Common/input_State'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Claims/pge_Common/input_State'), state, FailureHandling.STOP_ON_FAILURE)

/*WebUI.setText(findTestObject('Claims/pge_Common/input_Zipcode'), zipcode, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Claims/pge_Common/input_Zipcode'), Keys.chord(Keys.TAB), FailureHandling.STOP_ON_FAILURE)*/

//CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Claims/pge_Common/input_Zipcode'), zipcode)
Thread.sleep(3000)

WebUI.click(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Claims/pge_LossDetails/btn_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

/*WebUI.click(findTestObject('Claims/pge_LossDetails/btn_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_LossDetails/btn_DuplicateContinue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Claims/pge_LossDetails/btn_Continue'), FailureHandling.STOP_ON_FAILURE)*/

/*WebUI.waitForElementPresent(findTestObject('Object Repository/Claims/pge_SideMenu/chk_LossDetails'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_SideMenu/chk_LossDetails'), 5, FailureHandling.STOP_ON_FAILURE)*/