package pl.jangrot.algs

import spock.lang.Specification

class SingleNumberSpec extends Specification {

    def "find number that appars once"() {
        expect:
        SingleNumber.singleNumber(input) == output
        where:
        input                                || output
        [1, 2, 3, 4, 1, 2, 4, 3, 5] as int[] || 5
    }
}
