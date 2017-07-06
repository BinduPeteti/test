import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import org.mozilla.javascript.Context;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonaws.services.budgets.model.TimeUnit;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 
 */

/**
 * @author Bindu
 *
 */
public class Pixel {

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {

		File appDir = new File("C://Users//Bindu//Documents//Bindu Work//Software//Appium");
		File app = new File(appDir, "Salesforce1.apk");
		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("device", "Android Emulator");
		// capabilities.setCapability("browserName", "chrome");

		// mandatory capabilities
		capabilities.setCapability("deviceName", "Pixel");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "7.1.1");

		capabilities.setCapability("app", app.getAbsolutePath());

		capabilities.setCapability("appPackage", "com.salesforce.chatter");

		capabilities.setCapability("appActivity", "com.salesforce.chatter.Chatter");

		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("ignore-certificate-errors");

		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		capabilities.setCapability("chromedriverExecutable",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Chrome Driver//chromedriver_win32//chromedriver.exe");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		WebElement IagreeButton = driver.findElement(
				By.xpath("//android.widget.TextView[contains(@resource-id,'com.salesforce.chatter:id/mi_accept')]"));

		IagreeButton.click();
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Chrome Driver//chromedriver_win32//chromedriver.exe");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		int contextHandles = driver.getContextHandles().size();

		System.out.println("Context Handles : " + contextHandles);

		for (Object contextName : driver.getContextHandles()) {
			System.out.println("Context Name : " + contextName);

			if (contextName.toString().toUpperCase().contains("WEBVIEW")) {
				System.out.println("CONTEXT NAME : " + contextName);
				System.out.println("Context :: " + contextName.toString());
				driver.context(contextName.toString());

			}
		}

		String pageSource = driver.getPageSource();

		System.out.println("Page Source : " + pageSource.toString());

		if (pageSource.contains("Custom")) {
			System.out.println("TEST");
		}

		/*
		 * WebElement user1 =
		 * driver.findElement(By.xpath("//*[@name='Username'][3]"));
		 * user1.sendKeys("TEST");
		 */

	}

}
