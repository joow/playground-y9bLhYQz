# Interoperability

## Kotlin -> Java

*https://kotlinlang.org/docs/reference/java-interop.html*

Kotlin can almost use any Java code without issue.

@[Instanciate a new user and display its name]({"stubs": ["src/kotlin.kt", "src/UserJava.java"], "command": "Chapter05Test#kotlin"})

## Java -> Kotlin

*https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html*

Using Kotlin in Java is almost quite easy.

@[Check if the password of the user is valid (at least 8 characters)]({"stubs": ["src/java.kt", "test/Chapter05JavaTest.java"], "command": "Chapter05JavaTest#java"})
