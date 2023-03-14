fun getName(): String {
    return "John Smith"
}

fun sayHello() {
    println(getName())
}

fun getAge() : Int ?{    // null string function
    return null
}

//------------------Single expression function----------------------------
fun getId1() : String = "SE/1001/001"
        //---------OR-----------
fun getId2() = "SE/1001/011"

//--------------------------
fun sayHi(itemToGreet: String) {
   val msg = "Hi $itemToGreet"
    println(msg)
}  //fun sayHi(itemToGreet: String) = println("Hi $itemToGreet")  ---->Single expression function

//-----------High level function/free function-----------
fun getInput(word:String, no:Int)= println("$word $no")  // 2arguments



fun main(){// main(), println() are two basic functions
    println("Hi Kotlin")
    println(getName())
    sayHello()
    println(getAge())

    println(getId1())
    println(getId2())

    sayHi("SriLanka")
    sayHi("Kotlin")

    getInput("SS",606)
    getInput("DS", 171)
}

