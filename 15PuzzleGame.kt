fun main() {
    val game = PuzzleGame()

    while (true) {
        game.printBoard()
        if (game.isSolved()) {
            println("🎉 Puzzle Solved!")
            break
        }

        print("Enter move (w/a/s/d): ")
        when (readln().lowercase()) {
            "w" -> game.move(-1, 0)
            "s" -> game.move(1, 0)
            "a" -> game.move(0, -1)
            "d" -> game.move(0, 1)
            "q" -> break
            else -> println("Invalid move.")
        }
    }
}

class PuzzleGame {
    val board: Array<IntArray> = Array(4) { IntArray(4) }
    private var emptyX = 3
    private var emptyY = 3

    init {
        initBoard()
    }

    private fun initBoard() {
        val values = (1..15).toMutableList()
        values.add(0)
        values.shuffle()
        var index = 0
        for (i in 0..3) {
            for (j in 0..3) {
                board[i][j] = values[index++]
                if (board[i][j] == 0) {
                    emptyX = i
                    emptyY = j
                }
            }
        }
    }

    fun printBoard() {
        println("---------------")
        for (i in 0..3) {
            for (j in 0..3) {
                val value = board[i][j]
                if (value == 0) print("   ") else print(String.format("%2d ", value))
            }
            println()
        }
        println("---------------")
    }

    fun move(dx: Int, dy: Int): Boolean {
        val newX = emptyX + dx
        val newY = emptyY + dy
        if (newX in 0..3 && newY in 0..3) {
            board[emptyX][emptyY] = board[newX][newY]
            board[newX][newY] = 0
            emptyX = newX
            emptyY = newY
            return true
        }
        return false
    }

    fun isSolved(): Boolean {
        var expected = 1
        for (i in 0..3) {
            for (j in 0..3) {
                if (i == 3 && j == 3) return board[i][j] == 0
                if (board[i][j] != expected++) return false
            }
        }
        return true
    }

    fun setCustomBoard(values: List<Int>) {
        require(values.size == 16)
        var index = 0
        for (i in 0..3) {
            for (j in 0..3) {
                board[i][j] = values[index]
                if (values[index] == 0) {
                    emptyX = i
                    emptyY = j
                }
                index++
            }
        }
    }
}
