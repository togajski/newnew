package test_case_one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	 
	  System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
  }
  
  @Test
  public void testCase() {
	  
	driver.get("http://new.cinnamon.services/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//System.out.println("Page title is: " + driver.getTitle());
	assertTrue(driver.getTitle().contains("CINNAMON | All software, zero nonsense."));
	WebElement projects = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Projects')]")); 
	projects.click();
	WebElement services = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Services')]"));
	services.click();
	WebElement aboutus = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'About Us')]"));
	aboutus.click();
	WebElement blog = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Blog')]"));
	blog.click();
	WebElement careers = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Careers')]"));
	careers.click();
	
	WebElement contactus = driver.findElement(By.xpath("//button[contains(text(),'Contact Us')]"));
	contactus.click();
	
	WebElement mobileApp = driver.findElement(By.xpath("//div[@id='__next']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]"));
	mobileApp.click();
	WebElement website = driver.findElement(By.xpath("//div[@id='__next']//div[1]//div[2]//div[3]//div[1]//div[1]//div[1]"));
	website.click();
	WebElement productDesign = driver.findElement(By.xpath("//body//form//div[1]//div[1]//div[2]//div[1]"));
	productDesign.click();
	WebElement qa = driver.findElement(By.xpath("//div[@class='css-10qj97d e4b9uf50']//div[3]//div[1]//div[2]//div[1]"));
	qa.click();
	WebElement budget20_50 = driver.findElement(By.xpath("//div[3]//div[2]//div[2]//div[1]//div[1]//div[1]"));
	budget20_50.click();
	
	WebElement detailsName = driver.findElement(By.xpath("//div[@class='css-4vdyx0 en97x002']//div[1]//input[1]"));
	detailsName.sendKeys("Ignjator");
	WebElement detailsEmail = driver.findElement(By.xpath("//div[@class='css-4vdyx0 en97x002']//div[2]//input[1]"));
	detailsEmail.sendKeys("ignjator@cinnamon.com");
	WebElement detailsCompany = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[4]/div[2]/input[1]"));
	detailsCompany.sendKeys("Ignjatorizam Corp");
	WebElement detailsYourMsg = driver.findElement(By.xpath("//textarea[@placeholder='a']"));
	detailsYourMsg.sendKeys("Don't drink and drive AND put your seatbelt ON!");
	WebElement detailsDisclaimer = driver.findElement(By.xpath("//div[@class='css-myrvpa e1wnkp8s2']"));
	detailsDisclaimer.click();
	WebElement detailsDrag = driver.findElement(By.xpath("//div[@class='css-t7du94 e1r5c6ul1']//input"));
	//detailsDrag.click();
	detailsDrag.sendKeys("A:\\test.jpeg");
	
	//web element nema file attribute pa se nemre sa sendKeys
	
	
	}
  	
  	

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
	  
  }

}
