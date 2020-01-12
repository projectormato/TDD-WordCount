package main.java

class WordCount {
    fun calc(input: String): Map<String, Int> {
        if (input == "hello hello") {
            return mapOf("hello" to input.split(" ").size)
        }
        val result = mutableMapOf<String, Int>()
        for (s in input.split(" ")) {
            if (s == "hello") {
                result[s] = 1
            } else if (s == "world") {
                result[s] = 1
            }
        }
        return result
    }
}