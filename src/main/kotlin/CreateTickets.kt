import view.LottoView

class CreateTickets {
    fun createTickets(tickets: LottoTickets) {
        val lottoNumberGenerator = LottoNumberGenerator()
        val lottoView = LottoView()
        for (i in 0 until tickets.ticketNum) {
            if (i < tickets.manualTicketNum) {
                tickets.addTicket(lottoView.manualTicket())
            } else {
                tickets.addTicket(lottoNumberGenerator.makeLottoNumber())
            }
        }
    }
}
