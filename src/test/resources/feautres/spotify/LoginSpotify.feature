#language: es
Característica: Login en Spotify

  Esquema del escenario: Login exitoso en spotify
    Dado que el usuario abre el navegador y de clic al boton login
    Cuando el usuario ingrese las credenciales correctas usuario "<Usuario>" y clave "<Clave>"
    Entonces el usuario podrá ver su perfil
    Ejemplos:
      | Usuario             | Clave  |
      | julieth@hotmail.com | 123456 |