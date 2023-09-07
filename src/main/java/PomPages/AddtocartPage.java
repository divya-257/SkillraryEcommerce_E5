package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	//Declaration
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	
	
	//initialization
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Utilization
	
	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtocart()
	{
		cartbtn.click();
	}
	}
