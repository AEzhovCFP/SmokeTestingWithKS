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
/*
WebUI.verifyElementPresent(findTestObject('Policy/pge_PolicyTerm/txt_BrokerName'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_PolicyTerm/txt_BrokerName'), GlobalVariable.gBrokerName)

CustomKeywords.'common.Actions.Click'(findTestObject('Object Repository/Policy/pge_PolicyTerm/chk_IAcknowledge'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)*/

WebUI.verifyElementText(findTestObject('Policy/pge_PolicyTerm/lbl_Term'), GlobalVariable.gPolicyTerm)

// answer eligibility/ rating questions
CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_CondominiumUnit'))

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Policy/pge_PolicyTerm/txt_MilesFromFireStation'), miles)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_PolicyTerm/txt_FireStationName'), fireStationName)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_1000FeetFromFireHydrant'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_FireWiseCommunity'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Premise improvements related questions

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/rb_RatingQuestion6'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/rb_RatingQuestion7'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Prior/Existing Damage, Condition And Use Information questions

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_PropertyUnhabitable'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_FinancialInstitution'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_LawViolation'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_UnhabitableQuestion'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_ApplicantQuestion'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_PropertyusedbyapplicantQuestion'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_CurrentlyInsured'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion1'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion2'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion3'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion4'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion5'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion6'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion7'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion8'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion9'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion10'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion11'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion12'))

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_PolicyTerm/chk_SubstandardQuestion13'))


/*CustomKeywords.'common.Actions.Click'(findTestObject('Object Repository/Policy/pge_PolicyTerm/chk_WildfireHardening'))*/

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

