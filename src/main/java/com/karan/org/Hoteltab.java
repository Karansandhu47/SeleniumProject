package com.karan.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hoteltab {
	
	static WebDriver driver;
	
	
	//CONSTRUCTOR
	public Hoteltab() {
		this.driver=new FirefoxDriver();
	}
	
	public static void main(String[] args) {
		Hoteltab h = new Hoteltab(); // Object
		
		driver.get("https://www.makemytrip.com/");
		
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[3]/a");
		
		//Select City
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='from_city_data_box']");
		
		Hoteltab hotelnew= new Hoteltab();
		hotelnew.EnterData(driver, ".//*[@id='from_city_data_box']", "Ker");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[2]/p");
		
		//Select Check-In Dates
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='start_date_sec']/span[1]/span[1]");
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[5]/a");
		
		
	    //Select Check-out Dates
		SeleniumUtil.findElementAndClick(driver,".//*[@id='return_date_sec']/span[1]/span[1]");
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a");
		
		
	}
	
	public void EnterData(WebDriver driver,String xpath,String key){
		driver.findElement(By.xpath(xpath)).sendKeys(key);
		
	}

}
