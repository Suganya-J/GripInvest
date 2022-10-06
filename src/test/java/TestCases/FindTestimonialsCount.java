package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTestimonialsCount {
  @Test
  public void findCountOfTestimonials() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.gripinvest.in");
	  LandingPage lap1 = new LandingPage(driver);
	  lap1.findTestimonials();
	  int ExpectedCount = 20;
      System.out.println("The number of links is " + lap1.links.size());
      
      Assert.assertEquals(ExpectedCount, lap1.links.size());
      driver.quit();
  }
}
