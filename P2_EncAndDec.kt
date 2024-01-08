fun main() {
    val message = readln()
    val key = readln().toInt()
    val encryptedMessage = encryptCaesarCipher(message, key)
    println(encryptedMessage)
}

fun encryptCaesarCipher(message: String, key: Int): String {
    return message.map { char ->
        when {
            char.isLetter() -> {
                val base = 'a'
                val shiftedChar = (base.code + (char.code - base.code + key) % 26).toChar()
                shiftedChar
            }
            else -> char
        }
    }.joinToString("")
}
