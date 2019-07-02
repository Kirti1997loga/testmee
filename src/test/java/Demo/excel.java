package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excel
{
	WebDriver driver;
  @Test
  public void f() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.manage().window().maximize();
	  File src=new File("C:\\Users\\a08019dirp_c2x.08.05\\Desktop\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	 // for(int i=0;i<2;i++)
	//  {
	  
	  String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	  String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	  
	  
	  driver.findElement(By.name("userName")).sendKeys(data0);
	  driver.findElement(By.name("password")).sendKeys(data1);
	  driver.findElement(By.name("Login")).submit();
	  
	 // }
	  
	  
  }
}
