package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException  {

		File file=new File("D:\\kishor\\kishor1.xlsx");
		
		FileInputStream	fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("names");
		
		int rowNum=sheet.getLastRowNum();
		
		int colNum=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Row count is " +rowNum+ " Column count is " +colNum);
		
		for(int i=0;i<=rowNum;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<colNum;j++)
			{
				
				XSSFCell cell=row.getCell(j);
				
				String value=cell.toString();
				
				System.out.println("The Value is" + "\t" +value);
				
			}
		}
			

	}

}
