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

import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Billing/pge_Account/lbl_Account'))
// navigate to policy term summary page
WebUI.scrollToElement(findTestObject('Billing/pge_PolicyTermSummary/url_policyTerm'), GlobalVariable.gTimeOutSeconds)

gTerm=WebUI.getText(findTestObject('Billing/pge_Account/lnk_PolicyTerm'))
CustomKeywords.'common.Actions.Click'(findTestObject('Billing/pge_PolicyTermSummary/url_policyTerm'))
WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)
WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Billing/pge_PolicyTermSummary/lbl_ViewEditPolicyTerm'), GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Billing/pge_PolicyTermSummary/lbl_ViewEditPolicyTerm'))

//Verify page title
WebUI.verifyElementPresent(findTestObject('Billing/pge_TermPlan/title_TermPlanSetup'),GlobalVariable.gTimeOutSeconds)

//Verify elements present

List<TestObject> items = [
	findTestObject('Billing/pge_TermPlan/lbl_PaymentPlan'),
	findTestObject('Billing/pge_TermPlan/rb_Paper3Month'),
	findTestObject('Billing/pge_TermPlan/rb_Paper11Month'),
	findTestObject('Billing/pge_TermPlan/btn_Cancel'),
	findTestObject('Billing/pge_TermPlan/btn_SaveChanges')
	]
	
for (TestObject to: items) {
	WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
}

WebUI.click(findTestObject('Billing/pge_TermPlan/rb_Paper3Month'))

WebUI.click(findTestObject('Billing/pge_TermPlan/btn_SaveChanges'))

WebUI.verifyElementText(findTestObject('Billing/pge_TermPlan/txt_BillingFrequency'), BillingFrequency)

WebUI.click(findTestObject('Billing/pge_Account/lbl_Account'))

//verify recent account activity section present
WebUI.verifyElementPresent(findTestObject('Billing/pge_Account/title_recentAccountActivity'), GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementText(findTestObject('Billing/pge_Account/txt_RecentActivity'), Activity)

