#language: es

Característica: reproduir una cancion en Spotify

Antecedentes:
  Dado que el usuario abre el navegador y de clic al boton login
  Cuando el usuario ingrese las credenciales correctas
  Entonces el usuario podrá ver su perfil


  Escenario: reproducir una cancion en spotify
    Dado que el usuario ingrese al buscador ingresa el nombre de la cancion a buscar
    Cuando el usuario seleccione la cancion
    Entonces el usuario podrá reproducir la cancion