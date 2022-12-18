

fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//    println(joinOptions(arrayListOf("1,2,3,4")))
//println(foo("sada"))
//    println( containsEven(arrayListOf(3,3,3)))
//    println(getPattern())
//    println(Sort().getList())

//    println(Sort().getListTwo())
//      println( MyDate(1,2,3).compareTo(MyDate(5,2,3)))

//    println(compare(MyDate(1,2,3),MyDate(1,2,3)))

    println(checkInRange(MyDate(8,6,5), MyDate(8,6,5), MyDate(8,6,5)))
}

class JavaCode {
    fun toJSON(collection: Collection<Int?>): String {
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }

}

fun joinOptions(options: Collection<String>) = options.joinToString(",", "[", "]")

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = true) =
    (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\s$month\s\d{4}"""




