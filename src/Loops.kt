fun main() {
    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1, 2, 3 ,4, 5)
    for(i in 1..12) {
        println(i)
    }

    for (index in names.indices) {
        println(index)
        println(names[index])
    }

    for (index in names.indices.reversed()) {
        println(index)
        println(names[index])
    }
}