package pl.jangrot.algs

import spock.lang.Specification

class BinarySearchSpec extends Specification {

    def "checks existence using BST"() {
        expect:
        BinarySearch.binarySearch(arr, n) == output
        where:
        arr                      || n || output
        [2, 5, 7, 8, 9] as int[] || 9 || true
        [2, 8, 9, 12] as int[]   || 6 || false
        [2] as int[]             || 4 || false
        [] as int[]              || 9 || false
    }
}
