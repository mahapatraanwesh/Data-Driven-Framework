package generics;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excel 
{
public static String demo(String file,String sheet,int row,int cell)
	{
	String s="";
	try
	{
		FileInputStream f=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(f);
		s=wb.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	}
	catch(Exception e)
	{
		
	}
	return s;
	}
}