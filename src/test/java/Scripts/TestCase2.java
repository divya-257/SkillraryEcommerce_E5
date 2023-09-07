package Scripts;

import org.testng.annotations.Test;

import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass {
@Test
public void tc2() throws Throwable {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbutton();
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	utilies.switchingtabs(driver);
	utilies.dropDown(sd.getCourseadd(), pdata.getPropertydata("courseadd"));
	TestingPage tp= new TestingPage(driver);
	utilies.dragdrop(driver,tp.getSeleninumtraining(),tp.getMycart());
	
}
}
