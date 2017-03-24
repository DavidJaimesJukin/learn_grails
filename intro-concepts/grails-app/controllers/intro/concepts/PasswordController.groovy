package intro.concepts

class PasswordController {

    def index() { }

    def update(PasswordCommand passwordCommand){
        if(passwordCommand.validate()){
            passwordCommand.person.changePass(passwordCommand.password)
        } else {
            request.status = 400
            respond passwordCommand.errors
        }
    }
}

class PasswordCommand {
    Person person
    String password
    String retypePassword

    static constraints = {
        password minSize: 8
        retypePassword validator: { value, command ->
            if(command.password != command.retypePassword){
                return 'passwordCommand.retypePassword.error.mismatch'
            }
        }
    }
}
