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

WebUI.switchToFrame(findTestObject('Object Repository/Claims/pge_AddParty/wel_PolicyDetailsFrame'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddParty/wel_Search'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddParty/btn_AddNewParty'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddParty/wel_AddParty'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_AddParty/input_FirstName'), firstName, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.gFname=firstName

WebUI.setText(findTestObject('Object Repository/Claims/pge_AddParty/input_LastName'), lastName, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.gLname=lastName

println("Name="+(GlobalVariable.gLname+", "+GlobalVariable.gFname))

GlobalVariable.gFullName=(GlobalVariable.gLname+", "+GlobalVariable.gFname)

println("Full name:"+ GlobalVariable.gFullName)

WebUI.setText(findTestObject('Object Repository/Claims/pge_AddParty/input_AddressLine1'), addressLine1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_AddParty/input_City'), city, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_AddParty/input_State'), state, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Claims/pge_AddParty/input_Zipcode'), zipcode, FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_AddParty/input_Zipcode'), zipcode)

WebUI.sendKeys(findTestObject('Object Repository/Claims/pge_AddParty/input_Zipcode'), Keys.chord(Keys.TAB), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.click(findTestObject('Claims/pge_Common/btn_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddParty/btn_Continue_DuplicateParties'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddParty/btn_Continue_DuplicateParties'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddParty/btn_Attach'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddParty/btn_Attach'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddParty/input_Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Object Repository/Claims/pge_AddParty/input_Role'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_AddParty/input_Role'), role)

Thread.sleep(5000)

WebUI.scrollToElement(findTestObject('Object Repository/Claims/pge_AddParty/btn_SaveAndClose'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_AddParty/btn_SaveAndClose'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Claims/pge_AddParty/btn_SaveAndClose'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)