import view.LottoView

class WinningTicket(private val winningTicket: Set<Int>) {
    fun calculateWinningTickets(tickets: LottoTickets, lottoView: LottoView) {
        for (i in 0 until tickets.ticketNum) {
            val count = tickets.getTicket().elementAt(i).intersect(winningTicket).count()
            val result = WinningPrize.getRank(count)
            if (result != WinningPrize.NONE) {
                lottoView.printWinningTicket(tickets.getTicket().elementAt(i), result.prize)
            }
        }
    }
}
