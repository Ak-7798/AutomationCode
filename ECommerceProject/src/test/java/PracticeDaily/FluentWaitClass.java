package PracticeDaily;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import ECommerceTest.LoginRepo;
import ECommerceTest.UtilityClass;

public class FluentWaitClass implements LoginRepo{
	static UtilityClass uc=new UtilityClass();
	static WebDriver driver;
public static void main(String[] args) {
	
	try {
		uc.setWebDriver(driver);
	uc.ExecutionMethod("Chrome");
	uc.clickEvent(btnlinkFresh,"btn Fresh");
	}catch(TimeoutException e) {
		System.out.println("Message="+e.getMessage());
	}finally {
		driver.quit();
	}
}
}
