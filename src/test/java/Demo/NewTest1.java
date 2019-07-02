package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest1
{
	WebDriver driver;
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeAp");
	  driver.manage().window().maximize();
	  WebElement about=driver.findElement(By.xpath("//*[@id='menu3']/li[3]/a/span"));
	  Actions action=new Actions(driver);
	  action.moveToElement(about).click().build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span"))).click().build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li[1]/a/span"))).click().build().perform();
	  Set<String> set=driver.getWindowHandles();
	  for(String string : set)
	  {
		  driver.switchTo().window(string);
	  }
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  String add=driver.findElement(By.tagName("address")).getText();
	  System.out.println(add);
	  }
 }

