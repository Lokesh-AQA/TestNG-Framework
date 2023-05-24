package access;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import baseClass.Reuse;
import pages.LoginPage;

public class Environment {

	public static WebDriver d;
	public static WebDriverWait wait;
	public static Properties pro;
	public static LoginPage lpg;
	public static Logger log=Logger.getLogger(BaseClass.class.getName());
	public static FileInputStream file;
	public static JavascriptExecutor j;
	public static Reuse rs;

}
