package pl.jangrot.algs

import spock.lang.Specification

class ReverseStringSpec extends Specification {

    def "reverses string"() {
        expect:
        ReverseString.reverseString(input) == output
        where:
        input || output
        "abc" || "cba"
        ""    || ""
        null  || null
    }
}
