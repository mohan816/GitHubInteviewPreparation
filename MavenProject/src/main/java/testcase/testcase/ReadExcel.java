package testcase.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	

	public String[][] readExcel(String fileName) throws IOException {
		//To get the location of excel file
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//to read the excel sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		//to get the row
	int rowSize =	ws.getLastRowNum();
	int cellCount =	ws.getRow(0).getLastCellNum();
	String[][] d= new String[rowSize][cellCount];
	
	
	for(int i=1;i<=rowSize;i++) {
		for(int j=0;j<cellCount;j++) {
		String value =	ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(value);	
		d[i-1][j]=value;
	
		}
	}
	
	
		
	wb.close();
	return d;
	
}
	
}


	
