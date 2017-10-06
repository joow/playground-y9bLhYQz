import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule
import java.awt.Point

class Chapter03Test {
    @Rule
    @JvmField
    val systemOutRule: SystemOutRule = SystemOutRule().enableLog()

    @Test
    fun add() {
        assertThat(add(21, 21)).isEqualTo(42)
    }

    @Test
    fun print() {
        printTheAnswer()
        assertThat(systemOutRule.log).startsWith("42")
    }

    @Test
    fun strEq() {
        assertThat(strEq("Hello, Kotlin", "Hello, kotlin")).isFalse()
        assertThat(strEq("Hello, Kotlin", "Hello, kotlin", true)).isTrue()
    }

    @Test
    fun isEven() {
        assertThat(isEven(1)).isFalse()
        assertThat(isEven(2)).isTrue()
    }

    @Test
    fun extension() {
        assertThat("Hello, Kotlin".tail()).isEqualTo("ello, Kotlin")
    }

    @Test
    fun infix() {
        assertThat(1 inc 1).isEqualTo(2)
        assertThat(5 inc 5).isEqualTo(10)
    }

    @Test
    fun sum() {
        assertThat(sum(1)).isEqualTo(1)
        assertThat(sum(1, 2)).isEqualTo(3)
        assertThat(sum(1, 2, 3)).isEqualTo(6)
    }

    @Test
    fun plus() {
        assertThat(Point(3, 5) + Point(5, 3)).isEqualTo(Point(8, 8))
    }

    @Test
    fun freq() {
        assertThat(freq("Hello, Kotlin", 'o')).isEqualTo(2)
    }
}
