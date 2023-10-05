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

WebUI.navigateToUrl('https://stg-booking.jazeeraairways.com/en/select-flight.')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Allow'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/a_Home Page'))

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_From_from_flight_search'), 'ku')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/div_Kuwait                Kuwait           _7359b5'))

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_To_to_flight_search'), 'du')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/div_Dubai                  United Arab Emir_63d471'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/th_october 2023'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/div_26'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Select'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Select_1'))

WebUI.scrollToElement(findTestObject('Page_Jazeera Airways/txt_RegularFare'), 0)

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Select-2'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/app-select-flight_FromKWIToDXBFromKuwait (K_2170a4'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Next Step Passenger Details'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Continue As Guest'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/span_As written in passport_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/span_Mr'))

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_Title_titleFirst0'), 'Katalojn')

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_First name_titleLast0'), 'User')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/span_Last Name_ng-arrow-wrapper'))

WebUI.setText(findTestObject('Page_Jazeera Airways/input_text'), 'ind')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/div_India'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/input_Nationality_AdultDob'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Jazeera Airways/select_201120102009200820072006200520042003_65b6ca'), 
    '1989', false)

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Jazeera Airways/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '5', false)

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/span_24'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/span_Last Name_ng-arrow-wrapper_1'))

not_run: WebUI.setText(findTestObject('Page_Jazeera Airways/input_text_1'), 'ind')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/div_India_1'))

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_Country of residence_form-control con_065964'), 
    'Bangalore')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/section_Passenger DetailsAs written in pass_f1c7d1'))

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_Code_form-control contactDetails ng-u_02bf77'), 
    '6756565823')

WebUI.setText(findTestObject('Object Repository/Page_Jazeera Airways/input_Mobile Number_form-control contactDet_d88b43'), 
    'test@katalon.com')

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Next Step Select Travel Extras'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Jazeera Airways/input_KWD_checkbox-wrap primary'), 0)

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/input_KWD_checkbox-wrap primary'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Next Step Payment'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Select Seat'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Select Seat_1'))

WebUI.click(findTestObject('Page_Jazeera Airways/label', [('seat') : '6C']))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Confirm Selection'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/section_Enhance Your Jazeera Flight Experie_1f39d6'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Jazeera Airways/button_Select Seat_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Select Seat_1'))

WebUI.click(findTestObject('Page_Jazeera Airways/label_1', [('seat') : '7A']))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Confirm Selection'))

WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/button_Next Step Payment'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Jazeera Airways/section_KWIDXBDXBKWIKWIDXBDXBKWITotalKWD 73_f0780c'))

WebUI.closeBrowser()

