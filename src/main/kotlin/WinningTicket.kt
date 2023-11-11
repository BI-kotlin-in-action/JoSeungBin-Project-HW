class WinningTicket() {
    private val lottoNumberGenerator = LottoNumberGenerator()
    private val winningTicket = lottoNumberGenerator.makeLottoNumber()

    fun calculateWinningTickets(tickets: LottoTickets, winTickets: WinningTicket) {
        for (i in 0 until tickets.ticketNum) {
            val count = tickets.ticketList[i].intersect(winTickets.winningTicket.toSet()).count()
            val sum = 0
            when (count) {
                6 -> println("${tickets.ticketList[i]} | 100000KW 당첨")
                5 -> println("${tickets.ticketList[i]} | 5000KW 당첨")
                4 -> println("${tickets.ticketList[i]} | 100KW 당첨")
                3 -> println("${tickets.ticketList[i]} | 5KW 당첨")
            }
        }
    }
}
