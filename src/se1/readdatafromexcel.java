package se1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;

public class readdatafromexcel {

	private static final String NUMERIC = null;
	private static final String BOOLEAN = null;
	private static final String STRING = null;

	public static void main(String[] args) throws Exception {
		File file = new File("");
		FileInputStream fis=new FileInputStream(file); //raw data which will read the data from excel in the formate of bytes
	 //   XSSFWorkbook workbook=new XSSFWorkbook(fis);
	//	XSSFSheet sheet = workbook.getSheetAt(0);
		//String cellValue = sheet.getRow(0).getcell(0).setStringCellValue();
	//	System.out.println(cellValue);
		
		
		
		/*
		 * int rowCount = sheet.getPhysicalNumberOfRows(); for(int i=0;i<rowCount;i++) {
		 * XSSFRow row=sheet.getRow(i); int cellCount=row.getPhysicalNumberOfCells();
		 * for(int j=0; i<cellCount; j++) { XSSFCell cell=row.getCell(j); String
		 * cellValue =getCellValue(cell) System.out.println("||" +cellValue);
		 * 
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		
		
	//	workbook.close();
		fis.close();

	}
	
	/*
	 * public static String getCellValue(XSSFCell cell) { switch
	 * (cell.getCellType()) { case NUMERIC: return
	 * String.valueOf(cell.getNumericCell.Value());
	 * 
	 * 
	 * case BOOLEAN: return String.valueOf(cell.getBooleanCell.Value());
	 * 
	 * case STRING: return cell.getStringCell.Value();
	 * 
	 * default: break;
	 */
				
		
	//	}
//	}
	
	

}
