import view.buyManualLotto
import view.manualTicket

fun createTickets(tickets: LottoTickets) {
    val lottoNumberGenerator = LottoNumberGenerator()
    val manualCount = buyManualLotto()
    for (i in 0 until tickets.ticketNum) {
        if (i < manualCount) {
            tickets.addTicket(manualTicket())
        } else {
            tickets.addTicket(lottoNumberGenerator.makeLottoNumber())
        }
    }
}
