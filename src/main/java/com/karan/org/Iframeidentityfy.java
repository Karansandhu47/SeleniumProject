package com.karan.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframeidentityfy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		Iframeidentityfy ifr = new Iframeidentityfy();
		ifr.switchToFrame(driver);
		
	}
	
	public  void switchToFrame(WebDriver d) {
		d.get("https://fantasycricket.dream11.com/in/");
		System.out.println(d.getPageSource());
	}

}
