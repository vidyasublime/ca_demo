package ca.caProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class LaunchApp {
	
	private String title1="";
	public static WebDriver driver = null;

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Android4\\Downloads\\chromedriver.exe");
				 driver=new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sublimetechnocorp.com/ca_pro_new_new");
	}
 


  }
