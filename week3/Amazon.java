package day2.week3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Amazon {
	//Classroom Assignment : (List)
	//1) Go to https://amazon.in
	//2) Type phones
	//3) Print price of every phone
	//4) Print the lowest price !
	//Hints: 
	//Look what is common locator for all price info of every phone. 
	//Use Collection sort to get the lowest price
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://amazon.in");
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		List<WebElement> lst = obj.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i=0;i<lst.size();i++)
			System.out.println(lst.get(i).getText());
		}
	
}