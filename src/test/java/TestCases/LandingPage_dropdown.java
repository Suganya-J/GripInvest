package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage_dropdown {
  @Test
  public void validateDropdown() {
	  try {
          
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions(); 
	  options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	  WebDriver driver = new ChromeDriver(options); 
	  LandingPage lap = new LandingPage(driver);
	  driver.manage().window().maximize();
	  driver.get("https://www.gripinvest.in");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	  
	  //lap.checkIframe();
	  lap.hoverToLearn();	   
	  List actualDropdown = new ArrayList();
	  
	  for(WebElement myitem : lap.items) {
		  actualDropdown.add(myitem.getText());
		  System.out.println(actualDropdown);
		  
	  }
	  List expectedDropdown = new ArrayList();
	  expectedDropdown.add("Products");
	  expectedDropdown.add("About Us");
	  expectedDropdown.add("FAQ");
	  expectedDropdown.add("Transparency");
	  expectedDropdown.add("Blogs");
	  
	  for(int i=0; i<=actualDropdown.size()-1; i++) {
 
		  Assert.assertTrue(actualDropdown.get(i).equals(expectedDropdown.get(i)));
		  
	  }
	  driver.quit();
	  }
	  catch (Exception e) {
		  throw new ExceptionInInitializerError(e);
      }
	  
  }
  
}
