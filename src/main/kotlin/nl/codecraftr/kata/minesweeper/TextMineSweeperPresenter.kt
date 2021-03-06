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
        val rowsContent = presentRows(mineField.rows)
        return """
            |Field #${index + 1}:
            |$rowsContent
        """.trimMargin()
    }

    private fun presentRows(rows: List<MineFieldRow>): String {
        return rows
            .map {
                it.squares
                    .map(Mine::value)
                    .joinToString(separator = "")
            }
            .joinToString("\n")
    }
}
