package main.java

class WordCount {
    fun calc(s: String): Map<String, Int> {
        return mapOf("hello" to s.split(" ").size)
    }
}