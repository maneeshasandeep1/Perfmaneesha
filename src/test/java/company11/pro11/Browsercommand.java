package company11.pro11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommand {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
	String title=driver.getTitle();
		
    System.out.println(title);
    
     String pagesource =driver.getPageSource();
     System.out.println(pagesource);
     
     String currenturl=driver.getCurrentUrl();
     System.out.println(currenturl);

    		 
	}

}
