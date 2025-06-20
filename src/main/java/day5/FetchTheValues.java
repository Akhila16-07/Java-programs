package day5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTheValues {
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Excelr.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		Thread.sleep(2000);
		Sheet sheet = book.getSheet("Sheet1");
		
		//to nvaigate to that particular row
		Row row = sheet.getRow(0);
		//to nvaigte to that particular cell form the specfic row
		Cell cell=row.getCell(0);
		
		// better always go for toString() for all type of data then convert it after fetching
		String stringCellValue = cell.toString();
		System.out.println(stringCellValue);
		
		//TO fetch the numeric value form cell
		Row row1 = sheet.getRow(1);
		Cell cell1= row1.getCell(3);
		double numericValue= cell1.getNumericCellValue();
		System.out.println(numericValue);
		
		book.close();
		}
}
