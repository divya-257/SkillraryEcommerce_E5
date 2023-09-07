package Scripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass {
@Test
public void tc1()
{
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	utilies.switchingtabs(driver);
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	utilies.mouseHover(driver,sd.getCoursetab());
	sd.selelinumtrainingtab();
	AddtocartPage d=new AddtocartPage(driver);
	utilies.doubleClick(driver, d.getAddbtn());
	d.addtocart();
	utilies.alertPopup(driver);
	
}
	
}
