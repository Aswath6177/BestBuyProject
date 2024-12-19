package Project.BestBuy;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtomLinks {
WebDriver driver;
	

	public ButtomLinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Check Order Status']")
	WebElement checkorderstatus;

	@FindBy(xpath = "//a[text()='Visit our Support Center']")
	WebElement visitoursupportcenter;

	@FindBy(xpath = "//a[text()='Sell on Best Buy Marketplace']")
	WebElement sellonbestbuymarketplace;
	
	
	@FindBy(xpath = "//a[text()='My Best Buy® Credit Card']")
	WebElement mybestbuycreditcard;
	
	

	@FindBy(xpath = "//footer//a[text()='My Best Buy Memberships']")
	WebElement mybestbuymemberships;

	@FindBy(xpath = "//a[text()='Corporate Information']")
	WebElement corporateinformation;
	
	
	//-----------------------------------------------------------------------
	
	

	public void checkOrderStatusClick(WebDriver driver) throws InterruptedException {
		checkorderstatus.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Sign In for Order Status";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		CommonFunctions.navigateBack(driver);
		CommonFunctions.waitForFixTime(4000);

	}

	public void visitOurSupportCenterClick(WebDriver driver) throws InterruptedException {
		visitoursupportcenter.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Best Buy Support & Customer Service";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		CommonFunctions.navigateBack(driver);
		CommonFunctions.waitForFixTime(4000);

		
	}

	public void sellOnBestBuyMarketClick(WebDriver driver) throws InterruptedException {
		sellonbestbuymarketplace.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Best Buy Marketplace - Sell on Best Buy";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		
		CommonFunctions.navigateBack(driver);
		
		CommonFunctions.waitForFixTime(4000);

	}

	public void myBestBuyCreditCardClick(WebDriver driver) throws InterruptedException {
		mybestbuycreditcard.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Best Buy Credit Card: Rewards & Financing";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		
		CommonFunctions.navigateBack(driver);
		CommonFunctions.waitForFixTime(4000);

	}

	public void myBestBuyMemberShipsClick(WebDriver driver) throws InterruptedException {
		mybestbuymemberships.click();
		String pageTitle = driver.getTitle();
		String landedTitle="My Best Buy Memberships";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		
		CommonFunctions.navigateBack(driver);
		CommonFunctions.waitForFixTime(4000);
	}

	
public void corporateInformationClick(WebDriver driver) throws InterruptedException {
	corporateinformation.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Homepage - Best Buy Corporate News and Information";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the gfsgpage.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		CommonFunctions.navigateBack(driver);
		CommonFunctions.waitForFixTime(4000);

	}


}
