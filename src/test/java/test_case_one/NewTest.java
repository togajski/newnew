package test_case_one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }
  
  @Test
  public void navigateToUrl() {
	  driver.get("http://new.cinnamon.services/");
	  assertTrue(driver.getTitle().contains("CINNAMON | All software, zero nonsense."));
	  //System.out.println("Page title is : " + driver.getTitle());
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
