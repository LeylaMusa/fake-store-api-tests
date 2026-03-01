package core;

import config.EnvConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpecFactory {

    public static RequestSpecification requestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(config.EnvConfig.baseUrl())
                .setContentType(ContentType.JSON)
                .addFilter(core.Filters.allure())
                .build();

    }
}