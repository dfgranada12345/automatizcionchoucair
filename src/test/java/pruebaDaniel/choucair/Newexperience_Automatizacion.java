package pruebaDaniel.choucair; //REGISTRO DE USUARIO NUEVO

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Newexperience_Automatizacion {
	private WebDriver driver;


	By usernameLocator = By.id("email_create");
	By signinBtnlocator= By.id("SubmitCreate");
	By firstnamelocator = By.id("customer_firstname");
	By lasnameLocator = By.id("customer_lastname");
	By passwordLocator = By.id("passwd");
	By companyLocator = By.id("company");
	By addressLocator = By.id("address");
	By cityLocator = By.id("city");
	
	By postalcodeLocator = By.id("postcode");
	
	By phoneLocator = By.id("phone_mobile");
	By referenceLocator = By.id("alias");
	By registerbotonLocator = By.id("submitAccount");
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
	searchbox.click();
	
	driver.findElement(usernameLocator).sendKeys("df.granada19045@gmail.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(signinBtnlocator).click();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.findElement(firstnamelocator).sendKeys("Daniel");
  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(lasnameLocator).sendKeys("Granada");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(passwordLocator).sendKeys("1234567");
  driver.findElement(companyLocator).sendKeys("choucair");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(addressLocator).sendKeys("cll20#67a");
  
  driver.findElement(cityLocator).sendKeys("manizales");
  
  
  driver.findElement(postalcodeLocator).sendKeys("12789");
  
  
  
  driver.findElement(phoneLocator).sendKeys("3104444445");
  
  driver.findElement(referenceLocator).sendKeys("cra21_10");
 
  driver.findElement(registerbotonLocator).click();
  
}
	
@After
public void tearDown() {
	
	  
//driver.quit();	
}	
	
private void assertEquals(String string, String title) {
	// TODO Auto-generated method stub
	
}

}
