package Helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
     
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src = new File("./TestData/NewData.xlsx");
		try {
			FileInputStream fs = new FileInputStream(src);
			wb= new XSSFWorkbook(fs);	
			
		} catch (Exception e) {
			
		System.out.println("Found Exception with ExcelDataProvider" + e.getMessage());		}			
	}
	
	public String getStringData(int SheetIndex, int row, int cell)
	{
	  return wb.getSheetAt(SheetIndex).getRow(row).getCell(cell).getStringCellValue();	
}
	
	public String getNumericData(String SheetName, int row, int cell)
	{
	  return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();	
	}
}
