package loanRequest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoanTest {
	WebDriver driver;
	
	@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  	
	  	//Login Page
	  String baseUrl = "https://aspireapp.odoo.com";
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      WebElement email = driver.findElement(By.xpath("//*[@id=\"login\"]"));
      WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
      WebElement Login = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/button"));
      email.sendKeys("user@aspireapp.com");
      password.sendKeys("@sp1r3app");
      Login.click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Application Home Page
      WebElement inventory = driver.findElement(By.xpath("//*[@id=\"result_app_1\"]/div[2]"));
      inventory.click();
      WebElement products = driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/button"));
      products.click();
      WebElement subproducts = driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/div/a[1]"));
      subproducts.click();
      
      //Product Screen in Inventory
      WebElement createProduct = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button"));
      createProduct.click();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement productName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[4]/h1/div/input"));
      productName.sendKeys("French Fries");
      WebElement updateQuantity = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/button[2]/span"));
      updateQuantity.click();
      WebElement createQuantity = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[4]"));
      createQuantity.click();
      WebElement countedQuantity = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input"));
      countedQuantity.clear();
      countedQuantity.sendKeys("12");
      WebElement saveQuantity = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[1]"));
      saveQuantity.click();
      driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      
      //Manufacturing Page
      WebElement homeMenu = driver.findElement(By.xpath("/html/body/header/nav/a[1]"));
      homeMenu.click();
      WebElement Manufacturing = driver.findElement(By.xpath("//*[@id=\"result_app_2\"]/div[2]"));
      Manufacturing.click();
      WebElement createMaOrder = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[3]"));
      createMaOrder.click();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement MaProName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/table[1]/tbody/tr[5]/td[2]/div/div[1]/div/input"));
      MaProName.sendKeys("French Fries");
      MaProName.sendKeys(Keys.TAB);
      WebElement MaQuatity = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/table[1]/tbody/tr[9]/td[1]/label"));
	  MaQuatity.clear();
	  MaQuatity.sendKeys("12");
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      WebElement manSave = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]"));
      manSave.click();
      
      //After this a alert message is popping up at the screen via Automation execution but by manually I couldn't replicate the same step
      
		/* 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h1/span")).click();
		 * MaProName.click(); Select MaPrDropdown = new
		 * Select(driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/table[1]/tbody/tr[5]/td[2]/div/div[1]/div/input"
		 * ))); MaPrDropdown.selectByVisibleText("French Fries"); Alert alert =
		 * driver.switchTo().alert(); String text = alert.getText();
		 * System.out.println(text); WebElement discard = driver.findElement(By.xpath(
		 * "//*[@id=\"modal_199\"]/div/div/footer/button[2]/span")); discard.click();
		 * WebElement confirm =driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/button[5]/span"));
		 * confirm.click();
		 */ 
      
      
      
      
      
      
      
      
      
    
      
      
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
