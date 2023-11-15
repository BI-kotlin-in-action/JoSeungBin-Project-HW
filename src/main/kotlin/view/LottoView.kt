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
}
