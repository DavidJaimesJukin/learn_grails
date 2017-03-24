package intro.concepts

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MathService)
class MathServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }

    void "Add: #lhs + #rhs = #answer"(){
        expect:
            answer == service.add(lhs, rhs)
        where:
            lhs | rhs | answer
            1   |  1  | 2
            5   |  5  | 10

    }
}
