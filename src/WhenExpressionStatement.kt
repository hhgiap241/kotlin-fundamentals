fun main() {
    // like switch in java
    val gender = "F"
    val isMale = when(gender) {
        "F" -> {
            println("Female")
            false
        }
        "M" -> {
            println("Male")
            true
        }
        else -> {
            println("Unknown")
            false
        }
    }
    println(isMale)

    val age = 2
    when (age) {
        in 13..19 -> println("Teenager")
        !in 0..12 -> println("1")
        else -> println("Final case")
    }
}