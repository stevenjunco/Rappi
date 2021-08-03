Feature: Prueba de api https://reqres.in/

  Scenario Outline: Probando el método PUT del API
    When Se ejecuta el método PUT, actualizando el id "<user_id>" con el user "<user_name>" y el trabajo "<user_job>"
    Then se verifica que se actualizó correctamente con el nombre "<user_name>"
    Examples:
      | user_id | user_name | user_job   |
      | 1       | morpheus  | leader     |
      | 2       | diego     | sub leader |
      | 3       | steven    | jefe       |


