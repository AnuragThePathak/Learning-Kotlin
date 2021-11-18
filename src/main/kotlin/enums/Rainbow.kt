package enums

enum class Rainbow {
    VIOLET, INDIGO, BLUE, GREEN, YELLOW, ORANGE, RED;

    companion object {
        fun findColorByName(color: String): Boolean {
            for (i in values()) {
                if (i.name == color) return true
            }
            return false
        }
    }
}

fun main() {
    val color = readLine()!!.uppercase()

    println(Rainbow.findColorByName(color))
}