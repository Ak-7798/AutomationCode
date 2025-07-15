package ECommerceTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class TestRunner implements LoginRepo {
//static WebDriver driver;
static LoginTest lt=new LoginTest();
static UtilityClass uc=new UtilityClass();
static WebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//run();
		try {
			uc.setWebDriver(driver);
			//Opening Edge Browser to invoke Amazon website
		uc.ExecutionMethod("Chrome");
		uc.clickEvent(btnlinkFresh,"btn Fresh");
		Thread.sleep(2000);
		// Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Check each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();
                    int responseCode = connection.getResponseCode();
                    if (responseCode != 200) {
                        System.out.println("Broken link: " + url);
                    }
                } catch (IOException e) {
                    System.out.println("Error checking link: " + url);
                }
            }
        }
		driver.quit();
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
