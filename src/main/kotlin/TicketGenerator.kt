import view.LottoView

class TicketGenerator {
    fun createTickets(tickets: LottoTickets, lottoView: LottoView) {
        val lottoNumberGenerator = LottoNumberGenerator()
        for (i in 0 until tickets.ticketNum) {
            if (i < tickets.manualTicketNum) {
                tickets.addTicket(lottoView.manualTicket())
            } else {
                tickets.addTicket(lottoNumberGenerator.makeLottoNumber())
            }
        }
    }
}
