# Functions

Kotlin makes programming fun so naturally the `fun` keyword is used to declare a function 😀.

@[Declare a function named add which adds two Ints]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`` `add function should add two Ints` ``"})

If we only have one return statement we can transform the function to use only an expression.

@[Rewrite the previous code using a single expression]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`add function should add two Ints`"})

We could go one step further and remove the return type as the compiler will be nice enough to infer it for us.

@[Drop as much as you can]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`add function should add two Ints`"})

**Note**: inferring the return type works only for single expression function, the compiler won't try to infer it for functions with block body so overuse single expression function 😁.

If a function doesn't return anything we use the `Unit` type :

@[Declare a function printing a meaningful sentence]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`print the answer to the question`"})

## Named arguments

When calling a function we can change arguments order by naming them in the call :

```kotlin
fun sub(a: Int, b: Int) = a - b

print(sub(b = 1, a = 2))        // 1
```

## Default arguments

Never dreamt of assigning default values to some arguments instead of having to define multiple overloading functions ?
Guess what ? You can 😀 :

@[Declare a function strEq returning either two strings are the same or not, ignoring or not their case]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`strEq should allow to ignore case`"})

## Local Functions

You can declare local functions, having access to outer scope :

```kotlin
fun isEven(n: Int): Boolean {
    fun isMultiple(operand: Int) = n % operand == 0
    return isMultiple(2)
}
```

## Infix notation

Using `infix` keyword and `extension functions` (we'll get to that later) we can use infix notation for some of our functions :

```kotlin
infix fun Int.inc(n: Int) = this + n

print(1 inc 1) // 2
```

## Vararg

As in Java we might need to pass a variable number of arguments. In this case we need to prefix the argument by the keyword `vararg` :

@[Declare a function sum that can sum an infinite number of Ints]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`sum should add a variable number of Ints`"})

## Operator Overloading

At last we can overload common operators using the `operator` keyword 😃 :

@[Define a plus operator to add two Points  a function sum that can some an infinite number of Ints]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`add two points with + operator`"})

## Tail recursion

A tail recursive function can be marked as such with the `tailrec` keyword.

@[Define a freq tail recursive function counting the number of a character in a string]({"stubs": ["src/Chapter03.kt"], "command": "Chapter03Test#`add two points with + operator`"})

**Beware**: contrary to Scala the compiler won't raise an error if you incorrectly marked a function as tail recursive.
