package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/TestData/jobs applied.xlsx");
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
