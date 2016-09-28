package com.karan.org;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.*;


public class Hotels {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getCurrentUrl());

		SeleniumUtil.findElementAndClick(driver,".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[3]/a");

		SeleniumUtil.findElementAndClick(driver,".//*[@id='from_city_data_box']");
		Hotels hotel = new Hotels();
	    hotel.enterData(driver, ".//*[@id='from_city_data_box']", "Goa");
		
        SeleniumUtil.findElementAndClick(driver, ".//*[@id='dwnApp_save_closeIcon']");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		SeleniumUtil.findElementAndClick(driver,".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[2]/p");
		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='start_date_sec']/span[1]/span[1]");
		SeleniumUtil
				.findElementAndClick(driver,
						".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a");
		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='return_date_sec']/span[1]/span[1]");
		SeleniumUtil
				.findElementAndClick(driver,
						".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[6]/td[2]/a");
		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='nightAnchor']/div/p[2]/span[2]");
		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='nightAnchor']/div/div/ul/li[31]/a");

		WebElement slider = driver.findElement(By
				.xpath(".//*[@id='ex_1_1_Slider']/div[1]/div[2]"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions moveSlider = new Actions(driver);
		moveSlider.dragAndDropBy(slider, 30, 0).build().perform();
		;

		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='dwnApp_save_closeIcon']");

		// Room 1
		int i = 0;
		while (i < 3) {
			SeleniumUtil.findElementAndClick(driver,
					".//*[@id='roomDiv_1']/div/div/div[2]/div/div/a[2]");
			i++;
		}
		// int k = 0;
		// while (k < 3) {
		// SeleniumUtil.findElementAndClick(driver,".//*[@id='roomDiv_1']/div/div/div[4]/div/div/a[2]");
		// k++;
		// }

		SeleniumUtil.findElementAndClick(driver, ".//*[@id='addRoomDiv']/a[2]");

		// Room 2

		int j = 0;
		while (j < 3) {
			SeleniumUtil.findElementAndClick(driver,
					".//*[@id='roomDiv_2']/div/div/div[2]/div/div/a[2]");
			j++;
		}
		// int l = 0;
		// while (l < 3) {
		// SeleniumUtil.findElementAndClick(driver,".//*[@id='roomDiv_2']/div/div/div[4]/div/div/a[2]");
		// l++;
		// }

		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='dwnApp_save_closeIcon']");

		SeleniumUtil.findElementAndClick(driver, ".//*[@id='hotels_submit']");









	}





public void enterData(WebDriver driver, String xpath, String key) {
	driver.findElement(By.xpath(xpath)).sendKeys(key);
}







//Click Method for Hotels Module

	
}





