//TODO: In dieser Aufgabe ist eine Funktion mit dem Namen buyItem() gegeben, mit der ein Kunde ein Produkt
// kaufen kann. Diese erzeugt einen Fehler, falls das Produkt nicht mehr vorhanden ist.
// In diesem Beispiel erzeugt die Funktion immer einen Laufzeitfehler.
// In der main()-Funktion wird die Funktion buyItem() aufgerufen und es entsteht ein Laufzeitfehler.
// Deine Aufgabe ist es den erzeugten Laufzeitfehler aufzufangen, indem du den Funktionsaufruf buyItem() in
// einen Try-Block packst.
// Erstelle dazu noch einen Catch-Block mit dem Parameter “e: Exception”.
// Im Catch-Block soll jetzt mit der println()-Funktion der Text “Ein Fehler ist aufgetreten: “ ausgegeben werden.
// Dann wird auch der Fehler "e" über die println()-Funktion ausgegeben. Am Ende wird noch eine eigene Fehlermeldung
// “Dieses Produkt ist leider nicht mehr verfügbar.” über die println()-Funktion ausgegeben.
// Danach soll das Programm beim Ausführen den erzeugten Fehler richtig behandeln und den gewünschten Text ausgeben.
fun main() {

    try {
        buyItem()
    } catch (e: Exception){
        println("Ein Fehler ist aufgetreten: ")
        println(e)
        println("Dieses Produkt ist leider nicht mehr verfügbar.")
        val nowIsInStock = true
        var nowIsInStockArticles = 10
        if (nowIsInStock) {
            println("Wir haben neue Ware erhalten. Ihr gewünschtes Produkt ist wieder verfügbar!")
            println("Wie viele Artikel wollen Sie kaufen?")
            var customerWish = readln().toInt()
            if (customerWish <= nowIsInStockArticles){
                println("Wir haben genug Artikel auf Lager.")
                println("Du hast nun ${customerWish} Artikel in deinem Warenkorb!")
                println("")
                println("Jetzt kaufen? j/n")
                var customerEingabe = readln()
                if (customerEingabe == "j"){
                    println("Du hast nun ${customerWish} Artikel erfolgreich gekauft. Vielen Dank!")
                    nowIsInStockArticles = nowIsInStockArticles - customerWish
                    println("Der Artikel wurde auf ${nowIsInStockArticles} Artikel reduziert!")
                } else {
                    println("Wir haben deine ${customerWish} Artikel auf deine Wunschliste verschoben. Vielen Dank!")
                }
            }else {
                println("Wir haben leider nur ${nowIsInStockArticles} Artikel dieses Produktes auf Lager.")
                println("Bitte gib eine kleinere Zahl an!")
            }
        } else {
            // exception
            throw Exception("item not in stock exception")
        }
    }

}

fun buyItem() {
    val isInStock = false

    if (isInStock) {
        // buying item
    } else {
        // exception
        throw Exception("item not in stock exception")
    }
}