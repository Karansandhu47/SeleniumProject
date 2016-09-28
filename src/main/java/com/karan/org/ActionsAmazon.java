package com.karan.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.in/");
		
		
		// IF you want to use mouse action for automation then we use Action class
		
		
		Actions abc=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		
		abc.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("GAMES");
		WebElement y=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		
		abc.contextClick(y).build().perform();
		
		
		
	}

}
