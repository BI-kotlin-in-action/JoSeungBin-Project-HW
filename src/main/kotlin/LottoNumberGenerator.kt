import kotlin.random.Random

class LottoNumberGenerator {
    fun makeLottoNumber(): List<Int> {
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
