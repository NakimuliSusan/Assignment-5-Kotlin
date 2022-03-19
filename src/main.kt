fun main () {
    var w = Human("Susan",22,60.0F)
    w.eat(5)
    println( w.weight)
    w.speak("My name is Susan and I love Kotlin")
    w.birthday()
   var me = User("Susan","Nakimuli","nakimulimarysusan@gmail.com",6764545)
    println(me.first_Name)
    println(me.email)
}
class Human (var name:String,var age:Int,var weight:Float) {

    fun eat (foodWeight:Int) {
       println("I am eating $foodWeight kgs of food.")
        weight+=foodWeight

    }

    fun speak (speech:String){
        println(speech)
    }

    fun birthday ():Int {
        println( age+1)
        return age

    }
}
data class User(var first_Name:String,var lastName:String,var email:String,var password:Int) {

}