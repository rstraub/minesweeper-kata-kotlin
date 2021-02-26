package nl.codecraftr.kata.minesweeper

class MineSweeper {
    fun solve(minefields: String) = ""
}

fun main() = MineSweeper().solve(
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