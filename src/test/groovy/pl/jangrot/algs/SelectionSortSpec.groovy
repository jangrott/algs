package pl.jangrot.algs

import spock.lang.Specification

class SelectionSortSpec extends Specification {

    def "sorts"() {
        expect:
        SelectionSort.selectionSortArray(input) == output
        where:
        input                         || output
        [64, 25, 12, 22, 11] as int[] || [11, 12, 22, 25, 64] as int[]
    }
}
