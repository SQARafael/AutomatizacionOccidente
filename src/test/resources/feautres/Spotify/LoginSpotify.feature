#language: es
  Característica: Login en Spotify

    Esquema del escenario: Login exitoso en spotify
      Dado El usuario abre el navegador y de clic al boton login
      Cuando El usuario ingrese las credenciales correctas usuario "<Usuario>" y contrasena "<Contrasena>"
      Entonces el usuario podrá ver su perfil
      Ejemplos:
        | Usuario                          | Contrasena         |  |
        | diaztorresjavierdario1@gmail.com | Automatizacion2023 |  |
