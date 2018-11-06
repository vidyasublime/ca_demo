package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddServices {

	private static WebElement element = null;
	 public static WebElement txtbx_service_name(WebDriver driver){
		 
        element = driver.findElement(By.name("service_name"));

        return element;

        }

    public static WebElement txtbx_service_short_name(WebDriver driver){

        element = driver.findElement(By.name("service_short_name"));

        return element;

        }
    public static WebElement txtbx_estimated_hrs(WebDriver driver){

        element = driver.findElement(By.name("estimated_hrs"));

        return element;

        }
    public static WebElement txtbx_charges(WebDriver driver){

        element = driver.findElement(By.name("charges"));

        return element;

        }
    public static WebElement txtbx_qualification_id[](WebDriver driver){

        element = driver.findElement(By.name("qualification_id[]"));

        return element;

        }
    public static WebElement txtbx_desp(WebDriver driver){

        element = driver.findElement(By.name("desp"));

        return element;

        }
    public static WebElement txtbx_notification_day_before(WebDriver driver){

        element = driver.findElement(By.name("notification_day_before"));

        return element;

        }
    public static WebElement txtbx_notification_frequency(WebDriver driver){

        element = driver.findElement(By.name("notification_frequency"));

        return element;

        }
    public static WebElement txtbx_service_period_type(WebDriver driver){

        element = driver.findElement(By.name("service_period_type"));

        return element;

        }

    public static WebElement btn_Submit(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[11]/button[1]"));
         
        return element;

        }
    public static WebElement btn_ Reset (WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[11]/button[2]"));
         
        return element;

        }
    public static WebElement btn_ Close(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[11]/button[3]"));
         
        return element;

        }

	

}
