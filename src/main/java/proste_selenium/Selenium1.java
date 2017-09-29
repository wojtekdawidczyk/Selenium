package proste_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Tools/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.alx.pl");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}
}
