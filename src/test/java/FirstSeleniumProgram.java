import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //object creation
        driver.get("https://foodstore-1.web.app/"); //open a browser and navigate to URL

        String url = driver.getCurrentUrl();
        System.out.println("URL is : " + url); //printing purpose

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();
        System.out.println("Refresh 1");
        driver.navigate().refresh();
        System.out.println("Refresh 2");
        driver.navigate().refresh();
        System.out.println("Refresh 3");
        driver.navigate().refresh();
        System.out.println("Refresh 4");
        driver.navigate().refresh();
        System.out.println("Refresh 5");
        driver.navigate().refresh();
        System.out.println("Refresh 6");

        String title = driver.getTitle();
        System.out.println("Title of page :" + title);


        int width = driver.manage().window().getSize().getWidth();
        System.out.println("Width of the browser: "+ width);

        int height = driver.manage().window().getSize().getHeight();
        System.out.println("Height of the browser: "+ height);

        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
        //maximize the windows
        driver.manage().window().maximize();
        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }

        driver.manage().window().fullscreen();
        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
        //Minimize method is only supported in selenium version 4
        //driver.manage().window().minimize();

        //make sure opened browser is closed
       driver.close();
        //make sure it will close the process for that browser
       driver.quit();

    }
}
