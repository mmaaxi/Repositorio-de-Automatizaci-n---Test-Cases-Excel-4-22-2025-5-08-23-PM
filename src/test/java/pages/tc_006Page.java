package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class tc_006Page {

    WebDriver driver;

    public tc_006Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToReportExportPage() {
        driver.get("http://example.com/report-export");
    }

    public void exportReportAsExcel() {
        driver.findElement(By.id("exportExcelButton")).click();
        // Wait mechanism should be added here to ensure download is complete
    }

    public boolean isIvaZeroColumnPresentAndCorrect() {
        try {
            File excelFile = new File("path/to/downloaded/report.xlsx");
            FileInputStream fis = new FileInputStream(excelFile);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            int ivaZeroIndex = -1;

            // Assuming the first row contains the column headers
            for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
                if (sheet.getRow(0).getCell(i).getStringCellValue().equals("IVA 0%")) {
                    ivaZeroIndex = i;
                    break;
                }
            }

            // Check if 'IVA 0%' column exists and has relevant data
            if (ivaZeroIndex == -1) {
                return false;
            }

            for (int j = 1; j <= sheet.getLastRowNum(); j++) {
                if (sheet.getRow(j).getCell(ivaZeroIndex) != null &&
                    sheet.getRow(j).getCell(ivaZeroIndex).getNumericCellValue() != 0) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}