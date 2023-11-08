import LottoTickets.Companion.lottoNumberGenerator

fun main() {
    println("금액을 입력하세요. ")

    val cost = readln().toInt()
    val lottoNum = cost / 1000

    val tickets = LottoTickets(lottoNum, cost)
    val winTickets = WinningTicket()

    createTickets(tickets)
    tickets.printTicket()
    calculateWinningTickets(tickets, winTickets)
}

fun calculateWinningTickets(tickets: LottoTickets, winTickets: WinningTicket) {
    for (i in 0 until tickets.getTicketNum()) {
        val count = tickets.getTicket(i).intersect(winTickets.winningTicket.toSet()).count()
        val sum = 0
        when (count) {
            6 -> println("${tickets.getTicket(i)} | 100000KW 당첨")
            5 -> println("${tickets.getTicket(i)} | 5000KW 당첨")
            4 -> println("${tickets.getTicket(i)} | 100KW 당첨")
            3 -> println("${tickets.getTicket(i)} | 5KW 당첨")
        }
    }
}

fun createTickets(tickets: LottoTickets) {
    println("수동으로 구매할 로또의 개수를 입력하세요")
    val manualCount = readln().toInt()
    for (i in 0 until tickets.getTicketNum()) {
        when {
            i < manualCount -> tickets.manualTicket()
            else -> tickets.addTicket(lottoNumberGenerator())
        }
    }
}
