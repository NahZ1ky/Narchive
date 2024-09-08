fun main() {
    dup("Ankara", 27, 31, 82)
    dup("Tokyo", 32, 36, 10)
    dup("Cape Town", 59, 64, 2)
    dup("Guatemala City", 50, 55, 7)
}

fun dup(city: String = "void", lowTemp: Int = 0, highTemp: Int = 100, CoR: Int = 0): Unit {
    println("City: $city\nLow temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $CoR%\n")
}