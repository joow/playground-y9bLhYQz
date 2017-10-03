# Classes

## Introduction

*https://kotlinlang.org/docs/reference/classes.html#classes*

The keyword `class` is used to declare a class :

```kotlin
class Empty
```

## Constructors

*https://kotlinlang.org/docs/reference/classes.html#constructors*

Classes can have one primary constructor and multiple secondary constructors.

@[Create a class Person with two properties : firstName and lastName]({"stubs": ["src/class.kt"], "command": "Chapter06Test#person"})

@[Create a class Rectange and allow to create easily a square]({"stubs": ["src/constructor.kt"], "command": "Chapter06Test#square"})

## Property

*https://kotlinlang.org/docs/reference/properties.html*

There is no such thing as a field in a Kotlin class. Instead classes may have properties.

@[Add a computed property area to the Rectangle class ]({"stubs": ["stub/empty.kt"], "command": "Chapter06Test#area"})

@[Create a RandomInt class that can return a new random Int and count the number of Ints generated]({"stubs": ["stub/empty.kt"], "command": "Chapter06Test#random"})

## Data classes

*https://kotlinlang.org/docs/reference/data-classes.html*

Using the magic `data` keyword we can transform a class in a data class having the following code handled for us :

    - `equals()`/`hashCode()`
    - `toString()`
    - `componentN()` functions for each declared property
    - `copy()` function

@[Transform the Person class in a data class and use it to copy a person, changing only his first name]({"stubs": ["stub/empty.kt"], "command": "Chapter06Test#data"})

## Pair and Triple

*https://kotlinlang.org/docs/reference/data-classes.html#standard-data-classes*

`Pair` and `Triple` classes are data classes allowing to return a pair or a triple of elements.

@[Add an identity function to the Person class return the first name and the last name as a pair]({"stubs": ["stub/empty.kt"], "command": "Chapter06Test#pair"})

## Destructuring

*https://kotlinlang.org/docs/reference/multi-declarations.html*

Data classes can be destructured :

```kotlin
val (country, city) = Pair("France", "Bordeaux")
val (_, city) = Pair("France", "Bordeaux")       // don't care about country
```

@[Add a hello function taking a Person and returning Hello, <firstName> <lastName>, using destructuring]({"stubs": ["stub/empty.kt"], "command": "Chapter06Test#destructuring"})

## Equality

*https://kotlinlang.org/docs/reference/equality.html*

There are two equality operators in Kotlin :

  1. `==` (and `!=`) as structural equality (or functional equality)
  2. `===` (and `!==`) as referential equality

@[Define the structural equality for our Rectangle class]({"stubs": ["stub/empty.kt"], "command": "Chapter06Test#random"})
