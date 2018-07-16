package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class CountTheLeavesSpec extends Specification {

    def "counts leaves"() {
        expect:
        CountTheLeaves.numberOfLeaves(input) == output
        where:
        input                                   || output
        toTreeNode([1, 2, 3, 4, 5, 6, 7, 8, 9]) || 5
    }
}
