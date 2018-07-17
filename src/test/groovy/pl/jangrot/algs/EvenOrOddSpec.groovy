package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class EvenOrOddSpec extends Specification {

    def "checks if even"() {
        expect:
        EvenOrOdd.isListEven(input) == output
        where:
        input                       || output
        toListNode([1, 2, 3, 4])    || true
        toListNode([1, 2, 3, 4, 5]) || false
    }
}
