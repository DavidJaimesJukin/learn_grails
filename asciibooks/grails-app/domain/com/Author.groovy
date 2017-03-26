package com.asciibooks

import sun.jvm.hotspot.debugger.Address

class Author {

    String name
    String penName

    Boolean active = true

    Address address

    Date lastUpdated
    Date dateCreated

    static hasMany = [books: Books]

    static constraints = {
        penName nullable: true
    }

    String getDisplayName(){
        penName ?: name
    }
}
