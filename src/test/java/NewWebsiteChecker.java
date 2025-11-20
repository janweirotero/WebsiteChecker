import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewWebsiteChecker {

    public static WebDriver driver;

    public static void main(String[] args) {

            // Example Usage
            List<String> systemPrintout = new ArrayList<>();

            systemPrintout.add("https://www.bistro.com.ph/");
            systemPrintout.add("https://www.bldworld.org/");
            systemPrintout.add("http://blog.i4asiacorp.com/");
            systemPrintout.add("http://bulgogibrothers.com.ph/");
            systemPrintout.add("http://chickenbacolod.com.ph/");
            systemPrintout.add("http://dennys.ph/");
            systemPrintout.add("http://dva.org.ph/");
            systemPrintout.add("http://empire-east.com/");
            systemPrintout.add("http://empireeasthighlandcity.com/");
            systemPrintout.add("http://fifl.com.pg/");
            systemPrintout.add("https://milkyway.fonterraphils.com/");
            systemPrintout.add("http://fpe.ph/");
            systemPrintout.add("http://i4asiacorp.com/");
            systemPrintout.add("http://labelmenenterprises.com/");
            systemPrintout.add("http://lartizan.com/");
            systemPrintout.add("http://lookitsaboutme.com/");
            systemPrintout.add("http://mangotreeresidences.net");
            systemPrintout.add("http://michellesputongube.com/");
            systemPrintout.add("https://unclejohns.ph/");
            systemPrintout.add("http://modernshanghai.com.ph/");
            systemPrintout.add("http://ntfp.org/");
            systemPrintout.add("http://pigeon.com.ph/");
            systemPrintout.add("http://pioneerwoodlands.com");
            systemPrintout.add("http://staelena.com/");
            systemPrintout.add("http://stmichaelmedical.com/");
            systemPrintout.add("http://stpeter.com.ph/");
            systemPrintout.add("https://rebapmakati.com/");
            systemPrintout.add("http://texasroadhouse.com.ph/");
            systemPrintout.add("http://thecoventgarden.net");
            systemPrintout.add("http://thefrenchbaker.com/");
            systemPrintout.add("http://thekasara.net");
            systemPrintout.add("http://themanhattangardencity.com");
            systemPrintout.add("http://thepaddingtonplace.com");
            systemPrintout.add("http://therochester.net");
            systemPrintout.add("http://thesonoma.net");
            systemPrintout.add("http://tourismknowledgecenter.com/");
            systemPrintout.add("http://visitfortsantiago.com/");
            systemPrintout.add("http://watami.com.ph/");
            systemPrintout.add("http://worldformwppi.com/");
            systemPrintout.add("http://gopinas.com/");
            systemPrintout.add("https://store67.ph/");
            systemPrintout.add("https://nextasialand.com/");
            systemPrintout.add("https://cnakpop.com/");

            String excelFilePath = "/Users/i4asia/Selenium Screenshots/output.xlsx";
            createExcelFile(excelFilePath, systemPrintout);



    }

    public static void createExcelFile(String filePath, List<String> data) {
        try {
            // Create a new workbook
            XSSFWorkbook workbook = new XSSFWorkbook();
            // Create a new sheet
            XSSFSheet sheet = workbook.createSheet("Data");

            // Write data to the sheet
            int rowNum = 0;
            for (String line : data) {
                XSSFRow row = sheet.createRow(rowNum++);
                XSSFCell cell = row.createCell(0);
                cell.setCellValue(line);
            }

            // Save the workbook to a file
            FileOutputStream fileOut = new FileOutputStream(filePath);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Excel file created successfully at: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
