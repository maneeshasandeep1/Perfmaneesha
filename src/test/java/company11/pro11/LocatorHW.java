package company11.pro11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorHW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://automationexercise.com/contact_us");
        driver.findElement(By.name("name")).sendKeys("man");
        driver.findElement(By.className("form-control")).sendKeys("mail.com");
        
		

	}

}
