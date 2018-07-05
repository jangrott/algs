package pl.jangrot.algs

import spock.lang.Specification

class FindMissingNumberSpec extends Specification {

    def "find missing number"() {
        expect:
        FindMissingNumber.findMissingNumber(input) == output
        where:
        input                                 || output
        [1, 2, 4, 5, 6, 7, 8, 9, 10] as int[] || 3
        [1, 2, 3, 4, 5, 6, 7, 8, 10] as int[] || 9
        [1, 2, 3, 4, 5, 6, 7, 8, 9] as int[]  || 10
    }
}
