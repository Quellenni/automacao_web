package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriarContaPage {


    @FindBy(xpath = "//div/a[@class ='login']")
    private WebElement botaoEntrar;

    @FindBy(id = "email_create")
    private WebElement campoEmail;

    @FindBy(name = "SubmitCreate")
    private WebElement botaoCreateAccount;

    public void clicarNoBotaoEntrar() {
        botaoEntrar.click();

    }

    public void informarCampoEmailAdress(String emailAdress) {
        campoEmail.sendKeys(emailAdress);

    }

    public void acionarBotaoCreateAnAccount() {
        botaoCreateAccount.click();

    }

    public void entrarCadastro(String emailAdress) {
        clicarNoBotaoEntrar();
        informarCampoEmailAdress(emailAdress);
        acionarBotaoCreateAnAccount();

    }

}




