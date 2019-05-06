package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reporting {

	public WebDriver driver ;
	

	By MainDropdownList=By.xpath("//select[@name='funktion']");
	
	By ReportingButton=By.xpath("//option[contains(text(),'Reporting')]");
	
	By TypePartner=By.xpath("//option[contains(text(),'Partner')]");
	
	By Importeuer=By.xpath("//option[contains(text(),'Importeur')]");
	
	By Suchen=By.xpath("//td//td[1]//input[1]");
	
	By OffeneLieferungen=By.xpath("//strong[contains(text(),'offene Lieferungen')]");
	
	By ReportPartnerDropdownlist=By.xpath("//select[@name='partnerId']");
			
			By ReportPartnerSelect=By.xpath("//option[contains(text(),'Al-Rowaishan Co. Ltd. Showroomand Service | 20096 ')]");
	
	public Reporting(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
	}

	public WebElement getMainDropdownList()
	{
		return driver.findElement(MainDropdownList);
		}
	
	public WebElement getTypePartner()
	{
		return driver.findElement(TypePartner);
		}
	
	public WebElement getImporteuer()
	{
		return driver.findElement(Importeuer);
		}
	
	public WebElement getSuchen()
	{
		return driver.findElement(Suchen);
		}
	
	public WebElement getReportingButton()
	{
		return driver.findElement(ReportingButton);
	}
	
	public WebElement getOffeneLieferungen()
	{
		return driver.findElement(OffeneLieferungen);
		}
	public WebElement getReportPartnerDropdownlist()
	{
		return driver.findElement(ReportPartnerDropdownlist);
		}
	
	public WebElement getReportPartnerSelect()
	{
		return driver.findElement(ReportPartnerSelect);
		}
	
	}

