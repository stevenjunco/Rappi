package Rappi.Methods;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

public class PutAPI {

    private static String URL_PUT = "https://reqres.in/api/users/{use_id}";

    @Step("Put API para actualizar el usuario con id {0} por usuario con nombre {1} y trabajo {2}")
    public void pruebaMétodoPut(String id_user, String user_name, String user_job) {

        Map<String, Object> Body = new HashMap<>();
        Body.put("name", user_name);
        Body.put("job", user_job);

        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .pathParam("use_id", id_user)
                .body(Body)
                .put(URL_PUT);
    }
}
