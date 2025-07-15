package ECommerceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UtilityClass {
	public static WebDriver driver;
	public WebDriver getWebDriver() {
		driver=this.driver;
		return driver;
	}
	public void setWebDriver(WebDriver wd) {
		 System.setProperty("webdriver.chrome.driver", "D:/DailyCode/ECommerceProject/Framework/chromedriver.exe");
		this.driver=wd;
		driver=new ChromeDriver();
		
	}
	 
	/*
	 * passed the parameters as WebElement and String 
	 * Click on WebElement
	 * */
	public static void clickEvent(By Element,String message) {
		try {
		driver.findElement(Element).click();
		System.out.println(message +"Element is  Clicked");
		}catch(Exception e){
			System.out.println("Element is not Clickable due to="+e.getMessage());
		}
		
	}
	public static WebDriver ExecutionMethod(String browser) {
		
		switch(browser) {
		                case "Chrome":
		                	System.setProperty("webdriver.chrome.driver", "D:/DailyCode/ECommerceProject/Framework/chromedriver.exe");
		                    driver=new ChromeDriver();
		                    
		                    break;
		               case "Edge":
			            System.setProperty("webdriver.edge.driver", "D:/DailyCode/ECommerceProject/Framework/msedgedriver.exe");
			            driver=new EdgeDriver();
			           break;
			
		}
		
		//driver.manage().window().maximize();
		return driver;
		//driver.manage().timeouts().getImplicitWaitTimeout();
		
	}

}
