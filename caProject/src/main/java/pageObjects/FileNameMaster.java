package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileNameMaster {


	private static WebElement element = null;
	 public static WebElement txtbx_file_name_master_name(WebDriver driver){
		 
        element = driver.findElement(By.name("file_name_master_name"));

        return element;

        }

    public static WebElement btn_Submit(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[2]/button[1]"));
         
        return element;

        }
    public static WebElement btn_ Reset (WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[2]/button[2]"));
         
        return element;

        }
    public static WebElement btn_Close(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[2]/button[3]"));
         
        return element;

        }
	
}
