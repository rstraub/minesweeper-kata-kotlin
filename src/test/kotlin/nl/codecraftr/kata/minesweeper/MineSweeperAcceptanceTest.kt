package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class MineSweeperAcceptanceTest : BehaviorSpec({
    given("an empty minefield") {
        `when`("it is solved") {
            then("it should return zero solved minefields") {
                val input = ""

                val result = MineSweeper().solve(input)

                result shouldBe ""
            }
        }
    }
})