package nl.codecraftr.kata.minesweeper

class MineSweeperApp(
    private val mineSweeperNotationParser: MineSweeperNotationParser,
    private val mineSweeperPresenter: MineSweeperPresenter
) {
    fun solve(minefields: String) =
        mineSweeperNotationParser
            .parse(minefields)
            .let(mineSweeperPresenter::present)
}

object NoopInputOutputParser : MineSweeperPresenter, MineSweeperNotationParser {
    override fun present(mineSweeper: MineSweeper) = ""
    override fun parse(mineSweeperNotation: String) = MineSweeper(emptyList())
}

fun main() = print("MineSweeper app")