import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Chapter06Test {
    @Test
    fun person() {
        val me = Person(firstName = "Benoît", lastName = "Giraudou")
        assertThat(me.firstName).isEqualTo("Benoît")
        assertThat(me.lastName).isEqualTo("Giraudou")
    }

    @Test
    fun square() {
        val rectangle = Rectangle(5, 8)
        assertThat(rectangle).isNotNull()
        val square = Rectangle(5)
        assertThat(square).isNotNull()
    }

    @Test
    fun area() {
        val rectangle = Rectangle(5, 8)
        assertThat(rectangle.area).isEqualTo(40)
    }

    @Test
    fun random() {
        val randomInt = RandomInt()
        val n1 = randomInt.new()
        val n2 = randomInt.new()
        val n3 = randomInt.new()
        assertThat(n1).isNotEqualTo(n2)
        assertThat(n1).isNotEqualTo(n3)
        assertThat(n2).isNotEqualTo(n3)
        assertThat(randomInt.counter).isEqualTo(3)
    }

    @Test
    fun data() {
        val person1 = Person("Benoît", "Giraudou")
        val person2 = person1.copy(firstName = "Clément")
        assertThat(person2.firstName).isEqualTo("Clément")
        assertThat(person2.lastName).isEqualTo("Giraudou")
    }

    @Test
    fun pair() {
        val person = Person("Benoît", "Giraudou")
        val identity = person.identity()
        assertThat(identity.first).isEqualTo("Benoît")
        assertThat(identity.second).isEqualTo("Giraudou")
    }

    @Test
    fun destructuring() {
        val person = Person("Benoît", "Giraudou")
        val hello = hello(person)
        assertThat(hello).isEqualTo("Hello, Benoît Giraudou")
    }

    @Test
    fun equals() {
        val rectangle1 = Rectangle(5, 8)
        val rectangle2 = Rectangle(5, 8)
        assertThat(rectangle1 == rectangle2).isTrue()
    }
}