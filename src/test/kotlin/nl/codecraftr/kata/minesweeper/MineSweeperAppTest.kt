package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class MineSweeperAppTest : WordSpec({
    "solve" should {
        "return solved field representation given unsolved minefield input" {
            val minefields = """
                1 1
                .
                0 0
            """.trimIndent()

            val expected = """
                Field #1:
                0
            """.trimIndent()

            val result = MineSweeperApp().solve(minefields)

            result shouldBe expected
        }
    }
})