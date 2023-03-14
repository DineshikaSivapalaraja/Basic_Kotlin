/* collection data types
--array
--list
--stacks


*/
fun main() {
    val colors = arrayOf("Blue", "Pink" , "White")
    println(colors.size)
    println(colors[0])
    println(colors.get(0))
    println("Hello world")

    for(color in colors){
        println(color)
    }

    colors.forEach{ color->
    println(color)
    }

    colors.forEachIndexed {index, color ->
        println("$color is at index $index")
    }
}