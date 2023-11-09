package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File dstin=new File("./ScreenShots/img1.png");
			
			FileUtils.copyFile(Sourcefile, dstin);
			
			System.out.println("screenshotistaken");
	}

}
