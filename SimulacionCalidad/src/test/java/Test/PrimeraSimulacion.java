package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrimeraSimulacion {

	private WebDriver driver;
	
	@Before
	public void SetUP() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.driver", "C:/Users/ssao2/eclipse-workspace/SimulacionCalidad/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
	}
	
	@Test
	public void PrimeraPrueba() {
		
		
	}
	
	@Test
	public void SegundoTest() {
		
	}
	
	@After
	public void after() {
		
		//driver.quit();
	}
	
}
