fun String.heightInInches(): String {
    val luca = this.toDouble()
    val result = luca * 0.393701
    return result.toBigDecimal().toPlainString()
}


class PersonHandler(var Name: String, var Surname: String, var Age: Int,
                    var Height: Float, var Weight: Float, var Email: String) {

    fun createPerson(): String {
        // gets details of the person from mainPanel class.
        val newPerson = Person(Name, Surname, Age, Height, Weight, Email)
        return newPerson.toString()

    }
    fun getHeightInInches(person: Person): String {

        var newHeight = person.height.heightInInches()
        reuturn newHeight
    }


