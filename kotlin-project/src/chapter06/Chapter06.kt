import java.util.concurrent.ThreadLocalRandom

data class Person(val firstName: String, var lastName: String) {
    fun identity() = Pair(firstName, lastName)
}

class Rectangle(val width: Int, val height: Int) {
    constructor(side: Int) : this(side, side)

    val area get() = width * height
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Rectangle

        if (width != other.width) return false
        if (height != other.height) return false

        return true
    }

    override fun hashCode(): Int {
        var result = width
        result = 31 * result + height
        return result
    }
}

class RandomInt {
    var counter: Int = 0
        private set

    fun new(): Int {
        counter++
        return ThreadLocalRandom.current().nextInt()
    }
}

fun hello(p: Person): String {
    val (firstName, lastName) = p
    return "Hello, $firstName $lastName"
}