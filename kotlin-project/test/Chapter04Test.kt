import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Chapter04Test {
    @Rule
    @JvmField
    val systemOutRule: SystemOutRule = SystemOutRule().enableLog()

    @Test
    fun headOrTail() {
        assertThat(toss).matches("(head)|(tail)")
    }

    @Test
    fun fizzbuzz() {
        val answers = mapOf(
                1 to "1", 2 to "2", 3 to "Fizz", 4 to "4", 5 to "Buzz", 6 to "Fizz", 7 to "7", 8 to "8",
                9 to "Fizz", 10 to "Buzz", 11 to "11", 12 to "Fizz", 13 to "13", 14 to "14", 15 to "FizzBuzz")

        answers.forEach { n, s -> assertThat(fizzbuzz(n)).isEqualTo(s) }
    }

    @Test
    fun forin() {
        printLanguages()
        assertThat(systemOutRule.log).startsWith("""
            |Java
            |JavaScript
            |Go
            |Kotlin
            """.trimMargin())
    }

    @Test
    fun ranges() {
        tenFirstNumber()
        assertThat(systemOutRule.log).startsWith("""
            |1
            |2
            |3
            |4
            |5
            |6
            |7
            |8
            |9
            |10
            """.trimMargin())

        systemOutRule.clearLog()
        countdown()
        assertThat(systemOutRule.log).startsWith("""
            |10
            |9
            |8
            |7
            |6
            |5
            |4
            |3
            |2
            |1
            |0
            """.trimMargin())

        systemOutRule.clearLog()
        tenFirstEvenNumbers()
        assertThat(systemOutRule.log).startsWith("""
            |2
            |4
            |6
            |8
            |10
            |12
            |14
            |16
            |18
            |20
            """.trimMargin())
    }
}
