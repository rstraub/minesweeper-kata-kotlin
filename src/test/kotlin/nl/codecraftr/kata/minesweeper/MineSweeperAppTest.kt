package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk

internal class MineSweeperAppTest : WordSpec({
    val mineSweeperTextPresenter = mockk<MineSweeperTextPresenter>()
    val mineSweeper = MineSweeperApp(mineSweeperTextPresenter)

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

            every { mineSweeperTextPresenter.present(any()) } returns expected

            val result = mineSweeper.solve(mineSweeperInput)

            result shouldBe expected
        }
    }
})