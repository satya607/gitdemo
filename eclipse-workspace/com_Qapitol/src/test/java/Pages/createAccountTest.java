package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com_Qapitol_base.initialization;

public class createAccountTest extends initialization {
  public static void createaccount() {
	 driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("satya");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
	  WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	  Select s = new Select(ele);
	  s.selectByValue("4");
	  WebElement ele1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	  Select s1 = new Select(ele1);
	  s1.selectByVisibleText("Feb");
	  WebElement ele2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	  Select s2 = new Select(ele2);
	  s2.selectByValue("1995");
	  driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][2]")).click();
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("satya");
	  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("s1a2t3y4");
	  WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
	   Actions a = new Actions(driver);
	   a.moveToElement(signup).perform();
	   
	  
}
}
