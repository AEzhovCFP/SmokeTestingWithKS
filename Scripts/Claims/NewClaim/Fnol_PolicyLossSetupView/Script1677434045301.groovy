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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver

Thread.sleep(5000)

//WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/wel_PolicyDetailsTitle'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/wel_PolicyInformationTitle'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/btn_EditPolicyInformation'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/btn_EditPolicyInformation'), FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Claims/NewClaim/Fnol_PolicyDetailsPopup'), [('policyNumber') : policyNumber, ('status') : status,('effectiveDate'):effectiveDate,('expirationDate'):expirationDate,('type'):type,('addressLine1'):addressLine1,('city'):city,('state'):state,('zipcode'):zipcode,('ssn'):ssn],
	//FailureHandling.STOP_ON_FAILURE)

//Thread.sleep(5000)

//WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/btn_AddUnlistedDriver'), FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Claims/NewClaim/Fnol_AddParty'), [('firstName') : firstName, ('lastName') : lastName,('addressLine1'):addressLine1,('city'):city,('state'):state,('zipcode'):zipcode],
	//FailureHandling.STOP_ON_FAILURE)

//WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_Vehicle/btn_AddVehicle'), FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Claims/NewClaim/Fnol_AddVehicle'), [('vehicleType') : vehicleType, ('year') : year,('make'):make,('model'):model],
	//FailureHandling.STOP_ON_FAILURE)

//Thread.sleep(5000)

//WebUI.switchToFrame(findTestObject('Claims/pge_Common/wel_MainContentFrame'), 5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/input_VehicleDriver'), FailureHandling.STOP_ON_FAILURE)

//println("Fullname is:"+GlobalVariable.gFullName)

//CustomKeywords.'common.Text.TypeTextAndTab'(findTestObject('Object Repository/Claims/pge_PolicyLossSetupView/input_VehicleDriver'), name)

Thread.sleep(3000)

WebUI.click(findTestObject('Claims/pge_Common/btn_SaveAndContinue'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Claims/pge_SideMenu/chk_PolicyDetails'), 5, FailureHandling.STOP_ON_FAILURE)