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

WebUI.click(findTestObject('Object Repository/PlanScedule/button_Login'))

WebUI.setText(findTestObject('Object Repository/PlanScedule/input_Home_form-control ng-untouched ng-pri_f7992a'), 'agroj@nawa.lol')

WebUI.setEncryptedText(findTestObject('Object Repository/PlanScedule/input_Home_form-control ng-untouched ng-dir_de7c82'), 
    'GsD77e9AfXmPfCaQ5p1Ifw==')

WebUI.click(findTestObject('Object Repository/PlanScedule/button_Login_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Training Management'))

WebUI.click(findTestObject('Object Repository/PlanScedule/a_Scheduled Training'))

WebUI.click(findTestObject('Object Repository/PlanScedule/a_Schedule a Training'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_select training module Pruning Train_c86281'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Agronomist Jj'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Kanyinya'), '5bfd8dbe91703530fcb9b1d6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Nzove  Taba  Nyamweru'), '5bf816d753d485a9eae4aa57', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Bibungo  Bwiza  Kagasa  Gateko  Nyab_b1236b'), 
    '5bf8163553d485a9eae42dc6', true)

WebUI.setText(findTestObject('Object Repository/PlanScedule/input_Venue_form-control ng-untouched ng-pr_15ad65'), 'BAR AKEZA')

WebUI.click(findTestObject('Object Repository/PlanScedule/input_Starting Date and Time of the trainin_b6ce6d'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Oct 2022_owl-dt-control-content owl-dt_42d512'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_30'))

WebUI.click(findTestObject('Object Repository/PlanScedule/input_Starting Date and Time of the trainin_b6ce6d_1'))

WebUI.doubleClick(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Hour_owl-dt-control-button-content'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Set'))

WebUI.click(findTestObject('Object Repository/PlanScedule/input_Starting Date and Time of the trainin_b6ce6d'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_CANCEL_owl-dt-control-content owl-dt-c_f6e4ef'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_7'))

WebUI.click(findTestObject('Object Repository/PlanScedule/input_Starting Date and Time of the trainin_b6ce6d_1'))

WebUI.doubleClick(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.doubleClick(findTestObject('Object Repository/PlanScedule/span_SCHEDULE A TRAINING_owl-dt-control-but_0f9102'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_SCHEDULE A TRAINING_owl-dt-control-but_0f9102'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_SCHEDULE A TRAINING_owl-dt-control-but_0f9102'))

WebUI.doubleClick(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/svg_1'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Set'))

WebUI.setText(findTestObject('Object Repository/PlanScedule/input_Venue_form-control ng-untouched ng-pr_15ad65'), 'KONGERA UMUSARURO')

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Kanyinya'), '5bfd8dbe91703530fcb9b1d6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Nzove'), '5bf816d753d485a9eae4aa57', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Bibungo'), '5bf8163553d485a9eae42dc6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PlanScedule/select_Farmer Group J  Tugirimana Kawa Group'), 
    '635f9833dfb31d31f198a830', true)

WebUI.click(findTestObject('Object Repository/PlanScedule/button_ADD SELECTED TO BE TRAINED'))

WebUI.click(findTestObject('Object Repository/PlanScedule/input_not_invited_pull-right ng-untouched n_d710b6'))

WebUI.click(findTestObject('Object Repository/PlanScedule/button_SCHEDULE A TRAINING'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Confirm'))

WebUI.click(findTestObject('Object Repository/PlanScedule/button_undefined undefined_btn btn-primary btn-xs'))

WebUI.click(findTestObject('Object Repository/PlanScedule/i_undefined undefined_fa fa-remove'))

WebUI.click(findTestObject('Object Repository/PlanScedule/i_undefined undefined_fa fa-edit'))

WebUI.click(findTestObject('Object Repository/PlanScedule/i_undefined undefined_fa fa-check'))

WebUI.click(findTestObject('Object Repository/PlanScedule/button_ADD SELECTED TO BE TRAINED'))

WebUI.click(findTestObject('Object Repository/PlanScedule/button_SCHEDULE A TRAINING'))

WebUI.click(findTestObject('Object Repository/PlanScedule/span_Confirm'))

