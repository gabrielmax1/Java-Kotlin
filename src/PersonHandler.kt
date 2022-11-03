import java.util.EventListener

fun Float.heightInInches(): Float {
    val luca = this
    return luca * 0.393701F     //   return result.toBigDecimal().toPlainString()
}

//private val personsList = mutableListOf<Person>()

class PersonHandler(var name1: String, var surname1: String, var age1: Int,
                    var height1: Float, var weight1: Float, var email1: String, var strength1: Int) {

//    companion object {
//
//        @JvmField
//        val personsList = mutableListOf<Person>()
//
//    }
    val personsList = mutableListOf<Person>()


    fun createPerson(): String {
        // gets details of the person from mainPanel class.
        val newPerson = Person(name1, surname1, age1, height1, weight1, email1, strength1)

        createList(newPerson)
//       saveList(newPersonString)
//        println(newPersonString)
        return newPerson.toString()

    }

    // TODO Mutable List that stores the person Object, every time you Save new person, Person Object added to the list.
    fun createList(person: Person) {
//        println(personsList)
        personsList.add(person)
//        println(personList)
        for (i in personsList) println("Persona: ${i.name} " + i.surname + " " + i.email)

    }

    fun getList(): List<Person>{
        return personsList
    }
//        fun saveList(person: String){
//            println(personList)
//            personList.add(person)
//            println(personList)
//
//        }
//    }
//   fun saveList(person: String){
//
//        this.personList.add(person)
//        println(this.personList)
//
//   }


    fun getHeightInInches(person: Person): Float {

        return height1?.heightInInches() ?: 0.0F
    }


}




