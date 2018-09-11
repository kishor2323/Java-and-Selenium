package testNG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\kishor\\kishor.xlsx");
		
		fos=new FileOutputStream(file);
		
		wb=new XSSFWorkbook();
		
		sheet=wb.createSheet("names");
		
		WriteExcel re=new WriteExcel();
		
		re.writedata(0,"kishor","gooty",10);
		re.writedata(1,"krishna","anantapur",20);
		re.writedata(2,"ashok","kurnool",30);
		re.writedata(3,"mokshi","bengalore",40);
		
		wb.write(fos);
		
		fos.close();
		
		System.out.println("File is Created");

	}	
	
	
	
	public void writedata(int rowno,String col1,String col2,int col3)
	{
		
		XSSFRow row=sheet.createRow(rowno);
		
		XSSFCell cell=row.createCell(0);
		
		cell.setCellType(Cell.CELL_TYPE_STRING);
		
		cell.setCellValue(col1);
		
		cell=row.createCell(1);
		
        cell.setCellType(Cell.CELL_TYPE_STRING);
		
		cell.setCellValue(col2);
		
		cell=row.createCell(2);
		
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
		
		cell.setCellValue(col3);
		
		
		
	}
	

}
