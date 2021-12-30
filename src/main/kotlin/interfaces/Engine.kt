package interfaces

interface Engine {

    fun startEngine() {
        println("Voom voom")
    }

    fun stopEngine(key: Boolean): Boolean

    companion object {
        fun coolEngine() {
            println("Ha ha it's static function.")
        }

        // Final is redundant in case of static members as they are not inherited.
        final fun batteryUse() {
            println("We're running on battery.")
        }
    }
}