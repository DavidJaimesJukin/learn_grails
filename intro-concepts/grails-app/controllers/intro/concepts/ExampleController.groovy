package intro.concepts

class ExampleController {

    def index() {
        def myMap = [name: "David", id:123]
        respond myMap
    }

    def hello() {
        def greet = [greeting: "Hello ${params.name ?: ' world'}"]
        respond greet
    }

    def save(Person person){
        if(!person.save()){
            respond person.errors
            return
        }

        respond person
    }
}
