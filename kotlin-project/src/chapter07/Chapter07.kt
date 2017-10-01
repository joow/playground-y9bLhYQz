val name: String? = null

val nameLength = name?.length

val length = name?.length ?: 0

fun npe(s: String?) = s!!.length
