package day1.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment1 {
		/*
		 * Week4 day1
//🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓🍓
//Assignment1:
//============
//1. Launch the URL https://www.chittorgarh.com/
//2. Click on stock market
//3. Click on NSE bulk Deals
//4. Get all the Security names
//5. Ensure whether there are duplicate Security names
		 */
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.chittorgarh.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();
	driver.findElement(By.linkText("NSE Bulk Deals")).click();
	List<WebElement> table = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr/td[3]"));
	List<String> lst=new ArrayList<String>();
	for(int i=1;i<table.size();i++) {
		String text = driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]//tr["+i+"]//td[3]")).getText();
		lst.add(text);
		
	}
	System.out.println(lst);
	System.out.println(lst.size());
Set<String>set=new LinkedHashSet<String>(lst);
System.out.println(set.size());
System.out.println(lst);
}}

	
	
	
	/*WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//1. Launch the URL 
	driver.get("https://www.chittorgarh.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   //2. Click on stock market//
	driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();
		//3. Click on NSE bulk Deals//
	driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		//4. Get all the Security names//
	List<WebElement> Securitynames = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr"));	
	List<String>lst=new ArrayList<String>();
	for (int i = 1; i < Securitynames.size(); i++) {
		String names = driver.findElement(By.xpath("//table[contains(@class,'table table-bordered table')]//tr["+i+"]/td[3]")).getText();
		lst.add(names);
		
	}
	System.out.println(lst);
	//5. Ensure whether there are duplicate Security names
   System.out.println(lst.size());
   Set<String>security=new LinkedHashSet<String>(lst);
   System.out.println(security.size());
   System.out.println(security);
   if(lst.size()==security.size()) {
	   System.out.println("No Duplicate present");
   }
   else {
	   System.out.println("Duplicate present");
   }
}

}*/
