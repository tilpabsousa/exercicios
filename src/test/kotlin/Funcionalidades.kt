import org.example.soma
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Funcionalidades {

    @Test
    fun somaTipoTest() {
        val response = soma(10, 10)
        Assertions.assertEquals(response, 20)
    }

    @Test
    fun somaValorTest() {
        val response = soma(10, 10)
        Assertions.assertEquals(response, 20)
    }

}

