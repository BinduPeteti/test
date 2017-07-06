/**
 * 
 */
package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Bindu
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Bindu\\Documents\\Bindu Work\\Software\\Selenium\\Driver Executables\\Firefox Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("http://phptravels.com/demo/");
		
		driver.close();
		
		driver.quit();

	}

}
