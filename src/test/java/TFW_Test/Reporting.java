package TFW_Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import resources.Base;


public class Reporting extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	 @BeforeTest
	   
	   public void initialize()throws IOException 
	   {
	driver =  initializeDriver() ;
	log.info("Reporting::Driver is initialized");
	driver.get("https://i-tfw.bmwgroup.net");
	log.info("Reporting::Navigated to TFW home page");
	   }


	@Test(dataProvider="getData")
	
	public void Reporting (String Qnummer, String TssPasswort) throws IOException
	{
		
		
		pageobjects.TFW_LoginPage m=new pageobjects.TFW_LoginPage(driver);
	
		m.getQnummer().click();
		m.getQnummer().sendKeys(Qnummer);
		m.getTssPasswort().click();
		m.getTssPasswort().sendKeys(TssPasswort);
		m.getAnmelden().click();
		log.info("Reporting::Logged in");
		pageobjects.TFW_MainPage n=new pageobjects.TFW_MainPage(driver);
	
		n.getMainDropdownList().click();
		//n.getTypePartner().click();
		//n.getImporteuer().click();
		
		//n.getSuchen().click();
		//n.getReportingButton().click();
		n.getReportingButton().click();
		log.info("Reporting::Entered Reporting Module");
		n.getOffeneLieferungen().click();
		log.info("Reporting::Selected Reporting Option");
		n.getReportPartnerDropdownlist().click();
		n.getReportPartnerSelect().click();
	n.getReportRegionSelect().click();
	n.getReportRegionB1().click();
	log.info("Reporting::Selected Partner/Region Option");
	n.getReportAnzeigen().click();
	log.info("Reporting::Results displayed");
	}

	@DataProvider
	public Object[][] getData()
	{
	Object[][] data= new Object[1][2];
	data[0][0]="qxv5565";
			data[0][1]="edcrfv13";
			
			return data;
	}
			@AfterTest
			public void teardown()
			{
				driver.close();
				driver=null;
			}
}

