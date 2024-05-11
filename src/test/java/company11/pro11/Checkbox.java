package company11.pro11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
	Thread.sleep(4000);
		WebElement chbox = driver.findElement(By.xpath("(//input [@type='checkbox'])[2]"));
				
				if(chbox.isDisplayed())	{
				
				chbox.click();

	}else {
		System.out.println("no chckbox");
	}
		WebElement chbox2 =driver.findElement(By.xpath("(//input [@type='checkbox'])[1]"));
		
		if(chbox2.isDisplayed())	
		{
			chbox2.click();
		}
		else {
			System.out.println("chbox2 is not displayed");
		}
	
		
	}
	
	
	
	
	
	
	
		

}
