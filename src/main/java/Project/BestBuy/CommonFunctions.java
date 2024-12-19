package Project.BestBuy;

import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	
	public static void maxiMizeWindow(WebDriver driver) {
		
		driver.manage().window().maximize();
		
	}
	
	public static void waitForFixTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static void navigateToUrl(WebDriver driver) {
		driver.navigate().to("https://www.bestbuy.com/");
		
	}public static void navigateBack(WebDriver driver) {
		driver.navigate().back();
		
	}
	public static void driverClose(WebDriver driver) {
		driver.close();
	}
	public static void driverQuit(WebDriver driver) {
		driver.quit();
	}


}
