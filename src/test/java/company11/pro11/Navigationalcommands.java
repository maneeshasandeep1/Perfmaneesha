package company11.pro11;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationalcommands {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		Thread.sleep(4000);
		
         driver.navigate().back();
         
         Thread.sleep(4000);
         
         driver.navigate().forward();
         
         Thread.sleep(4000);
         
         driver.navigate().refresh();
         driver.close();
	}

}
