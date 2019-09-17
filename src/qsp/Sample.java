package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException,
			AWTException {
		System.setProperty("webdriver.chrome.driver",
				"./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

		WebElement src = driver.findElement(By.xpath("//h1[.='Block 1']"));

		WebElement dst = driver.findElement(By.xpath("//h1[.='Block 3']"));

		Actions act = new Actions(driver);
		Thread.sleep(3000);

		act.dragAndDrop(src, dst).perform();
	}

}
