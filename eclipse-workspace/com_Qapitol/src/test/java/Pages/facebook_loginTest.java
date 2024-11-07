package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com_Qapitol_base.initialization;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_loginTest extends initialization {
	       

	public static void loginpage() {
	WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("syadav962@gmail.com");
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("s1a2t3y4a5");
    driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
