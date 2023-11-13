import java.util.TreeSet
import kotlin.random.Random
import kotlin.random.nextInt

class LottoNumberGenerator {
    fun makeLottoNumber(): Set<Int> {
        val numbers: TreeSet<Int> = sortedSetOf()
        while (numbers.size < 6) {
            val randomNumber = Random.nextInt(MINIMUM_NUM..MAXIMUM_NUM)
            numbers.add(randomNumber)
        }
        return numbers
    }

    companion object {
        const val MINIMUM_NUM = 1
        const val MAXIMUM_NUM = 45
    }
}
