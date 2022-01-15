package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel
{
		public static String getData(String sheet,int row,int column) throws EncryptedDocumentException, IOException   
		{
			String Val="";
		FileInputStream fis=new FileInputStream("./excel/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheet).getRow(row).getCell(column);
		return Val=c.getStringCellValue();
		}
}
