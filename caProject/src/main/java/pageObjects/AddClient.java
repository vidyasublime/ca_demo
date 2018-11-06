package pageObjects;

public class AddClient {
	
	private static WebElement element = null;
	 public static WebElement txtbx_client_name(WebDriver driver){
		 
       element = driver.findElement(By.name("client_name"));

       return element;

       }

   public static WebElement txtbx_no_of_emp(WebDriver driver){

       element = driver.findElement(By.name("no_of_emp"));

       return element;

       }

   public static WebElement txtbx_client_number(WebDriver driver){

       element = driver.findElement(By.name("client_number"));

       return element;

       }
   public static WebElement txtbx_client_email(WebDriver driver){

       element = driver.findElement(By.name("client_email"));

       return element;

       }
   public static WebElement txtbx_client_password(WebDriver driver){

       element = driver.findElement(By.name("client_password"));

       return element;

       }
   public static WebElement txtbx_cp_name1(WebDriver driver){

       element = driver.findElement(By.name("cp_name1"));

       return element;

       }
   public static WebElement txtbx_cp_email1(WebDriver driver){

       element = driver.findElement(By.name("cp_email1"));

       return element;

       }
   public static WebElement txtbx_cp_number1(WebDriver driver){

       element = driver.findElement(By.name("cp_number1"));

       return element;

       }
   public static WebElement txtbx_cp_desig1(WebDriver driver){

       element = driver.findElement(By.name("cp_desig1"));

       return element;

       }
   public static WebElement txtbx_cp_name2(WebDriver driver){

       element = driver.findElement(By.name("cp_name2"));

       return element;

       }

   public static WebElement txtbx_cp_email2(WebDriver driver){

       element = driver.findElement(By.name("cp_email2"));

       return element;

       }
   public static WebElement txtbx_cp_number2(WebDriver driver){

       element = driver.findElement(By.name("cp_number2"));

       return element;

       }
   public static WebElement txtbx_cp_desig2(WebDriver driver){

       element = driver.findElement(By.name("cp_desig2"));

       return element;

       }
   public static WebElement txtbx_cp_name3(WebDriver driver){

       element = driver.findElement(By.name("cp_name3"));

       return element;

       }
   public static WebElement txtbx_cp_email3(WebDriver driver){

       element = driver.findElement(By.name("cp_email3"));

       return element;

       }
   public static WebElement txtbx_cp_number3(WebDriver driver){

       element = driver.findElement(By.name("cp_number3"));

       return element;

       }
   public static WebElement txtbx_cp_desig3(WebDriver driver){

       element = driver.findElement(By.name("cp_desig3"));

       return element;

       }
   public static WebElement txtbx_remark(WebDriver driver){

       element = driver.findElement(By.name("remark"));

       return element;

       }

   public static WebElement btn_Submit(WebDriver driver){

       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[9]/button[1]"));
        
       return element;

       }
   public static WebElement btn_ Reset(WebDriver driver){

       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[9]/button[2]"));
        
       return element;

       }
   public static WebElement btn_Close(WebDriver driver){

       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[9]/button[3]"));
        
       return element;

       }



}
