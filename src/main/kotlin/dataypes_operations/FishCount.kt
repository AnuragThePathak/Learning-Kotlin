package dataypes_operations

class FishCount {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            var nos = 2
//            nos += 71
//            nos += 233
//            nos -= 13

//             alter see power of kotlin
            var nos = 2.plus(71).plus(233).minus(13)

            println("No of fishes left=$nos")
            var aquarium = nos / 30.0  //30.0 is used to get double value not rounded off
            println("No of aquarium required will be " + aquarium.toInt())

        }
    }
}