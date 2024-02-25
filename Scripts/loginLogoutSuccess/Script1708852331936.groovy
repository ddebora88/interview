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

Mobile.startExistingApplication('blibli.mobile.commerce')

Mobile.tap(findTestObject('Object Repository/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Emailphone number'), 'bsrhtest3@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), 'Testing123', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - 0895807918272'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Log out'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Log out'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.LinearLayout'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

