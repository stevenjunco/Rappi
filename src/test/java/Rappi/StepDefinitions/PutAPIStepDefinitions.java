package Rappi.StepDefinitions;

import Rappi.Locators.LocalizadorRespuesta;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PutAPIStepDefinitions {

    @Steps
    Rappi.Methods.PutAPI PutAPI;

    @When("Se ejecuta el método PUT, actualizando el id {string} con el user {string} y el trabajo {string}")
    public void seEjecutaElMétodoPUTActualizandoElIdConElUserYElTrabajo(String user_id, String user_name, String user_job) {
        PutAPI.pruebaMétodoPut(user_id, user_name, user_job);
    }

    @Then("se verifica que se actualizó correctamente con el nombre {string}")
    public void seVerificaQueSeActualizóCorrectamenteConElNombre(String user_name) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body(LocalizadorRespuesta.user_name_response, equalTo(user_name)));
    }

}
