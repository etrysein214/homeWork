package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var ticket = scanner.nextInt()
    println("How many round-trip tickets:")
    var returnTicket = scanner.nextInt()
    TicketsCalculatorKotlin(ticket, returnTicket).print()
}

class TicketsCalculatorKotlin(var ticket: Int, var returnTicket: Int) {
    var total: Double = 0.0

    init {
        this.total = (ticket - returnTicket) * 1000 + (returnTicket * 2000) * 0.9
    }

    fun print() {
        print(
            "(kt)Total tickts: $ticket\n" +
                    "(kt)Roun-trip: $returnTicket\n" +
                    "(kt)Total: ${total.toInt()}"
        )
    }
}