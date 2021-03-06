package nl.codecraftr.kata.minesweeper

class TextMineSweeperPresenter : MineSweeperPresenter {
    override fun present(mineSweeper: MineSweeper): String {
        return mineSweeper
            .fields
            .mapIndexed { index, mineField ->
                presentField(index, mineField)
            }
            .joinToString("\n\n")
    }

    private fun presentField(index: Int, mineField: MineField): String {
        return """
            Field #${index + 1}:
            *
        """.trimIndent()
    }
}
