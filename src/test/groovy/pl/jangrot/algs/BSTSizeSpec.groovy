package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class BSTSizeSpec extends Specification {

    def "gets size"() {
        expect:
        BSTSize.size(input) == output
        where:
        input                             || output
        toTreeNode([1, 2, 3, 4, 5, 6, 7]) || 7
    }
}
