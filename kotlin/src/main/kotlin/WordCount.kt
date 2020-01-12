package main.java

class WordCount {
    fun calc(input: String): Map<String, Int> {
        val result = mutableMapOf<String, Int>()
        for (s in input.split(" ")) {
            if (result[s] != null) {
                result[s] = result[s]!!.plus(1)
            } else {
                result[s] = 1
            }
        }
        return result
    }
}