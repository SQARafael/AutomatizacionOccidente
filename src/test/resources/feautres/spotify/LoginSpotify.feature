#language: es
Característica: Login en Spotify

  Esquema del escenario: Login exitoso en spotify
    Dado que el usuario abre el navegador y de clic al boton login
    Cuando el usuario ingrese las credenciales correctas Usuario "<usuario>" y Clace "<clave>"
    Entonces el usuario podrá ver su perfil
    Ejemplos:
      | usuario                 | clave         |
      | alejandrop758@gmail.com | Alejandrop758 |