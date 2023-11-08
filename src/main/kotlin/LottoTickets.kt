import kotlin.random.Random

class LottoTickets(num: Int, cost: Int) {
    private val tickets = mutableListOf<List<Int>>()
    private val ticketNum = num
    private val cost = cost

    fun addTicket(array: List<Int>) {
        tickets.add(array)
    }
    fun printTicket() {
        for (i in 0 until ticketNum) {
            println(tickets[i])
        }
    }
    fun getTicketNum(): Int = ticketNum
    fun getTicket(index: Int): List<Int> = tickets[index]

    fun manualTicket() {
        println("로또 번호를 입력하세요. ")
        val ticket = readln().split(" ").map { it.toInt() }.sorted()
        addTicket(ticket)
    }

    companion object {
        fun lottoNumberGenerator(): List<Int> {
            val numbers = mutableListOf<Int>()
            while (numbers.size < 6) {
                val randomNumber = Random.nextInt(1, 46)
                if (!numbers.contains(randomNumber)) {
                    numbers.add(randomNumber)
                }
            }
            numbers.sort()
            return numbers
        }
    }
}
