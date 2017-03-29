package com.example

import grails.transaction.Transactional

@Transactional
class ValueEstimateService {

    def getEstimate(Vehicle vehicle){
        log.info "Esimating vehicle value..."

        //TODO: call third-party valuation API

        def value = Math.round(vehicle.name.size() + vehicle.model.name.size() * vehicle.year) * 2

        return value
    }
}
