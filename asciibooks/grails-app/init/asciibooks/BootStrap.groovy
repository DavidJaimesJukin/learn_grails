package asciibooks
    import com.asciibooks.Author
    import com.asciibooks.Book
class BootStrap {


    def eric = new Author(name: "Eric", biography: "Grails Developer & Writer").save()
    def grails3Book = new Book(author: eric, title: "Practical Grails 3", price: 100).save()

    def init = { servletContext ->
    }
    def destroy = {
    }
}
