package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Suite1 {

	@Test
	public void Login()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\rana_selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver bo=new ChromeDriver();
			bo.get("http://apps.qaplanet.in/hrm/login.php");
			bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
			bo.findElement(By.name("txtPassword")).sendKeys("lab1");
			bo.findElement(By.name("Submit")).click();
	        Assert.assertEquals(bo.getTitle(), "OrangeHRM");
			bo.close();


	}

}
