//import java.util.*
//
// class Person_Copy(
//    var name: String = "Name",var surname: String = "Surname",
//    var age: Int = 999, var height: Float = 200.00F,
//    var weight: Float = 150.00F,
//    var email: String = "abc123@gre.ac.uk", var strength: Int) {
//    override fun toString(): String =
//        "Fullname: ${name} ${surname}, Age: ${age}, Height: ${height} cm, Weight:${weight} Kg," +
//                " Email:${email}, Username:${genUsername(name, surname)}, Password:${genPassword(name, strength)}"
//
//    //    override fun toString(): String {
////        return "Fullname: $name $surname, Age: $age, Height: $height cm, Weight:$weight Kg, Email:$email"
////    }
////    fun setusername(name: String, surname: String): String {
////        val username = name + surname
////        println(username)
////    }
//
//    fun genUsername(name: String, surname: String): String {
//        val ranNum = (1..100).random() // Generate numbers between 1 and 100
//        // transform the number in string
//        return "$name.$surname$ranNum"
//
//    }
//
//    fun genPassword(name: String, strength: Int): String {
//
//        val sb = StringBuilder()
//        sb.append(name)
//        println(strength)
//        for (i in 0..strength) {sb.append((Random().nextInt(10)))} // Returns number between 0-9 }
//        return sb.toString()
//    }
////    fun genPassword(name: String, strength: Int): String {
//////        val rnd = (1 .. 9).random()
////        val sb = StringBuilder()
////        sb.append(name)
////        for (i in 0..strength) {
////            sb.append((Random().nextInt(10))) // Returns number between 0-9
////
////        }
////        return sb.toString()
////    }
//
////    override fun hashCode(): Int {
////        return Objects.hash(age, name)
////    }
////
////    companion object {
////        @kotlin.jvm.JvmStatic
////        fun main(args: Array<String>) {
////            val myPers = Person("Markus", 55)
////            println(myPers.age.toString() + " " + myPers.name)
////        }
////    }
//    }
//
//
