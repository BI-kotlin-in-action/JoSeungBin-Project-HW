class LottoTickets(val ticketNum: Int, val manualTicketNum: Int) {
    val ticketList = mutableSetOf<Set<Int>>()

    fun addTicket(ticket: Set<Int>) {
        ticketList.add(ticket)
    }

    fun printTicket() {
        println(ticketList.joinToString("\n"))
    }
}
