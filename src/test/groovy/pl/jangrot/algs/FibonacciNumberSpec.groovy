package pl.jangrot.algs

import spock.lang.Specification

class FibonacciNumberSpec extends Specification {

    def "calculates fibonacci number"() {
        expect:
        FibonacciNumber.fib(input) == output
        where:
        input || output
        0     || 0
        1     || 1
        2     || 1
        3     || 2
        4     || 3
        5     || 5
        6     || 8
        7     || 13
        8     || 21
    }
}
