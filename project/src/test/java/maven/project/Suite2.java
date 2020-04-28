package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Suite2 {

	@Test
	public void invlid() throws Exception
	{
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\rana_selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver bo=new ChromeDriver();
			bo.get("http://apps.qaplanet.in/hrm/login.php");
		  bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
		    bo.findElement(By.name("txtPassword")).sendKeys("");
		    Thread.sleep(6000);
		   bo.findElement(By.name("Submit")).click();
		   Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
		  bo.switchTo().alert().accept();
		  bo.close();


	}

}
