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
import org.openqa.selenium.WebElement

import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

//navigate to 'Installment Schedule' page
CustomKeywords.'common.Actions.Click'(findTestObject('Billing/pge_InstallmentSchedule/opt_installmentSchedule'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds, FailureHandling.STOP_ON_FAILURE)

// verify the number of installments for the policy created.
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> InstallmentNum = driver.findElements(new By.ByXPath("//div[@id='installmentScheduleTreePanel-body']//table"))

WebUI.println('\tNo: of installments = '+InstallmentNum.size())

if (GlobalVariable.gCollectionMethod == 'Paper') {
	if (GlobalVariable.gPaymentPlan == '11 Pay') {
		if (InstallmentNum.size()== 11) {
			WebUI.println("\tNumber of Installments Verified!")
		}else {
			WebUI.println("\tunable to verify number of installments")
		}
	}else if (GlobalVariable.gPaymentPlan == '3 Pay') {
		if (InstallmentNum.size()== 3) {
			WebUI.println("\tNumber of Installments Verified!")
		}else {
			WebUI.println("\tunable to verify number of installments")
		}
	}else if (GlobalVariable.gPaymentPlan == 'Full Pay') {
		if (InstallmentNum.size()== 1) {
			WebUI.println("\tNumber of Installments Verified!")
		}else {
			WebUI.println("\tunable to verify number of installments")
		}
	}else {
		WebUI.println("\tUnable to verify Installments!")
	}
}

//click expand/collapse
WebUI.click(findTestObject('Billing/pge_InstallmentSchedule/btn_expandCollapse'), FailureHandling.STOP_ON_FAILURE)

// verify first installment line item
def lineItem = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_firstLineItem'), FailureHandling.STOP_ON_FAILURE)
if (lineItem.contains(GlobalVariable.gPolicyNumber)) {
	WebUI.println("\tPolicy Line Item Verified..!")
}

// verify the term
Term = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/lbl_Term'))

println("Policy Term is:"+ Term)

PolicyTerm =  GlobalVariable.gPolicyNumber +" " +GlobalVariable.gPTerm

println(PolicyTerm)

WebUI.verifyMatch(Term, PolicyTerm, false)

//verify Due Date for first installment
DueDate=WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_DueDate'))

// verify Recv  for first installment
WebUI.verifyElementText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_firstPremium'), "PREM", FailureHandling.STOP_ON_FAILURE)

//verify Trans for first installment
WebUI.verifyElementText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_Trans'), "NBUS", FailureHandling.STOP_ON_FAILURE)

//verify item amount for first installment
ItemAmount = WebUI.getText(findTestObject('Billing/pge_Account/lbl_outstandingBalance'))

WebUI.verifyElementText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_ItemAmount'), ItemAmount, FailureHandling.STOP_ON_FAILURE)

//verify install amount for first installment
WebUI.verifyElementPresent(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_installAmt'),10)

InstallAmount = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_installAmt'))

//verify amounts
def initialAmount = '$0.00'

cash = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_cash'), FailureHandling.STOP_ON_FAILURE)
credit = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_credit'), FailureHandling.STOP_ON_FAILURE)
writeOff = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_writeOff'), FailureHandling.STOP_ON_FAILURE)
reDist = WebUI.getText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lbl_reDist'), FailureHandling.STOP_ON_FAILURE)

if (cash == initialAmount && credit == initialAmount && writeOff ==initialAmount && reDist == initialAmount) {
	WebUI.println("\t1st Installment Amounts Verified..!")
}

//verify balance for first installment
WebUI.verifyElementText(findTestObject('Billing/pge_InstallmentSchedule/firstInstallment/lnl_balance'), InstallAmount, FailureHandling.STOP_ON_FAILURE)
