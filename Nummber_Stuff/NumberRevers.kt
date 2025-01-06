package numberrevers

import java.util.*

fun main() {
    val arr = ArrayList<Int>()
    val input = Scanner(System.`in`)

    println("Geben Sie eine Zahl ein und drücken Sie Enter. Wenn Sie keine weiteren Zahlen hinzufügen wollen, schreiben Sie 'Stop' und drücken Sie Enter.")

    while (true) {
        val userInput = input.nextLine()
        if (userInput.equals("Stop", ignoreCase = true)) {
            break
        }
        try {
            val number = userInput.toInt()
            arr.add(number)
        } catch (e: NumberFormatException) {
            println("Bitte geben Sie eine gültige Zahl ein oder 'Stop', um zu beenden.")
        }
    }

    reverseOrder(arr)
}

fun reverseOrder(arr: ArrayList<Int>) {
    val n = arr.size
    for (i in 0 until n / 2) {
        val temp = arr[i]
        arr[i] = arr[n - 1 - i]
        arr[n - 1 - i] = temp
    }
    println("Umgekehrte Reihenfolge: $arr")
}