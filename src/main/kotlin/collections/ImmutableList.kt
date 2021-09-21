package collections

class ImmutableList {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            var list = listOf(1, 3, 6)
//            list.add(7)
//            we can't even add elements to an immutable list.

            val list1 = mutableListOf(2, 5, 7, 9)
            list1.add(34)
            list1.forEach {
                print("$it ")
            }
            println()

            val list2 = emptyList<List<Int>>()
            println("list2.size = ${list2.size}")
        }

        fun solution(numbers: List<Int>) = numbers.sum()

        fun solution1(numbers: List<Int>) {
            numbers.forEach { if (it % 2 == 0) print("$it ") }
        }
    }
}