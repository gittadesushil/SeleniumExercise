import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadExcelData {
    public static void main(String[] args) {
        //Step : 1 Open a browser
        WebDriver wd = new ChromeDriver();
        wd.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("Data/UserData.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            //creating a Sheet object to retrieve the object
            Sheet sheet = wb.getSheetAt(0);

            int i = 1;
            HashMap<Integer, List<String>> map = new HashMap<>();
            for (Row row : sheet)     //iteration over row using for each loop
            {
                List<String> rowData = new ArrayList();
                for (Cell cell : row)    //iteration over cell using for each loop
                {
                    //System.out.println(cell.getRow().getCell(cell.getColumnIndex()));
                    rowData.add(cell.getRow().getCell(cell.getColumnIndex()).toString());
                }
                map.put(i, rowData);
                i++;
            }

            // iterate the hashmap

            for (Map.Entry mm: map.entrySet()){
                System.out.println("I am entering data for row : "+mm.getKey());
                List<String> cells = (List<String>) mm.getValue();
                for(int j=0;j<cells.size();j++){
                    switch (j){
                        case 0:
                            wd.findElement(By.id("firstName")).sendKeys(cells.get(j));
                            break;
                        case 1:
                            wd.findElement(By.id("lastName")).sendKeys(cells.get(j));
                            break;
                        case 2:
                            wd.findElement(By.id("username")).sendKeys(cells.get(j));
                            break;
                        case 3:
                            wd.findElement(By.id("email")).sendKeys(cells.get(j));
                            break;
                        case 4:
                            wd.findElement(By.id("address")).sendKeys(cells.get(j));
                            break;
                        case 5:
                            wd.findElement(By.id("address2")).sendKeys(cells.get(j));
                            break;
                    }

                }
                wd.findElement(By.id("reset")).click();
            }



        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
