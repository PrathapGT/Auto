package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2 {

	public static void main(String[] args) {

		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());

	}

}
