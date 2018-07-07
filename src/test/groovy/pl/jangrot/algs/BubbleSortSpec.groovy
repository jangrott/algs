package pl.jangrot.algs

import spock.lang.Specification

class BubbleSortSpec extends Specification {

    def "sorts with usage of bubble sort"() {
        expect:
        BubbleSort.bubbleSortArray(input) == output
        where:
        input                       || output
        [3, 2, 4, 1, 8, 2] as int[] || [1, 2, 2, 3, 4, 8] as int[]
    }
}
