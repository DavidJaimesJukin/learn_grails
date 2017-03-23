package intro.concepts

class BootStrap {

    def init = { servletContext ->
        def person = new Person(firstName: "Eric", lastName: "Potato")
        person.lastName = "Bob";
        assert person.active == false
        person.save(flush:true)
        //person.findByFirstName("Bob")
    }
    def destroy = {
    }
}
