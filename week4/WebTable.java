package day1.week4;
//ClassRoom:
//Steps:
//1. Navigate to https://erail.in/
//2. Clear(.clear) the text in source and enter (sendkeys("ms",keys.tab))"ms" and tab
//3. Clear the text in destination and enter "mdu" and tab
//4. Uncheck sort on date(use .click)
//5. Get all  the train names and verify whether any duplicate train name is there or not
//tips:
//Table Class Name :DataTable TrainList TrainListHeader stickyTrainListHeader

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> Trainlist = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList TrainList')]//tr"));
		//System.out.println(Trainlist.size());
		for(int i=2;i<Trainlist.size();i++) {
			//System.out.println(Trainlist.get(i).getText());
			String name = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList TrainList')]//tr["+i+"]/td[2]")).getText();
			//if(name.contains("MS")) {
				//System.out.println(name);
			List<String> lst=new ArrayList<String>();
			lst.add(name);
			System.out.println(name);
			//System.out.println(name.length());
}
		System.out.println(Trainlist.size());  
		}}
