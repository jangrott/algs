package pl.jangrot.algs

import spock.lang.Specification

class HappyNumbersSpec extends Specification {

    def "checks if happy"() {
        expect:
        HappyNumbers.isHappyNumber(input) == output
        where:
        input || output
        19    || true
        12    || false
    }
}
