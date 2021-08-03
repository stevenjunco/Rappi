Feature: Prueba de api https://reqres.in/

  Scenario Outline: Probando el método POST del API
    When Se ejecuta el método POST, creando el usuario con el user "<user_name>" y el trabajo "<user_job>"
    Then se verifica que se creó correctamente con el nombre "<user_name>"
    Examples:
      | user_name | user_job   |
      | morpheus  | leader     |
      | diego     | sub leader |
      | steven    | jefe       |


