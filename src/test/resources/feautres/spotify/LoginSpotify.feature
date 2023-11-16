#language: es
Característica: Login en Spotify

  Esquema del escenario: : Login exitoso en spotify
    Dado que el usuario abre el navegador y de clic al boton login
    Cuando el usuario ingrese las credenciales usuario "<Usuario" y clave <"Clave">
    Entonces el usuario podrá ver su perfil
    Ejemplos:
      | Usuario       | Clave |
      | lmgarzon.lis@hotmail.com | L1n4L1s85*|