package FizzBuzz

import org.junit.Assert
import org.junit.Test


class FizzBuzzTest {
    @Test
    fun `when number is divisible by 3 should print Fizz`() {
        val result = fizzBuzz(3)

        Assert.assertEquals(result, "Fizz")
    }

    @Test
    fun `when number is divisible by 5 should print Buzz`() {
        val result = fizzBuzz(5)

        Assert.assertEquals(result, "Buzz")
    }

    @Test
    fun `when number is divisible by 15 should print FizzBuzz`() {
        val result = fizzBuzz(15)

        Assert.assertEquals(result, "FizzBuzz")
    }

    @Test
    fun `when number is not divisible by 3 nor 5 should print number`() {
        val result = fizzBuzz(1)

        Assert.assertEquals(result, "1")
    }
}