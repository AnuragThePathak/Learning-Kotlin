package dataypes_operations

class SwitchCase {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var fishName= readLine()
            when(fishName?.length){
                0-> println("Fish name cannot be empty")
                in 3..12-> println("Good fish name")
                else-> println("OK fish name")
            }
        }
    }
}