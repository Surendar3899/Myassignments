package day2.week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	/*Alerts 
-------
1. Load https://www.irctc.co.in/
2. Click on OK button in the dialog  
3. Click on FLIGHTS link            
4. Get the Title of the page
*/
	public static void main(String[] args){
	WebDriverManager.chromedriver().setup();
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("-disable-notifications");
    ChromeDriver driver=new ChromeDriver(ch);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.irctc.co.in/nget/train-search");
    
    //driver.findElement(By.xpath("//h3[contains(text(),'IRCTC Next Generation eTicketing System')]")).click();
    
    //Alert alert = driver.switchTo().alert();
    //String text = alert.getText();
    //System.out.println(text);
    //alert.accept();
    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
   driver.findElement(By.partialLinkText("FLIGHT")).click();
   System.out.println(driver.getTitle());
   
   
    
    
    
    
    
    
}}
