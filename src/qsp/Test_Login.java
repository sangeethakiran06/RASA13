package qsp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Login extends Generic{
	 
	@Test
	public void testLogin()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	//Assert.assertEquals(title,"actiTIME - Enter Time-Track");
		
		
		
		
	
	SoftAssert sa=new SoftAssert();
	
	sa.assertEquals(title,"actiTIME - Enter Time-Track");
	
		System.out.println("1");	
		
		sa.assertAll();
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
	
	
	
	}


