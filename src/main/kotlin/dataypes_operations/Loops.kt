package dataypes_operations

import kotlin.math.pow

class Loops {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
                "terabyte", "petabyte", "exabyte")
            val array = Array(sizes.size) { 1000.0.pow(it) }

//            array[0]=9.0  //new values assigned must be double

//            for (i in array){
//                println(i.toLong())
//            }
//            for (i:Double in array){ //to mention type explicitly
//                println(i)
//            }

//            for (i in array.indices){
//                println(i)
//            }

            for (i in array.indices) {
                println("1 ${sizes[i]} = ${array[i].toLong()} bytes")
            }

////            alter to above one
//            for ((i, value) in array.withIndex()) {
//                println("1 ${sizes[i]} = ${value.toLong()} bytes")
//            }

//            alter using range
//            for(i in 0 until array.size){ //until can be replaced with .. like in when
//                println("1 ${sizes[i]} = ${array[i].toLong()} bytes")
//            }

//            while loop
            var item=0
            while (item<array.size){
                println("1 ${sizes[item]} = ${array[item].toLong()} bytes")
                item++
            }

//            using it
//            for (i in array){
//                println("1 ${sizes[it]} = ${array[i].toLong()} bytes")
//            }
//            hence it can be used while forming array only
        }
    }
}