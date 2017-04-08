package ChromeTest_Device;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class StartChrome {
	
	//Examples of native apps: Angry Birds, Shazam
	//Examples of web apps: Get-Coupons.com, Marriot,Panera Bread
	//Examples of hybrid apps: Facebook, Linkedin
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities cap = DesiredCapabilities.android();
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		
		cap.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"19");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "my phone");
		
		cap.setCapability(MobileCapabilityType.VERSION, "4.4.2");	
		
		URL url = new URL("http://127.0.0.1:4727/wd/hub");
		
		WebDriver driver = new AndroidDriver(url,cap);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(8000);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("amol_bhaskar@yahoo.com");
		
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).sendKeys("test");
		
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
