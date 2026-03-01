package core;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class ApiClient {

    public Response get(String path) {
        return given()
                .spec(SpecFactory.requestSpec())
                .when()
                .get(path)
                .then()
                .extract()
                .response();
    }

    public Response post(String path, Object body) {
        return given()
                .filter(Filters.allure())
                .spec(SpecFactory.requestSpec())
                .body(body)
                .when()
                .post(path)
                .then()
                .extract()
                .response();
    }

    public Response put(String path, Object body) {
        return given()
                .filter(Filters.allure())
                .spec(SpecFactory.requestSpec())
                .body(body)
                .when()
                .put(path)
                .then()
                .extract()
                .response();
    }
}