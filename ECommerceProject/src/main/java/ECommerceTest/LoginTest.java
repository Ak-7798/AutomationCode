 package ECommerceTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest extends UtilityClass implements LoginRepo{
	static WebDriver driver;
	static UtilityClass uc=new UtilityClass();
	
    public static void main(String[] args) throws InterruptedException {
    	
    	//driver.findElement(btnlinkFresh).click();
    	//uc.clickEvent(btnlinkFresh,"btn Fresh");
    	Thread.sleep(2000);
    String str=	System.getProperty("browser");
    System.out.println("str="+str);
    	
    }
}
