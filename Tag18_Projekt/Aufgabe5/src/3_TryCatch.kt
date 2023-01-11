//TODO: Ruf die Funktion divideByZero() mit einer Zahl deiner Wahl auf.
//TODO: Fange den Laufzeitfehler mit einem Try-Catch-Block ab und gib eine Fehlermeldung deiner Wahl über die
// println()-Funktion in der Konsole aus.

fun main() {
    try {
        divideByZero(3)
    } catch (e: Exception) {
        println("Nicht möglich!")
    }
}

fun divideByZero(number: Int): Int {
    return number / 0
}