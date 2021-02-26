package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class MineSweeperAcceptanceTest : BehaviorSpec({
    given("an empty minefield") {
        `when`("it is solved") {
            then("it should return zero solved minefields") {
                val input = ""

                val result = MineSweeperApp().solve(input)

                result shouldBe ""
            }
        }
    }

    given("end of input") {
        `when`("it is solved") {
            then("it should return zero solved minefields") {
                val input = "0 0"

                val result = MineSweeperApp().solve(input)

                result shouldBe ""
            }
        }
    }

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