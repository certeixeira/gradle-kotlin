import org.junit.Assert
import org.junit.Test

class SomaInteirosTest {

    @Test
    fun `deve Somar Dois Numeros`(){
        Assert.assertEquals(3, SomaInteiros().soma(1,2))
    }

}