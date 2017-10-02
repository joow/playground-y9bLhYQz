# Variables

*https://kotlinlang.org/docs/reference/basic-syntax.html#defining-local-variables*

## Read-only variables

Kotlin let you declare variables as immutable by using the `val` keyword :

```kotlin 
val a: Int = 42 // Type is declared after name
val b = 5       // Int is inferred
val c: Int      // Initialization is deferred so we need to specify type
c = 3
```

**Warning** : As in Java (`final`) or JavaScript (`const`), `val` makes only the reference be immutable, not the object being referenced itself :

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

@[Fix the following code]({"stubs": ["src/chapter02/Chapter021.kt"], "command": "Chapter02Test#answer"})

## Constants

You can also declare compile-time constants with the `const` keyword :

```kotlin
const val CONST = 42
```

*Only usable for top-level or `object` member and `String` "primitive" types*

## Strings

### Type

*https://kotlinlang.org/docs/reference/basic-types.html#strings*

As in Java `String` are immutables. They are also iterables.

Kotlin has two types of strings :

1. Literals, using `"`
2. Raw, using `"""`

Raw strings can contain newlines and other characters :

>Tell me and I forget.  
>Teach me and I remember.  
>Involve me and I learn.  
>(Benjamin Franklin)

@[Define the previous string using a raw string]({"stubs": ["stub/chapter02/Chapter022.kt"], "command": "Chapter02Test#rawString"})

### Templates

*https://kotlinlang.org/docs/reference/basic-types.html#string-templates*

Using `$` or `${...}` in a string allows you to reference variables and call functions.

@[Define the hello function which should return Hello, <NAME>]({"stubs": ["src/chapter02/Chapter023.kt"], "command": "Chapter02Test#stringTemplate"})
