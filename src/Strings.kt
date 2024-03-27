fun main() {
    val name1 = "name 1"
    val name2 = name1
    val name3 = "name 1"
    val name4 = String("name 1".toCharArray())
    val name5 = " "
    println(name1 == name2) // true
    println(name1 == name3) // true
    println(name1 == name4) // true
    println(name1.equals(name2)) // true
    println(name1.equals(name3)) // true
    println(name1.equals(name4)) // true
    println(name5.isBlank()) // true
    println(name5.isEmpty()) // true

    // String template
    var msg = "$name1 $name2"
    println(msg)

    // Multiline String
    val email = """
        Hello %s %d
           How 
        are
        you today
    """.trimIndent()
    println(email.format("Anna", 1))
}