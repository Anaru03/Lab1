import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ItemDataJTest {

    @org.junit.Test
    fun `Given a list, When it has multiple elements, Then result type and info should be correct`() {
        val result = listOf(
            ItemDataJ(10),
            ItemDataJ("Enero"),
            ItemDataJ(null),
            ItemDataJ(true)
        )

        assertNotNull(result)
        assertTrue(
            result[0].getType() == "entero"
                    && result[0].getInfo() == "M10"
        )

        assertTrue(
            result[1].getType() == "cadena"
                    && result[1].getInfo() == "L5"
        )
        assertTrue(
            result[2].getType() == null
                    && result[2].getInfo() == null
        )

        assertTrue(
            result[3].getType() == "booleano"
                    && result[3].getInfo() == "Verdadero"
        )
    }
}