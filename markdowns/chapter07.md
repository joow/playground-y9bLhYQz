# Nullability

## Nullable types (https://kotlinlang.org/docs/reference/null-safety.html#nullable-types-and-non-null-types)

All types in Kotlin are non nullables (they don't include the `null` value).  
To do so the type must be explicitly marked as nullable with the `?` sign.

@[Declare a String variable called name and set it to the null value]({"stubs": ["stub/empty.kt"], "command": "Chapter07Test#nullable"})

## Safe calls (https://kotlinlang.org/docs/reference/null-safety.html#safe-calls)

Calling a function on a nullable value might raise a `NullPointerException`.  
Thanksfully Kotlin has a safe call operator : `?`.

@[Declare a nameLength variable holding the length of the name String]({"stubs": ["stub/empty.kt"], "command": "Chapter07Test#safeCall"})

## Elvis (https://kotlinlang.org/docs/reference/null-safety.html#elvis-operator)

What if we don't want to stay in the dangerous nullable world and escape from it ?  
We can thank Elvis for that and use the operator `?:` allowing to specify a non-null value to use in case the value is null.

@[Declare a length variable holding the length of the name String, 0 if name is null]({"stubs": ["stub/empty.kt"], "command": "Chapter07Test#elvis"})

## I ❤️ NPE (https://kotlinlang.org/docs/reference/null-safety.html#the--operator)

Finally if really we want to raise a `NullPointerException` we can use the `!!` operator.

@[Declare a function npe returning the length of the given String, throwing a NullPointerException if the string is null]({"stubs": ["stub/empty.kt"], "command": "Chapter07Test#npe"})

## Safecast (https://kotlinlang.org/docs/reference/null-safety.html#safe-casts)

In Kotlin the keyword `as` is used to cast an object into a specific type. If the cast fail a `ClassCastException` is raised, `as?` can be used to return a `null` value if the cast failed.
