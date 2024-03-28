fun main() {
    val names = arrayOf<String>("Giap", "Hoang", "3")
    println(names.contentToString())
    println(names.size)

    if ("3" in names) {
        println("contains")
    } else {
        println("not contains")
    }
}