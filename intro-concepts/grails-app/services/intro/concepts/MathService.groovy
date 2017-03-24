package intro.concepts

import grails.transaction.Transactional

@Transactional
class MathService {

    def add(def lhs, def rhs){
        lhs.toInteger() + rhs.toInteger()
    }
}
