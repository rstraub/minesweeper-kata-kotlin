package nl.codecraftr.kata.minesweeper

class MineSweeperApp(
    private val mineSweeperTextParser: MineSweeperTextParser,
    private val mineSweeperTextPresenter: MineSweeperTextPresenter
) {
    fun solve(minefields: String) =
        mineSweeperTextParser
            .parse(minefields)
            .let(mineSweeperTextPresenter::present)
}

object NoopInputOutputParser : MineSweeperTextPresenter, MineSweeperTextParser {
    override fun present(mineSweeper: MineSweeper) = ""
    override fun parse(mineSweeperNotation: String) = MineSweeper(emptyList())
}

fun main() = print("MineSweeper app")