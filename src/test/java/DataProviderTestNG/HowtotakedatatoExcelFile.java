package DataProviderTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HowtotakedatatoExcelFile {

	public static Object[][]dwsLogin() throws EncryptedDocumentException, IOException{
		Object[][]obj=new Object[2][2];

		File path =new File("C:\\Users\\Janabai Hajare\\Desktop\\janaha.xlsx");
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		obj[0][0] = sheet.getRow(0).getCell(0).toString();
		obj[0][1]= sheet.getRow(0).getCell(1).toString();
		obj[1][0] = sheet.getRow(1).getCell(0).toString();
		obj[1][1] = sheet.getRow(1).getCell(1).toString();
		return obj;

	}
}
