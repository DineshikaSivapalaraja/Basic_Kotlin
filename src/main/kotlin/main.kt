fun main() {
    println("Hello Kotlin")
    println("Hello Kotlin1") // println -> new line

    print("Hello")   //print -> same line
    print("Hello")
    println( )

    //Variables  (2 types)
    val Name = "Dins" //immutable reference (can't assign values again)
    ///name = "Hari" //error

    var Age = 25 //mutable reference
    Age = 22

    //println(Name + Age) ---> running

    println(Name)
    println(Age)

    // ------------------------------Null values----------------------------------

    val name : String? = null //immutable reference (can't assign values again)
    //name = "Hari" //error

    var age : Int = 25 //mutable reference
    age = 22

    println(name)
    println(age)

    val username = null;
    println(username)

    var password: String ?= null;
    println(password)

    password = "123@"
    println(password)

    /*  error
    var pass : String = null;
    println(pass)                    */


}