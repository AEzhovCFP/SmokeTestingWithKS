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
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementPresent(findTestObject('Policy/CEA/pge_PolicyTerm/title_PolicyInformation'), GlobalVariable.gTimeOutSeconds)

//Verify Policy Information screen items
List<TestObject> items = [
	findTestObject('Policy/CEA/pge_PolicyTerm/txt_EffectiveDate'), 
	findTestObject('Policy/CEA/pge_PolicyTerm/drp_Term'),
    findTestObject('Policy/CEA/pge_PolicyTerm/txt_ExpirationDate'), 
	findTestObject('Policy/CEA/pge_PolicyTerm/txt_CompanionPolicyNumber'),
    findTestObject('Policy/CEA/pge_PolicyTerm/txt_CompanionPolicyEffDate'),
	 findTestObject('Policy/CEA/pge_PolicyTerm/txt_CompanionPolicyExpDate')
	 ]

for (TestObject to : items) {
    WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
}

//Verify items are read only

//Get field values
String EffectiveDate = WebUI.getAttribute(findTestObject('Policy/CEA/pge_PolicyTerm/txt_EffectiveDate'),'$0.value')
println("Effective Date is:" +EffectiveDate)

//Navigate to next screen
WebUI.click(findTestObject('Policy/Navigation/btn_Next'))
