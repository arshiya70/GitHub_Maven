package maven_for_Jenkins;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.testng.annotations.Test;

public class UiTest {
	@Test
	public void startBrowser() {
		/*//WebDriverManager.chromedriver().setup();		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path +"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
		driver.quit();*/
		System.out.println("Welcome here");
		
	}
}
