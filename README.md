# Trabajo-practico-2
En un puerto deportivo se alquilan amarres para barcos de distinto tipo.
Cada amarre posee un identificador y una posición y un indicador si está libre u ocupado (pueden usar el
boolean para indicar si está libre u ocupado).
Para cada alquiler se guarda el cliente, el día inicial y el día final de alquiler (usar números de 1 a 30), el amarre
y el barco que lo ocupará.
Del cliente solo conocemos el nombre, el apellido y el DNI.
Un barco se caracteriza por su tipo, posee una matrícula, la eslora (en metros) y año de fabricación. Hay un
tipo especial de barco que se llama anfibio (Interface), que tiene la característica de poder responder a
cuantas ruedas tiene y a que velocidad viaja cuando está en tierra.
Los tipos de barcos y el precio de alquiler por día de cada uno son:

Tipo de Barco velero yate catamarán lancha anfibio motos acuáticas
Precio $ 100 $ 200 $ 150 $ 50 $175 $ 25

Un alquiler se calcula multiplicando el número de días de ocupación y el precio de cada tipo (incluyendo los
días inicial y final).
La cantidad de amarres y alquileres es un número finito que lo determina cada alumno.
Lo pueden resolver usando Listas o con Vectores o Arrays.



Actividades:
1. Hacer el diagrama de las clases necesarias y las relaciones para modelar el sistema.
2. Crear las clases necesarias para modelar el sistema solicitado con los atributos y métodos que consideres
necesarios para poder setear y obtener los datos de cada uno de los atributos descriptos anteriormente
con el constructor más adecuado.
3. Cada clase diseñada debe contener las declaraciones de métodos y variables siguiendo las reglas
sintácticas y por convención. También se aplican las reglas para los identificadores de proyecto y
paquete.
4. El código debe representar la sobreescritura del método toString().
5. Crear una clase PuertoTest que:
1. Cree la cantidad de barcos distintos que considere necesarios para hacer las siguientes acciones y
que se vean reflejado el cambio de estado de los amarres y los alquileres.
2. Se debe poder mostrar, en cualquier momento de la ejecución:
◦ la cantidad total de amarres.
◦ la cantidad total de amarres ocupados.
◦ la cantidad total de amarres libres.
◦ El listado de todos los amarres y el estado de cada uno de ellos.
3. Se debe poder mostrar, en cualquier momento de la ejecución:
◦ la cantidad de alquileres realizados.
◦ la cantidad de alquileres que no han finalizado.
◦ El listado de los alquileres que no han finalizado.
4. En los listados, al informar se debe indicar las características de los barcos y en caso de que sea
un anfibio, indicar la cantidad de ruedas y velocidad en tierra que posee.
5. Al momento de realizar un alquiler, se debe cambiar el estado del amarre de libre a ocupado.
6. Al momento de finalizar el alquiler, se debe cambiar el estado del amarre de ocupado a libre.
