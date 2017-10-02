# Control structures

## If

*https://kotlinlang.org/docs/reference/control-flow.html#if-expression*

The classic `if` is revised, it is an expression :

@[Declare an immutable string variable holding "head" or "tail" depending on the toss]({"stubs": ["src/if.kt"], "command": "Chapter04Test#headOrTail"})

## When

*https://kotlinlang.org/docs/reference/control-flow.html#when-expression*

Kotlin doesn't have a `switch` keyword, it replaces it with a powerful `when` expression, similar to pattern matching :

@[Declare a function fizzbuzz solving the infamous algorithm]({"stubs": ["src/when.kt"], "command": "Chapter04Test#fizzbuzz"})

## For

*https://kotlinlang.org/docs/reference/control-flow.html#for-loops* 

For loops are implemented as `foreach` loops, using `in` keyword :

@[Iterate over the list of languages to print them]({"stubs": ["src/for.kt"], "command": "Chapter04Test#forin"})

### Ranges

*https://kotlinlang.org/docs/reference/ranges.html*

Using `rangeTo` functions ranges can be defined for any comparable type.
The `..` operator is used to define ranges, `in` and `!in` to check if a value is included in a range or to iterate over a range (for integral type).
`downTo`, `step` and `until` can be used to revert the range, change the progression step or exclude the last value.

@[Display the ten first numbers, a countdown from 10 to 0 and the ten first even numbers]({"stubs": ["src/range.kt"], "command": "Chapter04Test#ranges"})
