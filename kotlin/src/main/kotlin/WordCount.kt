package main

class WordCount {
    fun calc(input: String): Map<String, Int> {
        return input.split(" ").groupingBy { it }.eachCount()
    }
}