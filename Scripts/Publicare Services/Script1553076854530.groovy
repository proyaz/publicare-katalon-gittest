import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
 
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
 
// Explicitly set the path of Chrome Driver binary
System.setProperty("webdriver.chrome.driver", "/var/jenkins_home/tools/chromedriver/chromedriver");

// Explicitly set the path of Chrome Browser binary
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory

optionsBeta = new ChromeOptions();
//optionsBeta.addArguments("start-maximized"); // open Browser in maximized mode
//optionsBeta.addArguments("disable-infobars"); // disabling infobars
//optionsBeta.addArguments("--disable-extensions"); // disabling extensions
//optionsBeta.addArguments("--disable-gpu"); // applicable to windows os only
optionsBeta.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
optionsBeta.addArguments("--no-sandbox"); // Bypass OS security model
optionsBeta.addArguments('--headless');
optionsBeta.setBinary("/var/jenkins_home/tools/chromedriver/chromedriver");
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(ChromeOptions.CAPABILITY, optionsBeta);

ChromeDriver driver = new ChromeDriver(capabilities);
DriverFactory.changeWebDriver(driver)
 
 

WebUI.navigateToUrl('https://publicare.ch/')

WebUI.click(findTestObject('Object Repository/servicesOR/Page_HOME  Publicare/a_Dienstleistungen'))

WebUI.click(findTestObject('Object Repository/servicesOR/Page_services  Publicare/a_Beratung'))

WebUI.click(findTestObject('Object Repository/servicesOR/Page_Beratung  Publicare/a_Dienstleistungen'))

WebUI.click(findTestObject('Object Repository/servicesOR/Page_services  Publicare/a_Lieferant'))

WebUI.click(findTestObject('Object Repository/servicesOR/Page_Lieferant  Publicare/a_Dienstleistungen'))

WebUI.closeBrowser()


