package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/web/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("ragu@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("1234");

		driver.findElement(By.name("login")).click();
	}

}
