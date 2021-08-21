package dataypes_operations

class NullChecks {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var nullTest: Int? = null
//            nullTest = 8

            if (nullTest != null) {
                nullTest++
                println(nullTest)
            } else {
                println(0)
            }

//            shortcut
//            println(nullTest?.inc() ?: 0)
        }
    }
}