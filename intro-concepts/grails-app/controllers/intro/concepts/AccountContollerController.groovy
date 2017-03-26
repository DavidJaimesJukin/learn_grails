package intro.concepts

import grails.transaction.Transactional

class AccountContollerController {
    def AccountService

    @Transactional(readOnly = true)

    def index() {
        render Account.list()
    }

    def show(){
        render accountService.get(params.long('id'))
    }

    def transfer(){
        def result = getAccountService().transfer(params.long('accountIdForm'), params.long('accountIdTo'), params.int('amount'))

        render result
    }
}
