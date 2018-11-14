package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
	
	private static WebElement element = null;
	 public static WebElement txtbx_dashboard(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[1]/a"));
	        
	       return element;

}
 public static WebElement lnk_Assign_task(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[2]/a"));
	        
	       return element;


	       }
 public static WebElement lnk_Master(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[3]/a"));
	
       return element;


       }
public static WebElement lnk_Client(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/h2/a"));
                                        	
       return element;


       }
public static WebElement lnk_Client_Status(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/h2/a"));
       
      return element;


      }
public static WebElement lnk_Client_Industry(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div[2]/h2/a"));
      
     return element;


     }
public static WebElement lnk_Staff(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[3]/div[1]/div/div[2]/h2/a"));
     
    return element;


    }
public static WebElement lnk_Staff_Qualification (WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div[2]/h2/a"));
    
   return element;


   }
public static WebElement txtbx_Staff_Designation(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[3]/div[3]/div/div[2]/h2/a"));
   
  return element;


  }
public static WebElement txtbx_Service(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[4]/div[1]/div/div[2]/h2/a"));
  
 return element;


 }
public static WebElement txtbx_Activity(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[4]/div[2]/div/div[2]/h2/a"));
 
return element;


}
public static WebElement txtbx_File_Name_Master (WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[4]/div[3]/div/div[2]/h2/a"));

return element;


}

 public static WebElement txtbx_Staff_Chat(WebDriver driver){
	 
	 element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[4]/a"));
        
       return element;


       }
 
 
}