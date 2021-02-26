package nl.codecraftr.kata.minesweeper

class MineSweeperApp {
    fun solve(minefields: String) = ""
}

fun main() = MineSweeperApp().solve(
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