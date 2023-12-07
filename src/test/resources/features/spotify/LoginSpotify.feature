#language: es
Característica: Login en Spotify

  @LoginSpotify
 Esquema del escenario: : Login exitoso en spotify
    Dado que el usuario abre el navegador y de clic al boton iniciar sesión
    Cuando el usuario ingrese las credenciales correctas usuario "<Usuario>" y contraseña "<Clave>"
    Entonces el usuario podrá ver su perfil
    Ejemplos:
      | Usuario                | Clave          |
      | samudio_09@hotmail.com | Zamudio1989#%* |



