package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.TreeNodeUtils.toTreeNode

class InsertIntoBSTSpec extends Specification {

    def "inserts node"() {
        expect:
        InsertIntoBST.insert(root, data) == output
        where:
        root                           || data || output
        toTreeNode([1, 2, 3, 4, 5, 6]) || 7    || toTreeNode([1, 2, 3, 4, 5, 6, 7])
    }
}
