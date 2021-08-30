package pruebaDaniel.choucair; //INICIO DE SESION USUARIO YA REGISTRADO


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchtest {
	private WebDriver driver;
	
	By emailLocator = By.id("email");
	By passwordlocator = By.id("passwd");
	By signinBtnlocator= By.id("SubmitLogin");
	
	
	

@Before
public void setUp () {

    
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	}

@Test
public void testGooglepage(){

	WebElement searchbox = driver.findElement(By.className("login"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	searchbox.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(emailLocator).sendKeys("df.Daniel@hotmail.com");
  driver.findElement(passwordlocator).sendKeys("pruebalogin123");
  
  driver.findElement(signinBtnlocator).click();

	
}
	
@After
public void tearDown() {
	
}	
	
private void assertEquals(String string, String title) {
	
	
}

}
