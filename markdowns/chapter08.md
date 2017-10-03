# Lambdas and Collections

## Higher-order functions

*https://kotlinlang.org/docs/reference/lambdas.html#higher-order-functions*

A higher-order function is a function that either :

    - takes at least one function as argument
    - returns a function

## Lambda expressions

*https://kotlinlang.org/docs/reference/lambdas.html#lambda-expressions-and-anonymous-functions*

The formal syntax for lambda expression is :

```kotlin
val sum = { x: Int, y: Int -> x + y }
```

We can also rewrite the previous expression like this :

```kotlin
val sum: (Int, Int) -> Int = { x, y -> x + y }
```

If the compiler can infer the signature you can leave out the signature :

```kotlin
ints.filter { it > 0 }
```

@[Declare a function negate that takes a predicate and returns its opposite]({"stubs": ["src/hof.kt"], "command": "Chapter08Test#negate"})

## Destructuring Lambdas

*https://kotlinlang.org/docs/reference/multi-declarations.html#destructuring-in-lambdas-since-11*

Since Kotlin 1.1 it is possible to destruture lambdas.

@[Given a map of countries and their capital, create a function capital printing for each entry "The capital of ... is ..."]({"stubs": ["src/destructuring.kt"], "command": "Chapter08Test#capitals"})

## Collections

*https://kotlinlang.org/docs/reference/collections.html*

Kotlin has immutable and mutable collections :

```kotlin
// List
val mutableList = mutableListOf("Java", "Kotlin", "JavaScript")
mutableList.add("Go")
val immutableList = listOf("Java", "Kotlin", "JavaScript")
immutableList.plus("Go") // returns a new list
// Set
val mutableSet = mutableSetOf(1, 3, 5, 7, 9)
mutableSet.add(11)
val immutableSet = setOf(0, 2, 4, 6, 8)
immutableSet.plus(10) // returns a new set
// Map    
val mutableMap = mutableMapOf("1" to 1, "2" to 2, "3" to 3)
mutableMap.put("4", 4)
val immutableMap = mapOf("1" to 1, "2" to 2, "3" to 3)
immutableMap.plus("4" to 4) // returns a new map
```

### Fun with numbers

@[Generate the ten first numbers and print them]({"stubs": ["stub/main.kt"], "command": "Chapter08Test#suit"})

@[Generate the first ten powers of two and print them]({"stubs": ["stub/main.kt"], "command": "Chapter08Test#powersOf2"})

@[Print the first power of 2 greater than 10000]({"stubs": ["stub/main.kt"], "command": "Chapter08Test#bigPowerOf2"})

### Fun with data

@[Print the birth countries of the musicians, without duplicate]({"stubs": ["src/musician.kt"], "command": "Chapter08MusicianTest#birth"})

@[Generate a string containing the last names of the musicians, sorted in ascending order and separated by a comma]({"stubs": ["src/musician.kt"], "command": "Chapter08MusicianTest#lastNames"})

@[Count the number of musicians having their last name containing the letter B, no matter the case]({"stubs": ["src/musician.kt"], "command": "Chapter08MusicianTest#countB"})

@[Print the list of death countries and the number of deceased musicians]({"stubs": ["src/musician.kt"], "command": "Chapter08MusicianTest#countD"})

@[Print the musicians ordered by their death age. Who was the youngest and who was the oldest ?]({"stubs": ["src/musician.kt"], "command": "Chapter08MusicianTest#age"})
