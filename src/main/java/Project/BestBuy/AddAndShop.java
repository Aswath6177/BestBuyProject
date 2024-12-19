package Project.BestBuy;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAndShop {
	WebDriver driver;

	public AddAndShop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="gh-search-input")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@title='submit search']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//button[@data-button-state='ADD_TO_CART']")
	WebElement addtocart;
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement carticon;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	
	
	
	public void searchBoxEnter(String SearchItem) {
		searchBox.click();
		searchBox.sendKeys(SearchItem);
		
	}
	public void searchButtonClick() {
		searchbutton.click();
		
	}
	public void addToCart(String Index) {
		String dynamicXpath = "(//button[@data-button-state='ADD_TO_CART'])[" + Index + "]";
		
		WebElement addToCartButtonAtIndex = driver.findElement(By.xpath(dynamicXpath));
		addToCartButtonAtIndex.click();
		
	}
	public void cartIconClick() {
		carticon.click();
		
	}
	
	public void checkoutClick() {
		checkout.click();
	}
}
