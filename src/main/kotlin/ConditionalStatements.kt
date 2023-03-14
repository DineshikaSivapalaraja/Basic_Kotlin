fun main() {
    var word : String ?= "Hello SL"
    val wish : String = "Good Morning"

    // ------------------- if else statement
    if (word != null){
        println(word)
    } else {
        println("Hooray")
    }

    // -------------------when statements
    when(word) {
        null -> println("Error")
        else -> println(word)
    }
    println(wish)

   //-------------------------------------------------------------------------
    val WishName = if(word != null) word else println("Empty")
    println(WishName)

  //-----------------------------------------------------------------------------
    word = null
    var Greeting = when(word){
        null -> "Empty"
        else -> word
    }
    println(Greeting)
}