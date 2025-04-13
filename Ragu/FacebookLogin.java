package org.fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/login/web/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("ragu@gmail.com");
//		email.clear();
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);

		driver.findElement(By.name("pass")).sendKeys("1234");

//		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}