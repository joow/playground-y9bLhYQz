# Functions

*https://kotlinlang.org/docs/reference/functions.html#function-declarations*

Kotlin makes programming fun again so naturally the `fun` keyword is used to declare a function 😀.

@[Declare a function add which adds two Ints]({"stubs": ["src/add.kt"], "command": "Chapter03Test#add"})

If we only have one return statement we can transform the function to use only an expression.

@[Rewrite the previous code using a single expression]({"stubs": ["src/add.kt"], "command": "Chapter03Test#add"})

We could go one step further and remove the return type as the compiler will be nice enough to infer it for us.

@[Drop as much as you can]({"stubs": ["src/add.kt"], "command": "Chapter03Test#add"})

**Note**: inferring the return type works only for single expression function, the compiler won't try to infer it for functions with block body so overuse single expression function 😁.

If a function doesn't return anything we use the `Unit` type :

@[Declare a function printing a meaningful sentence]({"stubs": ["src/print.kt"], "command": "Chapter03Test#print"})

## Named arguments

*https://kotlinlang.org/docs/reference/functions.html#named-arguments*

When calling a function we can change arguments order by naming them in the call :

```kotlin
fun sub(a: Int, b: Int) = a - b

print(sub(b = 1, a = 2))        // 1
```

## Default arguments

*https://kotlinlang.org/docs/reference/functions.html#default-arguments*

Never dreamt of assigning default values to some arguments instead of having to define multiple overloading functions ?
Guess what ? You can 😀 :

@[Declare a function strEq returning either two strings are the same or not, ignoring or not their case]({"stubs": ["src/strEq.kt"], "command": "Chapter03Test#strEq"})

> Tip : use `@JvmOverloads` to generate overloading methods for Java code.

## Local Functions

*https://kotlinlang.org/docs/reference/functions.html#local-functions*

You can declare local functions, having access to outer scope :

@[Define a function checking if a number is even or not]({"stubs": ["src/isEven.kt"], "command": "Chapter03Test#isEven"})

## Extensions

*https://kotlinlang.org/docs/reference/extensions.html*

It is possible to extend existing classes with new functionalities, even existing JVM classes.  
We just need to prefix the function name with the receiver type, followed by `.`. The receiver will be accessible as `this` in the function.

@[Create a function tail returning the tail of a given string]({"stubs": ["stub/empty.kt"], "command": "Chapter03Test#extension"})

## Infix notation

*https://kotlinlang.org/docs/reference/functions.html#infix-notation*

Using `infix` keyword and `extension functions` we can use infix notation for some of our functions :

@[Declare an infix function inc that can increment an Int]({"stubs": ["src/infix.kt"], "command": "Chapter03Test#infix"})

## Vararg

*https://kotlinlang.org/docs/reference/functions.html#variable-number-of-arguments-varargs*

As in Java we might need to pass a variable number of arguments. In this case we need to prefix the argument by the keyword `vararg` :

@[Declare a function sum that can sum an infinite number of Ints]({"stubs": ["src/vararg.kt"], "command": "Chapter03Test#sum"})

## Operator Overloading

At last we can overload common operators using the `operator` keyword 😃 :

@[Define a plus operator to add two Points  a function sum that can some an infinite number of Ints]({"stubs": ["src/operator.kt"], "command": "Chapter03Test#plus"})

## Tail recursion

A tail recursive function can be marked as such with the `tailrec` keyword.

@[Define a freq tail recursive function counting the number of a character in a string]({"stubs": ["src/tailrec.kt"], "command": "Chapter03Test#freq"})

**Beware**: contrary to Scala the compiler won't raise an error if you incorrectly marked a function as tail recursive.
