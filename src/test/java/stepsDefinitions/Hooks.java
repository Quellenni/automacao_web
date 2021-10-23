package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.CriarContaPage;

import static utils.Utils.*;

public class Hooks {


    @Before()
    public void setUp() {
        acessarSistema();
        Na(CriarContaPage.class).entrarCadastro("marywebtest@Gmail.com");

    }


    @Before(value = "@entrar")
    public void funcionalidadeEntrar() {
        acessarSistema();

    }


    @After()
    public void tearDown(Scenario scenario) {
        capturarTela(scenario);
    }
}
