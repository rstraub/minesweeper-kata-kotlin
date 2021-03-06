package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk

internal class MineSweeperAppTest : WordSpec({
    val mineSweeperTextParser = mockk<MineSweeperTextParser>()
    val mineSweeperTextPresenter = mockk<MineSweeperTextPresenter>()
    val mineSweeperApp = MineSweeperApp(mineSweeperTextParser, mineSweeperTextPresenter)

    afterEach {
        clearAllMocks()
    }

    "solve" should {
        "return solved field representation given unsolved minefield input" {
            val mineSweeperInput = """
                1 1
                .
                0 0
            """.trimIndent()

            val expected = """
                Field #1:
                0
            """.trimIndent()

            val mineSweeper = MineSweeper(emptyList())
            every { mineSweeperTextParser.parse(mineSweeperInput) } returns mineSweeper
            every { mineSweeperTextPresenter.present(mineSweeper) } returns expected

            val result = mineSweeperApp.solve(mineSweeperInput)

            result shouldBe expected
        }
    }
})