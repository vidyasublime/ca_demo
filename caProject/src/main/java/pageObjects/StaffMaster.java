package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaffMaster {

	private static WebElement element = null;
	 public static WebElement txtbx_UserName(WebDriver driver){
		 
        element = driver.findElement(By.name("user_fname"));

        return element;

        }

    public static WebElement txtbx_UserMName(WebDriver driver){

        element = driver.findElement(By.name("user_mname"));

        return element;

        }
    public static WebElement txtbx_user_lname(WebDriver driver){

        element = driver.findElement(By.name("user_lname"));

        return element;

        }
    public static WebElement txtbx_email(WebDriver driver){

        element = driver.findElement(By.name("email"));

        return element;

        }
    public static WebElement txtbx_password(WebDriver driver){

        element = driver.findElement(By.name("password"));

        return element;

        }

    public static WebElement txtbx_qualification_id(WebDriver driver){

        element = driver.findElement(By.name("qualification_id[]"));

        return element;

        }
    public static WebElement txtbx_qualification_id(WebDriver driver){

        element = driver.findElement(By.name("qualification_id[]"));

        return element;

        }
    public static WebElement txtbx_mobile_no(WebDriver driver){

        element = driver.findElement(By.name("mobile_no"));

        return element;

        }
    public static WebElement txtbx_mobile_no_2(WebDriver driver){

        element = driver.findElement(By.name("mobile_no_2"));

        return element;

        }
    public static WebElement txtbx_login_role(WebDriver driver){

        element = driver.findElement(By.name("login_role"));

        return element;

        }
    public static WebElement txtbx_user_desg(WebDriver driver){

        element = driver.findElement(By.name("user_desg"));

        return element;

        }
    public static WebElement txtbx_user_gender(WebDriver driver){

        element = driver.findElement(By.id("user_gender_yes"));

        return element;

        }
    public static WebElement txtbx_user_gender(WebDriver driver){

        element = driver.findElement(By.id("user_gender_no"));

        return element;

        }
    public static WebElement txtbx_user_gender(WebDriver driver){

        element = driver.findElement(By.id("user_gender_no"));

        return element;

        }

    public static WebElement txtbx_work_hrs(WebDriver driver){

        element = driver.findElement(By.name("work_hrs"));

        return element;

        }
    public static WebElement txtbx_user_birth_dt(WebDriver driver){

        element = driver.findElement(By.name("user_birth_dt"));

        return element;

        }
    public static WebElement txtbx_user_user_join_dt(WebDriver driver){

        element = driver.findElement(By.name("user_join_dt"));

        return element;

        }
    public static WebElement txtbx_user_address(WebDriver driver){

        element = driver.findElement(By.name("user_address"));

        return element;

        }
    public static WebElement txtbx_pincode(WebDriver driver){

        element = driver.findElement(By.name("pincode"));

        return element;

        }
    public static WebElement txtbx_pan_no(WebDriver driver){

        element = driver.findElement(By.name("pan_no"));

        return element;

        }
    public static WebElement txtbx_pan_pic(WebDriver driver){

        element = driver.findElement(By.name("pan_pic"));

        return element;

        }
    public static WebElement txtbx_aadhar_no(WebDriver driver){

        element = driver.findElement(By.name("aadhar_no"));

        return element;

        }
    public static WebElement txtbx_aadhar_f_pic(WebDriver driver){

        element = driver.findElement(By.name("aadhar_f_pic"));

        return element;

        }
    public static WebElement txtbx_aadhar_b_pic(WebDriver driver){

        element = driver.findElement(By.name("aadhar_b_pic"));

        return element;

        }
    public static WebElement txtbx_bank_name(WebDriver driver){

        element = driver.findElement(By.name("bank_name"));

        return element;

        }
    public static WebElement txtbx_branch_name(WebDriver driver){

        element = driver.findElement(By.name("branch_name"));

        return element;

        }
    public static WebElement txtbx_ac_no(WebDriver driver){

        element = driver.findElement(By.name("ac_no"));

        return element;

        }
    public static WebElement txtbx_ifsc_code(WebDriver driver){

        element = driver.findElement(By.name("ifsc_code"));

        return element;

        }

    public static WebElement btn_Submit(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[15]/button[1]"));
         
        return element;

        }
    public static WebElement btn_ Reset (WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[15]/button[2]"));
         
        return element;

        }
    public static WebElement btn_Close (WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[15]/button[3]"));
         
        return element;

        }

	
}
