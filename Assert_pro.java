package TestNgPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_pro {
	
	//public static void main(String[] args) {
		
		//Assert.assertNotEquals("Hello", "How are you");
		//System.out.println("Hello...");
	@Test
	
	
	public void TestGoogle() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\Users\Admin\Desktop\sellars\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Tutorial",Keys.ENTER);
		String ExpectedTitle="Tutorial";
		String ActualTitle= driver.getTitle();
		Assert.assertNotEquals(ExpectedTitle,ActualTitle,"Titile is matched");
		driver.quit();
		
	}