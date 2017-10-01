import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.Test

class Chapter07Test {
    @Test
    fun nullable() {
        assertThat(name).isNull()
    }

    @Test
    fun safeCall() {
        assertThat(nameLength).isNull()
    }

    @Test
    fun elvis() {
        assertThat(length).isEqualTo(0)
    }

    @Test
    fun npe() {
        assertThat(npe("Hello, Kotlin")).isEqualTo(13)
        assertThatThrownBy { npe(name) }.isInstanceOf(KotlinNullPointerException::class.java)
    }
}