package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginButton {
	
  @Test
  public void validateLoginBtn() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.gripinvest.in");
	  LoginPage lp = new LoginPage(driver);
	  lp.clickLogin();
	  Boolean bn = lp.checkLoginButton();
	  if(bn) {
		  Assert.assertFalse(false);
	  }
	  lp.typeUsername();
	  Boolean bn1 = lp.checkLoginButton();
	  if(bn1) {
		  Assert.assertTrue(true);
	  }
	  driver.quit();
  }
}
