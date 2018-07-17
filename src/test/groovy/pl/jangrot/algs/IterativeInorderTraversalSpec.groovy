package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class IterativeInorderTraversalSpec extends Specification {

    def "traverses in inorder mode"() {
        expect:
        IterativeInorderTraversal.inorderItr(input) == output
        where:
        input                             || output
        toTreeNode([1, 2, 3, 4, 5, 6, 7]) || [4, 2, 5, 1, 6, 3, 7]
    }
}
