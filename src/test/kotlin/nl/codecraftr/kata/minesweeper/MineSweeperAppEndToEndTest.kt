package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class MineSweeperAppEndToEndTest : BehaviorSpec({
    given("a single minefield") {
        `when`("it is solved") {
            then("it should return the solved minefield") {
                val input = """
                    4 4
                    *...
                    ....
                    .*..
                    ....
                    0 0
                """.trimIndent()

                val expected = """
                    Field #1:
                    *100
                    2210
                    1*10
                    1110 
                """.trimIndent()

                val result = MineSweeperApp().solve(input)

                result shouldBe expected
            }
        }
    }
})