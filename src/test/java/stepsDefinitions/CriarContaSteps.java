package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.CriarContaPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class CriarContaSteps {


    @Quando("eu clicar no botao entrar")
    public void euClicarNoBotaoEntrar() {
        Na(CriarContaPage.class).clicarNoBotaoEntrar();
    }

    @Quando("informar o campo email address {string}")
    public void informarOCampoEmailAddress(String emailAdress) {
        Na(CriarContaPage.class).informarCampoEmailAdress(emailAdress);
    }

    @Quando("acionar o botao  create an account")
    public void acionarOBotaoCreateAnAccount() {
        Na(CriarContaPage.class).acionarBotaoCreateAnAccount();
    }


    @Entao("o sistema apresenta a tela criar uma conta")
    public void oSistemaApresentaATelaCriarUmaConta() {
        assertEquals("Authentication", driver.findElement(By.xpath("//span[@class='navigation_page']")));

    }
}
