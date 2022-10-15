class Person(var name: String = "Name",var surname: String = "Surname",
             var age: Int = 999, var height: Float = 200.00F,
             var weight: Float = 150.00F,var email: String = "abc123@gre.ac.uk") {

//    override fun toString(): String {
//        return "Fullname: $name $surname, Age: $age, Height: $height cm, Weight:$weight Kg, Email:$email"
//    }
    override fun toString(): String =
        "Fullname: ${name} ${surname}, Age: ${age}, Height: ${height} cm, Weight:${weight} Kg, Email:${email}"

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