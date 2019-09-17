package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {

public static void getPhoto(WebDriver driver)
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("D://photos/.jpg");
	try {
		FileUtils.copyFile(src, dst);
	} catch (IOException e) {
		
		System.out.println("Failed to take ScreenShot");
	}
}

}
