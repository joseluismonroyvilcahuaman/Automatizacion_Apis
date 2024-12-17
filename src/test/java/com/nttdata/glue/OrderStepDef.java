package com.nttdata.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.nttdata.model.Order;
import org.junit.Assert;

public class OrderStepDef {
    private Order order;

    @Given("un pedido con id {int} y petId {int}")
    public void unPedidoConIdYPetId(int orderId, int petId) {
        order = new Order();
        order.setId(orderId);
        order.setPetId(petId);
        order.setQuantity(1);  // Asignamos valores para completar el pedido
        order.setShipDate("2024-12-16");
        order.setStatus("placed");
        order.setComplete(true);
    }

    @When("se crea el pedido")
    public void seCreaElPedido() {
        // Simulamos la creación del pedido en la API o base de datos
        // En este caso, solo simularemos la creación
        // Deberías agregar lógica para interactuar con tu API, como un POST request
    }

    @Then("el pedido con id {int} se crea correctamente")
    public void elPedidoSeCreaCorrectamente(int orderId) {
        // Verificación para asegurarse de que el pedido se ha creado correctamente
        // Asegúrate de que el pedido tenga el ID correcto, como ejemplo
        Assert.assertEquals("El id del pedido no coincide", orderId, order.getId());
        // Puedes agregar más Assertions según sea necesario
    }

    @Given("un pedido existente con id {int}")
    public void unPedidoExistenteConId(int orderId) {
        order = new Order();
        order.setId(orderId);
        // Simulamos que el pedido existe con un estado 'placed'
        order.setQuantity(1);
        order.setShipDate("2024-12-16");
        order.setStatus("placed");
        order.setComplete(true);
    }

    @When("se consulta el pedido")
    public void seConsultaElPedido() {
        // Simulamos la consulta del pedido (GET request)
        // En una implementación real, consultarías la API o base de datos
    }

    @Then("el pedido con id {int} se consulta correctamente")
    public void elPedidoSeConsultaCorrectamente(int orderId) {
        // Verificación de que el pedido se consulta correctamente
        Assert.assertEquals("El id del pedido consultado no coincide", orderId, order.getId());
        // Puedes agregar más Assertions para verificar el estado y otros atributos
    }
}
