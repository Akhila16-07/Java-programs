package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataBySheetName {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir") + "/TestData/jobs applied.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workBook.getSheet("Jobs");
		int maxRowCount=sheet.getLastRowNum();
		int maxCellCount=sheet.getRow(0).getLastCellNum();
		
		Set<Map<String,String>> setMap=new HashSet<>();
		Map<String,String> map ;
		for(int i=1;i<=maxRowCount;i++) {
			map=new HashMap<>();
			
			for(int j=0;j<maxCellCount;j++) {
				try {
				map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i).getCell(j).toString());
				}catch(NullPointerException e) {
					map.put(sheet.getRow(0).getCell(j).toString(), null);
				}
			}
			setMap.add(map);
		}	
		System.out.println(setMap);
	}
}
