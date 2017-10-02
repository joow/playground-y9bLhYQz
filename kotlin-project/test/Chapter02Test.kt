import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Chapter02Test {
    @Test
    fun answer() {
        assertThat(answer).isEqualTo(42)
    }

    @Test
    fun raw() {
        assertThat(quote).isEqualTo("""
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin())
    }

    @Test
    fun template() {
        assertThat(hello("kotlin")).isEqualTo("Hello, KOTLIN")
    }
}
