package Rappi.StepDefinitions;

import Rappi.Locators.LocalizadorRespuesta;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostAPIStepDefinitions {

    @Steps
    Rappi.Methods.PostAPI PostAPI;

    @When("Se ejecuta el método POST, creando el usuario con el user {string} y el trabajo {string}")
    public void seEjecutaElMétodoPOSTCreandoElUsuarioConElUserYElTrabajo(String user_name, String user_job) {
        PostAPI.pruebaMétodoPost(user_name, user_job);
    }

    @Then("se verifica que se creó correctamente con el nombre {string}")
    public void seVerificaQueSeCreóCorrectamenteConElNombreEnviado(String user_name) {
        restAssuredThat(response -> response.statusCode(201));
        restAssuredThat(response -> response.body(LocalizadorRespuesta.user_name_response, equalTo(user_name)));
    }

}
