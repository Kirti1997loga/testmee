package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel2 {
  @Test
  public void f() throws IOException{
	  File src=new File("C:\\Users\\a08019dirp_c2x.08.05\\Desktop\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(1);
	  sheet1.getRow(0).createCell(0).setCellValue("pass");
	  //System.out.println(data0);
	  sheet1.getRow(0).createCell(0).setCellValue("fail");
	  //System.out.println(data1);
	  
	  FileOutputStream fo=new FileOutputStream(src);
	  wb.write(fo);
	  
  }
}
