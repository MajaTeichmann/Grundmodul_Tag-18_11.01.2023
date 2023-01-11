//TODO: In dieser Aufgabe bekommst du Code gegeben, in dem ein try-catch Block verwendet wird. Hier geht es
// um das Bestellen von Schuhen und was passiert, wenn keine Schuhe mehr da sind.
// Schau dir den Codeausschnitt an.
// Was wird hier ausgegeben?
// Notiere dir deine Antwort. (z.B. in einem Kommentar)
// Führe dann den Code aus.
// Wird das ausgegeben, was du dir notiert hast?

var numberOfShoes = 0

fun main() {
    try {
        orderShoes()
    } catch (e: Exception) {
        println("Diese Schuhe sind leider ausverkauft")
    }
}

fun orderShoes() {
    println("Es wird überprüft ob die Schuhe noch vorrätig sind...")
    if (numberOfShoes > 0) {
        println("Die Schuhe wurden bestellt")
        numberOfShoes = numberOfShoes - 1
    } else {
        throw Exception("no shoes available")
    }
}

/*
Schreibe hier deine Antwort auf: Diese Schuhe sind leider ausverkauft

 */
