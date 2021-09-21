package dataypes_operations

class ArrayNList {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var arr= arrayOf("Hello", "Mellow")
            var arr1= arrayOf("Blah", "Wah", 21)
//            both the above arrays are of different type

            var arr2= intArrayOf(1,2,3,4)  // explicitly mentioning the type

            var li= listOf(1,2,3,3)
            var li1= listOf(1,2,3,"Jack")
            //            both the above lists are of different type

            var li2= listOf<Int>(1,2,3)
        }
    }
}