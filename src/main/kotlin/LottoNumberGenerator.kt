
import kotlin.random.Random
import kotlin.random.nextInt

class LottoNumberGenerator {
    fun makeLottoNumber(): Set<Int> {
        val numbers = mutableSetOf<Int>()
        while (numbers.size < MAX_NUM_COUNT) {
            val randomNumber = Random.nextInt(MINIMUM_NUM..MAXIMUM_NUM)
            numbers.add(randomNumber)
        }
        return numbers.toSortedSet()
    }

    companion object {
        private const val MINIMUM_NUM = 1
        private const val MAXIMUM_NUM = 45
        private const val MAX_NUM_COUNT = 6
    }
}
