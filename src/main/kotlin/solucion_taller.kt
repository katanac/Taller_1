import java.text.SimpleDateFormat
import java.util.*

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


   Actividad 3

* */


/*
a. Realice una función que halle el área de un triángulo.
Entradas:

 base-> double->b
 altura-> double->a

Salidas:

Area -> double->ar
* */

fun calculoAreaTrianglo(b: Double, a: Double): Double {
    val ar = (b * a) / 2
    return ar
}


/*
b. Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
universidad.

Entradas:

valor alquiler -> double -> va
cantidad estudiantes -> double -> ce

Salidas:

biciletas necesarias -> double -> bn
total dinero del alquiler -> double -> da

* */

fun alquilerBiciletas(ce: Double, va: Double): Pair<Double, Double> {
    val bn = ce / 2
    val da = bn * va
    return Pair(bn, da)

}


/*
d. Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos

Entradas:
peso colombiano -> double -> pc
dolar actual -> double -> da

Salidas:

dolares adquiridos -> double -> d
* */

fun conversion(pc: Double, da: Double): Double {
    val d = pc / da
    return d
}

/*
f. Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere
que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas
yrealice una función que permita determinar el cobro.


Entradas:
cantidad Horas Estacionamiento -> double -> che
cobro por hora -> double -> ch

Salidas:
cobro final -> double -> cf
* */

fun calculoCobroEstacionamiento(che: Double, ch: Double): Double {
    val horasRedondeadas = Math.round(che)
    val cf = horasRedondeadas * ch
    return cf
}


/*
g. Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se
cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.


Entradas:
cantidad Metros Cuadrados -> double -> cm2
cobro por metro cuadrado -> double -> cxm2

Salidas:
cobro final -> double -> cf
* */

fun calculoCobroTrabajoPintura(cm2: Double, cxm2: Double): Double {
    val cf = cm2 * cxm2
    return cf
}

/*
i. Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis,
considerando que tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento y
el precio final)


Entradas:
precioNetoArticulo -> double -> pna

Salidas:
descuento -> double -> d
precioFinal -> double -> pf
* */

fun precioArticulo(pna: Double): Double {
    val des = pna * 0.05
    val d = pna - des
    val pf = d * 0.19
    return pf
}


/*
j. Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza tres
exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de
50%.

Entradas:
nota examen uno -> double -> n1
nota examen dos -> double -> n2
nota examen tres -> double -> n3

Salidas:

nota final -> double -> nf

* */

fun calculoNotaFinal(n1: Double, n2: Double, n3: Double): Double {
    var valorExamenUno = n1 * 0.25
    var valorExamenDos = n2 * 0.25
    var valorExamenTres = n3 * 0.50
    val nf = valorExamenUno + valorExamenDos + valorExamenTres
    return nf
}


/*
l. El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la
asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios:
 Para alumnos mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00;
  con promedio mayor o igual a 75, de$1000.00;
  para los promedios menores de 75 pero mayores o iguales a 60, de $500.00;
   a los demás se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar.

   A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 90, se les dará $3000;
   con promedios menores a 90 pero mayores o iguales a 80, $2000;
   para los alumnos con promedios menores a 80 pero mayores o iguales a 60, se les dará $100,
   y a los alumnos que tengan promedios menores a 6 se les enviará carta de invitación. Realice la función correspondiente.


Entradas:

edad estudiante -> int -> ee
promedio estudiante ->pe

Salidas:

valor beca -> double -> vb

* */

fun calculoValorBeca(ee: Int, pe: Double): Double {
    return if (ee > 18) valorBecaMayoresEdad(pe)
    else valorBecaMenorEdad(pe)
}

fun valorBecaMayoresEdad(pe: Double): Double {
    if (pe >= 90) return 2000.00
    else if (pe >= 75) return 1000.00
    else if (pe < 75 && pe >= 60) return 500.00
    return 0.0
}

fun valorBecaMenorEdad(pe: Double): Double {
    if (pe >= 90) return 3000.00
    else if (pe < 90 && pe >= 80) return 2000.00
    else if (pe < 80 && pe >= 60) return 100.00
    return 0.0
}

/*
k. Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona de menor
edad.

Entradas:
persona uno -> double -> p1
persona dos -> double -> p2
persona tres -> double -> p3

Salidas:

persona menor -> double -> pm

* */

class Persona {
    var nombre: String
    var edad: Int

    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
}


fun calculoPersonaMenor(p1: Persona, p2: Persona, p3: Persona): Pair<String, Int> {

    val listadoPersonas: List<Persona> = listOf(p1, p2, p3)

    val menorEntreP1P2 = Math.min(p1.edad, p2.edad)
    val menor = Math.min(menorEntreP1P2, p3.edad)

    listadoPersonas.forEach {
        if (it.edad == menor) {
            return Pair(it.nombre, it.edad)
        }
    }
    return Pair("persona no existe", 0)
}


/*
o. Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán contaminados
por la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?

Entradas:
cantidad personas en la ciudad -> int -> psn

Salidas:

litros de agua contaminados -> int -> lac

* */

fun aguaPotableContaminada(psn: Int): Int {
    val bateriasXSemestre = psn * 2
    val bateriasAnio = bateriasXSemestre * 2
    val lac = bateriasAnio * 175
    return lac
}

/* e. Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo,
pero cuando se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo
para solucionar este problema

Entradas:
- Año_nacimiento: double - an

Salidas:
- Edad: double - e
 */

fun asdsadasdas(){
println("Por favor registre su fecha de nacimiento")
var fechanacString= readLine()
var fechanacDate: Date = SimpleDateFormat(pattern"yyyy").parse(fechanacString)
var fechaactual=Date(System.currentTimeMillis())
var edad=fechaactual-fechanacDate

return edad
}
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


/*
p. Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función
que permita determinar cuántos minutos y segundos debo esperar para descargar la última película de La
Mujer Maravilla.

Entradas:

peso pelicula en gigabytes -> Double -> ppg

Salidas:

tiempo espera -> int -> te

* */

fun calculoDescargaPelicula(ppg: Double): Double {

    val unGbAMb = 1024
    //funcion -> ((ppg*UnGbAMb)/4)/(60)
    val te = ((ppg * unGbAMb) / 4) / 60
    return te
}


/*
El valor presente de un cierto capital de dinero a una tasa de interés de durante años se encuentra a partir
de la fórmula:

VP= c/Math.pow(1+t,n)

Escriba una función que determine el valor presente a partir de los datos de entrada dados

Entradas:

capital -> Double -> c
tasa interes -> Double ->t
anios -> Double -> n

Salidas:

VP -> int -> vp

* */

fun calculoValoPresente(c: Double, t: Double, n: Double): Double {
    val vp = c / (Math.pow(1 + t, n))
    return vp
}


