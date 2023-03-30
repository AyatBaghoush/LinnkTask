package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="name-لايت")
	WebElement lightPackage; 
	
	@FindBy(xpath="//*[@id=\"currency-لايت\"]/b")
	WebElement lightPackagePrice; 
	
	@FindBy(xpath="//*[@id=\"currency-لايت\"]/i")
	WebElement lightPackageCurr; 
	
	
	
	@FindBy(id="name-الأساسية")
	WebElement asasyaPackage; 
	
	@FindBy(xpath="//*[@id=\"currency-الأساسية\"]/b")
	WebElement asasyaPackagePrice; 
	
	@FindBy(xpath="//*[@id=\"currency-الأساسية\"]/i")
	WebElement asasyaPackageCurr;
	
	
	
	
	@FindBy(id="name-بريميوم")
	WebElement premiumPackage; 
	
	@FindBy(xpath="//*[@id=\"currency-بريميوم\"]/b")
	WebElement premiumPackagePrice;
	
	@FindBy(xpath="//*[@id=\"currency-بريميوم\"]/i")
	WebElement premiumPackageCurr;
	
	public String getPackage(int i)
	{
		switch(i)
		{
		case 0:
			return getElementText(lightPackage);
		case 1:
			return getElementText(asasyaPackage);
		case 2:
			return getElementText(premiumPackage);
		default:
			return null;
		}
		
	}
	
	public int getPackagePrice(int i)
	{
		switch(i)
		{
		case 0:
			return getElementTextAsInteger(lightPackagePrice);
		case 1:
			return getElementTextAsInteger(asasyaPackagePrice);
		case 2:
			return getElementTextAsInteger(premiumPackagePrice);
		default:
			return 0;
		}
		
	}
	
	
	public String getPackageCurrency(int i)
	{
		switch(i)
		{
		case 0:
			return getElementText(lightPackageCurr).split("/")[0];
		case 1:
			return getElementText(asasyaPackageCurr).split("/")[0];
		case 2:
			return getElementText(premiumPackageCurr).split("/")[0];
		default:
			return null;
		}
		 
	}
}
