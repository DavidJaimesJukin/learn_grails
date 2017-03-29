package com.example

import  grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Mock([Make,Model, Vehicle])
@TestFor(ValueEstimateService)
class ValueEstimateServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test estimate retrieval"(){
        given: "a vehicle"
        def make = new Make(name: "Test")
        def model = new Model(name:"Test", make: make)
        def vehicle = new Vehicle(year: 2000, make: make, model: model, name: "Test Vehiole")

        when: "Service is called"
        def estimate = service.getEstimate(vehicle)

        then: "a non-zero result should be returned"
        estimate > 0

        and: "estimate is not to large"
        estimate < 10000000
    }
}
