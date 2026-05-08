package Assign;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
	static WebDriver driver;
	public static void main(String[] args) {
ChromeOptions options = new ChromeOptions();
		
		options.setBinary("D:\\software\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\\\software\\\\chromedriver-win64\\\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.get("https://adnabu-store-assignment1.myshopify.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("entering password");
		driver.findElement(By.id("password")).sendKeys("AdNabuQA");
		System.out.println("Click Enter");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebElement searchicon =driver.findElement(By.xpath("//summary[@aria-haspopup='dialog']"));
		System.out.println("Click on Search Icon");
		searchicon.sendKeys("The Collection Snowboard: Liquid");
		System.out.println("Search=The Collection Snowboard: Liquid");
	driver.findElement(By.xpath("//p[@class='predictive-search__item-heading h5']")).click();
	System.out.println("Click on Searched Product");
	driver.findElement(By.id("ProductSubmitButton-template--19850788667482__main")).click();
		System.out.println("Add to Cart");
	


	}

}


