package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static String[][] readDataExcel(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data_excel/"+fileName+".xlsx");// worksheet path
		XSSFSheet ws = wb.getSheet("Sheet1");// get in to worksheet
		
		int lastRowNum = ws.getLastRowNum();// counting num of rows
		short lastCellNum = ws.getRow(0).getLastCellNum();// any single row can be taken for counting columns
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {// i=1 for skipping first row ie a header
			for (int j = 0; j < lastCellNum; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cellValue;
				//System.out.println(cellValue);
			}
		}
		wb.close();
		return data;
	}

}
