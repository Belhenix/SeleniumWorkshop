package ens_sftk_test.WebUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	// get element
	public static WebElement getElement(WebDriver driver, String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	// add to element (input text, files)
	public static void addToElement(WebDriver driver, String xpath, String text) {
		WebElement element = getElement(driver, xpath);
		addToElement(element, text);
	}
	public static void addToElement(WebElement element, String text) {
		try {
			element.sendKeys(text);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// click element
	public static void clickElement(WebDriver driver, String xpath) {
		try {
			getElement(driver, xpath).click();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
