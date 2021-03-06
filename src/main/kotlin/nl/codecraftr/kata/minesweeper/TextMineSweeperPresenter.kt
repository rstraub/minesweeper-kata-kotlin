package nl.codecraftr.kata.minesweeper

class TextMineSweeperPresenter : MineSweeperPresenter {
    override fun present(mineSweeper: MineSweeper): String {
        return """
            Field #1:
            *
        """.trimIndent()
    }

}
