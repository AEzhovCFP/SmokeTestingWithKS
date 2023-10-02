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

//Click on link
WebUI.verifyElementPresent(findTestObject('Portal/lnk_clickhere'), GlobalVariable.gTimeOutSeconds)

WebUI.click(findTestObject('Portal/lnk_clickhere'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)

//Verify Broker System page is accessed
WebUI.verifyElementPresent(findTestObject('Portal/pge_Title'), GlobalVariable.gTimeOutSeconds)

WebUI.comment('\tBroker System')

//Enter Broker Username
WebUI.verifyElementPresent(findTestObject('Portal/txt_BrokerUsername'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.SetText'(findTestObject('Portal/txt_BrokerUsername'), GlobalVariable.gBUsername)

//Enter Broker Password
WebUI.verifyElementPresent(findTestObject('Portal/txt_BrokerPassword'), GlobalVariable.gTimeOutSeconds)

CustomKeywords.'common.Text.SetText'(findTestObject('Portal/txt_BrokerPassword'), GlobalVariable.gBPassword)

//Click on Log In 
CustomKeywords.'common.Actions.Click'(findTestObject('Portal/btn_Login'))

WebUI.waitForPageLoad(GlobalVariable.gTimeOutSeconds)





