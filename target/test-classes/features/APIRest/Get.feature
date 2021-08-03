Feature: Prueba de api https://reqres.in/

  Scenario Outline: Probando el método GET del API
    When Se ejecuta el método GET, buscando el user "<user_id>"
    Then se verifica que el nombre del usuario es "<user_name>"
    Examples:
      | user_id | user_name |
      | 1       | George    |
      | 2       | Janet     |
      | 3       | Emma      |


