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

//WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

//WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_ClaimDetails/txt_PageTitle'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_ClaimDetails/btn_droprightArrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_ClaimDetails/slt_SubjectOfInsurance'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddCoverageInformation/txt_PageTitle'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddCoverageInformation/btn_Collapse'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddCoverageInformation/link_Coverages'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddCoverageInformation/txt_coveragepagetitle'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddCoverageInformation/btn_Add'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.switchToFrame(findTestObject('Object Repository/Claims/popup_AddCoverageInformation/txt_popuptitleframe'), 5, FailureHandling.STOP_ON_FAILURE)


//WebUI.setText(findTestObject('Object Repository/Claims/popup_AddCoverageInformation/txt_coverage'), Coverage, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/popup_AddCoverageInformation/txt_coverage'), Coverage)
WebUI.setText(findTestObject('Object Repository/Claims/popup_AddCoverageInformation/txt_levelclick'), Level, FailureHandling.STOP_ON_FAILURE)


WebUI.setText(findTestObject('Object Repository/Claims/popup_AddCoverageInformation/txt_inputlimit'), limit, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/popup_AddCoverageInformation/btn_save'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(7000)
WebUI.switchToFrame(findTestObject('Object Repository/Claims/pge_Common/wel_MainContentFrame'), 10, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddCoverageInformation/txt_coveragepagetitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_clickclaimant'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(7000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/btn_arrow'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_arrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/opt_AddLine'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_AddLinePagetitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_expandfirstvehicleproperty'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/opt_CollisionLineSelection'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/opt_CollisionLineSelection'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_movetoSelectedLine'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/btn_SaveLine'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_SaveLine'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/btn_editLine'), 15, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_editLine'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_Linescreentitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_DamageVehicle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/Expd_DamageVehicle'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_AddVehicleInformation'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_vehicleinformationtitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_continueVI'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_Linescreentitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_Save'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_Linescreentitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_whole screentitle'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_CoverageMatch'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_CoverageMatchtitle'), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_CoverageMatchContinue'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)


WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/popup_titleverify'), 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Claims/pge_LineDetails/btn_Okpopupscreen'), FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_LineDetails/txt_Linescreentitle'), 10, FailureHandling.STOP_ON_FAILURE)





