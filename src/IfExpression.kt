import kotlin.math.PI

fun main() {
    // it is called if expression because it can return a value
    // if expression must have the else block

//    val isGreater = (20 > 10) ? true : false;
    val isGreater = if (20 > 10) true else false;

    val isGreater2 = if (4 > 10) {
        true;
    } else {
        false;
    }
    println(isGreater)
    println(isGreater2)
}