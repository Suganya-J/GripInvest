package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
	  WebDriver driver;
		
		//Constructor that will be automatically called as soon as the object of the class is created
		public LandingPage(WebDriver driver) {
			this.driver=driver;
		}
		
		//Locator for login button
		//span[text()='Login']
		By learnButton = By.xpath("//a[text()='Learn']");
		By Dropdown = By.xpath("//ul[@class='Nav_desktop_sub_menu_items_list__zvHM1']/li/a");
		By CloseButton = By.xpath("//button[@id='close-icon']");
		By Testimonials = By.xpath("//div[@class='Testimonials_TestimonialCard__baLiy']");
		public List<WebElement> items;
		public List<WebElement> links;
		
		public void checkIframe() {
			int size = driver.findElements(By.tagName("iframe")).size();
			if(size>0) {
				driver.switchTo().frame("moe-onsite-campaign-633bfb8d56306eb99f2971b4");
				driver.findElement(CloseButton).click();
			}
			else{
				System.out.println("NO IFRAMES");
			}
		}
		public void hoverToLearn() {
			WebElement element = driver.findElement(learnButton);
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			items= driver.findElements(Dropdown);
		}
        
		public void findTestimonials() {
			links = driver.findElements(Testimonials);
			
		}
}
