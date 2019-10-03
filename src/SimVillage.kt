fun main() {
    val greetingFunction: () -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(greetingFunction())

//    println(greetingFunction)
//    () -> kotlin.String


    fun myGreetingFunction() : String {
        val currentYear = 2019
        return "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(myGreetingFunction())

//    println(myGreetingFunction)
//    error: function invocation 'myGreetingFunction()' expected
}