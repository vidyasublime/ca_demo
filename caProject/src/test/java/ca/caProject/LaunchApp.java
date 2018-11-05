package ca.caProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ca.caProject.Constants;
import pageObjects.LoginPage;

public class LaunchApp {
	public static WebDriver driver = null;
	private String title1="";
  @Test(priority=0,description="Login Page")
  public void Login() throws Exception {
	
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Android4\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.get(Constant.URL);




  }}
