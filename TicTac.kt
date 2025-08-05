abstract class Player(val symbol: Char) {
    abstract fun makeMove(board: Board): Pair<Int, Int>
}

class HumanPlayer(symbol: Char) : Player(symbol) {
    override fun makeMove(board: Board): Pair<Int, Int> {
        while (true) {
            println("Гравець '$symbol', введи координати (рядок і стовпець через пробіл): ")
            val input = readLine()?.trim() ?: continue
            val parts = input.split(" ")

            if (parts.size != 2) {
                println("⚠️ Введіть рівно два числа!")
                continue
            }

            val row = parts[0].toIntOrNull()
            val col = parts[1].toIntOrNull()

            if (row == null || col == null || row !in 0..2 || col !in 0..2) {
                println("⚠️ Введіть числа від 0 до 2!")
                continue
            }

            if (!board.isCellEmpty(row, col)) {
                println("⚠️ Клітинка зайнята! Спробуй іншу.")
                continue
            }

            return row to col
        }
    }
}

class Board {
    private val grid = Array(3) { CharArray(3) { ' ' } }

    fun display() {
        println("  0 1 2")
        for (i in grid.indices) {
            print("$i ")
            println(grid[i].joinToString("│"))
            if (i != 2) println("  ─┼─┼─")
        }
    }

    fun isCellEmpty(row: Int, col: Int): Boolean = grid[row][col] == ' '

    fun makeMove(row: Int, col: Int, symbol: Char) {
        grid[row][col] = symbol
    }

    fun isFull(): Boolean = grid.all { row -> row.all { it != ' ' } }

    fun checkWinner(symbol: Char): Boolean {
        // Рядки і стовпці
        for (i in 0..2) {
            if ((0..2).all { grid[i][it] == symbol }) return true
            if ((0..2).all { grid[it][i] == symbol }) return true
        }
        // Діагоналі
        if ((0..2).all { grid[it][it] == symbol }) return true
        if ((0..2).all { grid[it][2 - it] == symbol }) return true
        return false
    }
}

class Game(private val player1: Player, private val player2: Player) {
    private val board = Board()

    fun start() {
        var currentPlayer = player1

        while (true) {
            board.display()
            val (row, col) = currentPlayer.makeMove(board)
            board.makeMove(row, col, currentPlayer.symbol)

            if (board.checkWinner(currentPlayer.symbol)) {
                board.display()
                println("🎉 Гравець '${currentPlayer.symbol}' переміг!")
                break
            }

            if (board.isFull()) {
                board.display()
                println("🤝 Нічия!")
                break
            }

            currentPlayer = if (currentPlayer == player1) player2 else player1
        }
    }
}

fun main() {
    println("▶️ Гра Хрестики-Нолики починається!")
    val playerX = HumanPlayer('X')
    val playerO = HumanPlayer('O')
    val game = Game(playerX, playerO)
    game.start()
}
