package pl.jangrot.algs

import spock.lang.Specification

class ReverseIntSpec extends Specification {

    def "reverses integer"() {
        expect:
        ReverseInt.reverseInt(input) == output
        where:
        input || output
        0     || 0
        123   || 321
        -65   || -56
    }
}
