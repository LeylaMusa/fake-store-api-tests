package core;

import io.qameta.allure.restassured.AllureRestAssured;

public class Filters {
    public static AllureRestAssured allure() {
        return new AllureRestAssured();
    }
}