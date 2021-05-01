package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
	           "D:\\Aparna\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  WebDriver  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.gmail.com/");
	}

}
