//TODO: In dieser Aufgabe bekommst du Code gegeben, in dem ein try-catch Block verwendet wird. Es geht
// dabei um die Buchung von Sitzplätzen in einem Flugzeug.
// Schau dir den Codeausschnitt an.
// Was wird hier ausgegeben?
// Notiere dir deine Antwort. (z.B. in einem Kommentar)
// Führe dann den Code aus.
// Wird das ausgegeben, was du dir notiert hast?

var availableSeats = 6

fun main() {
    try {
        reserveSeats(8)
    } catch (e: Exception) {
        println("Es sind leider nicht mehr genug Sitzplätze verfügbar.")
    }
}

fun reserveSeats(numberOfSeats: Int) {
    println("Es wird überprüft, ob noch " + numberOfSeats + " Sitzeplätze verfügbar sind...")
    if (numberOfSeats > availableSeats) {
        throw Exception("not enough available seats left")
    } else {
        availableSeats = availableSeats - numberOfSeats
        println("Die Sitzplätze wurden erfolgreich gebucht!")
    }
}

//Hinweis: Eine Variable muss nicht zwingend innerhalb einer Funktion angelegt werden, sie kann auch außerhalb
// angelegt werden.

/*
Schreibe hier deine Antwort auf: Es sind leider nicht mehr genug Sitzplätze verfügbar.

 */
