package company11.pro11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Invokeedge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\manee\\OneDrive\\Documents\\automation\\Driver\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");

		

	}

}
