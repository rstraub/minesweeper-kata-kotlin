package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class MineSweeperAppEndToEndTest : BehaviorSpec({
    val mineSweeperApp = MineSweeperApp(NoopInputOutputParser, TextMineSweeperPresenter())

    given("unsolved minesweeper notation") {
        `when`("it is solved") {
            then("it should return the solved minesweeper notation") {
                val input = """
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

                val expected = """
                    Field #1:
                    *100
                    2210
                    1*10
                    1110

                    Field #2:
                    **100
                    33200
                    1*100
                """.trimIndent()

                val result = mineSweeperApp.solve(input)

                result shouldBe expected
            }
        }
    }
})