package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class TextMineSweeperPresenterTest : WordSpec({
    "present" should {
        "return string representation given a multiple minefields with single row and square" {
            val mineSweeper = MineSweeper(
                listOf(
                    MineField(
                        listOf(
                            MineFieldRow(
                                listOf(Mine())
                            )
                        )
                    ),
                    MineField(
                        listOf(
                            MineFieldRow(
                                listOf(Mine())
                            )
                        )
                    )
                )
            )

            val expected = """
                Field #1:
                *
                
                Field #2:
                *
            """.trimIndent()

            val result = TextMineSweeperPresenter().present(mineSweeper)

            result shouldBe expected
        }
    }
})