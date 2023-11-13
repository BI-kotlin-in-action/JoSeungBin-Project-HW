class LottoTickets(num: Int, cost: Int) {
    public val ticketList = mutableSetOf<Set<Int>>()
    public val ticketNum = num
    public val cost = cost

    fun addTicket(ticket: Set<Int>) {
        ticketList.add(ticket)
    }

    fun printTicket() {
        println(ticketList.joinToString("\n"))
    }
}
