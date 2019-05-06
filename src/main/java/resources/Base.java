package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.reporters.Files;

public class Base {

	public static WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\dstreza\\TFW_Pilot\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		//String url=prop.getProperty("url");
		
		
		if(browserName.equals("chrome"))
		{
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dstreza\\Downloads\\chromedriver\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		
		else if (browserName=="firefox")
		{
			//execute in firefox
		}
		
		else if(browserName=="IE")
		{
			//execute in IE
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://test//"+result+"screenshot.png"));
		
	}
}
