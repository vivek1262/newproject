import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.firefox.driver","/home/dhanvika/Downloads/geckodriver-v0.29.0-linux64/geckodriver");
		System.setProperty("webdriver.chrome.driver","/home/dhanvika/Downloads/chrome_linux64/87/chromedriver");

//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		Thread.sleep(10);
		System.out.println("homepage opened");
	driver.close();
	}

}
