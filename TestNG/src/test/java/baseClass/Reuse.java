package baseClass;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Reuse extends BaseClass{
	
	static JavascriptExecutor j = (JavascriptExecutor)d;

	public void elemVisibi(WebElement ele1)
	{
		j.executeScript("return document.readyState").toString().equals("complete");
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
	}
	
	public void enterData(WebElement ele1, String val)
	{
		j.executeScript("return document.readyState").toString().equals("complete");
		wait.until(ExpectedConditions.visibilityOf(ele1));
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
		ele1.sendKeys(val);
	}
	
	public void dropSelect(String ele, Cell Value)
	{
		List<WebElement> elems = d.findElements(By.xpath(ele));
		
		for (WebElement elemGivenInEclipse : elems)
		{
			if (elemGivenInEclipse.getText().equals(Value.toString()))
			{
				elemGivenInEclipse.click();
				System.out.println(elemGivenInEclipse);
				break;
			}
		}
	}
	
	public void elemCheck(WebElement el1, String msg)
	{
		elemVisibi(el1);
		
		if (el1.isDisplayed())
		{
			System.out.println(msg);
		}
	}
	
}
