package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.findElement(By.xpath("//a[@href='cricket-series/6582/india-tour-of-west-indies-2023/matches']")).click();
		
		//input[@name='username']
		//input[@name='password']
		
		
		


	}
}
