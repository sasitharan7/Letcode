package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditPage_Letcode {
	@Test
	public  void editPage()
	{
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromdriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.letcode.in/edit");
		driver.findElementById("fullName").sendKeys("Sheeladevi Ramalingam");
		driver.findElementById("join").sendKeys("Person",Keys.TAB);
		String testValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(testValue);
		driver.findElementById("clearMe").clear();
		boolean isEnab = driver.findElementById("noEdit").isEnabled();
		System.out.println(isEnab);
		String testing = driver.findElementById("noEdit").getAttribute("readonly");
		System.out.println("testing "+ testing);
		String readOnly = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(readOnly);
		driver.quit();
	}

}
