fun main() {
    val list = listOf("123", "1321") // list is immutable
    val mutableList: MutableList<String> = mutableListOf("123", "432") // mutable list
    mutableList.remove("15t23")
    println(mutableList)

    // Destructuring
    val giap = mutableList[0]
    val giap2 = mutableList[1]

    // now change to
    val(_, giap4) = mutableList;
    println("$giap $giap2 $giap4")

}