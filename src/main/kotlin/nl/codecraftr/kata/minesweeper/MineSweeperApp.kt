package nl.codecraftr.kata.minesweeper

class MineSweeperApp(private val mineSweeperTextPresenter: MineSweeperTextPresenter) {
    fun solve(minefields: String): String {
        return mineSweeperTextPresenter.present(MineSweeper())
    }
}
object NoopPresenter : MineSweeperTextPresenter {
    override fun present(mineSweeper: MineSweeper) = ""
}

fun main() = MineSweeperApp(NoopPresenter).solve(
    """
   4 4
   *...
   ....
   .*..
   ....
   3 5
   **...
   .....
   .*...
   0 0
""".trimIndent()
).run(::print)