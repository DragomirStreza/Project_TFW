package TFW_Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.TFW_LoginPage;
import resources.Base;


public class Login_TFW extends Base {
	
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
   @BeforeTest
   
   public void initialize()throws IOException 
   {
driver =  initializeDriver() ;
log.info("Login_TFW::Driver is initialized");
driver.get("https://i-tfw.bmwgroup.net");
log.info("Login_TFW::Navigated to TFW home page");
   }
	@Test(dataProvider="getData")
	
	public void LoginTFW(String Qnummer,String TssPasswort) throws IOException
	{
	
		
		TFW_LoginPage m=new TFW_LoginPage(driver);
	
		m.getQnummer().click();
		m.getQnummer().sendKeys(Qnummer);
		m.getTssPasswort().click();
		m.getTssPasswort().sendKeys(TssPasswort);
		log.info("Login_TFW::Entered Qnummer und TssPasswort");
		m.getAnmelden().click();
		log.info("Login_TFW::Logged in TFW");
		/*TFW_MainPage n=new TFW_MainPage(driver);
	
		n.getMainDropdownList().click();
		n.getTypePartner().click();
		n.getImporteuer().click();
		
		n.getSuchen().click();*/
		
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

