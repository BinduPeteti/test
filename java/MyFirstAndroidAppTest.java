import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

/**
 * 
 */

/**
 * @author Bindu
 *
 */
public class MyFirstAndroidAppTest {

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {
		
		File appDir = new File("C://Users//Bindu//Documents//Bindu Work//Software//Appium");
		File app = new File(appDir, "notepad.apk");
		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("device", "Android Emulator");
		capabilities.setCapability("browserName", "");

		// mandatory capabilities
		capabilities.setCapability("deviceName", "BinduDevice");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "7.1.1");

		// capabilities.setCapability("app", app.getAbsolutePath()s);

		// other caps
		capabilities.setCapability("app", app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

	}

}
