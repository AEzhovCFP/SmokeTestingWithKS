import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


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
import org.apache.commons.lang3.StringUtils


WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Transact/title_Transact'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tTransACT Screen...')

WebUI.verifyTextPresent('Application - New - Approved', false)

WebUI.getAttribute(findTestObject('Policy/pge_Transact/lbl_Status'), 'value')

result = WebUI.getText(findTestObject('Policy/pge_Transact/lbl_Status'))

WebUI.verifyMatch(result, 'Approved', false)

WebUI.click(findTestObject('Policy/pge_Transact/btn_EditPolicy'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Applicant/title_ApplicantInformation'), GlobalVariable.gTimeOutSeconds)

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

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PaymentDetails/title_PaymentDetails'), GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PaymentDetails/lbl_DirectToCustomer'),GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_PaymentDetails/drp_CollectionMethod'),GlobalVariable.gTimeOutSeconds)
	
WebUI.verifyElementPresent(findTestObject('Policy/pge_PaymentDetails/drp_PaymentPlan'),GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Policy/pge_PaymentDetails/drp_CollectionMethod'),CollectionMethod)

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Policy/pge_PaymentDetails/drp_PaymentPlan'),PaymentPlan)

CustomKeywords.'common.Actions.Click'(findTestObject('Policy/Navigation/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

List<TestObject> InstallmentSchedule = [
	findTestObject('Policy/pge_InstallmentSchedule/title_InstallmentSchedule'),
	findTestObject('Policy/pge_Transact/lbl_DueDate'),
	findTestObject('Policy/pge_Transact/lbl_Installment'),
	findTestObject('Policy/pge_Transact/lbl_Quoted'),
	findTestObject('Policy/pge_Transact/lbl_Committed'),
	findTestObject('Policy/pge_Transact/lbl_Deductions')
	]
	
	for (TestObject to: InstallmentSchedule) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}

WebDriver driver = DriverFactory.getWebDriver()

def rows_count = driver.findElements(By.className("table-row-container")).size()

println ('Number of rows:'+ rows_count )

WebUI.verifyMatch('Number of rows:'+ rows_count, NumberOfInstallments, false)

WebUI.click(findTestObject('Policy/Navigation/btn_Back'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Policy/Navigation/btn_Back'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_InstallmentSchedule/btn_BindIssue'), GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Policy/pge_InstallmentSchedule/btn_BindIssue'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/pge_Transact/title_Transact'), GlobalVariable.gTimeOutSeconds)

WebUI.verifyTextPresent('InForce - New - Committed', false)

def PolicyNumber = WebUI.getText(findTestObject('Policy/pge_Transact/lbl_PolicyNumber'))

String[] PolicyN = PolicyNumber.split(" ");
//println(PolicyN)

String PNum = (PolicyN[0]+' '+PolicyN[1])

System.out.println(PNum)

GlobalVariable.gPolicyNumber = PNum

println(GlobalVariable.gPolicyNumber)

/*WebUI.getAttribute(findTestObject('Policy/pge_Transact/lbl_Status'), 'value')*/

result = WebUI.getText(findTestObject('Policy/pge_Transact/lbl_Status'))

WebUI.verifyMatch(result, 'Committed', false)

Thread.sleep(5000)


