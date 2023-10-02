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

WebUI.verifyElementPresent(findTestObject('Policy/pge_Transact/title_Transact'),GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tTransAct Screen...')

WebUI.verifyTextPresent(PolicyStatus,false)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Transact/lbl_Status'),10)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Transact/lbl_PolicyNumber'),10)

PolicyNumber = WebUI.getAttribute(findTestObject('Policy/pge_Transact/lbl_PolicyNumber'),'textContent')

System.out.println("Policy issued is:"+ PolicyNumber)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Policy/Login/InternalUserLogin_App04'),null)


WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.TypeTextAndEnter'(findTestObject('Policy/PolicySearch/txt_PolicySearch'), PolicyNumber)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/PolicySearch/btn_DropButton'), GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Policy/PolicySearch/btn_DropButton'))

WebUI.verifyElementPresent(findTestObject('Policy/PolicySearch/lst_ViewPolicy'), 10)

WebUI.click(findTestObject('Policy/PolicySearch/lst_ViewPolicy'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)



