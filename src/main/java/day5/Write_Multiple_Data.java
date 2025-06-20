package day5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Multiple_Data {
	
	//close the excel sheet while writing the data
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Excelr.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
		Object [][] data = {{"Name","age","city"},
							{"akhi","23","hyd"},
							{"manu","25","kurnool"}
							};
				
		// to write the date into excel sheet
		int rowNum=0;
		for(Object[] rowData:data) {
			Row rowdata = sheet.createRow(rowNum++);
			int cellNum=0;
			for(Object ColData:rowdata) {
				Cell createdCell =rowdata.createCell(cellNum++);
				if(ColData instanceof String) {
					createdCell.setCellValue((String)ColData);
				}else if(ColData instanceof Integer) {
					createdCell.setCellValue((Integer)ColData);
				}else if(ColData instanceof Boolean) {
					createdCell.setCellValue((Boolean)ColData);
				}
			}
		}
		
	}
}
