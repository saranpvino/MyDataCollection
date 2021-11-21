package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public String[][] readDataExcel() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data_excel/CreateIncident.xlsx");// worksheet path
		XSSFSheet ws = wb.getSheet("Sheet1");// get in to worksheet
		
		int lastRowNum = ws.getLastRowNum();// counting num of rows
		short lastCellNum = ws.getRow(0).getLastCellNum();// any single row can be taken for counting columns
		
		System.out.println("Actual Rows including HEADER:"+ws.getPhysicalNumberOfRows());
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {// i=1 for skipping first row i.e a header
			for (int j = 0; j < lastCellNum; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				//i-1 is for storing the (header is 0th row)1st row values in 0th index of array
				data[i-1][j]	=	cellValue;
				//System.out.print(" "+cellValue+" ");
			}
			//System.out.println();
		}
		wb.close();
		return data;
	}

}
