package intro.concepts

import grails.transaction.Transactional
@Transactional

class AccountService {
    def transfer(Long formId, Long toId, Integer amount){
        Boolean transfer = false
        Account from = Account.get(form)
        Account to = Account.get(to)

        from.balance -= amount
        to.balance += amount

        if(from.save() && to.save()){
            transfer = true
        }else {
            transactionStatus.setRollbackOnly()
        }

        return [transfer: transfer]
    }

    @Transactional(readOnly = true)

    def get(Account account){
        return account
    }
    static constraints = {
    }
}
