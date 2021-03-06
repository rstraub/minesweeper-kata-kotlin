package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class MineSweeperAppEndToEndTest : BehaviorSpec({
    given("a single minefield with a single square and row") {
        `when`("it is solved") {
            then("it should return the solved minefield") {
                val input = """
                    1 1
                    .
                    0 0
                """.trimIndent()

                val expected = """
                    Field #1:
                    0
                """.trimIndent()

                val result = MineSweeperApp(NoopPresenter).solve(input)

                result shouldBe expected
            }
        }
    }
})