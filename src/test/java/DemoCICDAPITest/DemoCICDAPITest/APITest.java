package DemoCICDAPITest.DemoCICDAPITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class APITest {
	
	@Test
	public void APITest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println("Title is :->"+driver.getTitle());
		
		Thread.sleep(5000);   
		driver.close();
		
	}

}
