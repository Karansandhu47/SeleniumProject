package com.karan.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flighthomepage {
	
	
	private static By InternationalTab=By.xpath(".//*[@id='widget_row']/div[1]/div/div[3]/div/div[2]/div[2]/a");
	private static By RoundTrip=By.xpath(".//*[@id='round_trip_button1']/span");
	private static By TravelFrom=By.xpath(".//*[@id='from_typeahead1']");
	private static By TravelTo=By.id("to_typeahead1");
	private static By DepartureDate=By.xpath(".//*[@id='start_date_sec']");
	private static By ReturnDate=By.xpath(".//*[@id='return_date_sec']");
	private static By Submit=By.xpath(".//*[@id='flights_submit']");
	
	private WebDriver driver;
	
	public Flighthomepage(WebDriver driver){
		 driver=driver;
		 driver.get("https://www.makemytrip.com/");
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
