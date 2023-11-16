package controller

import LottoNumberGenerator
import LottoTickets
import TicketGenerator
import WinningTicket
import view.LottoView

class LottoController {
    companion object {
        const val LOTTO_PRICE = 1000
    }
    fun startLottoApp() {
        val lottoView = LottoView()
        val cost = lottoView.inputCost()
        val manualTicketNum = lottoView.buyManualLotto()

        val lottoTickets = LottoTickets(cost / LOTTO_PRICE, manualTicketNum)

        val createTickets = TicketGenerator()
        createTickets.createTickets(lottoTickets, lottoView)

        lottoView.printTicket(lottoTickets.getTicket())

        val lottoNumberGenerator = LottoNumberGenerator()
        val winTickets = WinningTicket(lottoNumberGenerator.makeLottoNumber())
        winTickets.calculateWinningTickets(lottoTickets, lottoView)
    }
}
