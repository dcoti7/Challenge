# CHALLENGE CONVERSOR DE MONEDAS
Este proyecto es el primer challenge de la formación **Back End** con **Java y Spring Boot** de **ALURA LATAM**

El desafío consta de un menú donde se le pregunta al usuario que escoga una de las opciones 

![Menú](https://github.com/dcoti7/Challenge/assets/157064508/b44041a6-a41b-4013-92a9-deef4327b0f7)

El usuario al escoger una de las opciones le brinda la respuesta de la converción, esto es posbile gracias al consumo de una API.

![Captura de pantalla 2024-05-08 084033](https://github.com/dcoti7/Challenge/assets/157064508/2b4144c2-cb72-405f-9c3f-80675440aeef)

## El proyecto esta construido por 3 clases: 
* Clase Principal (Main)
* Clase ConsumoApi
* Clase Conversor

## Clase Principal (Main) 

En esta clase podemos observar toda la lógica del codigo, observamos la instancia de objetos tipo **ConsumoApi** como **Conversor**
observamos que esta basado a un bucle while donde valida que la variable **menu=true;**

### Biblioteca Gson

Esta es una biblioteca utilizada para obtener la respuesta de la petición hacia la Api y convertirla en formato Json, de tal manera que 
se pueda manipular la información de una mejor forma. 

## Clase ConsumoApi

Esta clase es la encargada de hacer la peticion **GET** hacia la Api y devolver un objeto con la información. 

## Clase Conversor

Esta clase tiene como parametro una parámetro de tipo: 
* Map<String , Double> conversion_rates
El cual es el encargado de almacenar la información obtenida de la clase ConsumoApi. 
