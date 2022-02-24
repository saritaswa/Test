package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;

	ReadConfig readconfig = new ReadConfig();
	String baseURL = readconfig.getApplicationURL();
	String searchB = readconfig.search();

	public  void BrowserLaunch()
	{		
		System.setProperty("webdriver.gecko.driver",readconfig.getchromePath());
		driver =new ChromeDriver();
		driver.get(baseURL);
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	public WebElement homeLoan()
	{		

		WebElement s = driver.findElement(By.id("nab-panel-2040962621-0"));


		return s ;	
	}

	public void bookAppointment()
	{
		//write xpath like - //tagname[@attribute='value']
		//#nab-panel-2040962621-0 > div > div > ul > li:nth-child(1) > a > span

		String str = driver.findElement(By.cssSelector("h4.product-name")).getText();
		System.out.println(str);
		if(str.equalsIgnoreCase("Bookanappoitment"))
		{
			System.out.println("item found");

		}

		else
		{
			System.out.println("item not found");
		}
		driver.findElement(By.cssSelector(".product-action > button:nth-child(1)")).click();

		//Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains("Cucumber"));
	}
	public void otherNabneeds()
	{
		driver.findElement(By.cssSelector(".product-action > button:nth-child(1)")).click();
		
	}

	public void lettalk()
	{
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)")).click();
		
	}
	
	public void newhomeloans()
	{
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)")).click();//radio button 
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)")).click();//next button
	}
	public void buyingnewproperty()
	{
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)")).click();//radio button 
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)")).click();//next button
	}
	public void centerCall()
	{
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--new member
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--first name
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--last name
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--state
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--email
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--phone number
		driver.findElement(By.cssSelector(".cart-icon > img:nth-child(1)"));//--submit button
	}
	}

