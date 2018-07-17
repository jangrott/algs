package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class BSTMaxSpec extends Specification {

    def "finds max in BST"() {
        expect:
        BSTMax.findMax(input) == output
        where:
        input                             || output
        toTreeNode([1, 2, 3, 4, 5, 6, 7]) || 7
    }
}
