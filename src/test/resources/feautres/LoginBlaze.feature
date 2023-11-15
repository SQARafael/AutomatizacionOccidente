#language: es
  Característica: Login en Demo Blaze

    Esquema del escenario: Login exitoso en demo blaze
      Dado que el usuario abre el navegador e ingrese a login
      Cuando el usuario ingrese las credenciales usuario "<Usuario>" y clave "<Clave>"
      Entonces el usuario podrá ver la bienvenida del perfil
      Ejemplos:
        | Usuario       | Clave |
        | carl@mail.com | 1234  |
        | carl@mail.com | 12345 |