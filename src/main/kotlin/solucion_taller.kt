fun main() {
    println(" Hola mundo")
}

/*
Actividad 1 traduccion de ecuaciones
1.
var S= Math.sqrt(Math.pow(x-m,2.0)/(n-1))

2.
var P= -(Math.pow(y,3.0)-1)/((y+1)-Math.sqrt(y+1))
3.
var Z = (x (Math.pow((Math.pow(x, 2.0) + 1), 3.0))) / (Math.sqrt(2 x) + 1)

4.
var T = 1- ((Math.sqrt(x-2, 1.0/n))/(Math.pow(x,3.0)))

5.
var s = ((x != y) && (x <= y))

6.
var s =((a>=b(c))||(b<=c))

Actividad 2

a. 30+8*3/6-4%6
  R=

    30+24/6-4%6
    30+4-4%6
    30+4-4
    34-4
    30

b. 30.0 / 20.0 - 2.5 * 3.0
   R=

    30.0 / 20.0 - 2.5 * 3.0
    30.0 / 20.0 - 7.5
    30.0 / 20.0 - 7.5
    1.5-7.5
    -6.0

c. 8/4/2*6

   R=

    8/4/2*6
    8/4/12
    2/12
    0.17

* */


/* e. Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo,
pero cuando se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo
para solucionar este problema

Entradas:
- Año_nacimiento: double - an

Salidas:
- Edad: double - e
 */

println("Por favor registre su fecha de nacimiento")
var fechanacString= readLine()
var fechanacDate:Date=SimpleDateFormat(pattern"yyyy").parse(fechanacString)
var fechaactual=Date(System.currentTimeMillis())
var edad=fechaactual-fechanacDate

return edad

/*h. Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta,
considerando que lleva una velocidad constante. Realice una función para tal fin.

Entradas:
- distancia --> double --> d
- velocidad --> double --> v
Salidas:
- tiempo --> double --> t
*/

fun tiempopersona(d:Double, v:Double):Double{
    Val tmp =(d/v)
    return tmp
}

/* m. Escriba una función que halle el volumen de un cono

Entradas:
- área de la base
- altura

Salidas:
-volumen
 */

fun volumencono=(ab:Double, h:Double): Double{
    volumen = (ab*h)/3
    return volumen
}

/* n. En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables. Se
necesita un cable para conectar dos computadores, y debe haber conexión entre todos los computadores.
Escriba una función que determine el número de cables a comprar a partir del número de computadores que
hay en la sala.

Entradas:
# computadores --> double nc

Salidas:
totalcbles --> double --> tc
 */

fun conexionpc(nc: Double)Double>{
    val tc=nc/2
    return tc
}









