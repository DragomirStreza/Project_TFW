package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TFW_LoginPage {

	public WebDriver driver ;
	
	By Qnummer=By.xpath("//input[@name='USER']");
	
	By TssPasswort=By.xpath("//input[@name='PASSWORD']");
	
	By login=By.xpath("//a[@class='button']");
	
	public TFW_LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
	}

	public WebElement getQnummer()
	{
		return driver.findElement(Qnummer);
		}
	
	public WebElement getTssPasswort()
	{
		return driver.findElement(TssPasswort);
		}
	
	
	public WebElement getAnmelden()
	{
		return driver.findElement(login);
		}
}
