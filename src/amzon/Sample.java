package amzon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));
		
		Actions act=new Actions(driver); 
		
		act.moveToElement(ele).perform();
		
		WebElement casioE = driver.findElement(By.xpath("//a[.='Casio']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(casioE)).click();
		
		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='_3dqZjq']")).click();
		
		Thread.sleep(3000);
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows);
		
		for (String str : windows) {
			driver.switchTo().window(str);
		}
		
		String chTitle = driver.getTitle();
		System.out.println(chTitle);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Remove'])[1]")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//div[.='Missing Cart items?']"));
		
		if(ele1.getText().contains("Missing"))
		{
			System.out.println("cart is empty");
		}
		else
		{
			System.out.println("cart is not empty");
		}
		
		driver.close();
		
	}
	

}
