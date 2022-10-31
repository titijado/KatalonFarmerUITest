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

WebUI.navigateToUrl('https://staging.smartkungahara.rw/#/')

WebUI.click(findTestObject('Object Repository/CreateTraining/button_Login'))

WebUI.setText(findTestObject('Object Repository/CreateTraining/input_Home_form-control ng-untouched ng-pri_f7992a'), 'agroj@nawa.lol')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateTraining/input_Home_form-control ng-untouched ng-dir_de7c82'), 
    'GsD77e9AfXmPfCaQ5p1Ifw==')

WebUI.click(findTestObject('Object Repository/CreateTraining/button_Login_1'))

WebUI.click(findTestObject('Object Repository/CreateTraining/span_Farmer Groups'))

WebUI.click(findTestObject('Object Repository/CreateTraining/span_Groups'))

WebUI.click(findTestObject('Object Repository/CreateTraining/a_Add a farmers group'))

WebUI.setText(findTestObject('Object Repository/CreateTraining/input_Group name_form-control ng-untouched _088861'), 'TUGIRIMANA KAWA GROUP1')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_Kanyinya'), '5bfd8dbe91703530fcb9b1d6', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_Nzove  Taba  Nyamweru'), '5bf816d753d485a9eae4aa57', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_Bibungo  Bwiza  Kagasa  Gateko  Nyab_b1236b'), 
    '5bf8163553d485a9eae42dc6', true)

WebUI.setText(findTestObject('Object Repository/CreateTraining/input_Group name_form-control ng-untouched _088861'), 'TUGIRIMANA')

WebUI.setText(findTestObject('Object Repository/CreateTraining/input_Group leader phone number_form-contro_98e0f8'), '250788298967')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_Monday  Tuesday  Wednesday  Thursday_d31684'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/CreateTraining/input_Time_form-control ng-untouched ng-pri_4edf80'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.doubleClick(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/svg'))

WebUI.click(findTestObject('Object Repository/CreateTraining/span_Set'))

WebUI.setText(findTestObject('Object Repository/CreateTraining/input_Group name_form-control ng-untouched _088861'), 'KAWA GROUP')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_select sector Kanyinya'), '5bfd8dbe91703530fcb9b1d6', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_select cell  Nzove'), '5bf816d753d485a9eae4aa57', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateTraining/select_select village  Bibungo'), '5bf8163553d485a9eae42dc6', 
    true)

WebUI.click(findTestObject('Object Repository/CreateTraining/button_SEARCH FARMERS'))

WebUI.click(findTestObject('Object Repository/CreateTraining/input_undefined undefined_ng-untouched ng-p_a15e1a'))

WebUI.click(findTestObject('Object Repository/CreateTraining/button_ADD SELECTED TO THE GROUP'))

WebUI.click(findTestObject('Object Repository/CreateTraining/input_undefined undefined_ng-untouched ng-p_a15e1a'))

WebUI.click(findTestObject('Object Repository/CreateTraining/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/CreateTraining/div_Thank you Group   TUGIRIMANA KAWA GROUP_bd3198'), 
    'Thank you Group “ TUGIRIMANA KAWA GROUP “ has been added Ok')

