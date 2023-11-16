enum class WinningPrize(val matchNum: Int, val prize: Int) {
    FIRST(6, 100000),
    SECOND(5, 5000),
    THIRD(4, 100),
    FOURTH(3, 5),
    NONE(0, 0),
    ;

    companion object {
        @JvmStatic
        fun getRank(matchNum: Int): WinningPrize {
            return values().find { it.matchNum == matchNum } ?: NONE
        }
    }
}
