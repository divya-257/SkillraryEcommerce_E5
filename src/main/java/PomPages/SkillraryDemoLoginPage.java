package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
//Declaration
//address of course
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of select dropdown
	@FindBy(name="addresstype")
	private WebElement courseadd;
	
	//initialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getCoursetab() {
		return coursetab;
	}

	public void selelinumtrainingtab() {
		seleniumtraining.click();
		}
			
	public WebElement getCourseadd() {
		return courseadd;
	}
	
	}
