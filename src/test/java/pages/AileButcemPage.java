package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Random;

public class AileButcemPage {
    ////*[@text='Giriş Yap']

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(15)),this);}

    public void ilkekranAyarlari() throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(2000);
            ReusableMethods.ekranKaydirmaMethodu(930,1200,500,130,1200);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }


    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement emailKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement sifreKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[2]")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement girisYazisiDogrulama;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement HamburgerButonu;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public MobileElement hesabimButonu;









}
