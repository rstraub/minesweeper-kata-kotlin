package nl.codecraftr.kata.minesweeper

class TextMineSweeperPresenter : MineSweeperPresenter {
    override fun present(mineSweeper: MineSweeper): String {
        return mineSweeper
            .fields
            .mapIndexed { index, mineField ->
                """
                    Field #${index + 1}:
                    *
                """.trimIndent()
            }
            .joinToString("\n\n")
    }

}
