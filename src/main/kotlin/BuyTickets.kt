class BuyTickets() {
    fun createTickets(tickets: LottoTickets) {
        println("수동으로 구매할 로또의 개수를 입력하세요")
        val manualCount = readln().toInt()
        val lottoNumberGenerator = LottoNumberGenerator()
        val buyTickets = BuyTickets()
        for (i in 0 until tickets.ticketNum) {
            when {
                i < manualCount -> buyTickets.manualTicket(tickets)
                else -> tickets.ticketList.add(lottoNumberGenerator.makeLottoNumber())
            }
        }
    }
    fun manualTicket(tickets: LottoTickets) {
        println("로또 번호를 입력하세요. ")
        val ticket = readln().split(" ").map { it.toInt() }.sorted()
        tickets.ticketList.add(ticket)
    }
}
