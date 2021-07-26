package WebUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtil {
	private static ChromeOptions options;
	private static WebDriver driver;
	
	public static WebDriver getSingleton() {
		return driver != null ? driver : createInstance();
	}
	
	public static void addOptions(String... arguments) {
		options = new ChromeOptions();
		for(String arg : arguments) {
			options.addArguments("arg");
		}
	}
	
	private static WebDriver createInstance() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jose.quijada\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(options);
		return driver;
	}
}
