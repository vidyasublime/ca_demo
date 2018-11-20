package ca.caProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import pageObjects.Navigation;
import pageObjects.ReadExcel;
import pageObjects.StaffQualification;




public class LaunchApp {
	
	private String title1="";
	public static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Android4\\Downloads\\chromedriver.exe");
				 driver=new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sublimetechnocorp.com/ca_pro_new_new");
		LoginPage.txtbx_UserName(driver).clear();
		LoginPage.txtbx_UserName(driver).sendKeys("superadmin@admin.com");
		LoginPage.txtbx_Password(driver).clear();
		LoginPage.txtbx_Password(driver).sendKeys("12345");
		WebElement element=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div[4]/div/div/div/button"));
		Actions actions = new Actions(driver);

//actions.moveToElement(element).click().perform();                          
//LoginPage.btn_LogIn(driver).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
Thread.sleep(5000);
ReadExcel.setExcelFile(project.data.constants.Constant.Path_TestData+project.data.constants.Constant.File_TestData, project.data.constants.Constant.sheetName);
/*Navigation.lnk_Master(driver).click();

WebElement element1=Navigation.lnk_Staff_Qualification(driver);
actions.moveToElement(element1).click().perform();
 
 //Step 2

WebElement addNew=StaffQualification.AddNew(driver);
executor.executeScript("arguments[0].click();", addNew);
WebElement btnSubmit=StaffQualification.btn_Submit(driver);
executor.executeScript("arguments[0].click();", btnSubmit);
JavascriptExecutor js = (JavascriptExecutor)driver;

WebElement field = StaffQualification.txtbx_qualification_name(driver);
Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
String message = (String)js.executeScript("return arguments[0].validationMessage;", field);
System.out.println(message);
*/

			}
 


  }
