package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// Import libraries necessary for handling Excel files
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;

public class tc_002Page {

    WebDriver driver;

    // Constructor to initialize WebDriver
    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    // Open the Claim Accounting Report page
    public void openClaimAccountingReport() {
        driver.get("URL_of_Claim_Accounting_Report");
    }

    // Export Excel report function
    public void exportExcelReport() {
        driver.findElement(By.id("exportButton")).click();
        // Wait for the file to be downloaded. Implement wait logic if necessary.
    }

    // Logic to verify the presence of column 'Estado Código'
    public boolean isEstadoCodigoColumnPresent() {
        try {
            FileInputStream fis = new FileInputStream(new File("path/to/downloaded/excel/file.xlsx"));
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet firstSheet = workbook.getSheetAt(0);
            Row headerRow = firstSheet.getRow(0);

            Iterator<Cell> cellIterator = headerRow.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getStringCellValue().equalsIgnoreCase("i")) { 
                    Cell nextCell = headerRow.getCell(cell.getColumnIndex() + 1);
                    if (nextCell.getStringCellValue().equalsIgnoreCase("Estado Código")) {
                        workbook.close();
                        fis.close();
                        return true;
                    }
                }
            }
            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}