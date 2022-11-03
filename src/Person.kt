import java.util.*

 data class Person(
    val name: String = "name1", val surname: String = "Surname",
    val age: Int = 999, val height: Float = 200F,
    val weight: Float = 150.00F,
    val email: String = "abc123@gre.ac.uk", val strength: Int) {

//     var height: Float? = null
//    override fun toString(): String =
//        "Fullname: ${name} ${surname}, Age: ${age}, Height: ${height} cm, Weight:${weight} Kg," +
//                " Email:${email}, Username:${genUsername(name, surname)}, Password:${genPassword(name, strength)}"

    //    override fun toString(): String {
//        return "Fullname: $name $surname, Age: $age, Height: $height cm, Weight:$weight Kg, Email:$email"
//    }
//    fun setusername(name: String, surname: String): String {
//        val username = name + surname
//        println(username)
//    }

    fun genUsername(name: String, surname: String): String {
        val ranNum = (1..100).random() // Generate numbers between 1 and 100
        // transform the number in string
        return "$name.$surname$ranNum"

    }

//    fun genPassword(name: String, strength: Int): String {
//
//        val sb = StringBuilder()
//        sb.append(name)
//        println(strength)
//        for (i in 0..strength) {sb.append((Random().nextInt(10)))} // Returns number between 0-9 }
//        return sb.toString()
//    }
//    fun genPassword(name: String): String {
//        val sb = StringBuilder()
//        val strength1: Int = name.length
//        println(strength1)
//
//        println("----")
//        sb.append(name)
//        for (i in 0..strength1) {sb.append((Random().nextInt(10)))} //Returns number between 0-9
//    return sb.toString()
//    }

     fun nameLen(name: String): Int {
         return name.length
     }
     val generatePassword = { passwordStrength: Int ->
         val rand = Random()
         var password = ""
         for (i in 1..passwordStrength) {
             password += rand.nextInt(10)

         }
         password
     }

     fun genPwdName(lambda: (Int) -> String): String {
         val strength1: Int = nameLen(this.name)
         return lambda(strength1)
     }


//         fun genPwdName(name: String, lambda: (Int) -> Int): String {
//             val strength1: Int = name.length
//             val passwd = lambda(strength1)
//             val sb2 = StringBuilder()
//             sb2.append(name, passwd)
//             return sb2.toString()
//         }
//     val ciao: String = genPwdName(generatePassword(name))


   //  val test3 = { firstname: String, surname: String
     //    println("Hello $firstname $surname")}
 //         test3("Markus", "Wolf")

//    fun genPassword(name: String, strength: Int): String {
////        val rnd = (1 .. 9).random()
//        val sb = StringBuilder()
//        sb.append(name)
//        for (i in 0..strength) {
//            sb.append((Random().nextInt(10))) // Returns number between 0-9
//
//        }
//        return sb.toString()
//    }

//    override fun hashCode(): Int {
//        return Objects.hash(age, name)
//    }
//
//    companion object {
//        @kotlin.jvm.JvmStatic
//        fun main(args: Array<String>) {
//            val myPers = Person("Markus", 55)
//            println(myPers.age.toString() + " " + myPers.name)
//        }
//    }
    }


