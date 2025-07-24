fun List<Int>.sumOfEven(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 9)

    val maxNumber = numbers.maxOrNull()
    println("Найбільше число: $maxNumber")

    val oddSquares = numbers.filter { it % 2 != 0 }
        .map { it * it }
    println("Квадрати непарних чисел: $oddSquares")

    val evenSum = numbers.sumOfEven()
    println("Сума парних чисел: $evenSum")
}
