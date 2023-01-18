package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProject {

public static void main(String[] args) throws InterruptedException {

	 System.setProperty("Webdriver.chrome.driver",
				"C:\Users\Admin\Desktop\sellars\chromedriver_win32\\chromedriver.exe");

  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();

  // Open Resturant website
  driver.get("file:///C:/Users/Admin/Desktop/my%20project/index.html#products");
  System.out.println(driver.getTitle());
 
 
  driver.findElement(By.id("search-btn")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/form[1]/input")).sendKeys("Fresh orange");
  Thread.sleep(1000);
  driver.findElement(By.id("cart-btn")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/form[2]/input[1]")).sendKeys("poojapatil751998@gmail.com");
  driver.findElement(By.xpath("/html/body/header/form[2]/input[2]")).sendKeys("Edubridge@#1234");
  driver.findElement(By.xpath("/html/body/header/form[2]/input[3]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();//Home
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();//dishes
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[3]")).click(); // for about
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[4]")).click(); // for Menu
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[5]")).click();//for Review
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[6]")).click();//for order
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/section[7]/div[1]/div[4]/input[1]")).sendKeys("poojapatil751998@gmail.com");
  Thread.sleep(2000);
  //driver.findElement(By.xpath("/html/body/section[7]/div[1]/div[4]/input[2]")).click();
  driver.quit();
 }
}
Footer
© 2023 GitHub, Inc.