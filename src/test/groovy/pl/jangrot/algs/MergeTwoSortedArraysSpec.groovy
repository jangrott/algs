package pl.jangrot.algs

import spock.lang.Specification

class MergeTwoSortedArraysSpec extends Specification {

    def "merges two sorted arrays"() {
        expect:
        MergeTwoSortedArrays.merge(left, right) == output
        where:
        left               || right              || output
        [1, 3, 5] as int[] || [2, 4, 6] as int[] || [1, 2, 3, 4, 5, 6] as int[]
    }
}
