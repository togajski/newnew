package test_case_one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	 
	//System.out.println("Page title is: " + driver.getTitle());
		assertTrue(driver.getTitle().contains("CINNAMON | All software, zero nonsense."));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 
  }
  
  @BeforeTest
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://new.cinnamon.services/");
	  
  }
  
  @Test(priority = 0)
  public void header() throws InterruptedException {
	  
	//header
	WebElement projects = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Projects')]")); 
	projects.click();
	Thread.sleep(2000);
	WebElement services = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Services')]"));
	services.click();
	Thread.sleep(2000);
	WebElement aboutus = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'About Us')]"));
	aboutus.click();
	Thread.sleep(2000);
	WebElement blog = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Blog')]"));
	blog.click();
	Thread.sleep(2000);
	WebElement careers = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Careers')]"));
	careers.click();
	Thread.sleep(2000);
	WebElement contactus = driver.findElement(By.xpath("//button[contains(text(),'Contact Us')]"));
	contactus.click();
	Thread.sleep(2000);
	
	//checkboxes
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
	
	//contact form
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
	
		
	
	}
  
  @Test(priority = 1)
  public void services() throws InterruptedException{
	  WebElement services = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'Services')]"));
	  services.click();
	  WebElement praises = driver.findElement(By.xpath("//div[@class='css-el31jj e1b6pfr47']"));
	  Point point = praises.getLocation();
	  
	  int x_coordinate = point.getX();
	  int y_coordinate = point.getY();
	  scrollToElement (x_coordinate, y_coordinate);
	  
	  WebElement arrowNext = driver.findElement(By.xpath("//button[@class='css-wsqny1 ee0xsp84']//div[@class='css-jetvm4 ee0xsp81']"));
	  arrowNext.click();
	  Thread.sleep(2000);
	  arrowNext.click();
	  Thread.sleep(2000);
	  
  }
  
  public void scrollToElement(int x, int y) {
	  
	  JavascriptExecutor javScriptExec = (JavascriptExecutor) driver;
	  javScriptExec.executeScript("window.scrollBy(" + x + ", " + y + ");");
	  
  }
  
  public void sleep() throws InterruptedException {
	  //Thread.sleep(10000);
  }
  
  
  @Test(priority = 2)
  public void about() throws InterruptedException {
	  WebElement aboutus = driver.findElement(By.xpath("//a[@class='css-rvg6o4 e62olcv2'][contains(text(),'About Us')]"));
	  aboutus.click();
	  WebElement ourTeamsDiv = driver.findElement(By.xpath("//div[@class='css-l5s78l e1hq3nxf4']"));
	  Point point = ourTeamsDiv.getLocation();
	  int x_coordinate = point.getX();
	  int y_coordinate = point.getY();
	  scrollToElement1 (x_coordinate, y_coordinate);
	  Thread.sleep(2000);
	  //WebElement ourTeamDiv = driver.findElement(By.xpath("//div[@class='css-l5s78l e1hq3nxf4']"));
	  /*WebElement ourTeamsDiv1 = driver.findElement(By.xpath("//div[@class='css-l5s78l e1hq3nxf4']"));
	  System.out.println(ourTeamsDiv1.findElements(By.tagName("p")).size());
	  for(int i=1;i<ourTeamsDiv1.findElements(By.tagName("p")).size();i++) {
		  ourTeamsDiv1.findElements(By.tagName("p")).get(i).click();
		  Thread.sleep(2000);*/
		  //ne radi gore petlja trenutno
	  
	  WebElement productDesign = driver.findElement(By.xpath("//p[contains(text(),'Product design')]"));
	  productDesign.click();
	  //Thread.sleep(2000);
	  WebElement webDevelopment = driver.findElement(By.xpath("//p[contains(text(),'Web development')]"));
	  webDevelopment.click();
	  //Thread.sleep(2000);
	  WebElement mobileDev = driver.findElement(By.xpath("//p[contains(text(),'Mobile development')]"));
	  mobileDev.click();
	  //Thread.sleep(2000);
	  WebElement qA = driver.findElement(By.xpath("//p[contains(text(),'Quality assurance')]"));
	  qA.click();
	  //Thread.sleep(2000);
	  WebElement marketing = driver.findElement(By.xpath("//p[contains(text(),'Marketing')]"));
	  marketing.click();
	  //Thread.sleep(2000);
	  WebElement projectMng = driver.findElement(By.xpath("//p[contains(text(),'Project management')]"));
	  projectMng.click();
	  //Thread.sleep(2000);
	  WebElement humanRes = driver.findElement(By.xpath("//p[contains(text(),'Human resources')]"));
	  humanRes.click();
	  //Thread.sleep(2000);
	  WebElement sales = driver.findElement(By.xpath("//p[contains(text(),'Sales')]"));
	  sales.click();
	  //Thread.sleep(2000);
	  WebElement fluffyFriends = driver.findElement(By.xpath("//p[contains(text(),'Fluffy friends')]"));
	  fluffyFriends.click();
	  //Thread.sleep(2000);
	  
	  //WebElement picturesDiv = driver.findElement(By.xpath("//body/div[@id='__next']/main[@class='css-0 e18wief60']/div[5]"));
	  /*Point point1 = picturesDiv.getLocation();
	  int x1_coordinates = point1.getX();
	  int x2_coordinates = point1.getY();
	  scrollToElement1 (x1_coordinates, x2_coordinates);
	  Thread.sleep(2000);*/
	  
	  WebElement ourTeamArrow = driver.findElement(By.xpath("//body/div[@id='__next']/main[@class='css-0 e18wief60']/div[5]/div[1]/div[1]/div[2]/button[2]/div[1]"));
	  ourTeamArrow.click();
	  Thread.sleep(2000);
	  ourTeamArrow.click();
	  Thread.sleep(2000);
	  ourTeamArrow.click();
	  Thread.sleep(2000);
	  
	  String clickLinkedIn = Keys.chord(Keys.CONTROL, Keys.ENTER);
	  WebElement ivanProfile = driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/in/real-ivan-kovac/\"]"));
	  ivanProfile.sendKeys(clickLinkedIn);
	  Thread.sleep(2000);
	  WebElement matejaProfile = driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/in/mateja-bartolovic-aa20a26a/\"]"));
	  matejaProfile.sendKeys(clickLinkedIn);
	  WebElement mladenProfile = driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/in/mladen-simic/\"]"));
	  mladenProfile.sendKeys(clickLinkedIn);
	  
	  WebElement officesArrow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[8]/div[1]/div[1]/div[2]/button[2]/div[1]"));
	  officesArrow.click();
	  Thread.sleep(2000);
	  officesArrow.click();
	  Thread.sleep(2000);
	  
	  WebElement projectsArrowNext = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[9]/div[1]/div[2]/div[1]/button[2]/div[1]"));
	  projectsArrowNext.click();
	  Thread.sleep(2000);
	  projectsArrowNext.click();
	  Thread.sleep(2000);
	  projectsArrowNext.click();
	  Thread.sleep(2000);
	  projectsArrowNext.click();
	  WebElement projectsArrowBack = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[9]/div[1]/div[2]/div[1]/button[1]/div[1]"));
	  projectsArrowBack.click();
	  Thread.sleep(2000);
	 	  
  }
  
  public void scrollToElement1(int x, int y) {
	  
	  JavascriptExecutor javScriptExec = (JavascriptExecutor) driver;
	  javScriptExec.executeScript("window.scrollBy(" + x + ", " + y + ");");
	  
  }
  
  
  
  @Test(priority = 3)
  public void footer() throws InterruptedException {
	//footer-social links & clutch
			String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			//WebElement clutch = driver.findElement(By.xpath("//div[@class='clutch-widget']"));
			//clutch.sendKeys(clickLink);
			WebElement footerDriver = driver.findElement(By.xpath("//div[@class='css-1bbr9jd e1cjp5mf3']"));
			System.out.println(footerDriver.findElements(By.tagName("a")).size());
			
			for(int i=0;i<footerDriver.findElements(By.tagName("a")).size();i++) {
				footerDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
				Thread.sleep(2000);
			}
			
			Set <String> tabWindows = driver.getWindowHandles();
			Iterator <String> it = tabWindows.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
			}
	  
  }
  
   
  
  	
  	

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
	  
	  
  }

}
