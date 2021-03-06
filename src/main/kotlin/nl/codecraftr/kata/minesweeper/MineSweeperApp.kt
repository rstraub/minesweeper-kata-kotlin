package nl.codecraftr.kata.minesweeper

class MineSweeperApp {
    fun solve(minefields: String) = minefields
        .replace("1 1", "Field #1:")
        .replace(".", "0")
        .substringBeforeLast("\n0 0")
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