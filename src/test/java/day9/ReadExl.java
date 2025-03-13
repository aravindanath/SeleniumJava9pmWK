package day9;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExl {

    public static void main(String[] args) throws IOException {

//        String path = System.getProperty("user.dir")+ File.separator+"data.xlsx";
        String path ="/Users/aravindanathdm/Documents/Automation_Classes/SeleniumJava9pmWK/date.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet =  wb.getSheetAt(0);

        int getLastRow = sheet.getLastRowNum();

        for(int i=0;i<=getLastRow;i++){
            String city = sheet.getRow(i).getCell(0).getStringCellValue();
            String name = sheet.getRow(i).getCell(1).getStringCellValue();
            String pincode = sheet.getRow(i).getCell(2).getStringCellValue();
            System.out.println(city + " | " + name + " | " + pincode);

        }



        ///Users/aravindanathdm/Documents/Automation_Classes/SeleniumJava9pmWK/date.xlsx

    }
}
