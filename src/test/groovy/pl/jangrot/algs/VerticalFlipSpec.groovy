package pl.jangrot.algs

import spock.lang.Specification

class VerticalFlipSpec extends Specification {

    def "flips matrix vertical"() {
        expect:
        VerticalFlip.flipItVerticalAxis(input) == output
        where:
        input                                               || output
        [[1, 0] as int[], [1, 0] as int[]] as int[][]       || [[0, 1] as int[], [0, 1] as int[]] as int[][]
        [[1, 0, 2] as int[], [2, 3, 1] as int[]] as int[][] || [[2, 0, 1] as int[], [1, 3, 2] as int[]] as int[][]
        [[1, 0] as int[]] as int[][]                        || [[0, 1] as int[]] as int[][]
    }
}
