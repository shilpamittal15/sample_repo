package trigger_schedule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.google.common.collect.Table.Cell;

public class Trigger 
{
	static XSSFWorkbook hw;
    static XSSFSheet sheet1;
	
	public static void main(String[] args) throws Exception 
	{
		XmlSuite xs=new XmlSuite();
		xs.setName("Suit1");
		
		XmlTest xt=new XmlTest(xs);
		File f=new File("");
		FileInputStream fis=new FileInputStream(f);
		hw=new XSSFWorkbook(fis);
		sheet1=hw.getSheetAt(0);
		//int row=sheet1.getRow();
		//sheet1.getRow(0);
		
		ArrayList<XmlClass> al=new ArrayList<XmlClass>();
		
		/*for(int i=1;i<row; i++)
		{
			//Cell c=sheet1.getcell(4,i);
		}
		*/
	//	String userdata=sheet1.getRow(rowNum).getCell(columnNum).getStringCellValue();
		//return userdata;
		
		
		
	}
}
