package baseClass;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import access.Environment;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Environment{
	
	
	public BaseClass()
	{
		try
		{
			PropertyConfigurator.configure(System.getProperty("user.dir") + "\\config\\log4j.properties");
			pro = new Properties();
			file = new FileInputStream(System.getProperty("user.dir") + "\\config\\config.properties");
			pro.load(file);
			log.debug("Test Data property file configured!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void LaunchBrowser(String urlValue)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		d = new ChromeDriver(options);
		log.debug("Browser Launched");
		d.manage().window().maximize();
		log.debug("Windows Maximized");
		d.manage().deleteAllCookies();
		d.get(urlValue);
		log.debug("URL launched: "+ urlValue);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//wait = new WebDriverWait(driver,30);	
	}

}
