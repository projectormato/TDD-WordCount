package test.java

import main.java.WordCount
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class WordCountTest {

    @Test
    fun SampleTest() {
        assertTrue(true)
    }

    @Test
    fun InputIneHello() {
        assertEquals(WordCount().calc("hello"), mapOf("hello" to 1))
    }

}