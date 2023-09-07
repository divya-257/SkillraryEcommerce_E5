package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
//Declaration
	//address of Selenium webelement
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleninumtraining;
	
	//address of My cart
	@FindBy(id="mycart")
	private WebElement mycart;
	
	//address of facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
//Initialization
	public TestingPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
//Utilization

	public WebElement getSeleninumtraining() {
		return seleninumtraining;
	}

	public WebElement getMycart() {
		return mycart;
	}

	public void facebookicon() {
		facebook.click();
	}
	
	
}
