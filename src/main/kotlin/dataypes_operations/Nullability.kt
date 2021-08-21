package dataypes_operations

class Nullability {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            var rainbowColor=null
            var greenColor:String?=null
//            var blueColor: String? =null
            println("rainbowColor=$rainbowColor, greenColor=$greenColor")

//            rainbowColor="Blah blah"  // it can't be done because of
            // Type mismatch: inferred type is String but Nothing? was expected
            greenColor="Blue"
            println("rainbowColor=$rainbowColor, greenColor=$greenColor")
        }
    }
}