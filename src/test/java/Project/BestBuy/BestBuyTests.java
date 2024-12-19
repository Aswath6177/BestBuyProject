package Project.BestBuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BestBuyTests {
	static WebDriver driver;
	static HomePage page;
	static Loginpage page1;
	static SignUpPage page2;
	static AddAndShop shop;
	static ButtomLinks links;
	
	@BeforeTest
	public void openLink() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		CommonFunctions.maxiMizeWindow(driver);
		CommonFunctions.waitForFixTime(2000);
		
	

	}
	
	@Test(priority = 0)
	public void homePage() throws InterruptedException {
		page = new HomePage(driver);
		CommonFunctions.waitForFixTime(3000);
		page.holidayDealsClick();
		page.GiftCardsClick();
		page.GiftIdeasClick();
		page.TopDealsClick();
		page.DealOfTheDayClick();
		page.bestBuySellsClick();
		page.myBestBuyClick();
		page.bestbuybusinessClick();
		page.bestBuyOutletClick();
		page.shopWithAnExpertClick();
		page.cartClick();
		page.yardbirdClick();

	}
	@Test(priority = 1)
	public void ButtomLinks() throws InterruptedException {
		links = new ButtomLinks(driver);
		links.checkOrderStatusClick(driver);
		links.visitOurSupportCenterClick(driver);
		links.sellOnBestBuyMarketClick(driver);
		links.myBestBuyCreditCardClick(driver);
		links.myBestBuyMemberShipsClick(driver);
		links.corporateInformationClick(driver);
		

	}
	
	
	
	@Test(priority = 5)
	public void testSearchAndAddItemToCart() throws InterruptedException {
		shop = new AddAndShop(driver);
		CommonFunctions.navigateToUrl(driver);
		CommonFunctions.waitForFixTime(3000);
		shop.searchBoxEnter("Watches for men");
		shop.searchButtonClick();
		CommonFunctions.waitForFixTime(3000);
		shop.addToCart("1");
	}
	@Test(priority = 6)
	public void testSelectFromShopByDepartment() throws InterruptedException {
		shop = new AddAndShop(driver);
		CommonFunctions.navigateToUrl(driver);
		CommonFunctions.waitForFixTime(3000);
		shop.searchBoxEnter("Laptops");
		shop.searchButtonClick();
		CommonFunctions.waitForFixTime(3000);
		shop.addToCart("2");
	}
	@Test(priority = 7)
	public void testSelectFromBrands() throws InterruptedException {
		
		shop = new AddAndShop(driver);
		CommonFunctions.navigateToUrl(driver);
		CommonFunctions.waitForFixTime(3000);shop.searchBoxEnter("samsung");
		shop.searchButtonClick();
		CommonFunctions.waitForFixTime(3000);
		shop.addToCart("1");
		CommonFunctions.navigateBack(driver);
		CommonFunctions.waitForFixTime(3000);
		
	}
	
	@Test(priority = 8)
	public void checkoutWithDummyInfo()  throws InterruptedException{
		shop = new AddAndShop(driver);
		CommonFunctions.navigateToUrl(driver);
		CommonFunctions.waitForFixTime(3000);
		
		shop.cartIconClick();
		shop.checkoutClick();
	}
	
	//(enabled = false)
	@Test (priority = 2)
	public void loginpage() throws InterruptedException {
		page1 = new Loginpage(driver);
		CommonFunctions.navigateToUrl(driver);
		CommonFunctions.waitForFixTime(3000);
		
		page1.signinClickFromHomePage();
		page1.mailIdEnter("aswathshankar@gmail.com");
		page1.loginClick();
		CommonFunctions.waitForFixTime(3000);
		page1.enterPhoneNumber("6181");
		page1.enterLastName("s");
		page1.loginClick();
		CommonFunctions.waitForFixTime(3000);
	}
	@Test(priority = 3)
	public void loginpageNegativesenario() throws InterruptedException {
		page1 = new Loginpage(driver);
		CommonFunctions.navigateToUrl(driver);
		CommonFunctions.waitForFixTime(3000);
		page1.signinClickFromHomePage();
		page1.mailIdEnter("aswathmshankar@gmail.com");
		page1.loginClick();
		CommonFunctions.waitForFixTime(3000);
		page1.enterPhoneNumber("6181");
		page1.enterLastName("s");
		page1.loginClick();
		CommonFunctions.waitForFixTime(3000);
	}
	@Test(priority = 4)
	public void HomePage() throws InterruptedException {
		page2 = new SignUpPage(driver);
		CommonFunctions.navigateToUrl(driver);

		page2.clickOnSignUpFromHomePage();
		page2.firstNameEnter("Aswath");
		page2.lastNameEnter("s");
		page2.passWordEnter("aswath$9123");
		page2.passWordReEnter("aswath$9123");
		page2.phoneNumberEnter("1223454566");
		page2.mailIdEnter("aswathshankar@gmail.com");
		page2.signUpClick();

	}
	
	
		
		

}