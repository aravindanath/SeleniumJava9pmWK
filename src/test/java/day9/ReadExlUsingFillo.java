package day9;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExlUsingFillo {

    public static void main(String[] args) throws IOException, FilloException {
        String path = "/Users/aravindanathdm/Documents/Automation_Classes/SeleniumJava9pmWK/date2.xls";

        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection(path);
        String query = "SELECT City,Name FROM Sheet1";
        Recordset recordset = connection.executeQuery(query);
        recordset.getCount();
        while (recordset.next()) {
            String city = recordset.getField("City");
            String name = recordset.getField("Name");
//            String pincode = recordset.getField("Pincode");
//            System.out.println(city + " | " + name + " | " + pincode);
            System.out.println(city + " | " + name );
        }
        recordset.close();
        connection.close();
    }
}