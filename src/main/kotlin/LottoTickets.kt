class LottoTickets(val ticketNum: Int, val manualTicketNum: Int) {
    private val ticketList = mutableSetOf<Set<Int>>()

    fun addTicket(ticket: Set<Int>) {
        ticketList.add(ticket)
    }
    fun getTicket(): MutableSet<Set<Int>> {
        return ticketList
    }
}
