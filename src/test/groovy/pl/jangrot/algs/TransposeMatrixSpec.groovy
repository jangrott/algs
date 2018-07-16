package pl.jangrot.algs

import spock.lang.Specification

class TransposeMatrixSpec extends Specification {

    def "transposes matrix"() {
        expect:
        TransposeMatrix.transposeMatrix(input) == output
        where:
        input                                         || output
        [[1, 0] as int[], [1, 0] as int[]] as int[][] || [[1, 1] as int[], [0, 0] as int[]] as int[][]
    }
}
