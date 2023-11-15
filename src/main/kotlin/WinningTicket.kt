class WinningTicket() {
    private val lottoNumberGenerator = LottoNumberGenerator()
    private val winningTicket = lottoNumberGenerator.makeLottoNumber()

    fun calculateWinningTickets(tickets: LottoTickets, winTickets: WinningTicket) {
        for (i in 0 until tickets.ticketNum) {
            val count = tickets.ticketList.elementAt(i).intersect(winTickets.winningTicket.toSet()).count()
            val result = WinningPrize.getRank(count)
            if (result != WinningPrize.NONE) {
                println("${tickets.ticketList.elementAt(i)} | ${result.prize} KW 당첨")
            }
        }
    }
}
