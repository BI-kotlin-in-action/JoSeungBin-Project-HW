package controller

import CreateTickets
import LottoTickets
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

        val createTickets = CreateTickets()
        createTickets.createTickets(lottoTickets)

        lottoTickets.printTicket()

        val winTickets = WinningTicket()
        winTickets.calculateWinningTickets(lottoTickets, winTickets)
    }
}
