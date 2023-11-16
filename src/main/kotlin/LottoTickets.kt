class LottoTickets(val ticketNum: Int, val manualTicketNum: Int) {
    val ticketList = mutableListOf<Set<Int>>()

    fun addTicket(ticket: Set<Int>) {
        ticketList.add(ticket)
    }
    fun getTicket(): MutableList<Set<Int>> {
        return ticketList
    }
}
