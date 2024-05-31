package DataDrivenTestings;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatafromExcelbyusingForLoop {
	public void ByUsingforLoop() {
		@Test
		File path =new File("");
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);

	
	
		
		}
	}


