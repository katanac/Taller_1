import org.junit.jupiter.api.Assertions.*

internal class Solucion_tallerKtTest {

    @org.junit.jupiter.api.Test
    fun calculoAreaTrianglo() {
        assertEquals(2.0, calculoAreaTrianglo(2.0, 2.0))
    }

    @org.junit.jupiter.api.Test
    fun alquilerBiciletas() {
        val datosAlquiler = alquilerBiciletas(100, 1.000)
        val bicicletas = datosAlquiler.first
        val precioAlquiler = datosAlquiler.second

        assertEquals(50, bicicletas)
        assertEquals(50.000, precioAlquiler)
    }


    @org.junit.jupiter.api.Test
    fun calculoDesempleados() {
        assertEquals(652.0, calculoDesempleados(8000.0))
    }


    @org.junit.jupiter.api.Test
    fun conversion() {
        assertEquals(3.0, conversion(10500.0, 3500.0))
    }

    @org.junit.jupiter.api.Test
    fun calculoFecha() {
        assertEquals(25, calculoFecha(1997))
    }

    @org.junit.jupiter.api.Test
    fun testCalculoCobroEstacionamiento() {
        assertEquals(4000.0, calculoCobroEstacionamiento(3.6, 1000.0))
    }

    @org.junit.jupiter.api.Test
    fun calculoCobroTrabajoPintura() {
        assertEquals(25000.0, calculoCobroTrabajoPintura(5.0, 5000.0))
    }

    @org.junit.jupiter.api.Test
    fun tiempopersona() {
        assertEquals(0.6, tiempopersona(6.0, 10.0))
    }

    @org.junit.jupiter.api.Test
    fun precioArticulo() {

        val datos = precioArticulo(100000.0)
        val descuento = datos.first
        val precioFinal = datos.second

        assertEquals(5000.0, descuento)
        assertEquals(113050.0, precioFinal)
    }

    @org.junit.jupiter.api.Test
    fun calculoNotaFinal() {
        assertEquals(3.75, calculoNotaFinal(4.0, 5.0, 3.0))
    }

    @org.junit.jupiter.api.Test
    fun calculoPersonaMenor() {

        val persona1 = Persona("Yannis", 24)
        val persona2 = Persona("Tatiana", 25)
        val persona3 = Persona("Maria", 14)

        val datos = calculoPersonaMenor(persona1, persona2, persona3)

        val nombre = datos.first
        val edad = datos.second

        assertEquals("Maria", nombre)
        assertEquals(14, edad)

    }


    @org.junit.jupiter.api.Test
    fun calculoValorBeca() {
        assertEquals(2000.00, calculoValorBeca(20, 90.0))
    }


    @org.junit.jupiter.api.Test
    fun volumencono() {
        assertEquals(4.0, volumencono(3.0, 4.0))
    }

    @org.junit.jupiter.api.Test
    fun conexionpc() {
        assertEquals(10.0, conexionpc(20.0))
    }

    @org.junit.jupiter.api.Test
    fun aguaPotableContaminada() {
        assertEquals(70000, aguaPotableContaminada(100))
    }

    @org.junit.jupiter.api.Test
    fun calculoDescargaPelicula() {
        assertEquals(12.8, calculoDescargaPelicula(3.0))
    }

    @org.junit.jupiter.api.Test
    fun calculoValoPresente() {
        assertEquals(0.037037037037037035, calculoValoPresente(3.0,2.0,4.0))
    }


}