package nl.codecraftr.kata.minesweeper

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class TextMineSweeperPresenterTest : WordSpec({
    val textMineSweeperPresenter = TextMineSweeperPresenter()

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

            val result = textMineSweeperPresenter.present(mineSweeper)

            result shouldBe expected
        }

        "return string representation given minefield with multiple rows and single square" {
            val mineSweeper = MineSweeper(
                listOf(
                    MineField(
                        listOf(
                            MineFieldRow(
                                listOf(Mine())
                            ),
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
                *
            """.trimIndent()

            val result = textMineSweeperPresenter.present(mineSweeper)

            result shouldBe expected
        }

        "return string representation given minefield with single row and multiple squares" {
            val mineSweeper = MineSweeper(
                listOf(
                    MineField(
                        listOf(
                            MineFieldRow(
                                listOf(Mine(), Mine())
                            )
                        )
                    )
                )
            )

            val expected = """
                Field #1:
                **
            """.trimIndent()

            val result = textMineSweeperPresenter.present(mineSweeper)

            result shouldBe expected
        }
    }
})