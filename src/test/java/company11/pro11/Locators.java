package company11.pro11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("hh@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("vv");
        driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("bb");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.partialLinkText("Log")).click();
        driver.findElement(By.tagName("https://www.facebook.com/recover/initiate/?ars=facebook_login&amp;cancel_lara_pswd=0")).click();
        driver.findElement(By.cssSelector("div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active")).click();
        
		
	}

}
