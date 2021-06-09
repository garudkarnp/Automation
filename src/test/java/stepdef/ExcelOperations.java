package stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	
	public static void main(String[] args) throws IOException, InvalidFormatException{
	
	FileInputStream fis=new FileInputStream(new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\Nisha.xlsx"));
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	Iterator<Row> itrow=sheet.iterator();
	
	Row frow=itrow.next();
	Iterator<Cell> itcell=frow.cellIterator();
	while(itcell.hasNext()){
		System.out.println(itcell.next().getStringCellValue());
		
	}
	
	File file=new File("C:\\Users\\nisha.garudkar\\workspace\\CucumberTest1.0\\config\\Write.xlsx");
	FileOutputStream fileout=new FileOutputStream(file);
	XSSFWorkbook workbook1=new XSSFWorkbook();
	XSSFSheet sheet1=workbook1.createSheet("Sheet");
	XSSFRow rowhead=sheet1.createRow(0);
	rowhead.createCell(0).setCellValue("Nisha");
	rowhead.createCell(1).setCellValue("Garudkar");
	rowhead.createCell(2).setCellValue("JP Morgan");
	workbook1.write(fileout);
	fileout.close();
	workbook1.close();
	
	
	
	
	
	
	
	}
}
