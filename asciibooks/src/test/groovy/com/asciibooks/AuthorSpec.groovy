package com.asciibooks

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Author)
class AuthorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    @Unroll
    void "DisplayName is correct"() {
        given:
        def author = new Author(name: name, penName: penName)

        expect:
        author.displayName == displayName

        where:
        name    | penName  || displayName
        "Eric"  | "Author" || "Author"
        "Eric"  | null     || "Eric"
    }

    void "is active by default"() {
        given:
        def author = new Author()

        expect:
        author.active
    }

}
