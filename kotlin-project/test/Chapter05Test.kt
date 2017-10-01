import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Chapter05Test {
    @Rule
    @JvmField
    val systemOutRule: SystemOutRule = SystemOutRule().enableLog()

    @Test
    fun kotlin() {
        displayEmail()
        assertThat(systemOutRule.log).startsWith(user.email)
    }
}
