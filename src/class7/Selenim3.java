package class7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenim3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pc\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/mobile-apps");
				String title=driver .getTitle();
				System.out.println("title");
				String Current; 
				 String 
 url=driver.getCurrentUrl();
				 System.out.println("currenturl");
				
				
		
	}

}
