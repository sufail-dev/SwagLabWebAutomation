import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	
	
	
	@Test(dataProvider="passData")
	public void mYTestOne(Map<String,String> mp) {
		
		System.out.println(mp.get("username"));
		
		
	}
	
	@DataProvider
	public Object[] passData() throws IOException {
		FileInputStream fl=new FileInputStream(System.getProperty("user.dir")+"/excel/myData.xlsx");
		XSSFWorkbook myExcel=new XSSFWorkbook(fl);
		XSSFSheet sheet=myExcel.getSheet("testData");
		int rowNum=sheet.getLastRowNum();
		int column=sheet.getRow(0).getLastCellNum();
		Object[] data=new Object[rowNum];
		Map<String, String> map;
		
		for(int i=1;i<rowNum;i++) {
			map=new HashMap<>();
			for(int j=0;j<column;j++) {
				String key=sheet.getRow(0).getCell(j).getStringCellValue();
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-j]=map;
			}
			
			
		}
		
	return data;	
		
		
		
	}
	
	
}
