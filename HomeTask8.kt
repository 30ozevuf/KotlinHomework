open class Publication(open val title: String, open val year: Int)

data class Book(
    override val title: String,
    val author: String,
    override val year: Int
) : Publication(title, year), Comparable<Book> {
    override fun compareTo(other: Book): Int = this.year - other.year
}

class LibraryCatalog {
    private val catalog: MutableMap<String, MutableList<Book>> = mutableMapOf()

    fun addBook(book: Book) {
        val booksByAuthor = catalog.getOrPut(book.author) { mutableListOf() }
        booksByAuthor.add(book)
        println("Книгу '${book.title}' додано до каталогу.")
    }

    fun findBooksByAuthor(author: String): List<Book> {
        return catalog[author] ?: emptyList()
    }

    fun getAllBooksSorted(): List<Book> {
        return catalog.values.flatten().sorted()
    }

    fun printCatalog() {
        println("\n📚 Каталог бібліотеки:")
        for ((author, books) in catalog) {
            println("Автор: $author")
            for (book in books) {
                println("   • ${book.title} (${book.year})")
            }
        }
    }
}

fun main() {
    val catalog = LibraryCatalog()

    catalog.addBook(Book("Тигролови", "Іван Багряний", 1967))
    catalog.addBook(Book("Залишенець. Чорний Ворон", "Василь Шкляр", 1925))
    catalog.addBook(Book("Ворошиловград", "Сергій Жадан", 1866))
    catalog.addBook(Book("Місто", "Валер'ян Підмогильний", 1869))

    println("\n🔍 Книги Жадана:")
    val zadanBooks = catalog.findBooksByAuthor("Сергій Жадан")
    zadanBooks.forEach { println("• ${it.title} (${it.year})") }

    println("\n📖 Усі книги (відсортовані за роком):")
    val sortedBooks = catalog.getAllBooksSorted()
    sortedBooks.forEach { println("• ${it.title} — ${it.author} (${it.year})") }

    catalog.printCatalog()
}