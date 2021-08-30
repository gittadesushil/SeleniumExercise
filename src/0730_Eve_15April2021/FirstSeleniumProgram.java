import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {
    public static void main(String[] args) {
        //Step 1
        WebDriver driver = new ChromeDriver();

        //Step 2
        driver.get("https://foodstore-1.web.app/");
        String url = driver.getCurrentUrl();
        System.out.println("My url is: "+ url);

        String title = driver.getTitle();
        System.out.println("My title is: "+ title);

        driver.navigate().refresh();
        System.out.println("Refresh");

        int height = driver.manage().window().getSize().getHeight();
        System.out.println("height of the browser is "+ height);
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("width of the browser is "+ width);



        try{
            Thread.sleep(2000);

        driver.manage().window().maximize();
            Thread.sleep(2000);
        driver.manage().window().fullscreen();
            Thread.sleep(2000);

            int height2 = driver.manage().window().getSize().getHeight();
            System.out.println("height of the browser is "+ height2);
            int width2 = driver.manage().window().getSize().getWidth();
            System.out.println("width of the browser is "+ width2);

        }catch (Exception e){

        }
        System.out.println("Closing the driver bye bye....");
        driver.quit();





    }
}
