package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class AutomateFacebookLogin {

		public  void Login() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElementById("email").sendKeys("sheeladevitn@yahoo.com",Keys.TAB);
		driver.findElementById("pass").sendKeys("Guest123$",Keys.TAB);
		driver.findElementByName("login").submit();
		System.out.println(driver.getCurrentUrl());
		WebElement web = driver.findElementByXPath("//input[@placeholder='Search Facebook']");
		//WebElement web = driver.findElementByXPath("//span[text()='Sheeladevi']");
		
		boolean disp = web.isDisplayed();
		System.out.println(disp);
		
		driver.quit();

	}

}
