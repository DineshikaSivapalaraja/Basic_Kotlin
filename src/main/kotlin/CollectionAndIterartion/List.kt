fun main() {

    val colors = listOf("Blue", "Pink", "White", "Black")
    colors.forEach { color ->
        println(color)
    }
//---------------------------------------------------------------------------------------------------------------------

    val map = mapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
   map.forEach{ key, value -> println("$key -> $value")}

//---------------------------------------------------------------------------------------------------------------------

    val pLanguages = mutableListOf("Kotlin", "Java","Python")
    pLanguages.add("C")
    //println(pLanguage)
    pLanguages.forEach { pLanguage ->
        println(pLanguage)
    }

//---------------------------------------------------------------------------------------------------------------------

    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
  //  map2.forEach{key, value -> println("$key -> $value")}
    map2.put(4, "d")
    map2.forEach{key, value -> println("$key -> $value")}
    
}