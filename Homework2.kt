fun main() {

    val a1 = 10
    val b1 = 20
    val c1 = 5
    val result1 = ((a1 + b1 - c1) * 2 / 3) % 5
    println("Результат виразу 1): $result1")

    val x = 30
    val y = 40
    val z = 50
    val result2 = (x > y && z > x) || (y > z)
    println("Результат виразу 2): $result2")

    val a3 = 10
    val b3 = 5
    val c3 = 20
    val result3 = (a3 + b3 > c3) && ((a3 - b3) < c3)
    println("Результат виразу 3): $result3")

    val a4 = 5;
    val b4 = 3;
    val c4 = 2;
    val d4 = 4

    val result4 = ((a4 + b4 - c4) * d4 / 2) + 10 % 3 - (c4 and d4)
    println("Результат виразу 4) $result4")


    val a5 = 10;
    val b5 = 2;
    val c5 = 5;
    val d5 = 3

    val result5 = ((a5 - b5) * c5) / d5 + 15 % 4 - (c5 or d5)
    println("Результат виразу 5) $result5")


    val a6 = 11;
    val b6 = 20;
    val c6 = 7;
    val d6 = 13

    val result6 = ((a6 * b6) * c6) / d6 + d6 % 4 - (c6 and d6)
    println("Результат виразу 6) $result6")


    val a7 = 7;
    val b7 = 120;
    val c7 = 5;
    val d7 = 17

    val result7 = ((a7 + b7 + c7 - d7) * 2 / 3) % 5 + c7
    println("Результат виразу 7) $result7")

    val x8 = 30;
    val y8 = 40;
    val z8 = 50;
    val d8 = 18

    val result8 = (x8 < y8) && (z8 < x8) && (y8 > z8) || (y8 > d8)
    println("Результат виразу 8) $result8")

    val a9 = 5;
    val b9 = 3;
    val c9 = 2;
    val d9 = 4

    val result9 = ((a9 - b9) * c9) * d9 * 2 + a9 % d9 - (c9 * d9)
    println("Результат виразу 9) $result9")

    val a11 = 7;
    val b11 = 120;
    val c11 = 15
    val result11 = ((2 * a11 + 3 * b11 - 4 * c11) * 12 / a11) % 3

    println("Результат виразу 11) $result11")

    val x12 = 130;
    val y12 = 140;
    val z12 = 10

    val result12 = (x12 > y12) || (z12 < x12) && (y12 > z12)
    println("Результат виразу 12) $result12")


    val a13 = 18;
    val b13 = 15;
    val c13 = 120

    val denominator = (a13 - b13) * c13
    val result13 = if
            (denominator != 0) (7 * a13 + 3 * b13 - 6 * c13) / denominator
    else "Ділення на 0"

    println("Результат виразу 13) $result13")


    val a14 = 5;
    val b14 = 3;
    val c14 = 2;
    val d14 = 4

    val result14 = (((3 * a14 + b14) - 8 * c14) * d14 / 12) + (c14 % 3) - (c14 / d14)
    println("Результат виразу 14) $result14")

    val a15 = 10;
    val b15 = 2;
    val c15 = 5;
    val d15 = 3

    val result15 = ((a15 - 7 * b15) + 18 * c15) * d15 - 150 * a15 - (c15 % d15)
    println("Результат виразу 15) $result15")

    val a16 = 9;
    val b16 = 2;
    val c16 = 70;
    val d16 = 7

    val result16 = ((a16 * c16) / b16) / d16 + 10 * a16 % b16 - (a16 / d16)
    println("Результат виразу 16) $result16")

    val a17 = 7;
    val b17 = 120;
    val c17 = 15;
    val d17 = 17

    val result17 = ((19 * a17 + 3 * b17 - 2 * c17 * d17) * d17 / 3) % 5 + c17
    println("Результат виразу 17) $result17")

    val a18 = 100;
    val b18 = 12;
    val c18 = 4;
    val d18 = 2

    val result18 = ((10 * a18 - b18) + 7 * c18) * d18 - 7 * a18 - (c18 % 6)
    println("Результат виразу 18) $result18")

    val a19 = 3;
    val b19 = 19;
    val c19 = 20;
    val d19 = 9

    val result19 = ((a19 + c19) / d19) * a19 - 3 + 7 * (a19 - d19) - (c19 * d19)
    println("Результат виразу 19) $result19")

    val a20 = 15;
    val b20 = 13;
    val c20 = 5;
    val d20 = 40

    val result20 = ((a20 - b20 + d20) * c20 / d20) * 2 + 18 * (a20 + d20) + (c20 % d20)
    println("Результат виразу 20) $result20")

    }




