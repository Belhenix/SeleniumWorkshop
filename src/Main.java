
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Datos.EnumXpaths;
import WebUtils.ElementUtil;
import WebUtils.DriverUtil;

public class Main {
	private static String pagina_web = "https://www.gob.mx/curp/";
	
	public static void main(String[] args) {
		DriverUtil.addOptions("--start-maximized");
		WebDriver driver = DriverUtil.getSingleton();
		driver.get(pagina_web);

		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		// definir la estructura a seguir en el proyecto (arquitectura)
		//    Por ahora parece ser Page Object Model.
		// datos no hardcodearlos, leerlo de algun archivo (json, excel)
		ElementUtil.addToElement(driver, EnumXpaths.INPUT_CURP, "QURC960115HBCJCR07");
		
		try {
			Thread.sleep(20000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ElementUtil.clickElement(driver, EnumXpaths.BUTTON_SEARCH);
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
}
