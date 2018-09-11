package testNG;

import java.io.File;

public class DeleteExcelFile {

	public static void main(String[] args) {


		File file=new File("D:\\kishor\\kishor.xlsx");
		
		file.delete();
		
		System.out.println("File is Deleted");

	}

}
