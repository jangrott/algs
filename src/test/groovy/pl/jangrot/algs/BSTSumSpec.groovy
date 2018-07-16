package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class BSTSumSpec extends Specification {

    def "gets sum of elements"() {
        expect:
        BSTSum.sum(input) == output
        where:
        input                                || output
        toTreeNode([1, 2, 3, 4, 5, 6, 7, 8]) || 36
    }
}
