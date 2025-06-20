package dailyTasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AdditionOfAandBInC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Excelr.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet2");
		double sum=0;
		System.out.println("34234324");
		for(int i=1;i<3;i++) {
	
			Row row=sheet.getRow(i);
			for(int j=0;j<2;j++) {
				Cell cell =row.getCell(j);
				double add= cell.getNumericCellValue();
				sum=sum+add;
				}
			
			Row createdRow=sheet.createRow(i);
			Cell createdCell =createdRow.createCell(2);
			createdCell.setCellValue(sum);
			
			FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\Excelr.xlsx");
			book.write(fout);
			System.out.println("Sum of A and B "+sum);
			sum=0;		
		}
		
		double totalSum=0;
		for(int i =1;i<3;i++) {
			Row row = sheet.getRow(i);
			//to nvaigte to that particular cell form the specfic row				
					Cell cell=row.getCell(2);
					double add=cell.getNumericCellValue();
					totalSum=totalSum+add;
		}
		System.out.println("total value of C is "+totalSum);

		Row createdRow=sheet.createRow(3);
		Cell createdCell =createdRow.createCell(2);
		createdCell.setCellValue(totalSum);
		
		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\Excelr.xlsx");
		book.write(fout);
		
		book.close();
	}
}
