package basicutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata implements AutoConstatnts
{
	public static String getdata(String sheet, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		//specify path of excel file.here its in autoconstatnts so implements this.
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook wb = WorkbookFactory.create(fis);
	
		Sheet sh = wb.getSheet(sheet);
	
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String data = c.getStringCellValue();
		// i want use this data in futherly so i return the data 
		return data;
		
	}

}
