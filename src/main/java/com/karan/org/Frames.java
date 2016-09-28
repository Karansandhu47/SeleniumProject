package com.karan.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;

 class Frames {


	 
	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking//");
		//System.out.println(driver.getPageSource());
		TargetLocator tl = driver.switchTo();
		tl.frame(1);  //  driver.switchTo().frame(1);
		
		
		driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("1234");

		
	}

}
