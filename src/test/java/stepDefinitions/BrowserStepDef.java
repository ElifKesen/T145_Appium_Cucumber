package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDef {
    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");

    }
    @Given("{string} sayfasina gider")
    public void sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));


    }
    @Then("Avantajli urunler icon u oldugunu dogrular")
    public void avantajli_urunler_icon_u_oldugunu_dogrular() throws InterruptedException {

       // BrowserDriver.getBrowserDriver().findElementByXPath("(//*[@src='https://images.hepsiburada.net/banners/s/1/104-104/IMAGE-BADGE-EnAvantajli133709686739364322.png'])[1]").isDisplayed();
        Assert.assertTrue("Icon",BrowserDriver.getBrowserDriver().findElementByXPath("(//*[@src='https://images.hepsiburada.net/banners/s/1/104-104/IMAGE-BADGE-EnAvantajli133709686739364322.png'])[1]").isDisplayed());
        Thread.sleep(2000);



    }
    @Then("Avantajli urunler listesinin acildigini dogrular")
    public void avantajli_urunler_listesinin_acildigini_dogrular() {


    }







}

