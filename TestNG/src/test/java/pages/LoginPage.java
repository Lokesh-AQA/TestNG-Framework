package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import baseClass.Reuse;

public class LoginPage extends BaseClass
{
	
	@FindBy(xpath = " //*[@name='username']")
	public static WebElement userName;
	
	@FindBy(xpath = "//*[@name='password']")
	public static WebElement passWord;
	
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public static WebElement loginBtn;
	
	@FindBy(xpath = "//p[contains(text(), 'or Spot')]")
	public static WebElement createNewAcc;
	
	@FindBy(xpath="//span[contains(text(), 't user')]")
	public static WebElement invldLoginMsg;
	
	
	public LoginPage()        //Constructor
	{
		PageFactory.initElements(d, this);
		log.debug("Locators loaded with PageFactory");
	}
	
	public static void LoginUser(String uname, String pwd)
	{
		rs = new Reuse();
		
		rs.elemVisibi(userName);
		userName.sendKeys(uname);
		
		rs.elemVisibi(passWord);
		passWord.sendKeys(pwd);
		
		rs.elemVisibi(loginBtn);
		loginBtn.click();
	}
	
	
}
