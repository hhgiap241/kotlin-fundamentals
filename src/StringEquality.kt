fun main() {
    val name1 = "Giap"
    val name2 = "Hoang"
    val name3 = "Giap"
    val name4 = String("Giap".toCharArray())

    // In total: == is same with equals() it compare the content of string not the memory location
    // the === compare the memory location

    println(name1 == name3) // compare content not memory location
    println(name1.equals(name3)) // compare content also
    println(name1 == name4) // compare content not memory location
    println(name1.equals(name4)) // compare content also

    println(name1 === name3) // true
    println(name1 === name4) // false
}