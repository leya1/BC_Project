package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws IOException{
		File src=new File("./TestData/Data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
	}

	public String getStringData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getNumericData(String sheetName,int row,int column)
	{
		Cell cell = wb.getSheet(sheetName).getRow(row).getCell(column); 
		cell.setCellType ( Cell.CELL_TYPE_STRING ); 
		String pass = cell.getStringCellValue();
		return pass;
		//return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}
