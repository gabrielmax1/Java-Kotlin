fun Float.heightInInches(): Float {
    val luca = this
    return luca * 0.393701F     //   return result.toBigDecimal().toPlainString()
}


class PersonHandler(var name1: String, var surname1: String, var age1: Int,
                    var height1: Float?, private var weight1: Float, var email1: String, var strength1: Int) {

    fun createPerson(): String {
        // gets details of the person from mainPanel class.
        val newPerson = height1?.let { Person(name1, surname1, age1, it, weight1, email1, strength1) }
        var newPersonList: MutableList<String> = mutableListOf<String>()
        newPersonList.add(newPerson.toString())
        println(newPersonList)
        return newPerson.toString()

    }
    val list = mutableListOf<Int>()

    fun getHeightInInches(): Float {

        val newHeight = person.height.heightInInches()
        return newHeight
    }
}

// https://stackoverflow.com/questions/69007207/how-to-put-multiple-objects-in-a-mutablelistof-in-kotlin


