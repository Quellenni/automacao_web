package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.CadastrarUsuarioPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class CadastrarUsuarioSteps {


    @Quando("informar o campo First name {string}")
    public void informarOCampoFirstName(String firstName) {
        Na(CadastrarUsuarioPage.class).informarCampoFirstName(firstName);

    }

    @Quando("infomar o campo Last name {string}")
    public void infomarOCampoLastName(String lastName) {
        Na(CadastrarUsuarioPage.class).informarCampoLastName(lastName);

    }


    @Quando("informar o campo Email {string}")
    public void informarOCampoEmail(String email) {
        Na(CadastrarUsuarioPage.class).informarCampoEmail(email);

    }

    @Quando("informar campo Password {string}")
    public void informarCampoPassword(String senha) {
        Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);

    }


    @Quando("informar o campo First nameA {string}")
    public void informarOCampoFirstNameA(String firstNameA) {
        Na(CadastrarUsuarioPage.class).informarCampoFirstNameA(firstNameA);
    }

    @Quando("infomar o campo Last nameA {string}")
    public void infomarOCampoLastNameA(String lastNameA) {
        Na(CadastrarUsuarioPage.class).infomarCampoLastNameA(lastNameA);
    }

    @Quando("informar no campo Adress {string}")
    public void informarNoCampoAdress(String adress) {
        Na(CadastrarUsuarioPage.class).informarCampoAdress(adress);
    }


    @Quando("informar o campo City {string}")
    public void informarOCampoCity(String city) {
        Na(CadastrarUsuarioPage.class).informarCampoCity(city);
    }

    @Quando("informar o campo State")
    public void informarOCampoState() {
        Na(CadastrarUsuarioPage.class).informarCampoState();
    }


    @Quando("informar o campo Postal Code {string}")
    public void informarOCampoPostalCode(String postal) {
        Na(CadastrarUsuarioPage.class).informarCampoPostalCode(postal);
    }


    @Quando("informar o campo Country")
    public void informarOCampoCountry() {
        Na(CadastrarUsuarioPage.class).informarCampoCountry();

    }

    @Quando("informar o campo Mobile Phone {string}")
    public void informarOCampoMobilePhone(String phone) {
        Na(CadastrarUsuarioPage.class).informarCampoMobilePhone(phone);
    }


    @Quando("informar o campo Endereco Alternativo {string}")
    public void informarOCampoEnderecoAlternativo(String endereco) {
        Na(CadastrarUsuarioPage.class).informarCampoEnderecoAlternativo(endereco);
    }


    @Quando("acionar o botao Register")
    public void acionarOBotaoRegister() {
        Na(CadastrarUsuarioPage.class).acionarBotaoRegister();
    }

    @Entao("o sistema cadastra o usuario {string}")
    public void oSistemaCadastraOUsuario(String username) {
        assertTrue(driver.findElement(By.xpath("//span[text()='" + username + "']")).isDisplayed());
    }


}

