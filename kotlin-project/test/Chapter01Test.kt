import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Chapter01Test {
	@Rule
	@JvmField
	val systemOutRule: SystemOutRule = SystemOutRule().enableLog()

	@Test
	fun itShouldDisplayHelloWorld() {
		main(emptyArray())
		assertThat(systemOutRule.log).contains("Hello, Kotlin")
  }
}
