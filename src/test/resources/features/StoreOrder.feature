Feature: Crear y consultar pedidos
  Como usuario de la tienda de mascotas
  Quiero poder crear y consultar pedidos
  Para gestionar mis pedidos de manera efectiva

  Scenario Outline: Crear un pedido con diferentes datos
    Given un pedido con id <orderId> y petId <petId>
    When se crea el pedido
    Then el pedido con id <orderId> se crea correctamente

    Examples:
      | orderId | petId |
      | 1       | 100   |
      | 2       | 200   |

  Scenario Outline: Consultar un pedido existente con diferentes datos
    Given un pedido existente con id <orderId>
    When se consulta el pedido
    Then el pedido con id <orderId> se consulta correctamente

    Examples:
      | orderId |
      | 1       |
      | 2       |
