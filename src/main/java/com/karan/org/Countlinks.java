package com.karan.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com");
		
		//To count no. of links in website
		
		System.out.println("Total no. of links ");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//To count no. of links in footer section
		
		WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
			System.out.println("Total no. of links in footer section");
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement subfooter=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(subfooter.findElements(By.tagName("a")).size());
		for (int i=0;i<subfooter.findElements(By.tagName("a")).size();i++)
		{
		//System.out.println(subfooter.findElements(By.tagName("a")).get(i).getText());
		if (subfooter.findElements(By.tagName("a")).get(i).getText().contains("Site map"));
		subfooter.findElements(By.tagName("a")).get(i).click();
		}
		
				
	}

}
