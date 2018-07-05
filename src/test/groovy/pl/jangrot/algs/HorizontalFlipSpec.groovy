package pl.jangrot.algs

import spock.lang.Specification

class HorizontalFlipSpec extends Specification {

    def "flips matrix horizontal"() {
        expect:
        HorizontalFlip.flipHorizontalAxis(input) == output
        where:
        input                                               || output
        [[1, 1] as int[], [0, 0] as int[]] as int[][]       || [[0, 0] as int[], [1, 1] as int[]] as int[][]
        [[1, 0, 2] as int[], [2, 3, 1] as int[]] as int[][] || [[2, 3, 1] as int[], [1, 0, 2] as int[]] as int[][]
    }
}
