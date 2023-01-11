//Todo: In dieser Aufgabe ist eine Liste "numbers" mit 4 Elementen vorgegeben. Darunter versuchen wir
// der Variable "number" das 10. Element aus der Liste zu geben. Das geht nicht, da wir in der Liste
// nur 4 Elemente haben. Das heißt, es wird ein Laufzeitfehler erzeugt.
// Deine Aufgabe ist es nicht den Fehler zu beheben, sondern nur ihn aufzufangen. Schreibe einen
// Try-Catch-Block, der diesen Fehler auffängt. Dabei soll eine Fehlermeldung
// (denk dir eine Fehlermeldung aus) mit der println()-Funktion in der Konsole ausgegeben werden und
// der Wert der Variable “number” soll auf -1 gesetzt werden.

fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number: Int
    try {
        number = numbers[10]
    } catch (e: Exception) {
        println("Zahl zu hoch!")
        number = -1
    }
}