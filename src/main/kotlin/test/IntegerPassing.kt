package test

fun main() {
    val a = 12
    val b = 24

    swap(a, b)
}

// As we can see it's not possible to modify value parameter hence no way to
// change value of java primitive counterparts in Kotlin.
fun swap(a: Int, b: Int) {
//    val temp = a
//    a = b
//    b = temp
}

