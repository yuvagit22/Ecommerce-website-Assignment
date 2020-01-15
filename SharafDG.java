package maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharafDG {
public static String getData(int row , int cell) throws Throwable {
	String V = null;
	File loc = new File("C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Test Data\\SharafDG.xlsx");
	FileInputStream f=new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(f);
	Sheet s = w.getSheet("Sheet2");
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	System.out.println(c);
	int type = c.getCellType();
	if (type==1) {
	V = c.getStringCellValue();
	}
	else {
		double getnum = c.getNumericCellValue();
		long l = (long) getnum;
		V=String.valueOf(l);
	}
	return V;
	
	
}
}
