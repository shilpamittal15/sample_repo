package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading 
{
	public XSSFWorkbook xw;
   public XSSFSheet sheet1;
	
	public ExcelReading(String path) throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		xw=new XSSFWorkbook(fis);
		//sheet1=xw.getSheetAt(0);
	}
	
	public String getData(int sheetNum,int row, int column)
	{
		sheet1=xw.getSheetAt(sheetNum);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	
	public int getData(int sheetIndex)
	{
		int row=xw.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		System.out.println(row);
		return row;
	}
	
	

}
