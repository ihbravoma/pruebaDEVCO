#language: es
#author: Ian Bravo Manuel

Característica: NotePad

  #Escenario: Eliminar un articulo de la lista
    #Dado que "Ian" ingresa a la pagina
    #Cuando ingresa a la seccion de lista de tareas
    #Y elimina el articulo numero "3" de la lista
    #Entonces no se debe visualizar

    Escenario: Crear una nota de texto enriquecido con letra negrita
      Dado que "Ian" ingresa a la pagina
      Cuando ingresa a la seccion Nota Texto Enriquecido
      Y escribe "hola mundo" en negrita
      Entonces el texto se debe visualizar en negrita


