fun main() {
    println("금액을 입력하세요. ")

    val cost = readln().toInt()
    val lottoNum = cost / 1000

    val tickets = LottoTickets(lottoNum, cost)
    val winTickets = WinningTicket()
    val buyTickets = BuyTickets()
    buyTickets.createTickets(tickets)
    tickets.printTicket()
    winTickets.calculateWinningTickets(tickets, winTickets)
}
