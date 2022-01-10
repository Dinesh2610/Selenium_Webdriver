package com.adm.alaigal;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//businessdetail
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");//chromedriver path
		WebDriver driver=new ChromeDriver();	

		driver.get("https://myvideoscript.com/aligal/index.php/user/signin");

		driver.manage().window().maximize();
		Actions action=new Actions(driver);

		WebElement advanced=driver.findElement(By.id("details-button"));
		advanced.click();

		WebElement proceed=driver.findElement(By.id("proceed-link"));
		proceed.click();

		//Member login
		WebElement memberlogin=driver.findElement(By.xpath("//input[@id='login-email']"));
		memberlogin.sendKeys("dineshkumarbe27@gmail.com");

		WebElement memberpassword=driver.findElement(By.xpath("//input[@id='login-password']"));
		memberpassword.sendKeys("mafkei",Keys.ENTER);
		
		WebElement memberprofile1=driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a/span"));
		memberprofile1.click();
		
		WebElement Businessdet = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[2]/a/span"));
		Businessdet.click();
		WebElement businespic = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[2]/a/span"));
		businespic.click();
		WebElement businespic = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[2]/a/span"));
		businespic.click();
	}

}
