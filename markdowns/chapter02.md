# Variables

## Read-only variables

Kotlin let you declare variables as immutable by using the `val` keyword :

```kotlin 
val a: Int = 42 // Type is declared after name
val b = 5       // Int is inferred
val c: Int      // Initialization is deferred so we need to specify type
c = 3
```

**Warning** As in Java (`final`) or JavaScript (`const`), `val` makes only the reference be immutable, not the object being referenced itself :

```kotlin
val languages = mutableListOf("Java", "JavaScript")
languages.add("Kotlin") // [Java, JavaScript, Kotlin]
```

## Mutable variables

Using the `var` keyword you can declare a mutable variable =

```kotlin
var d = 41
d += 1     // What is the answer ?
```

## Exercice

@[Fix the following code]({"stubs": ["src/Chapter02.kt"], "command": "Chapter02Test#`answer should be equals to 42`"})

## Constants

You can also declare compile-time constants with the `const` keyword :

```kotlin
const val CONST = 42
```

*Only usable for top-level or `object` member and `String` "primitive" types*
