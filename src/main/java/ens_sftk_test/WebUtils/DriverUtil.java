package ens_sftk_test.WebUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtil {
	private static ChromeOptions options;
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver != null ? driver : createInstance();
	}
	
	public static void addOptions(String... arguments) {
		options = new ChromeOptions();
		for(String arg : arguments) {
			options.addArguments(arg);
		}
	}
	
	private static WebDriver createInstance() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jose.quijada\\Downloads\\chromedriver.exe");
		//TODO: Agregar drivers de otros navegadores.
		driver = new ChromeDriver(options);
		return driver;
	}
}
