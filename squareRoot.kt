import kotlin.math.sqrt

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0

    if (a == 0.0) {
        println("Це не квадратне рівняння, бо a = 0")
        return
    }

    val discriminant = b * b - 4 * a * c

    when {
        discriminant > 0 -> {
            val x1 = (-b + sqrt(discriminant)) / (2 * a)
            val x2 = (-b - sqrt(discriminant)) / (2 * a)
            println("Два корені: x1 = $x1, x2 = $x2")
        }
        discriminant == 0.0 -> {
            val x = -b / (2 * a)
            println("Один корінь: x = $x")
        }
        else -> {
            println("Дійсних коренів немає")
        }
    }
}