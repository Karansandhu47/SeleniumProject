package com.karan.org;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.karan.dto.Passenger;

public class Makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
			 SeleniumUtil.findElementAndClick(driver,".//*[@id='widget_row']/div[1]/div[1]/div[2]/ul/li[2]/a/span[2]");
		
		/*Boolean returnedValu =SeleniumUtil.userCreated();
		if(returnedValu){
			System
		}else{
			
		}*/
		
		
		SeleniumUtil.findElementAndClick(driver,".//*[@id='one_way_button1']/span");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='round_trip_button1']/span");
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='from_typeahead1']");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='one_round_default']/div/div[1]/div/div[1]/span/span/div[1]/span/div[7]/p");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='to_typeahead1']");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='one_round_default']/div/div[3]/div/div[1]/span/span/div[1]/span/div[5]/p");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='start_date_sec']/span[3]");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[4]/a");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='return_date_sec']/span[3]");
		SeleniumUtil.findElementAndClick(driver,".//*[@id='ui-datepicker-div']/div[3]/table/tbody/tr[5]/td[5]/a");
		SeleniumUtil.findElementAndClick(driver, ".//*[@id='class_selector']");
		

		Makemytrip makemytrip = new Makemytrip();
		makemytrip.fillingPassengerInfo(driver);

		SeleniumUtil.findElementAndClick(driver, ".//*[@id='flights_submit']");

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SeleniumUtil
				.findElementAndClick(
						driver,
						".//*[@id='content']/div[1]/div[3]/div[3]/div/div[5]/div/div[1]/div/div[1]/div[2]/div/div[3]/div[4]/p/a");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		makemytrip.enterPassengerEmail(driver,
				".//*[@id='inputEmailIdForLoggin']",
				"er.karansandhu47@gmail.com");

		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='content']/div[5]/div/div[1]/div[9]/div[1]/a");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Passenger> list = new ArrayList<Passenger>();

		// First Pax-- index 0
		Passenger passOne = new Passenger();
		passOne.setFirstName("Karan");
		passOne.setLastName("Singh");
		passOne.setNationality("India");
		passOne.setBirthdate("24");
		passOne.setBirthMonth("11");
		passOne.setBirthYear("1989");
		passOne.setPassportNum("J804032");
		passOne.setPassportPlaceOfIssue("India");
		passOne.setPassportExpiryDate("20");
		passOne.setPassportExpiryMonth("11");
		passOne.setPassportExpiryYear("2018");

		// Secound Pax---index 1
		Passenger passTwo = new Passenger();
		passTwo.setFirstName("Gunny");
		passTwo.setLastName("Vohra");
		passTwo.setNationality("India");
		passTwo.setBirthdate("24");
		passTwo.setBirthMonth("11");
		passTwo.setBirthYear("1991");
		passTwo.setPassportNum("J805032");
		passTwo.setPassportPlaceOfIssue("India");
		passTwo.setPassportExpiryDate("22");
		passTwo.setPassportExpiryMonth("10");
		passTwo.setPassportExpiryYear("2019");

		// Third Pax---2
		Passenger passThird = new Passenger();
		passThird.setFirstName("Bunny");
		passThird.setLastName("Vohra");
		passThird.setNationality("India");
		passThird.setBirthdate("31");
		passThird.setBirthMonth("10");
		passThird.setBirthYear("1981");
		passThird.setPassportNum("Ht05032");
		passThird.setPassportPlaceOfIssue("India");
		passThird.setPassportExpiryDate("12");
		passThird.setPassportExpiryMonth("10");
		passThird.setPassportExpiryYear("2017");

		// Fourth Pax---3
		Passenger passFourth = new Passenger();
		passFourth.setFirstName("Shinda");
		passFourth.setLastName("Dhanoa");
		passFourth.setNationality("India");
		passFourth.setBirthdate("31");
		passFourth.setBirthMonth("10");
		passFourth.setBirthYear("2006");
		passFourth.setPassportNum("F05032");
		passFourth.setPassportPlaceOfIssue("India");
		passFourth.setPassportExpiryDate("12");
		passFourth.setPassportExpiryMonth("12");
		passFourth.setPassportExpiryYear("2027");

		// Fifth Pax---4
		Passenger passFifth = new Passenger();
		passFifth.setFirstName("Sunny");
		passFifth.setLastName("Dhillon");
		passFifth.setNationality("India");
		passFifth.setBirthdate("02");
		passFifth.setBirthMonth("10");
		passFifth.setBirthYear("2009");
		passFifth.setPassportNum("F05032");
		passFifth.setPassportPlaceOfIssue("India");
		passFifth.setPassportExpiryDate("18");
		passFifth.setPassportExpiryMonth("10");
		passFifth.setPassportExpiryYear("2022");

		list.add(passOne);
		list.add(passTwo);
		list.add(passThird);
		list.add(passFourth);
		list.add(passFifth);
		SeleniumUtil.fillPaxInformation(makemytrip, driver, list.size(), list);
		// SeleniumUtil.fillPaxInformation(makemytrip, driver,2);

		// Contact Information
		SeleniumUtil
				.findElementAndClick(driver,
						".//*[@id='travellerContactDiv']/div/div/div[1]/div/div[2]/input[1]");
		makemytrip
				.PassengerDetails(
						driver,
						".//*[@id='travellerContactDiv']/div/div/div[1]/div/div[2]/input[1]",
						"4389390813");

		// Make Secure Payment
		SeleniumUtil.findElementAndClick(driver,
				".//*[@id='content']/div/div[4]/p[2]/button");

	}

	public void fillingPassengerInfo(WebDriver driver) {
		int i = 0;
		while (i < 2) {
			SeleniumUtil.findElementAndClick(driver,
					".//*[@id='adult_count']/a[2]");
			i++;
		}
		int j = 0;
		while (j < 2) {
			SeleniumUtil.findElementAndClick(driver,
					".//*[@id='child_count']/a[2]");
			j++;
		}

	}

	public void enterPassengerEmail(WebDriver driver, String xpath, String key) {
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}

	public void PassengerDetails(WebDriver driver, String xpath, String key) {
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}

}
