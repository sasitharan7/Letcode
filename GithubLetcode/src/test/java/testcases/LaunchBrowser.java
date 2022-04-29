package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchBrowser {

@Test(dataProvider = "gettingData", dataProviderClass = DataProviderClass.class)
	public void browserLaunch(String email, String pwd) {

		
	System.setProperty("Webdriver.chrome.driver", "./drivers/chromdriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
        driver.get("https://letcode.in");
        driver.findElementByLinkText("Log in").click();
        
        
        driver.findElementByName("email").sendKeys(email);
        driver.findElementByName("password").sendKeys(pwd);
        driver.findElementByXPath("//button[.='LOGIN']").click();
        driver.quit();
	}

}
