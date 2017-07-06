package HybridAppsTest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

/**
 * 
 */

/**
 * @author Bindu
 *
 */
public class Nexus6 {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		File appDir = new File("C://Users//Bindu//Documents//Bindu Work//Software//Appium");
		File app = new File(appDir, "Salesforce1.apk");
		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("device", "Android Emulator");
		// capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(CapabilityType.SUPPORTS_NETWORK_CONNECTION, true);
		capabilities.setCapability(CapabilityType.SUPPORTS_WEB_STORAGE, true);
		// mandatory capabilities
		capabilities.setCapability("deviceName", "Nexus_6p");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "6");
		// capabilities.setCapability("automationName", "selendroid");

		capabilities.setCapability("app", app.getAbsolutePath());

		capabilities.setCapability("appPackage", "com.salesforce.chatter");

		capabilities.setCapability("appActivity", "com.salesforce.chatter.Chatter");

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("ignore-certificate-errors");

		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		capabilities.setCapability("chromedriverExecutable",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Chrome Driver//chromedriver_2.20//chromedriver.exe");

		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		WebElement IagreeButton = driver.findElement(
				By.xpath("//android.widget.TextView[contains(@resource-id,'com.salesforce.chatter:id/mi_accept')]"));

		IagreeButton.click();
		
		//Thread.sleep(30000);
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Chrome Driver//chromedriver_2.20//chromedriver.exe");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		int contextHandles = driver.getContextHandles().size();

		System.out.println("Context Handles : " + contextHandles);
		
		Set<String> contextHandleNamesSet = driver.getContextHandles();
		
		for(int i=0; i<contextHandleNamesSet.size(); i++)
		{
			System.out.println("ContextHandles: "+contextHandleNamesSet);
			
			if(contextHandleNamesSet.("WEBVIEW")){
				driver.context(contextHandleNamesSet.toString());
				
				
				System.out.println("Context Name Page Source : "+driver.getPageSource());
				
			}
		}

	}

}
