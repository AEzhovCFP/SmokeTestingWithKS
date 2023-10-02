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

WebUI.openBrowser('')

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

WebUI.maximizeWindow()

//Navigate to URL
WebUI.navigateToUrl(GlobalVariable.gBrokerURL)

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Enter login credentials
WebUI.verifyElementPresent(findTestObject('Portal/txt_Username'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.SetText'(findTestObject('Portal/txt_Username'), GlobalVariable.gBUsername)

CustomKeywords.'common.Actions.Click'(findTestObject('Portal/btn_Next'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Enter Code
Thread.sleep(25000)

//Click on Sign In button
CustomKeywords.'common.Actions.Click'(findTestObject('Portal/btn_SignIn'))

//Verify access to broker portal 
WebUI.verifyElementPresent(findTestObject('Portal/img_CFP'), GlobalVariable.gTimeOutSeconds)

//verify policy system link
WebUI.verifyElementPresent(findTestObject('Portal/lnk_PolicySystem'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Actions.Click'(findTestObject('Portal/lnk_PolicySystem'))






