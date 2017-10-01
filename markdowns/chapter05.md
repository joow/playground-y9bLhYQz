# Interoperability

## Kotlin -> Java

*https://kotlinlang.org/docs/reference/java-interop.html*

Kotlin can almost use any Java code without issue.

@[Instanciate a new user and display its name]({"stubs": ["src/chapter05/Chapter051.kt", "src/chapter05/UserJava.java"], "command": "Chapter05Test#kotlin"})

## Java -> Kotlin

*https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html*

Using Kotlin in Java is almost quite easy.

@[Check if the password of the user is valid (at least 8 characters)]({"stubs": ["src/chapter05/Chapter052.kt", "test/chapter05/Chapter05JavaTest.java"], "command": "Chapter05JavaTest#java"})
