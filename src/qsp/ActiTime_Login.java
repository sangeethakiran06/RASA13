package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do;jsessionid=b6qa4kodmc7d6");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		webDriver ele=driver.findElement(By.xpath("//div[.='Login ']"));
		ele.click();
		System.out.println("edit by sangeetha");
		
		
 

	}

}
