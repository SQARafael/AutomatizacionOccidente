#language: es
Característica: Login en Spotyfy

  Esquema del escenario: Login exitoso en spotyfy
    Dado que el usuario abre el navegador y de clic al boton login
    Cuando el usuario ingrese las credenciales usuario "<Usuario>" y clave "<Clave>"
    Entonces el usuario podrá ver su perfil
    Ejemplos:
      | Usuario            | Clave     |
      | osdelrio@gmail.com | ASdf1234* |