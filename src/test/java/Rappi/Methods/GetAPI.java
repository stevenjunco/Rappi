package Rappi.Methods;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAPI {

    private static String URL_GET = "https://reqres.in/api/users/{use_id}";

    @Step("Get API por usuario {0}")
    public void pruebaMétodoGet(String userid) {
        SerenityRest.given()
                .pathParam("use_id", userid)
                .get(URL_GET);
    }
}
