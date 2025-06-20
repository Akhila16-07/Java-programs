package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Form {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\OrangeHrmDemo.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	int maxRowCount=sheet.getLastRowNum();
	int cellCount=sheet.getRow(0).getLastCellNum();
	ArrayList<Map<String,String>> listMap=new ArrayList<>();
	Map<String,String> map;
	for(int i=1;i<=maxRowCount;i++) {
		map=new HashMap<>();
		for(int j=0;j<cellCount;j++) {
			String key="";
			String value="";
			
			try {
				 key=sheet.getRow(0).getCell(j).toString();
				// System.out.println(key);
				 value=sheet.getRow(i).getCell(j).toString();
			}catch(NullPointerException e){
				value="Null";
				
			}
			map.put(key, value);
		}
		listMap.add(map);			
	}
	//System.out.println(listMap);
	
	
	ArrayList<Map<String,String>> newList=new ArrayList<>();
	for(Map<String,String> regis:listMap) {
		if(regis.get("Registered").equals("N")) {
			newList.add(regis);
		}
	}
	
	System.out.println("NewList = " +newList) ;
	System.out.println("0th Index = "+newList.get(0));
}

}
