val name: String? = "should be null"

val nameLength = name?.length

val length = name?.length ?: 0

fun npe(s: String?) = s!!.length
