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

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_ProtectionClass'), GlobalVariable.gTimeOutSeconds)

ProtectionClass = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/drp_ProtectionClass'),'value')

WebUI.verifyMatch(ProtectionClass, '8B', false)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/txt_TerritoryCode'), GlobalVariable.gTimeOutSeconds)

TerritoryCode = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/txt_TerritoryCode'),'value')

WebUI.verifyMatch(TerritoryCode, '39', false)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_ApprovedRoof'), GlobalVariable.gTimeOutSeconds)

ApprovedRoof = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/drp_ApprovedRoof'),'value')

WebUI.verifyMatch(ApprovedRoof, 'Yes', false)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_FireWiseCommDiscount'), GlobalVariable.gTimeOutSeconds)

FireWiseCommDiscount = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/drp_FireWiseCommDiscount'),'value')

WebUI.verifyMatch(FireWiseCommDiscount, 'No', false)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/txt_WildfireHardening'), GlobalVariable.gTimeOutSeconds)

WildfireHardening = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/txt_WildfireHardening'),'value')

WebUI.verifyMatch(WildfireHardening, 'Both', false)

WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_FireLine'), GlobalVariable.gTimeOutSeconds)

FireLine = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/drp_FireLine'),'value')

WebUI.verifyMatch(FireLine, '9', false)

/*WebUI.verifyElementPresent(findTestObject('Policy/pge_DwellingInformation/drp_SHIA'), GlobalVariable.gTimeOutSeconds)

SHIA = WebUI.getAttribute(findTestObject('Policy/pge_DwellingInformation/drp_SHIA'),'value')

WebUI.verifyMatch(SHIA, 'No', false)*/

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)







