import view.LottoView

class WinningTicket(private val winningTicket: Set<Int>) {
    fun calculateWinningTickets(tickets: LottoTickets, lottoView: LottoView): Int {
        var sum = 0
        for (ticket in tickets.getTicket()) {
            val count = ticket.intersect(winningTicket).count()
            val result = WinningPrize.getRank(count)
            if (result != WinningPrize.NONE) {
                lottoView.printWinningTicket(ticket, result.prize)
                sum += result.prize
            }
        }
        return sum
    }
}
