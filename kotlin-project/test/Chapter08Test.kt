import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Chapter08Test {
    @Rule
    @JvmField
    val systemOutRule: SystemOutRule = SystemOutRule().enableLog()

    @Before
    fun clearLog() {
        systemOutRule.clearLog()
    }

    @Test
    fun negate() {
        val isEven = { n: Int -> n % 2 == 0 }
        val isOdd = negate(isEven)
        assertThat(isOdd(1)).isTrue()
        assertThat(isOdd(2)).isFalse()
    }

    @Test
    fun destructuring() {
        capitals()
        assertThat(systemOutRule.log).contains("The capital of France is Paris")
        assertThat(systemOutRule.log).contains("The capital of Germany is Berlin")
        assertThat(systemOutRule.log).contains("The capital of Spain is Madrid")
        assertThat(systemOutRule.log).contains("The capital of Italy is Rome")
    }

    @Test
    fun suit() {
        main(emptyArray())
        assertThat(systemOutRule.log).isEqualToIgnoringWhitespace("""
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
    }

    @Test
    fun powersOf2() {
        main(emptyArray())
        assertThat(systemOutRule.log).isEqualToIgnoringWhitespace("""
            |1
            |2
            |4
            |8
            |16
            |32
            |64
            |128
            |256
            |512
            """.trimMargin())
    }

    @Test
    fun bigPowerOf2() {
        main(emptyArray())
        assertThat(systemOutRule.log).isEqualTo("16384")
    }
}