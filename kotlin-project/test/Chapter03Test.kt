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
    fun `add function should add two Ints`() {
        assertThat(add(21, 21)).isEqualTo(42)
    }

    @Test
    fun `print the answer to the question`() {
        printTheAnswer()
        assertThat(systemOutRule.log).startsWith("42")
    }

    @Test
    fun `strEq should allow to ignore case`() {
        assertThat(strEq("Hello, Kotlin", "Hello, kotlin")).isFalse()
        assertThat(strEq("Hello, Kotlin", "Hello, kotlin", true)).isTrue()
    }

    @Test
    fun `isEven use isMultiple local function`() {
        assertThat(isEven(1)).isFalse()
        assertThat(isEven(2)).isTrue()
    }

    @Test
    fun `use inc infix operation to increment an Int`() {
        assertThat(1 inc 1).isEqualTo(2)
    }

    @Test
    fun `sum should add a variable number of Ints`() {
        assertThat(sum(1)).isEqualTo(1)
        assertThat(sum(1, 2)).isEqualTo(3)
        assertThat(sum(1, 2, 3)).isEqualTo(6)
    }

    @Test
    fun `add two points with + operator`() {
        assertThat(Point(3, 5) + Point(5, 3)).isEqualTo(Point(8, 8))
    }

    @Test
    fun `count character frequency using tail recursive function`() {
        assertThat(freq("Hello, Kotlin", 'o')).isEqualTo(2)
    }
}
