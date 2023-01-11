//TODO: Wir wollen einen Türsteher simulieren, der unter 18-Jährige nicht in einen Club lässt.
// Befolge dazu folgende Schritte:
// Das Alter einer Person wird über die Konsole mit der readln()-Funktion eingelesen.
// Die Eingabe wird in der Variable alterInput gespeichert.
// Dann wird ein Try-Catch-Block erstellt, indem wir die Eingabe versuchen zu einem Integer zu konvertieren.
// Hier kann ein Laufzeitfehler erzeugt werden.
// Schreibe dazu im Try-Block folgende Zeile: var alter: Int = alterInput.toInt()
// Im Catch-Block geben wir eine geeignete Fehlermeldung aus, wenn ein Laufzeitfehler entsteht.
// Im Try-Block geben wir: "Willkommen, hier ist dein Bier, let's party!" in der Konsole aus, wenn das Alter größer oder gleich 18 ist.
// Ansonsten geben wir: "Sorry, kein Einlass zur Party. Ist ab 18." in der Konsole aus.
// Probier dann dein Programm aus.
// Lass es ein paar mal laufen und gib dann über die Konsole verschiedene Alter ein.
// Macht der Türsteher seinen Job?
// Was passiert, wenn du keine Zahl, sondern einen Text in der Konsole eingibst?

fun main() {
    println("Bitte gib dein Alter ein:")
    var alterInput = readln()
    try {
        var alter: Int = alterInput.toInt()
        if (alter >= 18) {
            println("Willkommen, hier ist dein Bier, let's party!")
        } else println("Sorry, kein Einlass zur Party. Ist ab 18.")
    } catch (e: Exception) {
        println("Die Eingabe war nicht korrekt.")
    }
}