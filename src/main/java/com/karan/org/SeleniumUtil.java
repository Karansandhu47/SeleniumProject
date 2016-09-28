package com.karan.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.karan.dto.Passenger;

public class SeleniumUtil {

	
/*	public static boolean userCreated(){
		//Datbase
		return true;
		
	}*/
	
	
	public static void findElementAndClick(WebDriver driver,String str){
		WebElement elem = driver.findElement(By.xpath(str));
		elem.click();
	}
	public static void fillPaxInformation(Makemytrip makemytrip,WebDriver driver,int numberOfPax,List<Passenger> listOfPax){
		     
		 for (int i = 0; i < numberOfPax; i++) {
			//FULL NAME
			makemytrip.PassengerDetails(driver,".//*[@id='travellerId"+i+ "']/div[1]/div/input[1]" ,listOfPax.get(i).getFirstName()+"" );
			makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[1]/div/input[2]", listOfPax.get(i).getLastName()+"");
			
			//NATIONALITY
			SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[2]/div/select");
			Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='travellerId"+i+"']/div[3]/div[2]/div/select")));
	         //dropdown.selectByIndex(1);
	         dropdown.selectByVisibleText(listOfPax.get(i).getNationality());
	         
	         //DATE OF BIRTH
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[3]/div/input[1]");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[3]/div/input[1]",listOfPax.get(i).getBirthdate() );
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[3]/div/input[2]");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[3]/div/input[2]", listOfPax.get(i).getBirthMonth());
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[3]/div/input[3]");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[3]/div[3]/div/input[3]",listOfPax.get(i).getBirthYear());
	         
	         //PASSPORT NUMBER
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[1]/div/input");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[1]/div/input",listOfPax.get(i).getPassportNum());
	         
	         //ISSUING COUNTRY
	         Select dropdown2 = new Select(driver.findElement(By.xpath(".//*[@id='travellerId"+i+"']/div[5]/div[2]/div/div/select")));
	         dropdown2.selectByVisibleText(listOfPax.get(i).getPassportPlaceOfIssue());
	         
	        // DATE OF Expiry
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[3]/div/input[1]");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[3]/div/input[1]", listOfPax.get(i).getPassportExpiryDate());
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[3]/div/input[2]");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[3]/div/input[2]", listOfPax.get(i).getPassportExpiryMonth());
	         SeleniumUtil.findElementAndClick(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[3]/div/input[3]");
	         makemytrip.PassengerDetails(driver, ".//*[@id='travellerId"+i+"']/div[5]/div[3]/div/input[3]", listOfPax.get(i).getPassportExpiryYear());
		}
	}
	}
	
	
	
//	SeleniumUtil s = new SeleniumUtil();
//	s.find

