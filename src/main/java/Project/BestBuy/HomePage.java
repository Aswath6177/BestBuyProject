package Project.BestBuy;

import org.openqa.selenium.WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Holiday Deals']")
	WebElement HolidayDeals;

	@FindBy(xpath = "//a[text()='Gift Cards']")
	WebElement GiftCards;

	@FindBy(xpath = "//a[text()='Gift Ideas']")
	WebElement GiftIdeas;
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement TopDeals;

	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement Dealoftheday;

	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	WebElement BestBuySells;
	
	
	@FindBy(xpath = "//a[text()='My Best Buy Memberships']")
	WebElement myBestbuy;
	
	@FindBy(xpath = "//a[text()='Best Buy Outlet']")
	WebElement bestbuyoutlet;
	
	
	@FindBy(xpath = "//a[text()='Best Buy Business']")
	WebElement bestbuybusiness;
	
	
	@FindBy(xpath = "//a[text()='Shop with an Expert']")
	WebElement shopwithanexpert;
	
	
	@FindBy(xpath = "//a[text()='Yardbird']")
	WebElement yardbird;
	
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cart;
	
	
	
	
	
	
	
	//-----------------------------------------------------------------------
	
	

	public void holidayDealsClick() {
		HolidayDeals.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
	}

	public void GiftCardsClick() {
		GiftCards.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Gifts Cards and E-Gift Cards - Best Buy";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		
	}

	public void GiftIdeasClick() {
		GiftIdeas.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Gift Ideas 2024: Best Gifts to Give This Year - Best Buy";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		

	}

	public void TopDealsClick() {
		TopDeals.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Best Buy Top Deals";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		

	}

	public void DealOfTheDayClick() {
		Dealoftheday.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Deal of the Day: Electronics Deals - Best Buy";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		

	}

	
public void bestBuySellsClick() {
		BestBuySells.click();
		String pageTitle = driver.getTitle();
		String landedTitle="Yes, Best Buy Sells That – Best Buy";
		if (pageTitle.contains(landedTitle)) {
            System.out.println("Successfully navigated to the page.");
        } else {
            System.out.println("Failed to navigate to the page.");
        }
		

	}
	

public void myBestBuyClick() {
	myBestbuy.click();
	String pageTitle = driver.getTitle();
	String landedTitle="My Best Buy Memberships";
	if (pageTitle.contains(landedTitle)) {
        System.out.println("Successfully navigated to the page.");
    } else {
        System.out.println("Failed to navigate to the page.");
    }
	

}

public void bestBuyOutletClick() {
	bestbuyoutlet.click();
	String pageTitle = driver.getTitle();
	String landedTitle="Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
	if (pageTitle.contains(landedTitle)) {
        System.out.println("Successfully navigated to the page.");
    } else {
        System.out.println("Failed to navigate to the page.");
    }
	

}
public void bestbuybusinessClick() {
	bestbuybusiness.click();
	String pageTitle = driver.getTitle();
	String landedTitle="Best Buy Business - Best Buy";
	if (pageTitle.contains(landedTitle)) {
        System.out.println("Successfully navigated to the page.");
    } else {
        System.out.println("Failed to navigate to the page.");
    }
	

}

public void shopWithAnExpertClick() {
	shopwithanexpert.click();
	String pageTitle = driver.getTitle();
	String landedTitle="Connect with an Expert - Best Buy";
	if (pageTitle.contains(landedTitle)) {
        System.out.println("Successfully navigated to the page.");
    } else {
        System.out.println("Failed to navigate to the page.");
    }
	

}

public void cartClick() {
	cart.click();
	String pageTitle = driver.getTitle();
	String landedTitle="Cart - Best Buy";
	if (pageTitle.contains(landedTitle)) {
        System.out.println("Successfully navigated to the page.");
    } else {
        System.out.println("Failed to navigate to the page.");
    }
	

}


public void yardbirdClick() throws InterruptedException {
	String mainWindowHandle = driver.getWindowHandle();
     yardbird.click();
    CommonFunctions.waitForFixTime(1000);
    Set<String> allWindowHandles = driver.getWindowHandles();
    for (String windowHandle : allWindowHandles) {
    	driver.switchTo().window(windowHandle);
    	String currentWindowTitle = driver.getTitle();
        if (currentWindowTitle.equals("Yardbird: Beautiful, High-Quality Outdoor Furniture")) {
        	
         String expectedTitle = "Yardbird: Beautiful, High-Quality Outdoor Furniture";
       
           if (currentWindowTitle.contains(expectedTitle)) {
               System.out.println("Successfully navigated hi  to the page.");
           } else {
               System.out.println("Failed to navigate  no to the page.");
           }
            driver.close();
            CommonFunctions.waitForFixTime(4000);
driver.switchTo().window(mainWindowHandle);
            break;  
        }
        
        
        
    }

//   


 
}

}
