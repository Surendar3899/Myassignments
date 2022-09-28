package day1.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
		/*ClassRoom:
			Load the url:https://www.snapdeal.com/
			Mousehover on Men's Fashion
			verify the page is loaded
			*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Mens = driver.findElement(By.linkText("Men's Fashion"));
		Actions builder=new Actions(driver);
		builder.moveToElement(Mens).perform();
		Thread.sleep(6000);
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions builder1=new Actions(driver);
		builder1.moveToElement(sign).perform();
		
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		//builder.sc
		
	    
	}

}
