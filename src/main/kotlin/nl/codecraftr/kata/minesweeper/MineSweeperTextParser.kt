package nl.codecraftr.kata.minesweeper

interface MineSweeperTextParser {
    fun parse(mineSweeperNotation: String): MineSweeper
}
