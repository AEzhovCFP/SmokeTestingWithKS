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

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/drp_TypeOFInspection'),10)

WebUI.setText(findTestObject('Policy/pge_Pricing/drp_TypeOFInspection'), TypesOfInspection)

WebUI.click(findTestObject('Policy/pge_Pricing/btn_OrderInspection'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/drp_Vendors'),10)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.setText(findTestObject('Policy/pge_Pricing/drp_Vendors'),Vendors)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/drp_TypesOfInspection_1'),10)

/*CustomKeywords.'common.Text.SetTextAndEnter'(findTestObject('Policy/pge_Pricing/drp_TypesOfInspection_1'),TypesOfInspection)

WebUI.selectOptionByValue(findTestObject('Policy/pge_Pricing/drp_TypesOfInspection_1'),TypesOfInspection, false)*/

WebUI.click(findTestObject('Policy/pge_Pricing/drp_TypesOfInspection_1'))

WebUI.click(findTestObject('Policy/pge_Pricing/drp_Observational'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/txt_InspectionComment'),10)
	
WebUI.setText(findTestObject('Policy/pge_Pricing/txt_InspectionComment'),InspectionComment)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Policy/pge_Pricing/btn_Order'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/btn_ViewForms'),10)

WebUI.click(findTestObject('Policy/pge_Pricing/btn_ViewForms'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/Policy_Forms/drp_Show'),10)

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Policy/Policy_Forms/drp_Show'),GlobalVariable.gForms)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementChecked(findTestObject('Policy/Policy_Forms/chk_Form1'),0)

/*WebUI.verifyElementChecked(findTestObject('Policy/Policy_Forms/chk_Form2'),0)*/

WebUI.click(findTestObject('Policy/Policy_Forms/btn_ReturnToPolicy'))
	
WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Policy/Policy_Forms/btn_Approve'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.setText(findTestObject('Policy/Policy_Forms/txt_RemarksApprove'), Remarks)

WebUI.click(findTestObject('Policy/Policy_Forms/btn_OK'))





