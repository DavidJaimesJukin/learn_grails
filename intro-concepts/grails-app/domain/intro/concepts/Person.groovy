package intro.concepts

class Person {
    String firstName
    String lastName
    Boolean active = false
    String emailAddress
    static constraints = {
        emailAddress nullable: true, email: true, unique: true
    }

    String toString(){
        firstName + " " + lastName
    }
}
