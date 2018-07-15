package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class FindNodeSpec extends Specification {

    def "finds node"() {
        expect:
        FindNode.findNode(root, val) == output
        where:
        root                        || val || output
        toTreeNode([1, 2, 3, 4, 5]) || 5   || toTreeNode([5])
    }
}
