package pl.jangrot.algs

import spock.lang.Specification

class RepeatedElementsSpec extends Specification {

    def "gets repeated elements"() {
        expect:
        RepeatedElements.duplicate(input) == output
        where:
        input                             || output
        [1, 3, 2, 4, 1, 2, 6, 7] as int[] || [1, 2] as Set<Integer>
        [] as int[]                       || [] as Set<Integer>
    }
}
