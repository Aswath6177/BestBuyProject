package Project.BestBuy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	WebElement Firstname;

	@FindBy(id = "lastName")
	WebElement Lastname;

	@FindBy(id = "email")
	WebElement Email;

	@FindBy(id = "fld-p1")
	WebElement Password;

	@FindBy(id = "reenterPassword")
	WebElement Passwordconfirm;

	@FindBy(id = "phone")
	WebElement Phonenumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath = "//span[text()='Account']")
	WebElement SignupClick;
	
	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createaccountclick;

	
	public void clickOnSignUpFromHomePage() throws InterruptedException {
		SignupClick.click();
		CommonFunctions.waitForFixTime(3000);
		createaccountclick.click();
	}
	public void firstNameEnter(String FirstName) {

		Firstname.sendKeys(FirstName);
	}

	public void lastNameEnter(String LastName) {

		Lastname.sendKeys(LastName);
	}

	public void mailIdEnter(String MailId) {

		Email.sendKeys(MailId);
	}

	public void passWordEnter(String PassWord) {

		Password.sendKeys(PassWord);
	}

	public void passWordReEnter(String PassWordReEnter) {

		Passwordconfirm.sendKeys(PassWordReEnter);
	}

	public void phoneNumberEnter(String PhoneNumber) {

		Phonenumber.sendKeys(PhoneNumber);
	}

	public void signUpClick() {
		SubmitButton.click();

	}

}
