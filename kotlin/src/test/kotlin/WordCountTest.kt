package test.java

import main.java.WordCount
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class WordCountTest {

    @Test
    fun sampleTest() {
        assertTrue(true)
    }

    @Test
    fun inputOneHello() {
        assertEquals(WordCount().calc("hello"), mapOf("hello" to 1))
    }

    @Test
    fun inputTwoHello() {
        assertEquals(WordCount().calc("hello hello"), mapOf("hello" to 2))
    }

    @Test
    fun inputHelloWorld() {
        assertEquals(WordCount().calc("hello world"), mapOf("hello" to 1, "world" to 1))
    }
}