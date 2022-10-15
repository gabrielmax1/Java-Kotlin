abstract class Persistence {
    // factory methods for creating an instance of the DBPersistence and FilePersistence classes
    companion object {
        fun createDBPersistence() = DBPersistence()

        fun createFilePersistence() = FilePersistence()
    }

    abstract infix fun save(data: String)
}
// Methods:
class DBPersistence: Persistence() {
    override fun save(data: String) {
        println("Saving $data to DB")
    }
}

class FilePersistence: Persistence() {
    override fun save(data: String) {
        println("Saving $data to File")
    }
}




