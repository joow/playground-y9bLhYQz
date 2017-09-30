import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Chapter05JavaTest {
    @Test
    public void java() {
        User user = new User("john@doe.com", "1234");
        assertThat(user.getEmail()).isEqualTo("john@doe.com");
        assertThat(user.getPassword()).isEqualTo("1234");
        assertThat(user.isPasswordValid()).isFalse();
    }
}
