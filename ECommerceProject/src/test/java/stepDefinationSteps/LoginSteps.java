package stepDefinationSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ECommerceTest.LoginRepo;
import ECommerceTest.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps implements LoginRepo{
    WebDriver driver= UtilityClass.ExecutionMethod("Chrome");
   
    @Given("the user is on the login page")
    public void userOnLoginPage() {
//        WebDriverManager.chromedriver().setup();
        
    	 //System.setProperty("webdriver.chrome.driver", "D:/DailyCode/ECommerceProject/Framework/chromedriver.exe");
//       //  driver=new EdgeDriver();
    	 //driver = new ChromeDriver();
//        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
        
    }

    @When("the user enters valid credentials")
    public void userEntersCredentials() throws InterruptedException {
    	
    	UtilityClass.clickEvent(btnsignin,"btnsignin");
    	 Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kishoramale717@gmail.com");
//    	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
//    	
    	//driver.findElement(By.xpath("//*[contains(text(),'Hello, sign in')]")).click();
//        driver.findElement(By.id("username")).sendKeys("testuser");
//        driver.findElement(By.id("password")).sendKeys("password");
//        driver.findElement(By.id("loginButton")).click();
    }

    @Then("the user should be redirected to the dashboard")
    public void userRedirectedToDashboard() throws InterruptedException {
        String title = UtilityClass.driver.getTitle();
        System.out.println("Title="+title);
        //assertEquals("Dashboard", title);
        Thread.sleep(2000);
        driver.quit();
    }
}
