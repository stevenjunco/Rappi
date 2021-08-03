package Rappi.StepDefinitions;

import Rappi.Locators.LocalizadorRespuesta;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAPIStepDefinitions {

    @Steps
    Rappi.Methods.GetAPI GetAPI;

    @When("Se ejecuta el método GET, buscando el user {string}")
    public void seEjecutaElMétodoGETBuscandoElUserUser_id(String user_id) {
        GetAPI.pruebaMétodoGet(user_id);
    }

    @Then("se verifica que el nombre del usuario es {string}")
    public void seVerificaQueElNombreDelUsuarioEs(String user_name) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body(LocalizadorRespuesta.user_name, equalTo(user_name)));
    }
}
