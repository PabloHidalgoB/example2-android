# Aplicacion de ejemplo 2 - Android

En este se proyecto se aprende a utilizar Fragments en combinacion con el MainActivity para hacer traspaso de informacion que sera 
desplegada en pantalla, junto con la posibilidad del programa para ser desplegado tanto como en portrait como en landscape.

<img src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/main.png" data-canonical-src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/main.png" width="200" height="auto" />

Este programa actua de manera automatica por lo cual lo unico que el usuario debe realizar es interactuar con el telefono ya sea girandolo
para que quede de forma horizontal o vertical, o explorar el scroll view que se despliega cuando el telefono (o tablet) esta posicionado 
de forma vertical

De forma resumida, el MainActivity ha de controlar 3 variables de string que se las entrega a 3 distintas clases fragments para posteriormente ser desplegadas en FrameLayouts destinados a almacenar estos fragments

<img src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/main.png" data-canonical-src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/main.png" width="200" height="auto" />

<img src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/scroll.png" data-canonical-src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/scroll.png" width="200" height="auto" />

Notara que esta vista representa el scroll view cuando el telefono (o tablet) se sostiene de manera vertical mientras que la siguiente 
imagen es la vista horizontal del programa 

<img src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/landscape.png" data-canonical-src="https://github.com/PabloHidalgoB/example2-android/blob/master/app/src/main/res/screenshots/landscape.png" width="400" height="auto" />

Explicando el programa de una manera mas detallada, se genera una vista de tipo landscape que funciona de manera paralela con la vista 
principal del programa, en estas vistas uno puede especificar los tipos de datos que uno crea pertiente mostrar y en que tipo de formato, 
estas vistas son controladas por una unica clase la cual es el MainActivity.
Para este fin se crearon 3 FrameLayouts dentro de estas dos vistas (portrait y landscape pertenecientes al MainActivity) que, a su vez, 
almacenan 3 vistas xml las cuales son controladas por 3 clases de tipo Fragment, la clase MainActivity se encarga de manejar las clases 
Fragment para que puedan desplegar los datos que este desea mostrar (en este caso, 3 mensajes distintos, uno para cada fragment), estas 
clases Fragment se encargan de mostrar el dato entregado por el MainActivity, controlando sus respectivos xml para ser desplegado dentro 
del activity_main ya sea en landscape o portrait.
