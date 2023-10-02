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

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/title_Pricing'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tPricing Screen...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/title_PremiumDetails'), GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/CEA/pge_Pricing/txt_Premium'), GlobalVariable.gTimeOutSeconds)

String Premium=WebUI.getAttribute(findTestObject('Policy/CEA/pge_Pricing/txt_Premium'), "value")

println("Premium is: "+Premium)

/*CustomKeywords.'common.Actions.Click'(findTestObject('Policy/CEA/pge_Pricing/chk_SignApplication'))

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/lbl_ChoseFromFolder'), GlobalVariable.gTimeOutSeconds)

WebUI.uploadFile(findTestObject('Policy/pge_Pricing/lbl_ChoseFromFolder'), FileUploadURL)

FilePath = WebUI.getText(findTestObject('Policy/pge_Pricing/lbl_ChoseFromFolder'))

WebUI.verifyMatch(FilePath, FileUploadURL, false)*/

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/btn_Submit'),GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Pricing/btn_Submit'))

WebUI.verifyElementPresent(findTestObject('Policy/pge_Pricing/txt_Remark'),GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/pge_Pricing/txt_Remark'),Remark) 

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/pge_Pricing/btn_OK'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)









