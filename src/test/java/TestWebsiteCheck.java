import io.cucumber.java.ja.但し;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestWebsiteCheck {

    public static WebDriver driver;


    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless=new");
       // driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }

    @Test
    public void run(){
        driver.get("https://www.bistro.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.bldworld.org/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://blog.i4asiacorp.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://bulgogibrothers.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://chickenbacolod.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://dennys.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://dva.org.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://empire-east.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://empireeasthighlandcity.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://fifl.com.pg/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://milkyway.fonterraphils.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://fpe.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://i4asiacorp.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://labelmenenterprises.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://lartizan.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://lookitsaboutme.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://mangotreeresidences.net");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://michellesputongube.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://unclejohns.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://modernshanghai.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://ntfp.org/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://pigeon.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://pioneerwoodlands.com");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://staelena.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://stmichaelmedical.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://stpeter.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://rebapmakati.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://texasroadhouse.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://thecoventgarden.net");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://thefrenchbaker.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://thekasara.net");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://themanhattangardencity.com");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://thepaddingtonplace.com");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://therochester.net");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://thesonoma.net");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://tourismknowledgecenter.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://visitfortsantiago.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://watami.com.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://worldformwppi.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://gopinas.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://store67.ph/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://nextasialand.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://cnakpop.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://radar.ph/");
    }


}
