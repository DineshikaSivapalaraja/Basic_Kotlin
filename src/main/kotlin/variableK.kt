
var color = "Blue"  //------------Variable declaration way 03(Outside of the main function)-------
val username : String = "Kavin"

fun main() {
 //immutable reference(Can't change assigned value again) --> val
 //mutable reference (Assigned value can be change)-->var

//-------------------Variable declaration way 01------------------------
    val Name = "Hari"
    var Age = 22

    println(Name)

       /*  Name = "Din"        //error
           println(Name) */

    println(Age)
    Age = 19
    println(Age)
    println()  //println( )

// --------------Variable declaration way 02--------------------------

    val name : String = "John"
    var id : Int = 221

    println(name)
    println(id)

    //
    println()
    println(color)  // print variable value outside the main function
    println(username)

}