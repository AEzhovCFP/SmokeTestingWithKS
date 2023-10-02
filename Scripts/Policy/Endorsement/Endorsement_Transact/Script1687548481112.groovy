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
import java.text.SimpleDateFormat
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger


WebUI.comment('\tTransact Screen...')

WebUI.verifyElementPresent(findTestObject('Policy/pge_Transact/title_Transact'), 10)

WebUI.verifyElementPresent(findTestObject('Endorsement/drp_TransactionType'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Endorsement/drp_TransactionType'), TransactionType)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.verifyElementClickable(findTestObject('Endorsement/btn_Go'))

WebUI.click(findTestObject('Endorsement/btn_Go'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//click 'Yes' on 'Information' pop up
WebUI.verifyElementClickable(findTestObject('Endorsement/btn_Yes'))

WebUI.click(findTestObject('Endorsement/btn_Yes'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Endorse pop up screen
WebUI.verifyElementPresent(findTestObject('Endorsement/title_Endorse'), 10)

List<TestObject> Endorse = [
	findTestObject('Endorsement/drp_Reason'),
	findTestObject('Endorsement/txt_Detail'),
	findTestObject('Endorsement/drp_EffectiveDate'),
	findTestObject('Endorsement/drp_ScheduleDate'),
	findTestObject('Endorsement/drp_ExpirationDate'),
	findTestObject('Endorsement/btn_OK'),
	findTestObject('Endorsement/btn_Schedule'),
	findTestObject('Endorsement/btn_Cancel')
	]
	
	for (TestObject to: Endorse) {
		WebUI.verifyElementPresent(to, GlobalVariable.gTimeOutSeconds)
	}
		

/*
WebUI.verifyOptionsPresent(findTestObject('Endorsement/drp_Reason'),['Insured Request','Underwriting Reasons','Internal'],null)

*/

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Endorsement/drp_Reason'), Endorse_Reason)

def today = new Date()
def other = today + 30
def Date = new SimpleDateFormat("MM/dd/yyyy")
WebUI.comment("today=${Date.format(today)}")  
WebUI.comment("other=${Date.format(other)}")
other=Date.format(other) 

CustomKeywords.'common.Text.SetTextAndTab'(findTestObject('Endorsement/drp_EffectiveDate'), other)

WebUI.click(findTestObject('Endorsement/btn_OK'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)
