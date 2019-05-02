package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	ChromeDriver driver;

	@BeforeMethod

	public void Launch() {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@Test
	public void GoogleSearch() {

		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Selenium");
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")).click();		
	}

	@Test
	public void GoogleSearch1() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

		//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Selenium");
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")).click();		
	}
	
	@AfterMethod
	public void close() {
		driver.close();	
	}
	
}
