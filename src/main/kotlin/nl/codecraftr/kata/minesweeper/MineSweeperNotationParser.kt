package nl.codecraftr.kata.minesweeper

interface MineSweeperNotationParser {
    fun parse(mineSweeperNotation: String): MineSweeper
}
