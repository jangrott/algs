package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class RecursivePreorderTraversalSpec extends Specification {

    def "traverses in preorder mode"() {
        given:
        def underTest = new RecursivePreorderTraversal()
        underTest.preorder(input)
        expect:
        underTest.preorderedList == output
        where:
        input                             || output
        toTreeNode([1, 2, 3, 4, 5, 6, 7]) || [1, 2, 4, 5, 3, 6, 7]
        null                              || []
    }
}
