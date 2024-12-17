package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import com.nttdata.model.Order;

public class OrderStep {
    @Step
    public void crearPedido(Order order) {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(order)
                .post("https://petstore.swagger.io/v2/store/order");
    }

    @Step
    public void consultarPedido(int orderId) {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .pathParam("orderId", orderId)
                .get("https://petstore.swagger.io/v2/store/order/{orderId}");
    }
}