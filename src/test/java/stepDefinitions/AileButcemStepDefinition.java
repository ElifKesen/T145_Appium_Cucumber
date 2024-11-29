package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.Random;

public class AileButcemStepDefinition {
    AileButcemPage page=new AileButcemPage();

    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
        Thread.sleep(2000);
        page.ilkekranAyarlari();

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String mail, String password, String girisYap) throws InterruptedException {
        page.emailKutusu.sendKeys(ConfigReader.getProperty(mail));
        Thread.sleep(2000);
        page.sifreKutusu.sendKeys(ConfigReader.getProperty(password));
        Thread.sleep(2000);
        page.girisYapButonu.click();
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() throws InterruptedException {
        Assert.assertTrue(page.girisYazisiDogrulama.isDisplayed());
        Thread.sleep(2000);
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String hesap) {
        page.HamburgerButonu.click();
        page.hesabimButonu.click();
       // ReusableMethods.scrollWithUiScrollableAndClick(hesap);

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} ve cinsiyet {string} degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_ve_cinsiyet_degisikleri_kaydedin_ve_değişikleri_dogrulayin(String string, String string2, String string3, String string4, String string5, String string6) {

    }
    @Given("uygulamayi kapatir")
    public void uygulamayi_kapatir() {

    }
}
