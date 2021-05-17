package week4.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
@Test
	public String[][] main() throws IOException {
		//To open the Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/SeleniumData.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		int cellCount = ws.getRow(0).getLastCellNum();
		System.out.println(cellCount);
	/*	for(int a=0;a<=0;a++)
		{
			for(int k=0;k<cellCount;k++)
			{
		
		String value =	ws.getRow(a).getCell(k).getStringCellValue();
			
					System.out.print(value);
					System.out.print(" ");
			}
		}*/
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++)
			
		{
			System.out.println("");
			for(int j=0;j<cellCount;j++)
			{
				
				String values = ws.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(values);
				System.out.print("       ");
				data[i-1][j]=values;
				
				
			}
		}
		
		wb.close();
		return data;
		
		

	}

}
