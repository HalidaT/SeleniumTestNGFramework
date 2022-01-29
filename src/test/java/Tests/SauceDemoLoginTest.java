package Tests;

import org.testng.annotations.Test;
import Pages.SauceDemoLoginPage;
import Utilities.Driver;
import Utilities.PropertiesReader;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class SauceDemoLoginTest {
	
	SauceDemoLoginPage loginPage;
	
  @Test
  public void loginPageTest() {
	  loginPage = new SauceDemoLoginPage();
	  
	  /*
		 * Test case 1
         go to https://saucedemo.com
         log in with username = standard_user  password = secret_sauce
         find all the results and get them in a list, and print the size of the list.
		 */
	  
	  Driver.getDriver().get(PropertiesReader.getProperty("sauceURL"));
	  
	 loginPage.userName.sendKeys(PropertiesReader.getProperty("sauce_username"));
	 loginPage.password.sendKeys(PropertiesReader.getProperty("sauce_password"));
	 loginPage.loginBtn.click();
	  
	  System.out.println(loginPage.items.size());
	  	    
  }
  
  @Test
  public void inventoryTest(){
	  /*
		 * go to https://saucedemo.com 
         log in with username = standard_user   password = secret_sauce
         find all the results. 
         print the price of each result. 
         Hint: loop through the list, get index and get text
		 */
	  loginPage = new SauceDemoLoginPage();
	  Driver.getDriver().get(PropertiesReader.getProperty("sauceURL"));
	  
	  loginPage.userName.sendKeys(PropertiesReader.getProperty("sauce_username"));
	  loginPage.password.sendKeys(PropertiesReader.getProperty("sauce_password"));
	  loginPage.loginBtn.click();
	  
	  for(WebElement item_price : loginPage.itemPrices) {
			System.out.println(item_price.getText().trim());
		  
	  }
	  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  Driver.quitDriver();
  }

}
