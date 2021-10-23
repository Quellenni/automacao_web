package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static utils.Utils.driver;

public class CadastrarUsuarioPage {
    Select state = new Select(
            driver.findElement(By.xpath("//select[@id='id_state']")));
    @FindBy(name = "customer_firstname")
    private WebElement campoFirstName;
    @FindBy(name = "customer_lastname")
    private WebElement campoLastName;
    @FindBy(name = "email")
    private WebElement campoEmail;
    @FindBy(name = "passwd")
    private WebElement campoPassword;
    @FindBy(id = "firstname")
    private WebElement campoFirstNameA;
    @FindBy(id = "lastname")
    private WebElement campoLastNameA;
    @FindBy(id = "address1")
    private WebElement campoAdress;
    @FindBy(id = "city")
    private WebElement campoCity;
    @FindBy(id = "postcode")
    private WebElement campoPostalCode;

    @FindBy(id = "id_country")
    private WebElement campoCountry;

    @FindBy(name = "phone_mobile")
    private WebElement campoPhone;

    @FindBy(name = "alias")
    private WebElement campoEndereco;

    @FindBy(xpath = "//*[@id='submitAccount']/span")
    private WebElement botaoRegister;


    public void informarCampoFirstName(String firstName) {
        campoFirstName.sendKeys(firstName);
    }

    public void informarCampoLastName(String lastName) {
        campoLastName.sendKeys(lastName);
    }

    public void informarCampoEmail(String email) {
        campoEmail.clear();
        campoEmail.sendKeys(email);
    }


    public void informarCampoPassword(String senha) {

        campoPassword.sendKeys(senha);

    }


    public void informarCampoFirstNameA(String firstNameA) {
        campoFirstNameA.clear();
        campoFirstNameA.sendKeys(firstNameA);
    }


    public void infomarCampoLastNameA(String lastNameA) {
        campoLastNameA.clear();
        campoLastNameA.sendKeys(lastNameA);

    }


    public void informarCampoAdress(String adress) {

        campoAdress.sendKeys(adress);
    }

    public void informarCampoCity(String city) {

        campoCity.sendKeys(city);
    }

    public void informarCampoState() {
        state.selectByValue("22");

    }


    public void informarCampoPostalCode(String postalCode) {
        campoPostalCode.sendKeys(postalCode);

    }


    public void informarCampoCountry() {
        campoCountry.sendKeys();

    }

    public void informarCampoMobilePhone(String phone) {
        campoPhone.sendKeys(phone);
    }

    public void informarCampoEnderecoAlternativo(String endereco) {
        campoEndereco.clear();
        campoEndereco.sendKeys(endereco);
    }


    public void acionarBotaoRegister() {
        botaoRegister.click();
    }
}










