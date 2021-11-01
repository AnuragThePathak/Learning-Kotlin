package test

fun main() {
    swap(Name("Anurag", "Pathak"))
    // By debugging we can see that reference of Name object here and passed name
    // remains the same. So we basically pass the reference.
}

fun swap(name: Name) {
    println(name)

    val temp = name.firstName
    name.firstName = name.lastName
    name.lastName = temp
}

data class Name(
    var firstName: String,
    var lastName: String,
)