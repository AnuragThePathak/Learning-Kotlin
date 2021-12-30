package enums

enum class Level(val daggerLevel: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int = this.daggerLevel
}