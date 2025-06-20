package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.*;

public class Write_A_Data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/TestData/joba applied.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int maxrow = sheet.getLastRowNum();
		int maxcell = sheet.getRow(0).getLastCellNum();
		Set<HashMap<String,String>> listmap =new LinkedHashSet<>();
		HashMap<String,String> map;
		for(int i=1;i<=maxrow;i++) {
			map = new HashMap<>();
			for(int j=0;j<maxcell;j++) {
				String key= sheet.getRow(0).getCell(j).toString();
				String value;
				try {									
				    value =sheet.getRow(i).getCell(j).toString();
				}catch(NullPointerException e) {			   
				    value="";
				}
				map.put(key,value);				
			}
			listmap.add(map);
		}
		System.out.println(listmap);
		System.out.println(listmap.size());
		//System.out.println(listmap.get(4).get("Company"));
		workbook.close();
		fis.close();

	}
}


//ArrayList<HashMap<String,String>> listmap =new ArrayList<>();
//HashMap<String,String> map;
//for(int i=1;i<maxrow;i++) {
//	map = new HashMap<>();
//	for(int j=0;j<maxcell;j++) {
//		String key;
//		String value;
//		try {					
//			key = sheet.getRow(0).getCell(j).toString();
//		    value =sheet.getRow(i).getCell(j).toString();
//		}catch(NullPointerException e) {
//		    key ="key";
//		    value="";
//		}
//		map.put(key,value);				
//	}
//	listmap.add(map);
//}System.out.println(listmap);
//



//FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Excelr.xlsx");
//Workbook book = WorkbookFactory.create(fis);
//
//Thread.sleep(2000);
//Sheet sheet = book.getSheet("Sheet1");
//// to write the data in first row and first cell
///*	Row createdRow=sheet.createRow(0);
//	Cell createdCell =createdRow.createCell(0);
//	createdCell.setCellValue("Focus");
//*/
////to write the data in first in 2nd row 5th cell - it is based on index value 
//Row createdRow=sheet.createRow(1);
//Cell createdCell =createdRow.createCell(4);
//createdCell.setCellValue("Focus22");
//
//FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\Excelr.xlsx");
//book.write(fout);
//
//System.out.println("Succesfully test is written in excel sheet");
