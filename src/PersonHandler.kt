import java.util.EventListener

fun Float.heightInInches(): Float {
    val luca = this
    return luca * 0.393701F     //   return result.toBigDecimal().toPlainString()
}


class PersonHandler(var name1: String, var surname1: String, var age1: Int,
                    var height1: Float, var weight1: Float, var email1: String, var strength1: Int) {

    fun createPerson(): String {
        // gets details of the person from mainPanel class.
        val newPerson = Person(name1, surname1, age1, height1, weight1, email1, strength1)
        return newPerson.toString()

    }

    fun getHeightInInches(person: Person): Float {

        val newHeight = person.height.heightInInches()
        return newHeight
    }
}




