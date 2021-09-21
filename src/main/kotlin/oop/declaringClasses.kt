package oop

class Calender(var day: String, var month: String, var year: String) { // it must be var to use inside function
    fun selectCurrentDay() {
        day = "25"
        month = "august"
        year = "2021"
    }
}

fun main() {
    val calendar = Calender("14", "09", "2021")
    calendar.selectCurrentDay()
    println("${calendar.day} ${calendar.month} ${calendar.year}")
}