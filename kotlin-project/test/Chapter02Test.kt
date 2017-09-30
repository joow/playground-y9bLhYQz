import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Chapter02Test {
    @Test
    fun `answer should be equals to 42`() {
        assertThat(answer).isEqualTo(42)
    }
}
