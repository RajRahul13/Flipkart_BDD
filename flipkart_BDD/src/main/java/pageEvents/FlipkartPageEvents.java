package pageEvents;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseTest.baseTest;
import pageObjects.FlipkartPageObjects;
import utils.ElementFetch;

public class FlipkartPageEvents {
	//public static WebDriver driver;
	public static WebDriverWait wait;
	ElementFetch ele = new ElementFetch();

	public void crossBTN() {
		ele.getWebElement("XPATH", FlipkartPageObjects.crossBTN).click();
	}
	public void mobile_BTN() {
		ele.getWebElement("XPATH", FlipkartPageObjects.mobile_BTN).click();
	}
	public void ElectronicBTNhover() {
		WebElement ElectronicBTNhover = ele.getWebElement("XPATH", FlipkartPageObjects.ElectronicBTNhover);
		Actions action = new Actions(baseTest.driver);
		action.moveToElement(ElectronicBTNhover).build().perform();
	}
	public void BrandBTN() {
		ele.getWebElement("XPATH", FlipkartPageObjects.BrandBTN).click();
	}
	public void slider() {
		WebElement slider1 = ele.getWebElement("XPATH", FlipkartPageObjects.slider1);
		WebElement slider2 = ele.getWebElement("XPATH", FlipkartPageObjects.slider2);
		
		wait = new WebDriverWait(baseTest.driver, Duration.ofSeconds(30));
		wait.until((ExpectedConditions.elementToBeClickable(slider1)));
		int xwidth = slider2.getSize().width;
		Actions action = new Actions(baseTest.driver);
		action.dragAndDropBy(slider2,xwidth*3,0).build().perform();
	}
	public void searchBox() throws InterruptedException {
		ele.getWebElement("XPATH", FlipkartPageObjects.searchBox).sendKeys("iphone 13"+Keys.ENTER);
		Thread.sleep(2000);
	}
	public void product() throws InterruptedException {
		Set<String> windowHandles = baseTest.driver.getWindowHandles();
		Thread.sleep(2000);
		ele.getWebElement("XPATH", FlipkartPageObjects.product).click();
		Set<String> updatedWindowHandles = baseTest.driver.getWindowHandles();
		updatedWindowHandles.removeAll(windowHandles);
		for (String window: updatedWindowHandles) {
			//Verify that the product amount should be greater than or equal to0 (Use switchto new window)
			baseTest.driver.switchTo().window(window);
			Thread.sleep(2000);
	}
	}
	public void videoICON() throws InterruptedException {
		WebElement videoICON = ele.getWebElement("XPATH", FlipkartPageObjects.videoICON);
		Actions action = new Actions(baseTest.driver);
		action.moveToElement(videoICON).build().perform();
		Thread.sleep(5000);
	}
	public void pinCodeTXT() throws InterruptedException {
		ele.getWebElement("XPATH", FlipkartPageObjects.pinCodeTXT).sendKeys("110030");
		Thread.sleep(5000);
		ele.getWebElement("XPATH", FlipkartPageObjects.checkBTN).click();
		Thread.sleep(3000);
	}
	public void viewDetailsBTN() throws InterruptedException {
		ele.getWebElement("XPATH", FlipkartPageObjects.viewDetailsBTN).click();
		Thread.sleep(3000);
	}
	public void viewDetailsCloseBTN() throws InterruptedException {
		ele.getWebElement("XPATH", FlipkartPageObjects.viewDetailsCloseBTN).click();
		Thread.sleep(3000);
	}
	public void addToCartBTN() {
		ele.getWebElement("XPATH", FlipkartPageObjects.addToCartBTN).click();
	}
	public void price() {
		String price = ele.getWebElement("XPATH", FlipkartPageObjects.price).getText();
		System.out.println("Final Price :"+ price);
	}
}
