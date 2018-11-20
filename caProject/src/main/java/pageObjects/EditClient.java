package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditClient {
	private static WebElement element = null;
	 public static WebElement txtbx_client_name(WebDriver driver){
		 
      element = driver.findElement(By.id("client_name"));

      return element;

      }
	public static WebElement client_name(WebDriver driver) {
		element =driver.findElement(By.id("edit_client_name"));
		return element;
}
	public static WebElement no_of_emp(WebDriver driver) {
		element =driver.findElement(By.id("edit_no_of_emp"));
		return element;
}
	public static WebElement client_email(WebDriver driver) {
		element =driver.findElement(By.id("edit_client_email"));
		return element;
}
	public static WebElement client_number(WebDriver driver) {
		element =driver.findElement(By.id("edit_client_number"));
		return element;
}
	public static WebElement cp_name1(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_name1"));
		return element;
}
	public static WebElement cp_email(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_email1"));
		return element;
}
	public static WebElement cp_number1(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_number1"));
		return element;
}
	public static WebElement cp_design1(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_desig1"));
		return element;
}
	public static WebElement cp_name2(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_name2"));
		return element;
}
	public static WebElement cp_email2(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_email2"));
		return element;
}
	public static WebElement cp_number2(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_number2"));
		return element;
}
	public static WebElement cp_design2(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_desig2"));
		return element;
}
	public static WebElement cp_name3(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_name3"));
		return element;
}
	public static WebElement cp_email3(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_email3"));
		return element;
}
	public static WebElement cp_number3(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_number3"));
		return element;
}
	public static WebElement cp_desig3(WebDriver driver) {
		element =driver.findElement(By.id("edit_cp_desig3"));
		return element;
}
	public static WebElement remark(WebDriver driver) {
		element =driver.findElement(By.id("edit_remark"));
		return element;
}
	public static WebElement btnsubmit(WebDriver driver){

	       element = driver.findElement(By.xpath("//*[@id=\"edit_price_type_form\"]/div[8]/button[1]"));
	        
	       return element;

	       }
	public static WebElement btnclose(WebDriver driver){

	       element = driver.findElement(By.xpath("//*[@id=\"edit_price_type_form\"]/div[8]/button[2]"));
	        
	       return element;

	       }
	}
