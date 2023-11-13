import view.inputCost

fun main() {
    val tickets = inputCost()
    createTickets(tickets)
    tickets.printTicket()

    val winTickets = WinningTicket()
    winTickets.calculateWinningTickets(tickets, winTickets)
}
