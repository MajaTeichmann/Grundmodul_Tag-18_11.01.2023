//Todo: Heute wollen wir eine Runde Schere, Stein, Papier gegen den Computer spielen.
// Dazu soll der Computer einen zufälligen Spielzug aus den Strings "Schere", "Stein", "Papier" wählen.
// Es soll aus der Konsole vom Nutzer ein Spielzug eingelesen werden (mit readln()).
// Dann werden die Spielzüge geprinted und anschließend miteinander verglichen, und das Ergebnis ausgedruckt.
// Ersetze alle Kommentare der Form "To-Do" durch Programmcode, bis das Spiel funktioniert.

////////////////////////////////////////////////////////////
// BONUSAUFGABE: SCHERE, STEIN, PAPIER                 /////
////////////////////////////////////////////////////////////
// Heute wollen wir das bekannte Spiel implementieren. /////
// Dabei soll es nur einen Zug machen.                 /////
////////////////////////////////////////////////////////////


val SCHERE = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)

(SCHERE)
"""

val STEIN = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)

(STEIN)
"""

val PAPIER = """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)

(PAPIER)
"""

fun holeSpielerZug(): String {
    print("Bitte geben Sie Ihren Zug ein (Schere/Stein/Papier): ")
    // TODO: lese den Zug von der Konsole ein
    val spielerZug = readln()
        return spielerZug
}

fun holeComputerZug(): String {
    // TODO: hole zufälligen Zuf
    val computerZug = listOf<String>("Schere","Stein","Papier").random()
        return computerZug
}

fun printSpielzug(spielzug: String) {
    when (spielzug) {
        "Schere" -> {
            println(SCHERE)
        }
        "Stein" -> {
            println(STEIN)
        }
        "Papier" -> {
            println(PAPIER)
        }
    }
}

fun printErgebnis(computerZug: String, spielerZug: String) {
    if (computerZug == spielerZug)                              { println("Unentschieden!")}
    else if (computerZug == "Schere" && spielerZug == "Stein")  { println("Du gewinnst!")}
    else if (computerZug == "Schere" && spielerZug == "Papier") { println("Der Computer gewinnt!")}
    else if (computerZug == "Stein"  && spielerZug == "Schere") { println("Der Computer gewinnt!")}
    else if (computerZug == "Stein"  && spielerZug == "Papier") { println("Du gewinnst!")}
    else if (computerZug == "Papier" && spielerZug == "Schere") { println("Du gewinnst!")}
    else if (computerZug == "Papier" && spielerZug == "Stein")  { println("Der Computer gewinnt!")}
    else                                                        { println("Fehler!")}
}

fun main() {
    val spielerZug = holeSpielerZug()
    val computerZug = holeComputerZug()

        println("Der Computer spielt: ")
    printSpielzug(computerZug)

    println("${spielerZug} vs. ${computerZug}")

    println("Dein Zug: ")
    printSpielzug(spielerZug)

    println("")
    printErgebnis(computerZug, spielerZug)
}