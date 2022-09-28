package day1.week4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment2 {
	/*Assignment2:
		============
		1. Launch the URL https://html.com/tags/table/
		2. Get the count of number of rows
		3. Get the count of number of columns*/
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

}}
