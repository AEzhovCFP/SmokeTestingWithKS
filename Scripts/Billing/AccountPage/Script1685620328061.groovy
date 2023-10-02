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

//verify recent account activity section present
WebUI.verifyElementPresent(findTestObject('Billing/pge_Account/title_recentAccountActivity'), GlobalVariable.gTimeOutSeconds)

// verifying account
if (WebUI.getText(findTestObject('Billing/pge_Account/lbl_policyStatus'), FailureHandling.STOP_ON_FAILURE).contains(policyStatus)) {
	
	if (GlobalVariable.gPolicyNumber.contains(WebUI.getText(findTestObject('Billing/pge_Account/lbl_accountNumber')))) {
		WebUI.println('\tPolicy ' +GlobalVariable.gPolicyNumber+ ' is ' + policyStatus)
	}
}

// Verify Outstanding Balance of account

OutstandingBalance = WebUI.getText(findTestObject('Billing/pge_Account/lbl_outstandingBalance'))

println("Outstanding balance is:" +OutstandingBalance)

//Check the Policy Term

GlobalVariable.gPTerm = WebUI.getText(findTestObject('Billing/pge_Account/lnk_PolicyTerm'))

println("Policy Term is:" +GlobalVariable.gPTerm)