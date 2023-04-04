package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel 
{
	public static String FetchDataFromExcel(int row,int cell) throws IOException
	{	
     String data ="";
     
     String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestExcel"+File.separator+"DemoSheet.xlsx";
     
     //File.seperator is used when we moved our project from one device to another(i.e from windows to Mac)
     //then no need to change the path and syntax
     
     FileInputStream file=new FileInputStream(path);
     
     Sheet s=WorkbookFactory.create(file).getSheet("DemoSheet");
     
     Cell c= s.getRow(row).getCell(cell);
     
     CellType type=c.getCellType();
     
     if(type==CellType.STRING)
     {
    	 data=c.getStringCellValue();
     }
     else  if(type==CellType.NUMERIC)
     {
    	Double num_value=c.getNumericCellValue();
    	//int num= (int)num_value;
    	
   // 	data=Integer.toString(num);  
     data=Double.toString(num_value);   //Double is a wrapper class of double keyword
     }
     else if(type==CellType.BLANK)
     {
    	 data=" ";
     }
     return data;     
   }
}
