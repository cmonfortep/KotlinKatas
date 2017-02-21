package FizzBuzz

fun Int.divisibleBy(n: Int) = this % n == 0

fun fizzBuzz(n: Int): String = when {
    n.divisibleBy(15) -> "FizzBuzz"
    n.divisibleBy(5) -> "Buzz"
    n.divisibleBy(3) -> "Fizz"
    else -> n.toString()
}

fun main(args: Array<String>) {
    for (n in 1..100) {
        println(fizzBuzz(n))
    }
}