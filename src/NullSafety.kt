fun main() {
    var brand: String? = null
//    brand = null;
    println(brand?.uppercase()) // safe (?.) call: print null if value is null
    println(brand!!.uppercase()) // non-null asserted (!!.) call: throw NullPointerException
}