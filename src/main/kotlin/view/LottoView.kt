package view

class LottoView {
    fun inputCost(): Int {
        println("금액을 입력하세요. ")
        val cost = readln().toInt()
        return cost
    }
    fun buyManualLotto(): Int {
        println("수동으로 구매할 로또의 개수를 입력하세요")
        val manualLottoNum = readln().toInt()
        return manualLottoNum
    }
    fun manualTicket(): Set<Int> {
        println("로또 번호를 입력하세요. ")
        val ticket = readln().split(" ").map { it.toInt() }.sorted()
        return ticket.toSet()
    }
    fun printTicket(ticket: MutableList<Set<Int>>) {
        println(ticket.joinToString("\n"))
    }
    fun printWinningTicket(elementAt: Set<Int>, prize: Int) {
        println("$elementAt | $prize KW 당첨")
    }
    fun printTotalPrize(totalPrize: Int) {
        println("총 당첨금액 $totalPrize KW")
    }
}
