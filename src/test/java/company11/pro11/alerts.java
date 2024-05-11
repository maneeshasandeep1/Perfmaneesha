package company11.pro11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        
        WebElement simplealert = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
        
    Alert alert =driver.switchTo().alert();
        
	}

}
