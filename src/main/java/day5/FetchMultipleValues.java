package day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleValues {

		
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Excelr.xlsx");
//		Workbook book = WorkbookFactory.create(fis);
//		
//		Thread.sleep(2000);
//		Sheet sheet = book.getSheet("Sheet1");
//		// to get the physical number of rows in sheet
//		int physicalNoOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println("Physical num of rows are " +physicalNoOfRows);
//		System.out.println("**********************************************");
//		
//		// to get the all the values form 1st row, in cell 0
//		for(int i =0;i<physicalNoOfRows; i++) {
//			String all_Values = sheet.getRow(i).getCell(0).toString();
//			System.out.println(all_Values);
//		}

	    public static void main(String[] args) {
	        String input = "programming";
	        String result = removeDuplicateCharacters(input);
	        System.out.println("Original String: " + input);
	        System.out.println("String after removing duplicates: " + result);
	    }

	    public static String removeDuplicateCharacters(String str) {
	        // Convert string to character array
	        char[] chars = str.toCharArray();
	        
	        // Use LinkedHashSet to maintain insertion order and remove duplicates
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        for (char c : chars) {
	            set.add(c);
	        }
	        
	        System.out.println(set);
	        // Build the result string
	        StringBuilder result = new StringBuilder();
	        for (char c : set) {
	            result.append(c);
	        }
	        
	        return result.toString();
	    }
	
	
}
