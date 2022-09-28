package day1.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreollDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement signup  = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
        Actions builder=new Actions(driver);
        builder.scrollToElement(signup).perform();
	}

}
