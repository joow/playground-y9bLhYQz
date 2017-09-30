# Control structures

## If

The classic `if` is revised, it is an expression :

@[Declare an immutable string variable holding "head" or "tail" depending on the toss]({"stubs": ["src/chapter04/Chapter041.kt"], "command": "Chapter04Test#headOrTail"})

## When

Kotlin doesn't have a `switch` keyword, it replaces it with a powerful `when` expression, similar to pattern matching :

@[Declare a function fizzbuzz solving the infamous algorithm]({"stubs": ["src/chapter04/Chapter042.kt"], "command": "Chapter04Test#fizzbuzz"})

## For

For loops are implemented as `foreach` loops, using `in` keyword :

@[Iterate over the list of languages to print them]({"stubs": ["src/chapter04/Chapter043.kt"], "command": "Chapter04Test#forin"})

### Ranges

Using `rangeTo` functions ranges can be defined for any comparable type.
The `..` operator is used to define ranges, `in` and `!in` to check if a value is included in a range or to iterate over a range (for integral type).
`downTo`, `step` and `until` can be used to revert the range, change the progression step or exclude the last value.

@[Display the ten first numbers, a countdown from 10 to 0 and the ten first even numbers]({"stubs": ["src/chapter04/Chapter044.kt"], "command": "Chapter04Test#ranges"})
