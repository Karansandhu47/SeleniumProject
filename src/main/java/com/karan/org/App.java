package com.karan.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub
    			//System.setProperty("webdriver.ie.driver", "G:\\Selenium\\InternetExplorerDriver\\IEDriverServer.exe");
    			WebDriver driver=new FirefoxDriver();
    			driver.get("https://www.facebook.com/");
    			
    			
    			/*System.out.println(driver.getTitle());
    			System.out.println(driver.getTitle());
    			System.out.println(driver.getPageSource());*/
    			
    			driver.findElement(By.xpath(".//*[@name='email']")).sendKeys("sandhu_rocks24@yahoo.co.in");
    			driver.findElement(By.xpath(".//*[@name='pass']")).sendKeys("-Welcome123");
    			driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
    }
}
