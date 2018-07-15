package pl.jangrot.algs

import spock.lang.Specification

class PowSpec extends Specification {

    def "returns x^n"() {
        expect:
        Pow.pow(x, n) == output
        where:
        x || n  || output
        2 || 3  || 8
        1 || 0  || 1
        2 || -1 || 0.5
    }
}
