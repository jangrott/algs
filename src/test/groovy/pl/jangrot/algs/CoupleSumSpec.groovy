package pl.jangrot.algs

import spock.lang.Specification

class CoupleSumSpec extends Specification {

    def "couples sum"() {
        expect:
        CoupleSum.coupleSum(numbers, target) == output
        where:
        numbers                  || target || output
        [2, 3, 4, 7] as int[]    || 7      || [2, 3] as int[]
        [1, 9, 3, 4, 5] as int[] || 10     || [1, 2] as int[]
    }
}
