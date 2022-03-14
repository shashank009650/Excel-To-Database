package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Connector.StudentDB;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Java\\Path/Book.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// create object of XSSFWorkbook class
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = (XSSFSheet) wb.getSheet("Sheet1");

		Iterator<Row> itr = sheet.iterator();
		Row row = itr.next();

		while (itr.hasNext()) {
			row = itr.next();

			String Name = String.valueOf(row.getCell(0));
			String ID = String.valueOf(row.getCell(1));
			String Roll_No = String.valueOf(row.getCell(2));

			object ob = new object(Name, ID, Roll_No);
			StudentDB.insertStudentToDb(ob);

		}

	}
}
