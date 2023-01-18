ackage Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon  {

public static void main(String[] args) throws InterruptedException
{
	System.setProperty("Webdriver.chrome.driver",
			"C:\Users\Admin\Desktop\sellars\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("http://www.amazon.in/");//Open Amazon 
driver.manage().window().maximize();
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile");
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("EN")).click();
Thread.sleep(1000);
driver.findElement(By.className("a-button-text")).click(); //cancel
Thread.sleep(1000);
driver.findElement(By.cssSelector("#nav-link-accountList ")).click(); //Sign-in
Thread.sleep(1000);
driver.findElement(By.id("ap_email")).sendKeys("er.poojapatil751998@gmail.com");
Thread.sleep(1000);
driver.findElement(By.id("continue")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("#continue")).click();
Thread.sleep(1000);
driver.findElement(By.id("createAccountSubmit")).click();
Thread.sleep(1000);
driver.findElement(By.className("a-input-text")).sendKeys("pooja Patil");
Thread.sleep(1000);
driver.findElement(By.id("ap_phone_number")).sendKeys("9763910985");
driver.findElement(By.name("secondaryLoginClaim")).sendKeys("er.poojapatil751998@gmail.com");

driver.findElement(By.id("ap_password")).sendKeys("pooja@123");
driver.findElement(By.className("a-button-input")).click();

//Navigate to facebook sign up page
driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfb%20create%20account%7C&placement=&creative=589460569870&keyword=fb%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-332264388364%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA14WdBhD8ARIsANao07gCwXFda4ohrrPZF6UHfiSK6C_zOeWVyC3DwkA7VfLvWh0x05IQeGoaAoy6EALw_wcB");
driver.findElement(By.name("firstname")).sendKeys("pooja");
driver.findElement(By.name("lastname")).sendKeys("Chavan");
driver.findElement(By.name("reg_email__")).sendKeys("9763910985");
driver.findElement(By.name("reg_passwd__")).sendKeys("pooja@123");

//Dropdown list
Select se = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
se.selectByValue("7");

Select se1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
se1.selectByVisibleText("May");

Select seYr = new Select(driver.findElement(By.id("year")));
seYr.selectByIndex(25);
driver.findElement(By.name("sex")).click();//for selecting female
driver.findElement(By.name("websubmit")).click();
driver.quit();
}
}