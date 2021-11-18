package enums

enum class Color(val color: String, val rgb: String) {
    VIOLET("Violet", "#8B00FF"),
    INDIGO("Indigo", "#4B0082"),
    BLUE("Blue", "#0000FF"),
    GREEN("Green", "#00FF00");

    fun getDetails() {
        println("Color: $color, Hex value: $rgb")
    }
}

fun main() {
    println(Color.VIOLET)
    println(Color.VIOLET.rgb)
    println(Color.valueOf("GREEN"))
    println()

    val color = Color.BLUE
    println("${color.name} ${color.declaringClass} ${color.ordinal}")

    color.getDetails()

    println()

    for (i in Color.values()) {
        i.getDetails()
    }
}