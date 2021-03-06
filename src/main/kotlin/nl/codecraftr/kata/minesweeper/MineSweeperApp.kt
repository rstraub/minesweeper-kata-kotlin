package nl.codecraftr.kata.minesweeper

class MineSweeperApp(
    private val mineSweeperNotationParser: MineSweeperNotationParser,
    private val mineSweeperTextPresenter: MineSweeperTextPresenter
) {
    fun solve(minefields: String) =
        mineSweeperNotationParser
            .parse(minefields)
            .let(mineSweeperTextPresenter::present)
}

object NoopInputOutputParser : MineSweeperTextPresenter, MineSweeperNotationParser {
    override fun present(mineSweeper: MineSweeper) = ""
    override fun parse(mineSweeperNotation: String) = MineSweeper(emptyList())
}

fun main() = print("MineSweeper app")