package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
  WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Login = By.xpath("//span[text()='Login']");
	By username = By.id("loginInput");
	By LoginBtn = By.xpath("//button[text()='Login']");
	
	public void clickLogin() {
		driver.findElement(Login).click();
	}
	
	public void typeUsername() {
		driver.findElement(username).sendKeys("xyz@gmail.com");
	}
	
	//Method to click login button
	public Boolean checkLoginButton() {
		Boolean btn = driver.findElement(LoginBtn).isEnabled();
		return btn;
	}

}
