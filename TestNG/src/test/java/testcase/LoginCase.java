package testcase;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import baseClass.Reuse;
import pages.LoginPage;

public class LoginCase extends BaseClass
{
	//LoginPage lpg = new LoginPage();   //Global Declaration
	
	public LoginCase()                  //Constructor
	{
		super();                        //Properties File---> Input Data Ready
	}
	
	@BeforeTest
	public void setup()
	{
		LaunchBrowser(pro.getProperty("url"));              // Launch Browser Ready
		lpg = new LoginPage();            			                 // Xpath Ready
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void invallidLogin()
	{
		rs = new Reuse();
		lpg.LoginUser(pro.getProperty("username"), pro.getProperty("password"));
		//rs.elemCheck(lpg.invldLoginMsg, "Incorrect username or password.");
		lpg.loginBtn.click();
	}
	
	//@AfterTest
	//public void teardown()
	//{
		//driver.quit();
	//}
		
}