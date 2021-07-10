package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class AutomationHomeWorkLogIn {
	
	public static void getBaseLogIn(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(BaseConfig.getConfig("URL"));
		driver.manage().window().maximize();
		ScreenShot.getScreenShot(driver, "home page");
		MasterPageFactory obj = new MasterPageFactory(driver);
		HighLighter.addColor(driver, obj.getSigninbtn());
		obj.getSigninbtn().click();
//		WebElement signinbtn = driver.findElement(By.xpath("//*[@class='login']"));
//		signinbtn.click();
		HighLighter.addColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getConfig("email"));
//		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
//		email.sendKeys("sarowerny@gmail.com");
		HighLighter.addColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getConfig("password"));
//		WebElement password = driver.findElement(By.xpath("//*[@name='passwd']"));
//		password.sendKeys("student");
		HighLighter.addColor(driver, obj.getSigninbutton());
		ScreenShot.getScreenShot(driver, "before final click");
		obj.getSigninbutton().click();
		ScreenShot.getScreenShot(driver, "after final click");
//		WebElement signinbutton = driver.findElement(By.xpath("//*[@class='icon-lock left']"));
//		signinbutton.click();
		//driver.quit();
	}



}
