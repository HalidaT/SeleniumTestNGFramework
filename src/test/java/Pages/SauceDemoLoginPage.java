package Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class SauceDemoLoginPage{
	
	public SauceDemoLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id="user-name")
	public WebElement userName; //preferred format.
	
	@FindBy(id="password")
	public WebElement password; //you can put id directly as the WebElement name. This works only with id locator.
	
	@FindBy (xpath="//input[@value='Login']")
	public WebElement loginBtn;
	
	@FindBy (css = ".inventory_item")
	public List<WebElement> items;
	
	@FindBy (css = ".inventory_item_price" )
	public List<WebElement> itemPrices;
	
		
	
	

}
