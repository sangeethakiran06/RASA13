package amzon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://localhost/login.do");

		Login_page s1=new Login_page(driver);
		
		s1.setUsername("admin");
		
		s1.setPassword("manager");
		
		s1.clickLogin();
		
		System.out.println(driver.getTitle());
	}

}
