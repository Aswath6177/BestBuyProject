package Project.BestBuy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
 
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		}
	
	@FindBy(id = "fld-e")
	WebElement mailid;
	@FindBy(id = "smsDigits")
	WebElement number;
	@FindBy(id = "fld-p1")
	WebElement password;
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//span[text()='Account']")
	WebElement accountclick;
	
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signinclick;
	
	
	public void signinClickFromHomePage() throws InterruptedException {
		accountclick.click();
		CommonFunctions.waitForFixTime(3000);
		signinclick.click();
		
	}
	
	
	public void mailIdEnter(String mailId) {
		mailid.click();
		mailid.sendKeys(mailId);
		submit.click();
	}
	public void enterPhoneNumber(String phonenumber) {
		number.sendKeys(phonenumber);
	}
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void passwordEnter(String passWord) {
		
		password.sendKeys(passWord);
	
	}
	public void loginClick() {
		submit.click();
		
	}
	
	
}
