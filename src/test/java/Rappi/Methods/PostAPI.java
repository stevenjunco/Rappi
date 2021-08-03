package Rappi.Methods;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

public class PostAPI {

    private static String URL_POST = "https://reqres.in/api/users/";

    @Step("Post API por usuario con nombre {0} y trabajo {1}")
    public void pruebaMétodoPost(String user_name, String user_job) {

        Map<String, Object> Body = new HashMap<>();
        Body.put("name", user_name);
        Body.put("job", user_job);

        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .body(Body)
                .post(URL_POST);
    }
}
