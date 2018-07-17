package pl.jangrot.algs

import spock.lang.Specification

class PowerOfTwoSpec extends Specification {

    def "checks if power of two"() {
        expect:
        PowerOfTwo.isPowOfTwo(input) == output
        where:
        input || output
        5     || false
        8     || true
    }
}
