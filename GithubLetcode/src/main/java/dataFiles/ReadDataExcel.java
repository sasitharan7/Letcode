package dataFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		String fileLoc = "C:\\Users\\sasit\\eclipse-workspace\\Letcode\\DataFiles\\dataFile.xlsx)";
	    FileInputStream fis = new FileInputStream(fileLoc);
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wbook.close();

	}

}
