fun main() {
    val originalMessage = "we found a treasure!"

    val encryptedMessage = originalMessage.map { char ->
        when {
            char.isLetter() -> {
                val distance = char.lowercaseChar() - 'a'
                ('z' - distance).toString()
            }
            else -> char.toString()
        }
    }.joinToString("")

    println(encryptedMessage)
}