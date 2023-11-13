class WinningTicket() {
    private val lottoNumberGenerator = LottoNumberGenerator()
    private val winningTicket = lottoNumberGenerator.makeLottoNumber()

    fun calculateWinningTickets(tickets: LottoTickets, winTickets: WinningTicket) {
        for (i in 0 until tickets.ticketNum) {
            val count = tickets.ticketList.elementAt(i).intersect(winTickets.winningTicket.toSet()).count()
            val result = when (count) {
                6 -> WinningPrize.FIRST.prize
                5 -> WinningPrize.SECOND.prize
                4 -> WinningPrize.THIRD.prize
                3 -> WinningPrize.FOURTH.prize
                else -> WinningPrize.NONE.prize
            }
            if (result != 0) {
                println("${tickets.ticketList.elementAt(i)} | $result KW 당첨")
            }
        }
    }
}
