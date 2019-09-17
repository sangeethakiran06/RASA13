package amzon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//declaration
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(name="pwd")
	private WebElement pword;
	
	//initialization
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setUsername(String username)
	{
		uname.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		login.click();
	}

	}

