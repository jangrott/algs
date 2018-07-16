package pl.jangrot.algs

import spock.lang.Specification

class TransposeMatrixSpec extends Specification {

    def "transposes matrix"() {
        expect:
        TransposeMatrix.transposeMatrix(input) == output
        where:
        input                                                                   || output
        [[1, 0] as int[], [1, 0] as int[]] as int[][]                           || [[1, 1] as int[], [0, 0] as int[]] as int[][]
        [[1, 2, 3] as int[], [4, 5, 6] as int[], [7, 8, 9] as int[]] as int[][] || [[1, 4, 7] as int[], [2, 5, 8] as int[], [3, 6, 9] as int[]] as int[][]
    }
}
